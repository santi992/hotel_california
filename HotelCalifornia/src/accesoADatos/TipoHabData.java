package accesoADatos;


import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TipoHabData {

    private Connection con;

    private HabitacionData habData;

    public void agregarTipo(TipoHabitacion tipo) {
        String sql= "INSERT INTO TipoHabitacion (  nombre, cantPersonas,  cantCamas,  precioxNoche)"+
                "VALUES(?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(2, tipo.getNombre());
            ps.setInt(3,tipo.getCantPersonas());
            ps.setInt(4, tipo.getCantCamas());
            ps.setDouble(5, tipo.getPrecioxNoche());
                    
                
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
                tipo.setIdTipoHab(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " Tipo de habitación agregada exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla TipoHabitación "+ ex.getMessage());
            
        }
    }

    public void modificarTipo(TipoHabitacion tipo) { //modificar los datos
        String sql= "UPDATE tipohabitacion SET idTipoHab=?,cantPersonas=?,cantCamas=?,tipoCamas=?,precioxNoche=? WHERE idTipoHab= ?";
        
        PreparedStatement ps;
         
        try {
            ps =con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipoHab());
            ps.setInt(2, tipo.getCantPersonas());
            ps.setInt(3, tipo.getCantCamas());
            ps.setInt(4, tipo;// agregar tipo cama a traibutos en clase tipoHabitacion enpaquete entidades
            ps.setDouble(5, tipo.getPrecioxNoche());
            ps.setString(0, sql);
        } catch (SQLException ex) {
            Logger.getLogger(TipoHabData.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoHabData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarTipo(TipoHabitacion tipo) {
    }

    public List listarTipos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double cambiarPrecio(TipoHabitacion tipo, double precio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TipoHabitacion obtenerTipo(int idTipoHab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TipoHabitacion obtenerTipoXNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TipoHabitacion obtenerTipoXHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
