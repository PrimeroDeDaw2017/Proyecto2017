/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    Connection conn;
    Statement stmt;
    
    static ConexionBD instancia = null;
    
    private ConexionBD() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://10.1.3.114:3306/ventasbd","root","mysql");
            stmt = conn.createStatement();
        }
        catch(SQLException e) {
          //  throw new ErrorConexionBD();
          e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public Statement getStatement() {
        return stmt;
    }
    
    public static void crearConexion() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
    }
    
    public static ConexionBD instancia() {
        return instancia;
    }
    
    public static void desconectar() {
        if (instancia != null) {
            try {
                instancia.stmt.execute("shutdown");
                instancia.stmt.close();
                instancia.conn.close();
                instancia = null;
            }
            catch(SQLException e) {
            }
        }
    }
}