/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.DTO.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author ad
 */
public class GestionUsuarios{
    
    private ArrayList<Usuarios> datos;

    public GestionUsuarios() {
        datos=new ArrayList<>();
        Usuarios u1 = new Usuarios("Andres","4469");
        Usuarios u2 = new Usuarios("Jose","campeon2012");
        
        datos.add(u1);
        datos.add(u2);
    }

    public GestionUsuarios(ArrayList<Usuarios> datos) {
        this.datos = datos;
    }
    
    
    public Boolean existe(String identificacion){
        for(int i=0; i <datos.size(); i++){
            if(datos.get(i).getUsuario()==(identificacion)){
                return true;
            }
        }
        return false;
    }

    
}
