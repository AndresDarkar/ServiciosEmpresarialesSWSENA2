/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

/**
 *
 * @author ad
 */
public interface UsuariosDAOInterface {
    public Boolean Registrar (UsuariosDAOImpl ud);
    public Boolean Actualizar (UsuariosDAOImpl ud);
    public Boolean Eliminar (Integer identificacion);
    public UsuariosDAOImpl Buscar (Integer identificacion);
}
