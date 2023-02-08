package org.example.Respositorios;

import org.example.Model.Profesor;
import org.example.InterfaceRepositorio.Repositorio;
import org.example.Util.DatabaseConection.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RespositorioProfesor implements Repositorio {
    @Override
    public boolean crear(Object o) {
        if(o instanceof Profesor){
            Profesor t = (Profesor) o;
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
                return true;
            } catch (Exception e) {}
        } else {
            System.err.println("No es de instancia profesor");
        }
        return false;
    }

    @Override
    public boolean actualizar(Object o) {
        if (o instanceof Profesor){
            Profesor t = (Profesor) o;
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
                return true;
            } catch (SQLException e) {}
        } else {
            System.err.println("No tiene instancia de tipo profesor!");
        }
        return false;
    }

    @Override
    public List<Object> listar() {
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
        return Collections.singletonList(listsProfessor);
    }

    @Override
    public boolean eliminar(String id) {
        String deleteSql = "DELETE FROM profesores WHERE id = ?";
        try (PreparedStatement deleteStatement = ConexionDB.getInstance().getConnection().prepareStatement(deleteSql)) {
            deleteStatement.setString(1, id);
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Se elimino!");
            return true;
        } catch (SQLException e) {
            System.err.println("No se elmino");
        }
        return false;
    }

    @Override
    public Object porId(String id) {
        String sql = "SELECT * FROM profesores WHERE id=?";
        Profesor p = new Profesor();
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(sql)) {
            readStatement.setString(1, id);
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String identificador = resultSet.getString("id");
                    p.setId(identificador);
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
    public boolean existe(String id) {
        Object a = porId(id);
        Profesor profesor = (Profesor) a;
        return profesor.getId() != null;
    }

    @Override
    public long contar() {
        return listar().stream().count();
    }

    @Override
    public List<Object> limitar(Integer n) {
        return listar().stream().limit(n).toList();
    }
}
