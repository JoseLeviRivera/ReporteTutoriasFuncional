package org.example.Model;

public class Tutoria {
    private String fecha;
    private String hora;
    private String duracion;
    private String comentarios;

    public Tutoria() {

    }

    public Tutoria(String fecha, String hora, String duracion, String comentarios) {
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.comentarios = comentarios;
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
}
