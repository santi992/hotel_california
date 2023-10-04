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

    public void agregarReserva(Reserva reserva) {

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

        }

    }

    public void modificarReserva(Reserva reserva) {

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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }

    }

    public void eliminarReserva(Reserva reserva) {

        String sql = "UPDATE reserva SET estado = ? WHERE idReserva = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva eliminada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }

    }

    public void extenderReserva(Reserva reserva, LocalDate fecha, Double precioFinal) {

        String sql = "UPDATE reserva SET  fechaCheckOut = ? precioFinal = ? WHERE idReserva = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(reserva.getFechaCheckOut()));
            ps.setDouble(2, reserva.getPrecioTotal());
            ps.setInt(3, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva extendida con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }

    }

    public List listarReservas() {
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
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXHuesped(Huesped huesped) {
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
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXHabitacion(Habitacion habitacion) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva WHERE estado = 1 AND idHabitacion = " + habitacion.getIdHabitacion();

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habitacion);
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXPiso(int piso) {
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
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXHuesped(Huesped huesped, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva Where estado = 1 AND idHuesped = " + huesped.getIdHuesped() + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckOut <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huesped);
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXHabitacion(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva WHERE estado = 1 AND idHabitacion = " + habitacion.getIdHabitacion() + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckOut <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habitacion);
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXPiso(int piso, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT reserva.*, piso FROM reserva JOIN habitacion ON reserva.idHabitacion = habitacion.idHabitacion WHERE reserva.estado = 1 AND piso = " + piso + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckOut <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXDni(int dni) {
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
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservasXDni(int dni, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        Huesped huesped = huData.obtenerHuespedXDni(dni);

        try {
            String sql = "SELECT * FROM reserva Where estado = 1 AND idHuesped = " + huesped.getIdHuesped() + " AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckOut <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huesped);
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List listarReservas(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;

        try {
            String sql = "SELECT * FROM reserva Where estado = 1  AND fechaCheckIn >= '" + fechaInicio + "' AND fechaCheckOut <= '" + fechaFin + "'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setHuesped(huData.obtenerHuesped(rs.getInt("idHuesped")));
                reserva.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
                reservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reservas;
    }

    public Reserva obtenerReserva(int idReserva) {
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
                reserva.setFechaCheckIn(rs.getDate("idFechaCheckIn").toLocalDate());
                reserva.setFechaCheckOut(rs.getDate("idFechaCheckOut").toLocalDate());
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
        return reserva;
    }
}
