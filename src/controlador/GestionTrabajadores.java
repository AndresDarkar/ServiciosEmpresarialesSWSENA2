/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.DTO.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author fragata
 */
public class GestionTrabajadores {
    private static ArrayList<Trabajador> datos;
    
    public GestionTrabajadores(){
        datos=new ArrayList<>();
        Trabajador t1 = new Trabajador(1,"Andres","Sebastian","Parra","Bocanegra","moto","nueva EPS",1);
        Trabajador t2 = new Trabajador(2,"Juan","Carlos","Melo","Camargo","Cicla","cafesalud",3);
        datos.add(t1);
        datos.add(t2);
    }
    
    public ArrayList<Trabajador> mostrarTodosLosUsusarios(){
        return datos;
    }
    
    public Boolean existe(Integer identificacion){
        for(int i=0; i <datos.size(); i++){
            if(datos.get(i).getNumident()==(identificacion)){
                return true;
            }
        }
        return false;
    }

    
}
