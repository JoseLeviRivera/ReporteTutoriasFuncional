package org.example.Servicio;

import org.example.Model.Profesor;
import org.example.Util.DatabaseConection.ConexionDB;
import org.example.interfaces.CrudRepositorioProfesor;
import org.example.interfaces.OrderSuperior;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProfesorImpl implements CrudRepositorioProfesor, OrderSuperior {
    public ProfesorImpl(){}
    @Override
    public List<Profesor> listar() {
        List<Profesor> listsProfessor = new ArrayList<>();
        Profesor p = new Profesor();
        String readSql = "SELECT * FROM profesores";
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    p.setId(id);
                    String nombre = resultSet.getString("nombre");
                    p.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    p.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    p.setCorreo(correo);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    p.setAnioIngreso(anioIngreso);
                    String gradoAcademico = resultSet.getString("gradoAcademico");
                    p.setGradoAcademico(gradoAcademico);
                    String adscripcion = resultSet.getString("adscripcion");
                    p.setAdscripcion(adscripcion);
                    listsProfessor.add(p);
                    p = new Profesor();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listsProfessor;
    }

    @Override
    public Profesor porId(String identificador) {
        String sql = "SELECT * FROM profesores WHERE id=?";
        Profesor p = new Profesor();
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(sql)) {
            readStatement.setString(1, identificador);
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    p.setId(id);
                    String nombre = resultSet.getString("nombre");
                    p.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    p.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    p.setCorreo(correo);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    p.setAnioIngreso(anioIngreso);
                    String gradoAcademico = resultSet.getString("gradoAcademico");
                    p.setGradoAcademico(gradoAcademico);
                    String adscripcion = resultSet.getString("adscripcion");
                    p.setAdscripcion(adscripcion);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return p;
    }

    @Override
    public void crear(Profesor t) {
        String sql = "INSERT INTO profesores (id, nombre, apellidos, correo, anioIngreso, gradoAcademico, adscripcion) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = ConexionDB.getInstance().getConnection().prepareStatement(sql)) {
            statement.setString(1, t.getId());
            statement.setString(2, t.getNombre());
            statement.setString(3, t.getApellidos());
            statement.setString(4, t.getCorreo());
            statement.setString(5, t.getAnioIngreso());
            statement.setString(6, t.getGradoAcademico());
            statement.setString(7, t.getAdscripcion());
            int rowsAffected = statement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (Exception e) {}
    }

    @Override
    public void editar(Profesor t) {
        String updateSql = "UPDATE profesores SET nombre = ?, apellidos = ?, correo = ?, anioIngreso = ?, gradoAcademico = ?, adscripcion = ? WHERE id = ?";
        try (PreparedStatement updateStatement = ConexionDB.getInstance().getConnection().prepareStatement(updateSql)) {
            updateStatement.setString(1, t.getNombre());
            updateStatement.setString(2, t.getApellidos());
            updateStatement.setString(3, t.getCorreo());
            updateStatement.setString(4, t.getAnioIngreso());
            updateStatement.setString(5, t.getGradoAcademico());
            updateStatement.setString(6, t.getAdscripcion());
            updateStatement.setString(7, t.getId());
            int rowsAffected = updateStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {}
    }

    @Override
    public boolean eliminar(String id) {
        String deleteSql = "DELETE FROM profesores WHERE id = ?";
        try (PreparedStatement deleteStatement = ConexionDB.getInstance().getConnection().prepareStatement(deleteSql)) {
            deleteStatement.setString(1, id);
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            return false;
        }
        return true;
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
