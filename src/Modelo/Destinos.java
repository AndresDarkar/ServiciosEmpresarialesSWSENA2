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
public class Destinos {
    private int numenvio;
    private String lugarEnvio;
    private String lugarDestino;
    private String Tiempopromedio;
    private String importancia;

    public Destinos() {
    }

    public Destinos(int numenvio, String lugarEnvio, String lugarDestino, String Tiempopromedio, String importancia) {
        this.numenvio = numenvio;
        this.lugarEnvio = lugarEnvio;
        this.lugarDestino = lugarDestino;
        this.Tiempopromedio = Tiempopromedio;
        this.importancia = importancia;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getLugarEnvio() {
        return lugarEnvio;
    }

    public void setLugarEnvio(String lugarEnvio) {
        this.lugarEnvio = lugarEnvio;
    }

    public int getNumenvio() {
        return numenvio;
    }

    public void setNumenvio(int numenvio) {
        this.numenvio = numenvio;
    }

    public String getTiempopromedio() {
        return Tiempopromedio;
    }

    public void setTiempopromedio(String Tiempopromedio) {
        this.Tiempopromedio = Tiempopromedio;
    }
    
    
    
}
