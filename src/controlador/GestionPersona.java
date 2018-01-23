/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author fragata
 */
public class GestionPersona implements GestionPersonalInterface{

    private static ArrayList<Persona> datos;

    public GestionPersona() {
    
        datos=new ArrayList<>();
        Persona P1 = new Persona(1,"cc","Andres","Sebastian","Parra","Bocanegra");
        Persona P2 = new Persona(2,"cc","Dayuby","Yuraine","Games","Guerrero");
        Persona P3 = new Persona(3,"cc","Yuri","Viviana","Patiño","Casas");
        Persona P4 = new Persona(4,"cc","Julian","Armando","Cuellar","Villa");
    
        datos.add(P1);
        datos.add(P2);
        datos.add(P3);
        datos.add(P4);
    }
    
    
    public ArrayList<Persona> mostrarTodosLosUsusarios(){
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

    @Override
    public Boolean Registrar(Persona P) {
        Boolean Existe = false;
        for (int q = 0; q <datos.size(); q++){
            if (datos.get(q).getNumident()==(P.getNumident())){
                Existe = true;
            }
        }
        if (Existe == false){
            datos.add(P);
            return true;
        }
        return Existe;
    }

    @Override
    public Boolean Actualizar(Persona P) {
        for(int i=0; i <datos.size(); i++){
            if(datos.get(i).getNumident()== P.getNumident()){
                datos.set(i, P);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean Eliminar(Integer identificacion) {
    for (int i=0; i < datos.size(); i++){
            if(datos.get(i).getNumident()==(identificacion)){
                if(datos.remove(i) !=null){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Persona Buscar(Integer identificacion) {
    Persona p=null;
        for (Persona datosPersona:datos){
            if (datosPersona.getNumident()==(identificacion)){
                p=datosPersona;
                return p;
            }
        }
        return p;
    }
    
    
  
    
    
   
    
}
