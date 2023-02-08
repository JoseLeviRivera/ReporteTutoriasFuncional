package org.example.Respositorios;

import org.example.InterfaceRepositorio.Repositorio;
import org.example.Model.Tutor;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.DatabaseConection.ConexionDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioTutor implements Repositorio {
    @Override
    public boolean crear(Object o) {
        if( o instanceof Tutor){
            Tutor t = (Tutor) o;
            String sql = "INSERT INTO Tutores (id, password) VALUES (?, ?)";
            try (PreparedStatement statement = ConexionDB.getInstance()
                    .getConnection().prepareStatement(sql)) {
                if(SuperFuncion.existe(new RespositorioProfesor(), t.getId())){
                    statement.setString(1, t.getId());
                    statement.setString(2, t.getPassword());
                    int rowsAffected = statement.executeUpdate();
                    System.out.println("Rows affected: " + rowsAffected);
                    return true;
                } else {
                    System.err.println("No se encuentra el registro del profesor " + t.getId());
                    return false;
                }
            } catch (Exception e) {}
        } else {
            System.err.println("La instancia no es de tipo profesor!");
        }
        return false;
    }

    @Override
    public boolean actualizar(Object o) {
        if(o instanceof  Tutor) {
            Tutor t = (Tutor) o;
            String updateSql = "UPDATE Tutores SET password = ? WHERE id = ?";
            try (PreparedStatement updateStatement = ConexionDB.getInstance().getConnection().prepareStatement(updateSql)) {
                updateStatement.setString(1, t.getPassword());
                updateStatement.setString(2, t.getId());
                int rowsAffected = updateStatement.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
                return true;
            } catch (SQLException e) {}
        } else { System.err.println("No es una instancia de tipo tutor!");}
        return false;
    }

    @Override
    public List<Object> listar() {
        List<Tutor> tutorList = new ArrayList<>();
        Tutor tutor = new Tutor();
        String readSql = "SELECT * FROM Tutores";
        try (PreparedStatement readStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    tutor.setId(id);
                    String password = resultSet.getString("password");
                    tutor.setPassword(password);
                    tutorList.add(tutor);
                    tutor = new Tutor();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Collections.singletonList(tutorList);
    }

    @Override
    public boolean eliminar(String id) {
        String deleteSql = "DELETE FROM Tutores WHERE id = ?";
        try (PreparedStatement deleteStatement = ConexionDB.getInstance().getConnection().prepareStatement(deleteSql)) {
            deleteStatement.setString(1, id);
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) { return false; }
        return true;
    }

    @Override
    public Object porId(String id) {
        String sql = "SELECT * FROM Tutores WHERE id=?";
        Tutor tutor = new Tutor();
        try (PreparedStatement readStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(sql)) {
            readStatement.setString(1, id);
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String identificador = resultSet.getString("id");
                    tutor.setId(identificador);
                    String password = resultSet.getString("password");
                    tutor.setPassword(password);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tutor;
    }

    @Override
    public boolean existe(String id) {
        return ((Tutor)porId(id)).getId() != null;
    }

    @Override
    public long contar() {
        return listar().stream().count();
    }

    @Override
    public List<Object> limitar(Integer n) {
        return listar().stream().limit(n).collect(Collectors.toList());
    }
}
