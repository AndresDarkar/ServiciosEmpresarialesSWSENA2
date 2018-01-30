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
public class Facturas {
    private int numfact;
    private String Cliente;
    private int numpaquetes;
    private Double precioEnvio;
    private String EnvioDesde;
    private String EnvioA;
    private int Descuento;

    public Facturas() {
    }

    public Facturas(int numfact, String Cliente, int numpaquetes, Double precioEnvio, String EnvioDesde, String EnvioA, int Descuento) {
        this.numfact = numfact;
        this.Cliente = Cliente;
        this.numpaquetes = numpaquetes;
        this.precioEnvio = precioEnvio;
        this.EnvioDesde = EnvioDesde;
        this.EnvioA = EnvioA;
        this.Descuento = Descuento;
    }

    public String getCliente() {
        return Cliente;
    }

    public int getDescuento() {
        return Descuento;
    }

    public String getEnvioA() {
        return EnvioA;
    }

    public String getEnvioDesde() {
        return EnvioDesde;
    }

    public int getNumfact() {
        return numfact;
    }

    public Double getPrecioEnvio() {
        return precioEnvio;
    }

    public int getNumpaquetes() {
        return numpaquetes;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    public void setEnvioA(String EnvioA) {
        this.EnvioA = EnvioA;
    }

    public void setEnvioDesde(String EnvioDesde) {
        this.EnvioDesde = EnvioDesde;
    }

    public void setNumfact(int numfact) {
        this.numfact = numfact;
    }

    public void setNumpaquetes(int numpaquetes) {
        this.numpaquetes = numpaquetes;
    }

    public void setPrecioEnvio(Double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }
    
    
}
