/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

/**
 *
 * @author fragata
 */
public class RepLegal {
    private Persona representante;
    private int numIdenRep;
    private String nombreR;
    private String apellidoR;

    public RepLegal(Persona representante, int numIdenRep, String nombreR, String apellidoR) {
        this.representante = representante;
        this.numIdenRep = numIdenRep;
        this.nombreR = nombreR;
        this.apellidoR = apellidoR;
    }

    public String getApellidoR() {
        return apellidoR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public int getNumIdenRep() {
        return numIdenRep;
    }

    
    public Persona getRepresentante() {
        return representante;
    }

    public void setApellidoR(String apellidoR) {
        this.apellidoR = apellidoR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public void setRepresentante(Persona representante) {
        this.representante = representante;
    }

    public void setNumIdenRep(int numIdenRep) {
        this.numIdenRep = numIdenRep;
    }
    
    
    
    public RepLegal() {
    }

    public RepLegal(Persona representante) {
        this.representante = representante;
    }
    
    
}
