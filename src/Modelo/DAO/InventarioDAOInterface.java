/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

/**
 *
 * @author 123
 */
public interface InventarioDAOInterface {
    public Boolean Registrar (InventarioDAOImpl id);
    public Boolean Actualizar (InventarioDAOImpl id);
    public Boolean Eliminar (Integer identificacion);
    public InventarioDAOImpl Buscar (Integer identificacion);
}
