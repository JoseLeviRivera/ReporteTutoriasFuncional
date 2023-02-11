package org.example.Model;
/**
 * Esta clase representa a un tutor que contiene un id y una contraseña
 * @author Jose Levi Rivera Mendoza
 * @date 8 feb 2023
 */
public class Tutor {

    public Tutor(){}

    /**
     * Crea un nuevo Profesor con el id y una contraseña que se genera automaticamente de forma aleatoria.
     *
     * @param id El id Tutor
     * @param password La contraeña deñ tutor
     */
    public Tutor(String id, String password) {
        this.id = id;
        this.password = password;
    }

    private String id;
    private String password;

    /**
     * Devuelve el Id de tutores
     * @return Id del tutor
     */
    public String getId() {
        return id;
    }

    /**
     * Crea un id para el tutor.
     *
     * @param id Id del tutor
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Devuelve el Password de tutores
     * @return Password del tutor
     */
    public String getPassword() {
        return password;
    }

    /**
     * Crea una contraseña para el tutor
     *
     * @param password Password del tutor
     *
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
