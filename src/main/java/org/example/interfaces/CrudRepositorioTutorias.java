package org.example.interfaces;

import org.example.Model.Tutoria;
import java.util.List;

public interface CrudRepositorioTutorias {
    List<Tutoria> listar();
    Tutoria porId(Integer id);
    void crear(Tutoria t);
    void editar(Tutoria t);
    boolean eliminar(Integer id);
}
