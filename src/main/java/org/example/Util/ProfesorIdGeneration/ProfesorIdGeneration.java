package org.example.Util.ProfesorIdGeneration;

import java.util.Arrays;
import java.util.stream.Collectors;
/**
Nombre Autores:
 @author: José Levi Rivera Mendoza & Carlos Alberto García Páez
Fecha última actualización:
 @date: 04/02/2023
Nombre de la clase o interfaz:
 @name: ProfesorIdGeneration
Metodos que se incluyen en la clase:

 @method generateIdProfesor(String nombre, String anioIngreso): Método creado para generar un id con las iniciales del nombre
 de un profesor y el año de ingreso,requiere los siguiente argumentos de entrada:
 @param nombre : nombre de un profesor
 @param anioIngreso : año de ingreso a la universidad
 @return Devuelve el id del profesor

 @method inicialesNombre(String nombre): Método creado para obtener las iniciales de un nombre
 @param nombre Nombre de un profesor
 @return Iniciales del nombre

*/
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
