package org.example.Util.RandomGeneration;

import java.security.SecureRandom;
import java.util.Random;

public class RandomPassword {
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random rng = new SecureRandom();
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(rng.nextInt(characters.length())));
        }
        return password.toString();
    }
}
