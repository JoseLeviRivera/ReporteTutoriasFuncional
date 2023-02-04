package org.example.Servicio;

import org.example.Model.Tutoria;
import org.example.interfaces.CrudRepositorioTutorias;

import java.util.List;

public class TutoriaImpl implements CrudRepositorioTutorias {
    @Override
    public List<Tutoria> listar() {
        return null;
    }

    @Override
    public Tutoria porId(Integer id) {
        return null;
    }

    @Override
    public void crear(Tutoria t) {

    }

    @Override
    public void editar(Tutoria t) {

    }

    @Override
    public boolean eliminar(Integer id) {
        return false;
    }
}
