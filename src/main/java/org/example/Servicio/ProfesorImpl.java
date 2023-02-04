package org.example.Servicio;

import org.example.Model.Profesor;
import org.example.Util.DatabaseConection.ConexionDB;
import org.example.interfaces.CrudRepositorioProfesor;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProfesorImpl implements CrudRepositorioProfesor {
    private Statement statement;

    public ProfesorImpl(){
        try {
                statement = ConexionDB.getInstance().getConnection().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Profesor> listar() {
        return null;
    }

    @Override
    public Profesor porId(Integer id) {
        return null;
    }

    @Override
    public void crear(Profesor t) {
        String sql = "INSERT INTO profesores (nombre, apellidos, correo, anioIngreso, gradoAcademico, adscripcion) " +
                "VALUES ('"
                + t.getNombre() + "', '"
                + t.getApellidos() + "', '"
                + t.getCorreo() + "', '"
                + t.getAnioIngreso()+ "', '"
                + t.getGradoAcademico() + "', '"
                + t.getAdscripcion() +
                "')";
        try {
            statement = ConexionDB.getInstance().getConnection().prepareStatement(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editar(Profesor t) {

    }

    @Override
    public boolean eliminar(Integer id) {
        return false;
    }
}
