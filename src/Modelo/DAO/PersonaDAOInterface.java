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
public interface PersonaDAOInterface {
    public Boolean Registrar (PersonaDAOImpl pd);
    public Boolean Actualizar (PersonaDAOImpl pd);
    public Boolean Eliminar (Integer identificacion);
    public PersonaDAOImpl Buscar (Integer identificacion);
}
