/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fragata
 */
public class Persona {
    
    private int numident;
    private String tipoIdent;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;

    public Persona() {
    }

    public Persona(int numident, String tipoIdent, String nombre1, String nombre2, String apellido1, String apellido2) {
        this.numident = numident;
        this.tipoIdent = tipoIdent;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public int getNumident() {
        return numident;
    }

    public String getTipoIdent() {
        return tipoIdent;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setNumident(int numident) {
        this.numident = numident;
    }

    public void setTipoIdent(String tipoIdent) {
        this.tipoIdent = tipoIdent;
    }
        
    
    
    
    
}
