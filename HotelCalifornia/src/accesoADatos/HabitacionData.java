package accesoADatos;

import entidades.Habitacion;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.sql.Connection;
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
        con = Conexion.conectar();
    }

// 
    public void agregarHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion (idHabitacion,idTipoHab,piso,idImagen,estado)"
                + "VALUES(?,?,?,?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());
            ps.setInt(2, habitacion.getTipoHabitacion().getIdTipoHab());
            ps.setInt(3, habitacion.getPiso());
            ps.setInt(4, habitacion.getImagen().getIdImagen());
            ps.setBoolean(5, habitacion.isEstado());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Habitacion agregada exitosamente");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones " + ex.getMessage());

        }
    }

    public void modificarHabitacion(Habitacion habitacion) {

        String sql = "UPDATE habitacion SET idTipoHab = ?,piso = ?,idImagen = ?, estado = ? WHERE idHabitacion=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getTipoHabitacion().getIdTipoHab());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getImagen().getIdImagen());
            ps.setBoolean(4, habitacion.isEstado());
            ps.setInt(5, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitaciones" + ex.getMessage());
        }
    }

    public void eliminarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET estado=0 WHERE idHabitacion=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la habitacion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }

    }

    public List<Habitacion> listarHabitacionesDisponibles(LocalDate fechaIn, LocalDate fechaOut) {
        List<Habitacion> habitaciones = new ArrayList<>();
        boolean reservada;
        for (Habitacion hab : listarHabitacionesTodas()) {
            reservada = false;
            if (hab.isEstado()) {
                for (LocalDate fecha : hab.getFechasReservadas()) {
                    int dias = (int) DAYS.between(fechaOut, fechaIn);
                    for (int i = 0; i <= dias; i++) {
                        if (fecha.equals(fechaIn.plusDays(i))) {
                            reservada = true;
                            break;
                        }
                    }
                    if (reservada) {
                        break;
                    }
                }
                if (!reservada) {
                    habitaciones.add(hab);
                }
            }
        }

        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesDisponibles() {
        
        
        
        List<Habitacion> habitaciones = new ArrayList<>();
        boolean reservada;
        for (Habitacion hab : listarHabitacionesTodas()) {
            reservada = false;
            if (hab.isEstado()) {
                for (LocalDate fecha : hab.getFechasReservadas()) {
                    if (fecha.equals(LocalDate.now())) {
                        reservada = true;
                        break;
                    }
                }
                if (!reservada) {
                    habitaciones.add(hab);
                }
            }
        }

        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesNoDisponibles(LocalDate fechaIn, LocalDate fechaOut) {
        
        
        
        List<Habitacion> habitaciones = new ArrayList<>();
        boolean reservada;
        for (Habitacion hab : listarHabitacionesTodas()) {
            reservada = false;
            if (hab.isEstado()) {
                for (LocalDate fecha : hab.getFechasReservadas()) {
                    int dias = (int) DAYS.between(fechaOut, fechaIn);
                    for (int i = 0; i <= dias; i++) {
                        if (fecha.equals(fechaIn.plusDays(i))) {
                            reservada = true;
                            habitaciones.add(hab);
                            break;
                        }
                    }
                    if (reservada) {
                        break;
                    }
                }

            }
        }

        return habitaciones;
    }

    public List listarHabitacoinesNoDisponibles() {
        
        
        
        List<Habitacion> habitaciones = new ArrayList<>();
        boolean reservada;
        for (Habitacion hab : listarHabitacionesTodas()) {
            reservada = false;
            if (hab.isEstado()) {
                for (LocalDate fecha : hab.getFechasReservadas()) {
                    if (fecha.equals(LocalDate.now())) {
                        reservada = true;
                        habitaciones.add(hab);
                        break;
                    }
                }
                if (reservada) {
                    break;
                }
            }
        }

        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesTodas() {

        
        
        imgData = new ImagenData();
        tipoData = new TipoHabData();
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habs = new Habitacion();

                habs.setIdHabitacion(rs.getInt("idHabitacion"));
                // idImagen.setHabitacion(habData.obtenerHabitacion(rs.getInt("idHabitacion")));
                habs.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habs.setPiso(rs.getInt("piso"));
                habs.setFechasReservadas(fechasReservadas(habs));
                habs.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
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

        
        
        tipoData = new TipoHabData();
        List<Habitacion> habsxPiso = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE piso = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, piso);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Habitacion habitacion = new Habitacion();
                    habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                    habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                    habitacion.setPiso(rs.getInt("piso"));
                    habitacion.setFechasReservadas(fechasReservadas(habitacion));
                    habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                    habitacion.setEstado(rs.getBoolean("estado"));
                    habsxPiso.add(habitacion);
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        }
        return habsxPiso;
    }

    public List listarHabitacionesXPisoYTipo(int piso, TipoHabitacion tipo) {
        
        
        
        tipoData = new TipoHabData();
        List<Habitacion> habsxPisoYTipo = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE piso = ? AND idTipoHab = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, piso);
            ps.setInt(2, tipo.getIdTipoHab());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Habitacion habitacion = new Habitacion();
                    habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                    habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                    habitacion.setPiso(rs.getInt("piso"));
                    habitacion.setFechasReservadas(fechasReservadas(habitacion));
                    habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                    habitacion.setEstado(rs.getBoolean("estado"));
                    habsxPisoYTipo.add(habitacion);
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a las Habitaciones " + ex.getMessage());
        }
        return habsxPisoYTipo;
    }

    public void activarHabitacion(Habitacion habitacion) {
        
        
        
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
        }
    }

    public void desactivarHabitacion(Habitacion habitacion) {
        
        
        
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
        }
    }

    public void idImagenrHabitacion(Habitacion habitacion) {
        
        
        
        String sql = "UPDATE habitacion SET idImagen = ? WHERE idHabitacion = ?";
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
        }
    }

    public void noReservarHabitacion(Habitacion habitacion) {
        
        
        
        String sql = "UPDATE habitacion SET idImagen = ? WHERE idHabitacion = ?";
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
        }
    }

    public Habitacion obtenerHabitacion(int idHabitacion) {

        
        
        tipoData = new TipoHabData();
        Habitacion habitacion = new Habitacion();
        String sql = " SELECT  idHabitacion,idTipoHab, piso, estado, idImagen FROM habitacion WHERE idHabitacion = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));
                habitacion.setTipoHabitacion(tipoData.obtenerTipoxId(rs.getInt("IdTipoHab")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setFechasReservadas(fechasReservadas(habitacion));
                habitacion.setImagen(imgData.obtenerImagen(rs.getInt("idImagen")));
                habitacion.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe habitacion o se enuentra inactivo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());

        }
        return habitacion;
    }

    public void cambiarTipo(Habitacion habitacion, TipoHabitacion tipo) {
        
        
        
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
        }
    }

    public ArrayList<Integer> ObtenerPiso() {
        
        
        
        ArrayList<Integer> numerosDePiso = new ArrayList<>();

        String query = "SELECT DISTINCT piso FROM habitacion";
        try (PreparedStatement statement = con.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int numeroPiso = resultSet.getInt("Piso");
                numerosDePiso.add(numeroPiso);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a los Pisos" + ex.getMessage());

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
