package org.example.Model;

public class Tutoria {
    private Integer id;
    private String fecha;
    private String hora;
    private String duracion;
    private String comentarios;

    private String alumno_id;
    public Tutoria() {

    }

    public Tutoria(Integer id, String fecha, String hora, String duracion, String comentarios, String alumno_id) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.comentarios = comentarios;
        this.alumno_id = alumno_id;
    }

    public Tutoria(String fecha, String hora, String duracion, String comentarios, String alumno_id) {
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.comentarios = comentarios;
        this.alumno_id = alumno_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(String alumno_id) {
        this.alumno_id = alumno_id;
    }

    @Override
    public String toString() {
        return "Tutoria{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", duracion='" + duracion + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", alumno_id='" + alumno_id + '\'' +
                '}';
    }

}
