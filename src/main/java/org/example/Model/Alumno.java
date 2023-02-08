package org.example.Model;
/**
 * Esta clase representa un alumno con un id, matricula, nombre, apellidos, correo, telefono de casa,
 * telefono celular, fecha nacimiento, año de ingreso, carrera, y un tutor.
 *
 * @author Carlos García & José Levi
 * @date: ltima actualización: 04 de feb 2023
 */
public class Alumno {
    private String id;
    private String matricula;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefonoCasa;
    private String telefonoCelular;
    private String fechaNacimiento;
    private String anioIngreso;
    private String carrera;
    private String tutorId;

    public Alumno() {}
    /**
     * Crea un nuevo alumno con la matricula, nombre, apellidos, correo, telefono Casa, telefono de celular, fecha nacimiento, año de ingreso y carrera.
     *
     * @param matricula Matricula del alumno
     * @param nombre Nombre del alumno
     * @param apellidos Apellidos del alumno
     * @param correo Correo del alumno
     * @param telefonoCasa Telefono de casa del alumno
     * @param telefonoCelular Telefono Celular del alumno
     * @param fechaNacimiento Fecha de Nacimiento del alumno
     * @param anioIngreso Año de ingreso del alumno
     * @param carrera Carrera del alumno
     */
    public Alumno(String matricula, String nombre, String apellidos, String correo, String telefonoCasa, String telefonoCelular, String fechaNacimiento, String anioIngreso, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefonoCasa = telefonoCasa;
        this.telefonoCelular = telefonoCelular;
        this.fechaNacimiento = fechaNacimiento;
        this.anioIngreso = anioIngreso;
        this.carrera = carrera;
    }
    /**
     * Crea un nuevo alumno con el id, matricula, nombre, apellidos, correo, telefono Casa, telefono de celular, fecha nacimiento, año de ingreso y carrera.
     *
     * @param id Id del alumno
     * @param matricula Matricula del alumno
     * @param nombre Nombre del alumno
     * @param apellidos Apellidos del alumno
     * @param correo Correo del alumno
     * @param telefonoCasa Telefono de casa del alumno
     * @param telefonoCelular Telefono Celular del alumno
     * @param fechaNacimiento Fecha de Nacimiento del alumno
     * @param anioIngreso Año de ingreso del alumno
     * @param carrera Carrera del alumno
     * @param  tutorId Id del tutor que tiene el alumno
     */
    public Alumno(String id, String matricula, String nombre, String apellidos, String correo, String telefonoCasa, String telefonoCelular, String fechaNacimiento, String anioIngreso, String carrera, String tutorId) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefonoCasa = telefonoCasa;
        this.telefonoCelular = telefonoCelular;
        this.fechaNacimiento = fechaNacimiento;
        this.anioIngreso = anioIngreso;
        this.carrera = carrera;
        this.tutorId = tutorId;
    }
    /**
     * Devuelve el id del alumno.
     * @return Id del alumno.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /**
     * Devuelve la matricula del alumno.
     * @return Matricula del alumno
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * Devuelve el nombre del alumno.
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve los apellidos del alumno.
     * @return Apellidos del alumno
     */
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Devuelve el correo del alumno.
     * @return Correo del alumno
     */
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Devuelve el telefono de casa del alumno.
     * @return TelefonoDeCasa del alumno
     */
    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }
    /**
     * Devuelve el telefono celular del alumno.
     * @return Telefono Celular del alumno
     */
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
    /**
     * Devuelve la fecha de nacimiento del alumno.
     * @return Fecha de nacimiento del alumno
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Devuelve el año de ingreso del alumno.
     * @return Año de ingreso del alumno
     */
    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    /**
     * Devuelve la carrera del alumno.
     * @return Carrera del alumno
     */
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /**
     * Devuelve el id del tutor del alumno.
     * @return IdTutor del alumno
     */
    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + id + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", telefonoCasa='" + telefonoCasa + '\'' +
                ", telefonoCelular='" + telefonoCelular + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", anioIngreso='" + anioIngreso + '\'' +
                ", carrera='" + carrera + '\'' +
                ", tutorId='" + tutorId + '\'' +
                '}';
    }
}