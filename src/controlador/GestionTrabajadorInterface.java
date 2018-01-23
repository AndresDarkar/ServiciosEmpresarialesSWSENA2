/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.trabajadores;

/**
 *
 * @author fragata
 */
public interface GestionTrabajadorInterface {
    public Boolean Registrar (trabajadores t );
    public Boolean Actualizar (trabajadores t);
    public Boolean Eliminar (Integer identificacion);
    public trabajadores Buscar (Integer identificacion);
}
