package accesoADatos;


import entidades.Habitacion;
import entidades.Reserva;
import entidades.Huesped;
import java.awt.List;
import java.sql.Connection;
import java.time.LocalDate;

public class ReservaData {

    private Connection con;

    private HabitacionData habData;

    private HuespedData huData;

    public void agregarReserva(Reserva reserva) {
    }

    public void modificarReserva(Reserva reserva) {
    }

    public void eliminarReserva(Reserva reserva) {
    }

    public void extenderReserva(Reserva reserva, LocalDate fecha) {
    }

    public List listarReservas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXHuesped(Huesped huesped) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXPiso(int piso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXHuesped(Huesped huesped, LocalDate fechaInicio, LocalDate fechaFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXHabitacion(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXPiso(int piso, LocalDate fechaInicio, LocalDate fechaFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXDni(int dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservasXDni(int dni, LocalDate fechaInicio, LocalDate fechaFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarReservas(LocalDate fechaInicio, LocalDate fechaFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Reserva obtenerReserva(int idReserva) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
