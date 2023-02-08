package org.example.SuperFuncion;

import org.example.InterfaceRepositorio.Repositorio;
import java.util.List;
public class SuperFuncion {

    public static List<Object> listar(Repositorio repositorio){
        return repositorio.listar();
    }

    public static Boolean crear(Repositorio repositorio, Object o){
        return repositorio.crear(o);
    }

    public static Boolean actualizar(Repositorio repositorio, Object o){
        return repositorio.actualizar(o);
    }

    public static Boolean eliminar(Repositorio repositorio, String id){
        return repositorio.eliminar(id);
    }

    public static Object porId(Repositorio repositorio, String id){
        return repositorio.porId(id);
    }

    public  static Boolean existe(Repositorio repo, String id){
        return repo.existe(id);
    }
}
