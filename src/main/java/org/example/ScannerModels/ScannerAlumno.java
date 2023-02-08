package org.example.ScannerModels;

import org.example.Model.Alumno;
import org.example.Respositorios.RepositorioAlumno;
import org.example.SuperFuncion.SuperFuncion;
import org.example.Util.AlumnoIdGeneration.AlumnoIdGeneration;
import org.example.Util.DatabaseConection.ConexionDB;

import java.sql.Connection;
import java.util.Scanner;

public class ScannerAlumno {
    final static String ID = "N/A";
    public void iniciar(){
        Alumno alumno = new Alumno();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Datos del alumno");
        System.out.println("Matrícula: ");
        String matricula = scanner.nextLine();
        alumno.setMatricula(matricula);
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        alumno.setNombre(nombre);
        System.out.println("Apellidos: ");
        String apellidos = scanner.nextLine();
        alumno.setApellidos(apellidos);
        System.out.println("Correo: ");
        String correo = scanner.nextLine();
        alumno.setCorreo(correo);
        System.out.println("Teléfono Casa: ");
        String telefonoCasa = scanner.nextLine();
        alumno.setTelefonoCasa(telefonoCasa);
        System.out.println("Teléfono Celular: ");
        String telefonoCelular = scanner.nextLine();
        alumno.setTelefonoCelular(telefonoCelular);
        System.out.println("Fecha Nacimiento: ");
        String fechaNacimiento = scanner.nextLine();
        alumno.setFechaNacimiento(fechaNacimiento);
        System.out.println("Año ingreso: ");
        String anioIngreso = scanner.nextLine();
        alumno.setAnioIngreso(anioIngreso);
        System.out.println("Carrera: ");
        String carrera = scanner.nextLine();
        alumno.setCarrera(carrera);
        //System.out.println("Desea asignarle un tutor al alumno Y/N: ");
        //String opcion = scanner.nextLine();
        String id =  AlumnoIdGeneration.generateIdAlumno(matricula,anioIngreso);
        alumno.setId(id);
        String idTutor = "N2003";
        alumno.setTutorId(idTutor);
        System.out.println(alumno);
        System.out.println("status: " + SuperFuncion.crear(new RepositorioAlumno(), alumno));

    }
}