package org.example.ScannerModels;

import org.example.Model.Profesor;
import org.example.Respositorios.RespositorioProfesor;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.ProfesorIdGeneration.ProfesorIdGeneration;

import java.util.Scanner;

public class ScannerProfesor {
    public void iniciar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Datos profesor");
        System.out.println("Nombre : ");
        String nombre = scanner.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println("Correo: ");
        String correo = scanner.nextLine();
        System.out.println("anio de ingreso: ");
        String anio = scanner.nextLine();
        System.out.println("grado academico: ");
        String grado = scanner.nextLine();
        System.out.println("adscripcion: ");
        String adsc = scanner.nextLine();
        String id = ProfesorIdGeneration.generateIdProfesor(nombre, anio);
        SuperFuncion.crear(new RespositorioProfesor(), new Profesor(id,nombre, apellidos,correo, anio, grado, adsc));
    }
}
