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
public class Proveedor extends RepLegal{
    private int nit;
    private String razonPersonal;
    private RepLegal representante;
    private Persona personaNatural;

    public Proveedor() {
    }

    public Proveedor(Persona represenate) {
        super(represenate);
    }

    public Proveedor(int nit, String razonPersonal, RepLegal representante, Persona personaNatural) {
        this.nit = nit;
        this.razonPersonal = razonPersonal;
        this.representante = representante;
        this.personaNatural = personaNatural;
    }

    public Proveedor(int nit, String razonPersonal, RepLegal representante, Persona personaNatural, Persona represenate) {
        super(represenate);
        this.nit = nit;
        this.razonPersonal = razonPersonal;
        this.representante = representante;
        this.personaNatural = personaNatural;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Persona getPersonaNatural() {
        return personaNatural;
    }

    public void setPersonaNatural(Persona personaNatural) {
        this.personaNatural = personaNatural;
    }

    public String getRazonPersonal() {
        return razonPersonal;
    }

    public void setRazonPersonal(String razonPersonal) {
        this.razonPersonal = razonPersonal;
    }

    public RepLegal getRepresentante() {
        return representante;
    }

    public void setRepresentante(RepLegal representante) {
        this.representante = representante;
    }
    
    
    
}
