package org.example.ScannerModels;

import org.example.Model.Tutor;
import org.example.Servicio.TutorImpl;
import org.example.Util.RandomGeneration.RandomPassword;

import java.util.Scanner;

public class ScannerTutor {
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tutor");
        System.out.println("Ingresa el id(Profesor): ");
        //String id = scanner.nextLine();
        String id = "AM2022";
        String password = RandomPassword.generatePassword(10);
        TutorImpl tutor = new TutorImpl();
        tutor.crear(new Tutor(id, password));
    }
}
