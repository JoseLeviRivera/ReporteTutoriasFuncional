package org.example.Util.RandomGeneration;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 @author: José Levi Rivera Mendoza & Carlos Alberto García Páez
 @date última actualización: 01/02/23
 @name RandomPassword
Métodos que se incluyen en la clase:
 @method generatePassword(int length): Método creado para generar una contraseña de manera aleatoria
 @param length para la longuitud de la contraseña generada
 @return Devuelve una cadena generada aleatoriamente utilizando el metodo de stream de la api 8 de java.
 Más descripción: El método IntStream.range para generar un flujo de enteros que
 representan los índices de los caracteres de la contraseña. Luego, se
 utiliza el método mapToObj para transformar cada índice en un carácter
 de la cadena de caracteres, y el método map para transformar cada carácter
 en una cadena. Finalmente, se utiliza el método collect para juntar todas
 las cadenas en una sola cadena, que es la contraseña resultante.
**/

public class RandomPassword {
    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random rng = new SecureRandom();
        return IntStream.range(0, length)
                .mapToObj(i -> characters.charAt(rng.nextInt(characters.length())))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
