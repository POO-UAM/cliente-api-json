/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Estudiante {
    private String id;
    private String nombre;
    private double notaFinal;
    private boolean becado;
    private long edad;

    public Estudiante(String id, String nombre, double notaFinal, boolean becado, long edad) {
        this.id = id;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
        this.becado = becado;
        this.edad = edad;
    }

    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the notaFinal
     */
    public double getNotaFinal() {
        return notaFinal;
    }

    /**
     * @param notaFinal the notaFinal to set
     */
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    /**
     * @return the becado
     */
    public boolean isBecado() {
        return becado;
    }

    /**
     * @param becado the becado to set
     */
    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    /**
     * @return the edad
     */
    public long getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(long edad) {
        this.edad = edad;
    }


    
}
