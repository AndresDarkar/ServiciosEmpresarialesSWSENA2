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
public interface ClientesDAOInterface {
    public Boolean Registrar (ClientesDAOImpl cd);
    public Boolean Actualizar (ClientesDAOImpl cd);
    public Boolean Eliminar (Integer identificacion);
    public ClientesDAOImpl Buscar (Integer identificacion);
}
