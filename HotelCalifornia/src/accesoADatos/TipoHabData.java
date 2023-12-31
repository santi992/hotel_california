package accesoADatos;

import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TipoHabData {

    private Connection con = null;   // atributo

    public TipoHabData() {     // constructor 
        con = Conexion.conectar();
    }

    public void agregarTipo(TipoHabitacion tipo) {

        String sql = "INSERT INTO TipoHabitacion (  idTipoHab, nombre, cantPersonas,  cantCamas, tipoCamas, precioxNoche, estado)"
                + " VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipoHab());
            ps.setString(2, tipo.getNombre());
            ps.setInt(3, tipo.getCantPersonas());
            ps.setInt(4, tipo.getCantCamas());
            ps.setString(5, tipo.getTipoCamas());
            ps.setDouble(6, tipo.getPrecioxNoche());
            ps.setBoolean(7, tipo.isEstado());

            int filasAfectadas = ps.executeUpdate(); // si se agrega una fila(>0), se agregan los datos

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, " Tipo de habitación agregado exitosamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla TipoHabitación " + ex.getMessage());

        }
    }

    public void modificarTipo(TipoHabitacion tipo) { //modificar los datos

        String sql = "UPDATE tipohabitacion SET nombre = ?, cantPersonas=?,cantCamas=?,tipoCamas=?,precioxNoche=?, estado = ? WHERE idTipoHab= ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
//          ps.setInt(1, tipo.getIdTipoHab());
            ps.setString(1, tipo.getNombre());// agregar tipo cama a traibutos en clase tipoHabitacion enpaquete entidades
            ps.setInt(2, tipo.getCantPersonas());
            ps.setInt(3, tipo.getCantCamas());
            ps.setString(4, tipo.getTipoCamas());// agregar tipo cama a traibutos en clase tipoHabitacion enpaquete entidades
            ps.setDouble(5, tipo.getPrecioxNoche());
            ps.setBoolean(6, tipo.isEstado());
            ps.setInt(7, tipo.getIdTipoHab());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "* Tipo de habitacion modificada exitosamente! *");
            } else {
                JOptionPane.showMessageDialog(null, "* ERROR! No  se pudo proceder con la modificación *");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitacion" + ex);

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de error al cerrar PreparedStatement
            }
        }
    }

    public void darDeBajaTipo(TipoHabitacion tipo) {

        String sql = " UPDATE tipohabitacion SET estado = 0 WHERE idTipoHab=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipoHab());
            int ok = ps.executeUpdate();
//            if (ok == 1) {
//                JOptionPane.showConfirmDialog(null, "El tipo habitación con id:" + tipo.getIdTipoHab() + " se ha dado de baja exitosamente");
//            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }

    }

    public void darDeAltaTipo(TipoHabitacion tipo) {//veeer no hay estado

        String sql = " UPDATE tipohabitacion SET estado=1 WHERE idTipoHab=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipoHab());
            int ok = ps.executeUpdate();
//            if (ok == 1) {
//                JOptionPane.showConfirmDialog(null, "El tipo habitación con id:" + tipo.getIdTipoHab() + " se ha dado de alta exitosamente");
//            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
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
                th.setNombre(rs.getString("nombre"));
                th.setCantPersonas(rs.getInt("cantPersonas"));
                th.setCantCamas(rs.getInt("cantCamas"));
                th.setTipoCamas(rs.getString("tipoCamas"));
                th.setPrecioxNoche(rs.getDouble("precioxNoche"));
                th.setEstado(rs.getBoolean("estado"));
                listaTipoHab.add(th);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }

        return listaTipoHab;
    }

    public ArrayList<TipoHabitacion> listarTiposXPiso(int piso) {
//        	
//idTipoHab	
//cantPersonas	
//cantCamas	
//tipoCamas	
//precioxNoche

        ArrayList listaTipoHab = new ArrayList<>();

        String sql = "SELECT DISTINCT tipohabitacion.idTipoHab, tipohabitacion.nombre, tipohabitacion.cantPersonas, "
                + "tipohabitacion.cantCamas, tipohabitacion.tipoCamas, tipohabitacion.precioxNoche , "
                + "tipohabitacion.estado FROM tipohabitacion "
                + "JOIN habitacion ON tipohabitacion.idTipoHab = habitacion.idTipoHab WHERE habitacion.piso = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, piso);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion th = new TipoHabitacion();
                th.setIdTipoHab(rs.getInt("idTipoHab"));
                th.setNombre(rs.getString("nombre"));
                th.setCantPersonas(rs.getInt("cantPersonas"));
                th.setCantCamas(rs.getInt("cantCamas"));
                th.setTipoCamas(rs.getString("tipoCamas"));
                th.setPrecioxNoche(rs.getDouble("precioxNoche"));
                th.setEstado(rs.getBoolean("estado"));
                listaTipoHab.add(th);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }

        return listaTipoHab;
    }

    public double cambiarPrecio(TipoHabitacion tipo, double precio) { // para mi tendria que ser void

        String sql = " UPDATE tipohabitacion SET `precioxNoche`='?' WHERE idTipoHab=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2, tipo.getIdTipoHab());
            int ok = ps.executeUpdate();
            if (ok == 1) {
                JOptionPane.showConfirmDialog(null, "Precio del tipo habitación con id:" + tipo.getIdTipoHab() + " se ha modificado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
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
        Habitacion hab = null;
        String sql = "SELECT * FROM tipohabitacion WHERE idTipoHab=?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idTipoHab);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    busquedaxId = new TipoHabitacion();
                    hab = new Habitacion();
                    busquedaxId.setIdTipoHab(rs.getInt("idTipoHab"));
                    busquedaxId.setNombre(rs.getString("nombre"));
                    busquedaxId.setCantPersonas(rs.getInt("cantPersonas"));
                    busquedaxId.setCantCamas(rs.getInt("cantCamas"));
                    busquedaxId.setTipoCamas(rs.getString("tipoCamas"));
                    busquedaxId.setPrecioxNoche(rs.getDouble("precioxNoche"));
                    busquedaxId.setEstado(rs.getBoolean("estado"));

                } else {
                    JOptionPane.showMessageDialog(null, "El idTipoHabitación:" + idTipoHab + " ingresado no existe o no está activo");
                }
                ps.close();
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
                busquedaxPrecio.setNombre(rs.getString("nombre"));
                busquedaxPrecio.setCantPersonas(rs.getInt("cantPersonas"));
                busquedaxPrecio.setCantCamas(rs.getInt("cantCamas"));
                busquedaxPrecio.setTipoCamas(rs.getString("tipoCamas"));
                busquedaxPrecio.setPrecioxNoche(rs.getDouble("precioxNoche"));
                busquedaxPrecio.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "El monto" + precio + " ingresado no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxPrecio;
    }

    public TipoHabitacion obtenerTipoXCantCamas(TipoHabitacion nroCamas) {

        TipoHabitacion busquedaxCantCamas = null;
        String sql = "SELECT * FROM tipohabitacion WHERE cantCamas=?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, nroCamas.getCantCamas());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    busquedaxCantCamas = new TipoHabitacion();
                    busquedaxCantCamas.setIdTipoHab(rs.getInt("idTipoHab"));
                    busquedaxCantCamas.setNombre(rs.getString("nombre"));
                    busquedaxCantCamas.setCantPersonas(rs.getInt("cantPersonas"));
                    busquedaxCantCamas.setCantCamas(rs.getInt("cantCamas"));
                    busquedaxCantCamas.setTipoCamas(rs.getString("tipoCamas"));
                    busquedaxCantCamas.setPrecioxNoche(rs.getDouble("precioxNoche"));
                    busquedaxCantCamas.setEstado(rs.getBoolean("estado"));
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de camas " + nroCamas.getCantCamas() + " ingresado no existe");
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxCantCamas;
    }

    public TipoHabitacion obtenerTipoXtipoCamas(TipoHabitacion tipoCama) {

        TipoHabitacion busquedaxTipoCama = null;
        String sql = "SELECT * FROM tipohabitacion WHERE tipoCamas= '?'";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, tipoCama.getTipoCamas());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    busquedaxTipoCama = new TipoHabitacion();
                    busquedaxTipoCama.setIdTipoHab(rs.getInt("idTipoHab"));
                    busquedaxTipoCama.setNombre(rs.getString("nombre"));
                    busquedaxTipoCama.setCantPersonas(rs.getInt("cantPersonas"));
                    busquedaxTipoCama.setCantCamas(rs.getInt("cantCamas"));
                    busquedaxTipoCama.setTipoCamas(rs.getString("tipoCamas"));
                    busquedaxTipoCama.setPrecioxNoche(rs.getDouble("precioxNoche"));
                    busquedaxTipoCama.setEstado(rs.getBoolean("estado"));
                } else {
                    JOptionPane.showMessageDialog(null, "El tipo de cama " + tipoCama.getTipoCamas() + " ingresado no existe");
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return busquedaxTipoCama;

    }

    public TipoHabitacion obtenerTipoXHabitacion(Habitacion habitacion) {// NO ENTENDER!!!

        TipoHabitacion th = new TipoHabitacion();
        String sql = "SELECT * FROM tipohabitacion WHERE idHabitacion=?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, habitacion.getIdHabitacion());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    th.setIdTipoHab(rs.getInt("idTipoHab"));
                    th.setCantPersonas(rs.getInt("cantPersonas"));
                    th.setCantCamas(rs.getInt("cantCamas"));
                    th.setTipoCamas(rs.getString("tipoCamas"));
                    th.setPrecioxNoche(rs.getDouble("precioxNoche"));
                    th.setEstado(rs.getBoolean("estado"));

                } else {
                    JOptionPane.showMessageDialog(null, "El idHabitacion" + habitacion + " ingresado no existe");
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "***ERROR*** al acceder a la tabla tipoHabitación " + ex);
        }
        return th;

    }

}
