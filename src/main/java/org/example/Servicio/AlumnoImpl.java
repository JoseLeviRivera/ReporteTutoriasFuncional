package org.example.Servicio;

import org.example.Model.Alumno;
import org.example.interfaces.CrudRepositorioAlumno;
import org.example.interfaces.OrderSuperior;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class AlumnoImpl implements CrudRepositorioAlumno, OrderSuperior {
    private Statement statement = null;
    private Connection connection = null;

    public AlumnoImpl(Connection _dbCon){
        this.connection = _dbCon;
    }

    @Override
    public List<Alumno> listar() {
        return null;
    }

    @Override
    public Alumno porId(Integer id) {
        return null;
    }

    @Override
    public void crear(Alumno t) {
        PreparedStatement statement = null;
        try {
            String sql = "INSERT INTO persons (nombre, apellido) " +
                    "VALUES (?, ?)";
            statement = this.connection.prepareStatement(sql);
            statement.setString(1, t.getNombre());
            statement.setString(2, t.getApellidos());
            statement.executeUpdate();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
            }
            //closeConnection(connection);
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public void editar(Alumno t) {

    }
    @Override
    public boolean eliminar(String name) {
        PreparedStatement statement = null;
        try {
            String sql = "DELETE FROM persons WHERE nombre = ?";
            statement = this.connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.executeUpdate();
            System.out.println("Registro eliminado exitosamente");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
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
