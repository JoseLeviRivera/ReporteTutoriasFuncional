package org.example.ScannerModels;


import org.example.Model.Tutor;
import org.example.Respositorios.RepositorioTutor;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.RandomGeneration.RandomPassword;

import java.util.Scanner;

public class ScannerTutor {
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tutor");
        System.out.println("Ingresa el id(Profesor): ");
        String id = scanner.nextLine();
        String password = RandomPassword.generatePassword(10);
        Tutor tutor = new Tutor(id, password);
        System.out.println("status: " + SuperFuncion.crear(new RepositorioTutor(), tutor));

    }
}
