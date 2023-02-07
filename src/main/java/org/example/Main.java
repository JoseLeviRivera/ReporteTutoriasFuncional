package org.example;

import org.example.Model.Alumno;
import org.example.ScannerModels.ScannerAlumno;
import org.example.Servicio.AlumnoImpl;
import org.example.Util.AlumnoIdGeneration.AlumnoIdGeneration;
import org.example.Util.DatabaseConection.ConexionDB;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ScannerAlumno scannerAlumno = new ScannerAlumno();
        scannerAlumno.iniciar();
        /*Connection connection = ConexionDB.getInstance().getConnection();
        if(connection != null){
            System.out.println("Se establecio la conexion a la base de datos");
        }*/
        /*AlumnoImpl alumno = new AlumnoImpl(connection);
        String id = AlumnoIdGeneration.generateIdAlumno("19010055","2019");
        Alumno alumno1 = new Alumno(id,"19010055","Marcos","Garcia Paez","marcos@gmail.com","2818724542","2811005313","2001","2019","computacion",null);
        Alumno alumno2 = new Alumno();

        alumno.crear(alumno1);*/
        /*
        alumno.eliminar("1901005519");
        alumno.editar(alumno1);
        alumno.crear(alumno1);
        */

        /*Alumno a = alumno.porId("1901004019");
        System.out.println("ID: " + a.getId());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Nombre: " + a.getNombre() + "\n" + "Apellidos: " + a.getApellidos());
        System.out.println("Correo: " + a.getCorreo() + "\n" + "TelefonoCasa: " + a.getTelefonoCasa() + "\n" + "TelefonoCelular: "+a.getTelefonoCelular());
        System.out.println("FechaNacimiento: " +a.getFechaNacimiento() + "\n" + "anioIngreso: "+ a.getAnioIngreso());
        System.out.println("Carrera: " + a.getCarrera()+ "tutodId: " + a.getTutorId());

         */

        /*
        List<Alumno> al = alumno.listar();
        for (Alumno item : al) {
            System.out.println("Id: " + item.getId());
            System.out.println("Matricula: " + item.getMatricula());
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Apellidos: " + item.getApellidos());
            System.out.println("Correo: " + item.getCorreo());
            System.out.println("TelefonoCasa: " + item.getTelefonoCasa());
            System.out.println("TelefonoCelular: " + item.getTelefonoCelular());
            System.out.println("FechaNacimiento: " + item.getFechaNacimiento());
            System.out.println("AnioIngreso: " + item.getAnioIngreso());
            System.out.println("Carrera: " + item.getCarrera());
            System.out.println("IdTutor: " + item.getTutorId());
            System.out.println("-------------------------------------");
        }
         */
    }
}