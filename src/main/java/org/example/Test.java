package org.example;

import org.example.Respositorios.RepositorioAlumno;
import org.example.SuperFuncion.SuperFuncion;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> lista = SuperFuncion.listar(new RepositorioAlumno());
        lista.forEach(System.out::println);
    }
}