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
public interface FacturasDAOInterface {
    public Boolean Registrar (FacturasDAOImpl fd);
    public Boolean Actualizar (FacturasDAOImpl fd);
    public Boolean Eliminar (Integer identificacion);
    public FacturasDAOImpl Buscar (Integer identificacion);
}
