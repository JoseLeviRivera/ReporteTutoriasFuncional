package org.example.Servicio;

import org.example.Model.Alumno;
import org.example.interfaces.CrudRepositorioAlumno;
import org.example.interfaces.OrderSuperior;

import java.util.List;
import java.util.stream.Collectors;


public class AlumnoImpl implements CrudRepositorioAlumno, OrderSuperior {

    public AlumnoImpl(){

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
