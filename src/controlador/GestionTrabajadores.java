/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.trabajadores;
import java.util.ArrayList;

/**
 *
 * @author fragata
 */
public class GestionTrabajadores {
    private static ArrayList<trabajadores> datos;
    
    public GestionTrabajadores(){
        datos=new ArrayList<>();
        trabajadores t1 = new trabajadores(1,"Andres","Sebastian","Parra","Bocanegra","moto","nueva EPS",1);
        trabajadores t2 = new trabajadores(2,"Juan","Carlos","Melo","Camargo","Cicla","cafesalud",3);
        
    }
}
