package accesoADatos;


import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            ps.setString(4, tipo.getTipoCamas());// agregar tipo cama a traibutos en clase tipoHabitacion enpaquete entidades
            ps.setDouble(5, tipo.getPrecioxNoche());
            ps.setInt(6, tipo.getIdTipoHab()); // dudaaa
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitacion"+ ex);
        
           
    }
    }
    public void DarDeBajaTipo(TipoHabitacion tipo) {//veeer no hay estado
        String sql=" UPDATE tipohabitacion SET `estado`=0 WHERE idTipoHab=?";
       PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipoHab());
            int ok=ps.executeUpdate();
            if(ok==1){
                JOptionPane.showConfirmDialog(null, "El tipo habitación con id:"+ tipo.getIdTipoHab()+ " se ha dado de baja exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación "+ ex);
        }
       
        
    }
public void DarDeAltaTipo(TipoHabitacion tipo) {//veeer no hay estado
        String sql=" UPDATE tipohabitacion SET `estado`=1 WHERE idTipoHab=?";
       PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipoHab());
            int ok=ps.executeUpdate();
            if(ok==1){
                JOptionPane.showConfirmDialog(null, "El tipo habitación con id:"+ tipo.getIdTipoHab()+ " se ha dado de alta exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación "+ ex);
        }
       
        
    }

    

    public ArrayList<TipoHabitacion> listarTipos() {
//        	
//idTipoHab	
//cantPersonas	
//cantCamas	
//tipoCamas	
//precioxNoche
        ArrayList listaTipoHab = new ArrayList<>();

        String sql = "SELECT * FROM tipohabitacion";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion th = new TipoHabitacion();
                th.setIdTipoHab(rs.getInt("idTipoHab"));
                th.setCantPersonas(rs.getInt("cantPersonas"));
                th.setCantCamas(rs.getInt("cantCamas"));
                th.setTipoCamas(rs.getString("tipoCamas"));
                th.setPrecioxNoche(rs.getDouble("precioxNoche"));
                listaTipoHab.add(th);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }

        return listaTipoHab;
    }

    public double cambiarPrecio(TipoHabitacion tipo, double precio) { // para mi tendria que ser void
       String sql=" UPDATE tipohabitacion SET `precioxNoche`='?' WHERE idTipoHab=?";
       PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2, tipo.getIdTipoHab());
            int ok=ps.executeUpdate();
            if(ok==1){
                JOptionPane.showConfirmDialog(null, "Precio del tipo habitación con id:"+ tipo.getIdTipoHab()+ " se ha modificado exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación "+ ex);
        }
       
        return precio;
    }

    public TipoHabitacion obtenerTipoxId(int idTipoHab) {
       //idTipoHab	
//cantPersonas	
//cantCamas	
//tipoCamas	
//precioxNoche 
        TipoHabitacion busquedaxId = null;
        String sql = "SELECT * FROM tipohabitacion WHERE idTipoHab=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipoHab);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                busquedaxId = new TipoHabitacion();
                busquedaxId.setIdTipoHab(rs.getInt("idTipoHab"));
                busquedaxId.setCantPersonas(rs.getInt("cantPersonas"));
                busquedaxId.setCantCamas(rs.getInt("cantCamas"));
                busquedaxId.setPrecioxNoche(rs.getDouble("precioxNoche"));
            } else {
                JOptionPane.showMessageDialog(null, "El idTipoHabitación:" + idTipoHab + " ingresado no existe o no está activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxId;

    }
     

    public TipoHabitacion obtenerTipoXPrecio(Double precio) { // cambio nombre x Precio
        TipoHabitacion busquedaxPrecio = null;
        String sql = "SELECT * FROM tipohabitacion WHERE precioxNoche=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                busquedaxPrecio = new TipoHabitacion();
                busquedaxPrecio.setIdTipoHab(rs.getInt("idTipoHab"));
                busquedaxPrecio.setCantPersonas(rs.getInt("cantPersonas"));
                busquedaxPrecio.setCantCamas(rs.getInt("cantCamas"));
                busquedaxPrecio.setPrecioxNoche(rs.getDouble("precioxNoche"));
            } else {
                JOptionPane.showMessageDialog(null, "El monto" + precio + " ingresado no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxPrecio;
    }
    
      public TipoHabitacion obtenerTipoXCantCamas(TipoHabitacion nroCamas) {
        TipoHabitacion busquedaxCantCamas = null;
        String sql = "SELECT * FROM tipohabitacion WHERE cantCamas=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroCamas.getCantCamas());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                busquedaxCantCamas = new TipoHabitacion();
                busquedaxCantCamas.setIdTipoHab(rs.getInt("idTipoHab"));
                busquedaxCantCamas.setCantPersonas(rs.getInt("cantPersonas"));
                busquedaxCantCamas.setCantCamas(rs.getInt("cantCamas"));
                busquedaxCantCamas.setPrecioxNoche(rs.getDouble("precioxNoche"));
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad de camas " + nroCamas + " ingresado no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxCantCamas;
    }
   public TipoHabitacion obtenerTipoXtipoCamas(TipoHabitacion tipoCama) {
        TipoHabitacion busquedaxTipoCama = null;
        String sql = "SELECT * FROM tipohabitacion WHERE tipoCamas=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoCama.getTipoCamas());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                busquedaxTipoCama = new TipoHabitacion();
                busquedaxTipoCama.setIdTipoHab(rs.getInt("idTipoHab"));
                busquedaxTipoCama.setCantPersonas(rs.getInt("cantPersonas"));
                busquedaxTipoCama.setCantCamas(rs.getInt("cantCamas"));
                busquedaxTipoCama.setPrecioxNoche(rs.getDouble("precioxNoche"));
            } else {
                JOptionPane.showMessageDialog(null, "La tipo de cama " + tipoCama + " ingresado no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxTipoCama;
     
   }
    public TipoHabitacion obtenerTipoXHabitacion(Habitacion habitacion) {// NO ENTENDER!!!
     

      
      TipoHabitacion th= new TipoHabitacion();
        String sql = "SELECT * FROM tipohabitacion WHERE idHabitacion=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
             th.setIdTipoHab(rs.getInt("idTipoHab"));
             th.setCantPersonas(rs.getInt("cantPersonas"));
             th.setCantCamas(rs.getInt("cantCamas"));
             th.setTipoCamas(rs.getString("tipoCamas"));
             th.setPrecioxNoche(rs.getDouble("precioxNoche"));
                
               
            } else {
                JOptionPane.showMessageDialog(null, "El idHabitacion" + habitacion + " ingresado no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return th;
       
    }
}

