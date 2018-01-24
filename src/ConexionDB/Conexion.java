/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fragata
 */
public class Conexion {

    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/serviciosem";
    private Connection conexion;

    public Conexion() {
        crearConexion();
    }

    public Connection crearConexion() {

        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            conexion.setAutoCommit(false);
            conexion.setSavepoint();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    private boolean confirmarTransaccion() {
        try {
            conexion.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    private boolean reservarTransaccion() {
        try {
            conexion.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean puntoRestauracion() {
        try {
            conexion.setSavepoint();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean realizarTransaccion() {
        if (confirmarTransaccion()) {
            return true;
        } else if (reservarTransaccion()) {
            return false;
        }
        return false;
    }
}
