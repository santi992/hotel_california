package accesoADatos;


import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con = null;
    
    public HabitacionData(){
        con = Conexion.conectar();
    }
   
    private TipoHabData tipoData;

    public void agregarHabitacion(Habitacion habitacion) {
    
        String sql= "INSERT INTO habitacion (idTipoHab,piso,reserva,estado)"+
                "VALUES(?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getIdTipoHab());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3,habitacion.isReserva());
            ps.setBoolean(4, habitacion.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitacion agregada exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla habitaciones "+ ex.getMessage());
            
        }
    }

    public void modificarHabitacion(Habitacion habitacion) {
         
        String sql="UPDATE habitacion SET idTipoHab = idHabitacion = ?,piso = ?,reserva = ?, estado = ? WHERE idHabitacion=?";
    PreparedStatement ps=null;
        try {
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, habitacion.getIdTipoHab());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3,habitacion.isReserva());
            ps.setBoolean(4, habitacion.isEstado());
            ps.setInt(5, habitacion.getIdHabitacion());
            int exito= ps.executeUpdate();
            if (exito==2){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "La habitacion no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitaciones"+ex.getMessage());
        }
}

    public void eliminarHabitacion(int idHabitacion) {
        String sql= "UPDATE habitacion SET estado=0 WHERE idHabitacion=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            int fila=ps.executeUpdate();
            if (fila==1){
                JOptionPane.showMessageDialog(null, "Se eliminó la habitacion");
            }
        }
      catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }
        
    }
    
    public List<Habitacion> listarHabitacionesDisponibles(boolean estado) {
  
        List<Habitacion> habsDisponibles = new ArrayList<>();
        List<Habitacion> todasLasHabitaciones = listarHabitacionesTodas();
        for (Habitacion habitacion : todasLasHabitaciones) {
            if (!habitacion.isReserva() && habitacion.isEstado()) {
                habsDisponibles.add(habitacion);
            }
        }
        return habsDisponibles;
    }
    
    public List listarHabitacoinesNoDisponibles() {
        List<Habitacion> habsNoDisponibles = new ArrayList<>();
        List<Habitacion> todasLasHabitaciones = listarHabitacionesTodas();
        for (Habitacion habitacion : todasLasHabitaciones) {
            if (habitacion.isReserva() || !habitacion.isEstado()) {
                habsNoDisponibles.add(habitacion);
            }
        }
        return habsNoDisponibles;
    }
    
    public List<Habitacion> listarHabitacionesTodas(){
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitaciones";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habs = new Habitacion();

               habs.setIdHabitacion(rs.getInt("idHabitacion"));
               habs.setTipoHabitacion(rs.getInt("IdTipoHab"));
               habs.setPiso(rs.getInt("piso"));
               habs.setReserva(rs.getBoolean("reserva"));
               habs.setEstado(rs.getBoolean("estado"));
               habitaciones.add(habs);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        }
        return habitaciones;
    }
     
    public List listarHabitacionesXPiso(int piso) {
        
        List<Habitacion> habsxPiso = new ArrayList<>();
        String sql = "SELECT * FROM habitaciones WHERE piso = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, piso);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Habitacion habitacion = new Habitacion();
                    habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                    habitacion.setTipoHabitacion(rs.getInt("IdTipoHab"));
                    habitacion.setPiso(rs.getInt("piso"));
                    habitacion.setReserva(rs.getBoolean("reserva"));
                    habitacion.setEstado(rs.getBoolean("estado"));
                    habsxPiso.add(habitacion);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        }
        return habsxPiso;
    }
    
    
    

    public void activarHabitacion(int idHabitacion) {
    //A que se refiere con activar habitacion???
    }

    public void desactivarHabitacion(int idHabitacion) {
    }

    public Habitacion obtenerHabitacion(int idHabitacion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    

    public void cambiarTipo(Habitacion habitacion, TipoHabitacion tipo) {
        String sql = "UPDATE habitaciones SET idTipoHab = ? WHERE idHabitacion = ?";
        PreparedStatement ps=null;
        try {
            ps = con.prepareStatement(sql); 
            ps.setInt(1, habitacion.getIdTipoHab());
            ps.setInt(2, habitacion.getIdHabitacion());
            int exito= ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "El tipo de habitacion fue modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion"+ex.getMessage());
        }
    }
}
