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
public class Vehiculos {
    
    private int numidenV;
    private String placaV;
    private String MarcaV;
    private String ModeloV;
    private int AñosUsoV;
    private String SeguroV;
    private int AñosSeguroV;

    public Vehiculos() {
    }

    public Vehiculos(int numidenV, String placaV, String MarcaV, String ModeloV, int AñosUsoV, String SeguroV, int AñosSeguroV) {
        this.numidenV = numidenV;
        this.placaV = placaV;
        this.MarcaV = MarcaV;
        this.ModeloV = ModeloV;
        this.AñosUsoV = AñosUsoV;
        this.SeguroV = SeguroV;
        this.AñosSeguroV = AñosSeguroV;
    }

    public int getAñosSeguroV() {
        return AñosSeguroV;
    }

    public int getAñosUsoV() {
        return AñosUsoV;
    }

    public String getMarcaV() {
        return MarcaV;
    }

    public String getModeloV() {
        return ModeloV;
    }

    public int getNumidenV() {
        return numidenV;
    }

    public String getPlacaV() {
        return placaV;
    }

    public String getSeguroV() {
        return SeguroV;
    }

    public void setAñosSeguroV(int AñosSeguroV) {
        this.AñosSeguroV = AñosSeguroV;
    }

    public void setAñosUsoV(int AñosUsoV) {
        this.AñosUsoV = AñosUsoV;
    }

    public void setMarcaV(String MarcaV) {
        this.MarcaV = MarcaV;
    }

    public void setModeloV(String ModeloV) {
        this.ModeloV = ModeloV;
    }

    public void setNumidenV(int numidenV) {
        this.numidenV = numidenV;
    }

    public void setPlacaV(String placaV) {
        this.placaV = placaV;
    }

    public void setSeguroV(String SeguroV) {
        this.SeguroV = SeguroV;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
