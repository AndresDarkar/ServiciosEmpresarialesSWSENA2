/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Proveedor;

/**
 *
 * @author fragata
 */
public interface GestionProveedorInterface {
    public Boolean Registrar (Proveedor pr );
    public Boolean Actualizar (Proveedor pr);
    public Boolean Eliminar (Integer nit);
    public Proveedor Buscar (Integer nit);
}
