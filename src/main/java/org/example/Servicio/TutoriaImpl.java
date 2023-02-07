package org.example.Servicio;

import org.example.Model.Tutoria;
import org.example.Util.DatabaseConection.ConexionDB;
import org.example.interfaces.CrudRepositorioTutorias;
import org.example.interfaces.LimitTutoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TutoriaImpl implements CrudRepositorioTutorias, LimitTutoria {
    @Override
    public List<Tutoria> listar() {
        List<Tutoria> tutorias = new ArrayList<>();
        Tutoria tutoria = new Tutoria();
        String readSql = "SELECT * FROM tutorias";
        try (PreparedStatement readStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    tutoria.setId(id);
                    String fecha = resultSet.getString("fecha");
                    tutoria.setFecha(fecha);
                    String hora = resultSet.getString("hora");
                    tutoria.setHora(hora);
                    String duracion = resultSet.getString("duracion");
                    tutoria.setDuracion(duracion);
                    String comentarios = resultSet.getString("comentarios");
                    tutoria.setComentarios(comentarios);
                    String alumno_id = resultSet.getString("alumno_id");
                    tutoria.setAlumno_id(alumno_id);
                    tutorias.add(tutoria);
                    tutoria = new Tutoria();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tutorias;
    }

    @Override
    public Tutoria porId(Integer id) {
        Tutoria tutoria = new Tutoria();
        String sql = "SELECT * FROM tutorias WHERE id = ?";
        try (PreparedStatement readStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(sql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    Integer identificador = resultSet.getInt("id");
                    tutoria.setId(identificador);
                    String fecha = resultSet.getString("fecha");
                    tutoria.setFecha(fecha);
                    String hora = resultSet.getString("hora");
                    tutoria.setHora(hora);
                    String duracion = resultSet.getString("duracion");
                    tutoria.setDuracion(duracion);
                    String comentarios = resultSet.getString("comentarios");
                    tutoria.setComentarios(comentarios);
                    String alumno_id = resultSet.getString("alumno_id");
                    tutoria.setAlumno_id(alumno_id);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tutoria;
    }

    @Override
    public boolean crear(Tutoria t) {
        String sql = "INSERT INTO tutorias (id, fecha, hora, duracion, comentarios, alumno_id)" +
                " VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = ConexionDB.getInstance().getConnection().prepareStatement(sql)) {
            statement.setInt(1, t.getId());
            statement.setString(2, t.getFecha());
            statement.setString(3, t.getHora());
            statement.setString(4, t.getDuracion());
            statement.setString(5, t.getComentarios());
            statement.setString(6, t.getAlumno_id());
            int rowsAffected = statement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean editar(Tutoria t) {
        String updateSql = "UPDATE tutorias SET fecha = ?, hora = ?, duracion = ?, comentarios = ?, alumno_id = ? WHERE id = ?";
        try (PreparedStatement statement = ConexionDB.getInstance()
                .getConnection().prepareStatement(updateSql)) {
            statement.setString(1, t.getFecha());
            statement.setString(2, t.getHora());
            statement.setString(3, t.getDuracion());
            statement.setString(4, t.getComentarios());
            statement.setString(5, t.getAlumno_id());
            statement.setInt(6, t.getId());
            int rowsAffected = statement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean eliminar(Integer id) {
        String deleteSql = "DELETE FROM tutorias WHERE id = ?";
        try (PreparedStatement deleteStatement = ConexionDB.getInstance().getConnection()
                .prepareStatement(deleteSql)) {
            deleteStatement.setInt(1, id);
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Tutoria> limit(Integer l) {
        return listar().stream().limit(l).collect(Collectors.toList());
    }

    @Override
    public void imprimirLista() {
        listar().forEach(System.out::println);
    }

    @Override
    public long contar() {
        return listar().stream().count();
    }
}
