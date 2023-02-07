package org.example.ScannerModels;

import org.example.Model.Alumno;
import org.example.Servicio.AlumnoImpl;
import org.example.Util.AlumnoIdGeneration.AlumnoIdGeneration;
import org.example.Util.DatabaseConection.ConexionDB;

import java.sql.Connection;
import java.util.Scanner;

public class ScannerAlumno {
    public void iniciar(){
        Connection connection = ConexionDB.getInstance().getConnection();
        if(connection != null){
            System.out.println("Se establecio la conexión a la base de datos");
        }
        AlumnoImpl alumno = new AlumnoImpl(connection);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Datos del alumno");
        System.out.println("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println("Correo: ");
        String correo = scanner.nextLine();
        System.out.println("Teléfono Casa: ");
        String telefonoCasa = scanner.nextLine();
        System.out.println("Teléfono Celular: ");
        String telefonoCelular = scanner.nextLine();
        System.out.println("Fecha Nacimiento: ");
        String fechaNacimiento = scanner.nextLine();
        System.out.println("Año ingreso: ");
        String anioIngreso = scanner.nextLine();
        System.out.println("Carrera: ");
        String carrera = scanner.nextLine();
        System.out.println("Desea asignarle un tutor al alumno Y/N: ");
        String opcion = scanner.nextLine();
        String id =  AlumnoIdGeneration.generateIdAlumno(matricula,anioIngreso);
        if (opcion.compareTo("y") == 0 || opcion.compareTo("Y") == 0){
            System.out.println("Id tutor: ");
            String idTutor = scanner.nextLine();
            alumno.crear(new Alumno(id,matricula,nombre,apellidos,correo,telefonoCasa,telefonoCelular,fechaNacimiento,anioIngreso,carrera,idTutor));
        } else {
            System.out.println("Entra que no");
            alumno.crear(new Alumno(id,matricula,nombre,apellidos,correo,telefonoCasa,telefonoCelular,fechaNacimiento,anioIngreso,carrera,null));
        }
        alumno.listar();

    }
}