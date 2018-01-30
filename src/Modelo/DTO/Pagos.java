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
public class Pagos {
    private int numPago;
    private String fechaPa;
    private String tipoPago;
    private String Cliente;
    private String montoPago;

    public Pagos() {
    }

    public Pagos(int numPago, String fechaPa, String tipoPago, String Cliente, String montoPago) {
        this.numPago = numPago;
        this.fechaPa = fechaPa;
        this.tipoPago = tipoPago;
        this.Cliente = Cliente;
        this.montoPago = montoPago;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getFechaPa() {
        return fechaPa;
    }

    public String getMontoPago() {
        return montoPago;
    }

    public int getNumPago() {
        return numPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setFechaPa(String fechaPa) {
        this.fechaPa = fechaPa;
    }

    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    
}
