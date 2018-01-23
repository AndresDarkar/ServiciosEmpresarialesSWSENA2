/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Persona;

/**
 *
 * @author fragata
 */
public interface GestionPersonalInterface {
    public Boolean Registrar (Persona P );
    public Boolean Actualizar (Persona P);
    public Boolean Eliminar (Integer identificacion);
    public Persona Buscar (Integer identificacion);
    
}
