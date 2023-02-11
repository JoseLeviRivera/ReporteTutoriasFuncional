package org.example.Util.Listar;

import org.example.Model.Alumno;
import org.example.Model.Profesor;
import org.example.Model.Tutor;
import org.example.Model.Tutoria;
import org.example.Util.DatabaseConection.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
Nombre Autores:
 *@author: Jose Levi
 *@date:  última actualización: 07 de feb 2023
Nombre de la clase o interfaz: ListsContainer
Metodos que se incluyen en la clase
 *@method: obtenerListaProfesores(): Método para consultar de la base de datos los datos de un profesor
 *@return: Devuelve una lista con las datos que tiene un profesor
 *
 * @method: obtenerListaTutores(): Método creado para realizar la consulta de un tutor en la base de datos
 * @return: Devuelve una lista de los datos del tutor
 *
 * @method: obtenerListaAlumnos: Método creado para realizar la consulta de un alumno en la base de datos
 * @return: Devuelve una lista con los datos del alumno
 *
 * @method: obtenerListaTutorias: Método creado para realizar la consulta de un tutoía en la base de datos
 * @return: Devuelve una lista de los datos de la tutoría
 *
 * @method: obtenerListaProfesoresTutores: Método creado para realizar la consulta de un profesor que tiene el rol de tutor.
 * @return: Devuelve una lista de los datos del profesor - tutor
 *
*/
public class ListsContainer {
    public static List<Profesor> obtenerListaProfesores() {
        List<Profesor> listsProfessor = new ArrayList<>();
        Profesor p = new Profesor();
        String readSql = "SELECT * FROM profesores";
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    p.setId(id);
                    String nombre = resultSet.getString("nombre");
                    p.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    p.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    p.setCorreo(correo);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    p.setAnioIngreso(anioIngreso);
                    String gradoAcademico = resultSet.getString("gradoAcademico");
                    p.setGradoAcademico(gradoAcademico);
                    String adscripcion = resultSet.getString("adscripcion");
                    p.setAdscripcion(adscripcion);
                    listsProfessor.add(p);
                    p = new Profesor();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listsProfessor;
    }

    public static  List<Tutor> obtenerListaTutores(){
        List<Tutor> tutorList = new ArrayList<>();
        Tutor tutor = new Tutor();
        String readSql = "SELECT * FROM Tutores";
        try (PreparedStatement readStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    tutor.setId(id);
                    String password = resultSet.getString("password");
                    tutor.setPassword(password);
                    tutorList.add(tutor);
                    tutor = new Tutor();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tutorList;
    }

    public static List<Alumno> obtenerListaAlumnos(){
        List<Alumno> listsAlumnos = new ArrayList<>();
        Alumno a = new Alumno();
        String readSql = "SELECT * FROM alumnos";
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    a.setId(id);
                    String matricula = resultSet.getString("matricula");
                    a.setMatricula(matricula);
                    String nombre = resultSet.getString("nombre");
                    a.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    a.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    a.setCorreo(correo);
                    String telefonoCasa = resultSet.getString("telefonoCasa");
                    a.setTelefonoCasa(telefonoCasa);
                    String telefonoCelular = resultSet.getString("telefonoCelular");
                    a.setTelefonoCelular(telefonoCelular);
                    String fechaNacimiento = resultSet.getString("fechaNacimiento");
                    a.setFechaNacimiento(fechaNacimiento);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    a.setAnioIngreso(anioIngreso);
                    String carrera = resultSet.getString("carrera");
                    a.setCarrera(carrera);
                    String id_tutor = resultSet.getString("tutor_id");
                    a.setTutorId(id_tutor);
                    listsAlumnos.add(a);
                    a = new Alumno();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listsAlumnos;
    }

    public static List<Tutoria> obtenerListaTutorias(){
        List<Tutoria> tutorias = new ArrayList<>();
        Tutoria tutoria = new Tutoria();
        String readSql = "SELECT * FROM tutorias";
        try (PreparedStatement readStatement = ConexionDB.getInstance()
                .getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    tutoria.setId(id);
                    String fecha = resultSet.getString("fecha");
                    tutoria.setFecha(fecha);
                    String hora = resultSet.getString("hora");
                    tutoria.setHora(hora);
                    String duracion = resultSet.getString("duracion");
                    tutoria.setDuracion(duracion);
                    String comentarios = resultSet.getString("comentarios");
                    tutoria.setComentarios(comentarios);
                    String alumno_id = resultSet.getString("alumno_id");
                    tutoria.setAlumno_id(alumno_id);
                    tutorias.add(tutoria);
                    tutoria = new Tutoria();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tutorias;
    }

    public static  List<Profesor> obtenerListaProfesoresTutores(){
        List<Profesor> listsProfessor = new ArrayList<>();
        Profesor p = new Profesor();
        String readSql = "SELECT DISTINCT profesores.id, profesores.nombre, profesores.apellidos, profesores.correo, profesores.anioIngreso, profesores.gradoAcademico , profesores.adscripcion FROM profesores JOIN Tutores ON profesores.id = Tutores.id";
        try (PreparedStatement readStatement = ConexionDB.getInstance().getConnection().prepareStatement(readSql)) {
            try (ResultSet resultSet = readStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    p.setId(id);
                    String nombre = resultSet.getString("nombre");
                    p.setNombre(nombre);
                    String apellidos = resultSet.getString("apellidos");
                    p.setApellidos(apellidos);
                    String correo = resultSet.getString("correo");
                    p.setCorreo(correo);
                    String anioIngreso = resultSet.getString("anioIngreso");
                    p.setAnioIngreso(anioIngreso);
                    String gradoAcademico = resultSet.getString("gradoAcademico");
                    p.setGradoAcademico(gradoAcademico);
                    String adscripcion = resultSet.getString("adscripcion");
                    p.setAdscripcion(adscripcion);
                    listsProfessor.add(p);
                    p = new Profesor();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listsProfessor;
    }
}
