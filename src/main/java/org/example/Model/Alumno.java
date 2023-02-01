package org.example.Model;

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

    public Alumno() {
    }

    public Alumno(String id, String matricula, String nombre, String apellidos, String correo, String telefonoCasa, String telefonoCelular, String fechaNacimiento, String anioIngreso, String carrera) {
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
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
                '}';
    }

}
