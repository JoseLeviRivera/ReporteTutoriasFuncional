package org.example.InterfaceRepositorio;

import java.util.List;
/**
 * Esta interfaz define los métodos para crear, actualizar, listar, eliminar, filtrar objetos.
 *
 * @author José Levi Rivera Mendoza
 */
public interface Repositorio {
    /**
     * Crea el objeto especificado.
     *
     * @param o El objeto a procesar
     */
    boolean crear(Object o);
    /**
     * Actualiza el objeto especificado.
     *
     * @param o El objeto a procesar
     */
    boolean actualizar(Object o);
    /**
     * Lista el objeto especificado
     */
    List<Object> listar();
    /**
     * Elimina de acuerdo el id especificado.
     *
     * @param id El id a eliminar
     */
    boolean eliminar(String id);
    /**
     * Filtra el objeto especificado.
     *
     * @param id El id del objeto a filtrar
     */
    Object porId(String id);
    /**
     * Devuelve si existe el id
     *
     * @param id El id a buscar
     */
    boolean existe(String id);
    /**
     * Devuuelve la cantidad de elementos
     */
    long contar();
    List<Object> limitar(Integer n);

}
