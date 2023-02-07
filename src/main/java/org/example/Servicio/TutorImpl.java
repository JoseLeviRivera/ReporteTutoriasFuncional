package org.example.Servicio;

import org.example.Model.Tutor;
import org.example.Util.DatabaseConection.ConexionDB;
import org.example.interfaces.CrudRepositorioTutor;
import org.example.interfaces.LimitTutor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TutorImpl implements CrudRepositorioTutor, LimitTutor {
    @Override
    public List<Tutor> listar() {
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
        return tutorList;
    }

    @Override
    public Tutor porId(String id) {
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
    public void crear(Tutor t) {
        String sql = "INSERT INTO Tutores (id, password) VALUES (?, ?)";
        try (PreparedStatement statement = ConexionDB.getInstance()
                .getConnection().prepareStatement(sql)) {
            if(new ProfesorImpl().exist(t.getId())){
                statement.setString(1, t.getId());
                statement.setString(2, t.getPassword());
                int rowsAffected = statement.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
            }else {
                System.err.println("No se encuentra el registro del profesor " + t.getId());
            }
        } catch (Exception e) {}
    }

    @Override
    public void editar(Tutor t) {
        String updateSql = "UPDATE Tutores SET password = ? WHERE id = ?";
        try (PreparedStatement updateStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(updateSql)) {
            updateStatement.setString(1, t.getPassword());
            updateStatement.setString(2, t.getId());
            int rowsAffected = updateStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {}
    }

    @Override
    public boolean eliminar(String id) {
        String deleteSql = "DELETE FROM Tutores WHERE id = ?";
        try (PreparedStatement deleteStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(deleteSql)) {
            deleteStatement.setString(1, id);
            int rowsAffected = deleteStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean exist(String id) {
        return porId(id) != null;
    }

    @Override
    public void imprimirLista() {
        listar().forEach(System.out::println);
    }

    @Override
    public long contar() {
        return listar().stream().count();
    }

    @Override
    public List<Tutor> limitar(Integer limit) {
        return listar().stream().limit(limit).collect(Collectors.toList());
    }
}
