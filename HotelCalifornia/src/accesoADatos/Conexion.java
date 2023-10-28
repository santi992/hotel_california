/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**  comentario 2308 
 *
 * @author SANTIAGONB
 */
public class Conexion {
    
    private static String url = "jdbc:mariadb://localhost";
    private static String db = "hotelcalifornia";
    private static String user = "root";
    private static String pass = "";
    
   // private static Conexion conexion = null;
    private static Conexion conexion;
    private static Connection con;
    
    
    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de Driver "+ex);
        }
    }
    
    public static Connection conectar() {
       // Connection con = null;
       con =null;
        if (conexion == null) {
            conexion = new Conexion();
        }
        try {
                con = DriverManager.getConnection(url+"/"+db, user, pass);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de Conexión "+ex);
            }
        return con;
    }
    
    public static void cerrarConexion(){
        if (conexion != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException np) {
            }
        }
    }
}
