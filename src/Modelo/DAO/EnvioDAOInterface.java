/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

/**
 *
 * @author fragata
 */
public interface EnvioDAOInterface {
    public Boolean Registrar (EnvioDAOImpl Ed);
    public Boolean Actualizar (EnvioDAOImpl Ed);
    public Boolean Eliminar (Integer identificacion);
    public EnvioDAOImpl Buscar (Integer identificacion);
}
