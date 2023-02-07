package org.example.interfaces;

import org.example.Model.Profesor;
import java.util.List;

public interface CrudRepositorioProfesor {
    List<Profesor> listar();
    Profesor porId(String id);
    void crear(Profesor t);
    void editar(Profesor t);
    boolean eliminar(String id);
    boolean exist(String id);
}
