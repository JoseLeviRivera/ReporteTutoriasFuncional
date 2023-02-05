package org.example.Servicio;

import org.example.Model.Alumno;
import org.example.interfaces.CrudRepositorioAlumno;
import java.util.List;


public class AlumnoImpl implements CrudRepositorioAlumno {
    public AlumnoImpl(){}

    @Override
    public List<Alumno> listar() {
        return null;
    }

    @Override
    public Alumno porId(Integer id) {
        return null;
    }

    @Override
    public void crear(Alumno t) {}

    @Override
    public void editar(Alumno t) {

    }
    @Override
    public boolean eliminar(Integer id) {
        return false;
    }

}
