/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.DTO.Usuarios;

/**
 *
 * @author ad
 */
public interface GestionUsuariosInterface {
    public Boolean Registrar (Usuarios u );
    public Boolean Actualizar (Usuarios u);
    public Boolean Eliminar (Integer identificacion);
    public Usuarios Buscar (Integer identificacion);
}
