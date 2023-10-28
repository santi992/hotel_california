package accesoADatos;

import entidades.Habitacion;
import entidades.Reserva;
import entidades.Huesped;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ReservaData {

    private Connection con;

    private HabitacionData habData;

    private HuespedData huData;

    public ReservaData() {
    }

    // CHECKEADO
    public void agregarReserva(Reserva reserva) {

        con = Conexion.conectar();
        String sql = "INSERT INTO reserva(idHuesped, idHabitacion, fechaCheckIn, fechaCheckOut, cantPersonas, precioFinal, estado) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getHuesped().getIdHuesped());
            ps.setInt(2, reserva.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getFechaCheckIn()));
            ps.setDate(4, Date.valueOf(reserva.getFechaCheckOut()));
            ps.setInt(5, reserva.getCantPersonas());
            ps.setDouble(6, reserva.getPrecioTotal());
            ps.setBoolean(7, reserva.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva añadida con éxito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una habitación\ny el tiempo de estadía.");
        } finally {
            Conexion.cerrarConexion();
        }

    }

    // CHECKEADO
    public void modificarReserva(Reserva reserva) {

        con = Conexion.conectar();
        String sql = "UPDATE reserva SET idHuesped = ?, idHabitacion = ?, fechaCheckIn = ?, fechaCheckOut = ?, cantPersonas = ?, precioFinal = ?, estado = ? WHERE idReserva = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getHuesped().getIdHuesped());
            ps.setInt(2, reserva.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getFechaCheckIn()));
            ps.setDate(4, Date.valueOf(reserva.getFechaCheckOut()));
            ps.setInt(5, reserva.getCantPersonas());
            ps.setDouble(6, reserva.getPrecioTotal());
            ps.setBoolean(7, reserva.isEstado());
            ps.setInt(8, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva modificada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }

    }

    // CHECKEADO
    public void cancelarReserva(Reserva reserva) {

        con = Conexion.conectar();
        String sql = "UPDATE reserva SET estado = ?, WHERE idReserva = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }

    }

    // CHECKEADO
    public void cancelarReserva(Reserva reserva, LocalDate fecha, double precioFinal) {

        con = Conexion.conectar();
        String sql = "UPDATE reserva SET estado = ?, precioFinal = ?, fechaCheckOut = ? WHERE idReserva = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setDouble(2, precioFinal);
            ps.setDate(3, Date.valueOf(fecha));
            ps.setInt(4, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }

    }

    // CHECKEADO
    public void extenderReserva(Reserva reserva, LocalDate fecha, double precioFinal) {

        con = Conexion.conectar();
        String sql = "UPDATE reserva SET  fechaCheckOut = ?, precioFinal = ? WHERE idReserva = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ps.setDouble(2, precioFinal);
            ps.setInt(3, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva extendida con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }

    }

    public List listarReservas() {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva Where estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXHuesped(Huesped huesped) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva Where estado = 1 AND idHuesped = " + huesped.getIdHuesped();

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huesped);
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXHabitacion(Habitacion habitacion) {

        con = Conexion.conectar();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva WHERE estado = 1 AND idHabitacion = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habitacion);
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXPiso(int piso) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT reserva.*, piso FROM reserva JOIN habitacion ON reserva.idHabitacion = habitacion.idHabitacion WHERE reserva.estado = 1 AND piso = " + piso;

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXHuesped(Huesped huesped, LocalDate fechaInicio, LocalDate fechaFin) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva WHERE estado = 1 AND idHuesped = ? AND fechaCheckIn >= ? AND fechaCheckIn <= ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped.getIdHuesped());
            ps.setDate(2, Date.valueOf(fechaInicio));
            ps.setDate(3, Date.valueOf(fechaFin));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huesped);
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXHabitacion(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {

        con = Conexion.conectar();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva WHERE estado = 1 AND idHabitacion = " + habitacion.getIdHabitacion() + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckIn <= '" + fechaFin + "'";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habitacion);
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXPiso(int piso, LocalDate fechaInicio, LocalDate fechaFin) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT reserva.*, piso FROM reserva JOIN habitacion ON reserva.idHabitacion = habitacion.idHabitacion WHERE reserva.estado = 1 AND piso = " + piso + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckIn <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXDni(int dni) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        Huesped huesped = huData.obtenerHuespedXDni(dni);

        try {
            String sql = "SELECT * FROM reserva Where estado = 1 AND idHuesped = " + huesped.getIdHuesped();

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huesped);
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasXDni(int dni, LocalDate fechaInicio, LocalDate fechaFin) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        Huesped huesped = huData.obtenerHuespedXDni(dni);

        try {
            String sql = "SELECT * FROM reserva Where estado = 1 AND idHuesped = " + huesped.getIdHuesped() + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckIn <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huesped);
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservas(LocalDate fechaInicio, LocalDate fechaFin) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT DISTINCT * FROM reserva Where estado = 1  AND fechaCheckIn >= ? AND fechaCheckIn <= ? OR fechaCheckOut >= ? AND fechaCheckOut <= ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
            ps.setDate(2, Date.valueOf(fechaFin));
            ps.setDate(3, Date.valueOf(fechaInicio));
            ps.setDate(4, Date.valueOf(fechaFin));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasActuales() {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        LocalDate hoy = LocalDate.now();

        try {
            String sql = "SELECT * FROM reserva Where estado = 1  AND fechaCheckIn <= ? AND fechaCheckOut >= ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(hoy));
            ps.setDate(2, Date.valueOf(hoy));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public List listarReservasActuales(int piso, Habitacion habitacion, String huespedBusqueda) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        LocalDate hoy = LocalDate.now();
        int contador = 2;

        String joinHu = "";
        String joinHab = "";
        String hu = "";
        String hab = "";
        String p = "";

        if (huespedBusqueda != null) {
            hu  = " AND ( huesped.nombre LIKE ?% OR huesped.apellido LIKE ?%)";
            joinHu = " JOIN huesped ON reserva.idHuesped = huesped.idHuesped ";
        }
        
        if (habitacion != null) {
            hab = " AND habitacion.idHabitacion = ?";
            joinHab = " JOIN habitacion ON reserva.idHabitacion = habitacion.idHabitacion ";
        }
        
        if (piso != 0) {
            p = " AND habitacion.piso = ?";
            joinHab = " JOIN habitacion ON reserva.idHabitacion = habitacion.idHabitacion ";
        }
        
        String sql = "SELECT reserva.idReserva, reserva.idHuesped, reserva.idHabitacion, reserva.fechaCheckIn, "
                + "reserva.fechaCheckOut, reserva.cantPersonas, reserva.precioFinal, reserva.estado FROM reserva " + 
                joinHu + joinHab
                + "WHERE reserva.estado = 1  AND reserva.fechaCheckIn <= ? AND reserva.fechaCheckOut >= ?" + hu + hab + p;
        
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(hoy));
            ps.setDate(2, Date.valueOf(hoy));
            if (huespedBusqueda != null){
                contador++;
                ps.setString(contador, huespedBusqueda);
            }
            if (habitacion != null){
                contador++;
                ps.setInt(contador, habitacion.getIdHabitacion());
            }
            if (piso != 0){
                contador++;
                ps.setInt(contador, piso);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reservas;
    }

    public Reserva obtenerReserva(int idReserva) {

        con = Conexion.conectar();
        habData = new HabitacionData();
        huData = new HuespedData();
        Reserva reserva = new Reserva();

        try {
            String sql = "SELECT * FROM reserva Where idReserva = " + idReserva;

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("fechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("fechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("preciofinal"));
                reserva.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
        return reserva;
    }

    public void actualizarDisponibilidad() {

        con = Conexion.conectar();
        Date hoy = Date.valueOf(LocalDate.now());
        String sql = "UPDATE reserva SET estado = ? WHERE fechaCheckOut < ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setDate(2, hoy);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar, reinicie el programa." + ex.getMessage());
        } finally {
            Conexion.cerrarConexion();
        }
    }
}
