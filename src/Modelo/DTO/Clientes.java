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
public class Clientes {
    
    private int numcliente;
    private String direccionC;
    private int numtelefono;

    public Clientes() {
    }

    public Clientes(int numcliente, String direccionC, int numtelefono) {
        this.numcliente = numcliente;
        this.direccionC = direccionC;
        this.numtelefono = numtelefono;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public int getNumcliente() {
        return numcliente;
    }

    public int getNumtelefono() {
        return numtelefono;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public void setNumcliente(int numcliente) {
        this.numcliente = numcliente;
    }

    public void setNumtelefono(int numtelefono) {
        this.numtelefono = numtelefono;
    }
    
    
    
}
