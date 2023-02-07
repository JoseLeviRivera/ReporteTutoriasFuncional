package org.example.interfaces;

import org.example.Model.Tutor;
import java.util.List;

public interface CrudRepositorioTutor {
    List<Tutor> listar();
    Tutor porId(String id);
    void crear(Tutor t);
    void editar(Tutor t);
    boolean eliminar(String id);
    boolean exist(String id);
}
