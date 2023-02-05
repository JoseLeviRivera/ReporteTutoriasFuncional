package org.example.Util.ProfesorIdGeneration;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProfesorIdGeneration {

    public static String generateIdProfesor(String nombre, String anioIngreso){
        return inicialesNombre(nombre).concat(anioIngreso);
    }

    /*Este código divide el nombre en un arreglo de cadenas usando el método split,
     luego crea un Stream a partir de ese arreglo y usa map para obtener la primera letra de cada nombre.
      Finalmente, se usa collect con Collectors.joining() para unir las letras en una sola cadena.*/
    private static String inicialesNombre(String nombre){
        return Arrays.stream(nombre.split(" "))
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());
    }
}
