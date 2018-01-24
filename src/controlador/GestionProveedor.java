/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.DTO.Proveedor;
import java.util.ArrayList;

/**
 *
 * @author fragata
 */
public class GestionProveedor implements GestionProveedorInterface{
    
    private static ArrayList<Proveedor> datos;
    
    public GestionProveedor(){
        datos=new ArrayList<>();
        Proveedor pr1 = new Proveedor(1,"envia",null,null);
        Proveedor pr2 = new Proveedor(2,"Servientrega",null,null);
        Proveedor pr3 = new Proveedor(3,"gobernacion",null,null);
        
        datos.add(pr1);
        datos.add(pr2);
        datos.add(pr3);
    }
    
    public ArrayList<Proveedor> mostrarTodosLosUsusarios(){
        return datos;
    }
    
    public Boolean existe(Integer identificacion){
        for(int i=0; i <datos.size(); i++){
            if(datos.get(i).getNit()==(identificacion)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean Registrar(Proveedor Pr) {
        Boolean Existe = false;
        for (int q = 0; q <datos.size(); q++){
            if (datos.get(q).getNit()==(Pr.getNit())){
                Existe = true;
            }
        }
        if (Existe == false){
            datos.add(Pr);
            return true;
        }
        return Existe;
    }

    @Override
    public Boolean Actualizar(Proveedor pr) {
        for(int i=0; i <datos.size(); i++){
            if(datos.get(i).getNit()== pr.getNit()){
                datos.set(i, pr);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean Eliminar(Integer nit) {
    for (int i=0; i < datos.size(); i++){
            if(datos.get(i).getNit()==(nit)){
                if(datos.remove(i) !=null){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Proveedor Buscar(Integer nit) {
    Proveedor pr=null;
        for (Proveedor datosProveedor:datos){
            if (datosProveedor.getNit()==(nit)){
                pr=datosProveedor;
                return pr;
            }
        }
        return pr;
    }
    
}
