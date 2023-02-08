package org.example.ScannerModels;

import org.example.Model.Tutoria;
import org.example.Respositorios.RepositorioTutoria;
import org.example.SuperFuncion.SuperFuncion;

import java.util.Scanner;

public class ScannerTutoria {
    public static void iniciar(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Tutoria");
        System.out.println("Fecha: ");
        String fecha = scanner.nextLine();
        System.out.println("Hora: ");
        String hora = scanner.nextLine();
        System.out.println("Duracion: ");
        String duracion = scanner.nextLine();
        System.out.println("Comentarios: ");
        String comentarios = scanner.nextLine();
        String id_Alumno = "22304hh";
        Tutoria tutoria = new Tutoria(fecha,hora,duracion,comentarios,id_Alumno);
        System.out.println("status: " + SuperFuncion.crear(new RepositorioTutoria(), tutoria));
    }
}
