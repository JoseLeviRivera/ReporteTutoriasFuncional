package org.example.Servicio;

import org.example.Model.Profesor;
import org.example.interfaces.CrudRepositorioProfesor;

import java.util.List;

public class ProfesorImpl implements CrudRepositorioProfesor {
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

    }

    @Override
    public void editar(Profesor t) {

    }

    @Override
    public boolean eliminar(Integer id) {
        return false;
    }
}
