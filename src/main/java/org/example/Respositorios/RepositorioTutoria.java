package org.example.Respositorios;

import org.example.InterfaceRepositorio.Repositorio;
import org.example.Model.Tutoria;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.DatabaseConection.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioTutoria implements Repositorio {

    @Override
    public boolean crear(Object o) {
        if (o instanceof Tutoria){
            Tutoria t = (Tutoria) o;
            String sql = "INSERT INTO tutorias (fecha, hora, duracion, comentarios, alumno_id)" +
                    " VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = ConexionDB.getInstance().getConnection().prepareStatement(sql)) {
                //statement.setInt(1, t.getId());
                if(SuperFuncion.existe(new RepositorioAlumno(), t.getAlumno_id())){
                    statement.setString(1, t.getFecha());
                    statement.setString(2, t.getHora());
                    statement.setString(3, t.getDuracion());
                    statement.setString(4, t.getComentarios());
                    statement.setString(5, t.getAlumno_id());
                    int rowsAffected = statement.executeUpdate();
                    System.out.println("Rows affected: " + rowsAffected);
                    return true;
                } else {
                    System.out.println("No existe el id del estudiante, no esta registrado!");
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        } else {
            System.err.println("No tiene la instancia de una tutoria");
        }
        return false;
    }

    @Override
    public boolean actualizar(Object o) {
        if (o instanceof Tutoria){
            Tutoria t = (Tutoria) o;
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
        }else {
            System.err.println("No es la instancia de Tutoria");
        }
        return true;
    }

    @Override
    public List<Object> listar() {
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
        return Collections.singletonList(tutorias);
    }

    @Override
    public boolean eliminar(String id) {
        String deleteSql = "DELETE FROM tutorias WHERE id = ?";
        try (PreparedStatement deleteStatement = ConexionDB.getInstance().getConnection()
                .prepareStatement(deleteSql)) {
            deleteStatement.setInt(1, Integer.parseInt(id));
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public Object porId(String id) {
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
    public boolean existe(String id) {
        return ((Tutoria) porId(id)).getId() != null;
    }

    @Override
    public long contar() {
        return listar().stream().count();
    }

    @Override
    public List<Object> limitar(Integer n) {
        return (List<Object>) listar().stream().limit(n);
    }
}
