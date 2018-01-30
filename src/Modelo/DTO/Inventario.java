/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

/**
 *
 * @author 123
 */
public class Inventario {
    
    private int numpaquete;
    private String sectorPaquete;
    private String tipoPaquete;

    public Inventario() {
    }

    public Inventario(int numpaquete, String sectorPaquete, String tipoPaquete) {
        this.numpaquete = numpaquete;
        this.sectorPaquete = sectorPaquete;
        this.tipoPaquete = tipoPaquete;
    }

    public int getNumpaquete() {
        return numpaquete;
    }

    public String getSectorPaquete() {
        return sectorPaquete;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setNumpaquete(int numpaquete) {
        this.numpaquete = numpaquete;
    }

    public void setSectorPaquete(String sectorPaquete) {
        this.sectorPaquete = sectorPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
