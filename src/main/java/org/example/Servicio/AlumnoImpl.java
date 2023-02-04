package org.example.Servicio;

import org.example.Model.Alumno;
import org.example.Util.DatabaseConection.ConexionDB;
import org.example.interfaces.CrudRepositorioAlumno;
import org.example.interfaces.OrderSuperior;

import java.beans.Statement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;


public class AlumnoImpl implements CrudRepositorioAlumno, OrderSuperior {
    private Statement statement = null;


    public AlumnoImpl(){
        try {
            statement = (Statement) ConexionDB.getInstance().getConnection().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
        /*
        String sql = "INSERT INTO alumno (first_name, last_name) " +
                "VALUES ('" + t + "', '" + lastName + "')";
        statement.executeUpdate(sql);
         */
    }

    @Override
    public void editar(Alumno t) {

    }

    @Override
    public boolean eliminar(Integer id) {
        return false;
    }

    @Override
    public void printLists(List<Object> list) {
        list.forEach(System.out::println);
    }

    @Override
    public long count(List<Object> a) {
        return a.stream().count();
    }
}
