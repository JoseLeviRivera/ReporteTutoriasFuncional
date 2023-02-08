package org.example.InterfaceRepositorio;

import java.util.List;

public interface Repositorio {
    boolean crear(Object o);
    boolean actualizar(Object o);
    List<Object> listar();
    boolean eliminar(String id);
    Object porId(String id);
    boolean existe(String id);
    long contar();
    List<Object> limitar(Integer n);

}
