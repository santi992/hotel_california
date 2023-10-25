/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Imagen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGONB
 */
public class ImagenData {
    
    private Connection con;

    public ImagenData() {
        con = Conexion.conectar();
    }
    
    public void agregarImagen(Imagen imagen) {

        String sql = "INSERT INTO imagen (ruta) VALUES (?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, imagen.getRuta());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Imagen añadida con éxito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla imagen " + ex.getMessage());
        }

    }
    
    public Imagen obtenerImagen(int idImagen){
        Imagen imagen = new Imagen();
        String sql = " SELECT * FROM imagen WHERE idImagen = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idImagen);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                imagen.setIdImagen(rs.getInt("idImagen"));
                imagen.setRuta(rs.getString("ruta"));
                imagen.setImagen(new ImageIcon(getClass().getResource(imagen.getRuta())));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la imagen");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla imagen " + ex.getMessage());

        }
        return imagen;
    }
    
}
