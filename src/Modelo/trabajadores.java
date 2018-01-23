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
public class trabajadores {
    private Integer numident;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String vehiculo;
    private String seguro;
    private Integer añosTrabajo;

    public trabajadores() {
    }

    public trabajadores(Integer numident, String nombre1, String nombre2, String apellido1, String apellido2, String vehiculo, String seguro, Integer añosTrabajo) {
        this.numident = numident;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.vehiculo = vehiculo;
        this.seguro = seguro;
        this.añosTrabajo = añosTrabajo;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Integer getAñosTrabajo() {
        return añosTrabajo;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public Integer getNumident() {
        return numident;
    }

    public String getSeguro() {
        return seguro;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setAñosTrabajo(Integer añosTrabajo) {
        this.añosTrabajo = añosTrabajo;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setNumident(Integer numident) {
        this.numident = numident;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
