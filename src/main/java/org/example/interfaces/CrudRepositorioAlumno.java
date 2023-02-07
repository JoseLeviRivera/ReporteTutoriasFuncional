package org.example.interfaces;

import org.example.Model.Alumno;

import java.util.List;

public interface CrudRepositorioAlumno {
    List<Alumno> listar();
    Alumno porId(String id);
    void crear(Alumno t);
    void editar(Alumno t);
    boolean eliminar(String id);
    boolean existe(String id);
}
