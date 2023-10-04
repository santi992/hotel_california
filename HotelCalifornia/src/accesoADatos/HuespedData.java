package accesoADatos;

import entidades.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class HuespedData {

    private Connection con;
        public HuespedData(){
        con= Conexion.conectar();
        }
   
        public void agregarHuesped(Huesped huesped) {
           String sql= "INSERT INTO huesped(`nombre`, `apellido`, `dni`, `Domicilio`, `Provincia`, `Localidad`, `Correo`, `Celular`)"
                   + " VALUES (?,?,?,?,?,?,?,?)";
           
           
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDireccion());
            ps.setString(5, huesped.getProvincia());
            ps.setString(6, huesped.getLocalidad());
            ps.setString(7, huesped.getCorreo());
            ps.setInt(8, huesped.getCelular());

            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped añadido con éxito");
            }
            ps.close();
    
        } catch (SQLException ef) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped "+ ef.getMessage());
            
        }
        }
    public void modificarHuesped(Huesped huesped) {
    }

    public void eliminarHuesped(Huesped huesped) {
    }

    public List listarHuespedes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Huesped obtenerHuesped(int idHuesped) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Huesped obtenerHuespedXDni(int dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
