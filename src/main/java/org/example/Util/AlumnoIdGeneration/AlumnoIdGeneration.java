package org.example.Util.AlumnoIdGeneration;

import java.util.stream.Collectors;

public class AlumnoIdGeneration {

    public static String generateIdAlumno(String matricula, String dAnioIngreso){
        return matricula.concat(obtenerUltimosDosDigitos(dAnioIngreso));
    }
    private static String obtenerUltimosDosDigitos(String anioIngreso){
        return anioIngreso.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining(""))
                .substring(Math.max(0, anioIngreso.length() - 2));
    }
}

