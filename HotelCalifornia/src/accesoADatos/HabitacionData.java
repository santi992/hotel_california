package accesoADatos;

import entidades.Habitacion;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con;
    private TipoHabData tipoData;
    private ReservaData resData;
    private ImagenData imgData;

    public HabitacionData() {
    }

// 
    public void agregarHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        String sql = "INSERT INTO habitacion (idHabitacion,idTipoHab,piso,idImagen,reserva,estado)"
                + "VALUES(?,?,?,?,?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());
            ps.setInt(2, habitacion.getTipoHabitacion().getIdTipoHab());
            ps.setInt(3, habitacion.getPiso());
            ps.setInt(4, habitacion.getImagen().getIdImagen());
            ps.setBoolean(5, habitacion.isReserva());
            ps.setBoolean(6, habitacion.isEstado());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Habitacion agregada exitosamente");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones " + ex.getMessage());

        } finally {
            Conexion.cerrarConexion();
        }
    }

    public void modificarHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET idTipoHab = ?,piso = ?,idImagen = ?, estado = ?, reserva = ? WHERE idHabitacion=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getTipoHabitacion().getIdTipoHab());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getImagen().getIdImagen());
            ps.setBoolean(4, habitacion.isEstado());
            ps.setBoolean(5, habitacion.isReserva());
            ps.setInt(6, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitaciones" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }

    public void eliminarHabitacion(int idHabitacion) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET estado=0 WHERE idHabitacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la habitacion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        } finally {
            Conexion.cerrarConexion();
        }

    }

    public List<Habitacion> listarHabitacionesNoDisponibles(LocalDate fechaIn, LocalDate fechaOut) {

        con = Conexion.conectar();
        imgData = new ImagenData();
        tipoData = new TipoHabData();
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT DISTINCT habitacion.idHabitacion, habitacion.piso, habitacion.idTipoHab, habitacion.idImagen, "
                + "habitacion.reserva, habitacion.estado FROM habitacion JOIN reserva ON habitacion.idHabitacion = reserva.idHabitacion "
                + "WHERE reserva.fechaCheckIn >= ? AND reserva.fechaCheckOut <= ? AND habitacion.estado = 1 ORDER BY habitacion.idHabitacion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaIn));
            ps.setDate(2, Date.valueOf(fechaOut));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setFechasReservadas(fechasReservadas(habitacion));
                habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                habitacion.setReserva(rs.getBoolean("reserva"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }

        return habitaciones;
    }
//
//    public List<Habitacion> listarHabitacionesDisponibles(LocalDate fechaIn, LocalDate fechaOut) {
//
//        List<Habitacion> habitaciones = new ArrayList<>();
//        boolean reservada;
//        for (Habitacion hab : listarHabitacionesTodas()) {
//            reservada = false;
//            if (hab.isEstado()) {
//                for (LocalDate fecha : hab.getFechasReservadas()) {
//                    int dias = (int) DAYS.between(fechaOut, fechaIn);
//                    for (int i = 0; i <= dias; i++) {
//                        if (fecha.equals(fechaIn.plusDays(i))) {
//                            reservada = true;
//                            break;
//                        }
//                    }
//                    if (reservada) {
//                        break;
//                    }
//                }
//                if (!reservada) {
//                    habitaciones.add(hab);
//                }
//            }
//        }
//
//        return habitaciones;
//    }

    public List<Habitacion> listarHabitacionesNoDisponibles() {
        return listarHabitacionesNoDisponibles(LocalDate.now(), LocalDate.now());
    }

    public List<Habitacion> listarHabitacionesDisponibles(LocalDate fechaIn, LocalDate fechaOut) {

        List<Habitacion> habitaciones = listarHabitacionesTodas();
        List<Habitacion> habitacionesNo = listarHabitacionesNoDisponibles(fechaIn, fechaOut);
        for (Habitacion habitacionNo : habitacionesNo) {
            for (Habitacion habitacion : habitaciones) {
                if (habitacion.getIdHabitacion() == habitacionNo.getIdHabitacion()){
                    habitaciones.remove(habitacion);
                    break;
                }
            }
        }

        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesDisponibles() {
        return listarHabitacionesDisponibles(LocalDate.now(), LocalDate.now());
    }

    public List<Habitacion> listarHabitacionesTodas() {

        con = Conexion.conectar();
        imgData = new ImagenData();
        tipoData = new TipoHabData();
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setFechasReservadas(fechasReservadas(habitacion));
                habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                habitacion.setReserva(rs.getBoolean("reserva"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return habitaciones;
    }

    public List listarHabitacionesXPiso(int piso) {

        con = Conexion.conectar();
        imgData = new ImagenData();
        tipoData = new TipoHabData();
        List<Habitacion> habitacionxPiso = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE piso = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, piso);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setFechasReservadas(fechasReservadas(habitacion));
                habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                habitacion.setReserva(rs.getBoolean("reserva"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacionxPiso.add(habitacion);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return habitacionxPiso;
    }

    public List listarHabitacionesXPisoYTipo(int piso, TipoHabitacion tipo) {

        con = Conexion.conectar();
        imgData = new ImagenData();
        tipoData = new TipoHabData();
        List<Habitacion> habitacionxPisoYTipo = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE piso = ? AND idTipoHab = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, piso);
            ps.setInt(2, tipo.getIdTipoHab());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setFechasReservadas(fechasReservadas(habitacion));
                habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                habitacion.setReserva(rs.getBoolean("reserva"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacionxPisoYTipo.add(habitacion);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return habitacionxPisoYTipo;
    }

    public void activarHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET estado = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El estado de la habitacion fue modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }

    public void desactivarHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET estado = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El estado de la habitacion fue modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }

    public void reservarHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET reserva = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }

    public void noReservarHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET reserva = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }

    public Habitacion obtenerHabitacion(int idHabitacion) {

        con = Conexion.conectar();
        imgData = new ImagenData();
        tipoData = new TipoHabData();
        Habitacion habitacion = null;
        String sql = " SELECT * FROM habitacion WHERE idHabitacion = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setFechasReservadas(fechasReservadas(habitacion));
                habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setReserva(rs.getBoolean("reserva"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la habitacion.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());

        } finally {
            Conexion.cerrarConexion();
        }
        return habitacion;
    }

    public void cambiarTipo(Habitacion habitacion, TipoHabitacion tipo) {

        con = Conexion.conectar();
        String sql = "UPDATE habitacion SET idTipoHab = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getTipoHabitacion().getIdTipoHab());
            ps.setInt(2, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El tipo de habitacion fue modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }

    public ArrayList<Integer> ObtenerPiso() {

        con = Conexion.conectar();
        ArrayList<Integer> numerosDePiso = new ArrayList<>();
        String query = "SELECT DISTINCT piso FROM habitacion";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int numeroPiso = resultSet.getInt("Piso");
                numerosDePiso.add(numeroPiso);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a los Pisos" + ex.getMessage());

        } finally {
            Conexion.cerrarConexion();
        }

        return numerosDePiso;
    }

    public List<LocalDate> fechasReservadas(Habitacion habitacion) {

        resData = new ReservaData();
        LocalDate hoy = LocalDate.now();
        LocalDate hoyMasAnio = LocalDate.now().plusYears(1);
        List<Reserva> idImagens = resData.listarReservasXHabitacion(habitacion, hoy, hoyMasAnio);
        TreeSet<LocalDate> fechas = new TreeSet<>();
        List<LocalDate> fechasFinal = new ArrayList<>();
        for (Reserva idImagen : idImagens) {
            LocalDate fechaIn = idImagen.getFechaCheckIn();
            LocalDate fechaOut = idImagen.getFechaCheckOut();
            int dias = (int) DAYS.between(fechaIn, fechaOut);
            for (int i = 0; i <= dias; i++) {
                LocalDate fecha = fechaIn.plusDays(i);
                fechas.add(fecha);
            }
        }
        fechasFinal.addAll(fechas);
        return fechasFinal;
    }
}
