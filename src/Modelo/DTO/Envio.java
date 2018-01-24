/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

import java.sql.Timestamp;

/**
 *
 * @author fragata
 */
public class Envio {
    private int numenvio;
    private Timestamp horaFechaEnvio;
    private String lugarEnvio;
    private String lugarDestino;
    private String Tiempopromedio;
    private String importancia;

    public Envio() {
    }

    public Envio(int numenvio, Timestamp horaFechaEnvio, String lugarEnvio, String lugarDestino, String Tiempopromedio, String importancia) {
        this.numenvio = numenvio;
        this.horaFechaEnvio = horaFechaEnvio;
        this.lugarEnvio = lugarEnvio;
        this.lugarDestino = lugarDestino;
        this.Tiempopromedio = Tiempopromedio;
        this.importancia = importancia;
    }

    public Timestamp getHoraFechaEnvio() {
        return horaFechaEnvio;
    }

    public void setHoraFechaEnvio(Timestamp horaFechaEnvio) {
        this.horaFechaEnvio = horaFechaEnvio;
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
