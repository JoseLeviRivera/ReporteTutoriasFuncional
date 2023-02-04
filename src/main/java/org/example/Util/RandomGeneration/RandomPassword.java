package org.example.Util.RandomGeneration;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomPassword {
    //el método IntStream.range para generar un flujo de enteros que
    // representan los índices de los caracteres de la contraseña. Luego, se
    // utiliza el método mapToObj para transformar cada índice en un carácter
    // de la cadena de caracteres, y el método map para transformar cada carácter
    // en una cadena. Finalmente, se utiliza el método collect para juntar todas
    // las cadenas en una sola cadena, que es la contraseña resultante.
    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random rng = new SecureRandom();
        return IntStream.range(0, length)
                .mapToObj(i -> characters.charAt(rng.nextInt(characters.length())))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
