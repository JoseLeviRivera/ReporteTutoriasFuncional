package org.example.Model;

public class Profesor {
    private String id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String anioIngreso;
    private String gradoAcademico;
    private String adscripcion;

    public Profesor() {
    }

    public Profesor(String id, String nombre, String apellidos, String correo, String anioIngreso, String gradoAcademico, String adscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.anioIngreso = anioIngreso;
        this.gradoAcademico = gradoAcademico;
        this.adscripcion = adscripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", anioIngreso='" + anioIngreso + '\'' +
                ", gradoAcademico='" + gradoAcademico + '\'' +
                ", adscripcion='" + adscripcion + '\'' +
                '}';
    }
}
