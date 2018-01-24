/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.DTO.Trabajador;

/**
 *
 * @author fragata
 */
public interface GestionTrabajadorInterface {
    public Boolean Registrar (Trabajador t );
    public Boolean Actualizar (Trabajador t);
    public Boolean Eliminar (Integer identificacion);
    public Trabajador Buscar (Integer identificacion);
}
