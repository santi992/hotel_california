package entidades;


import java.time.LocalDate;

public class Reserva {

    private int idReserva;

    private int idHuesped;

    private int idHabitacion;

    private LocalDate fechaCheckIn;

    private LocalDate fechaCheckOut;

    private double precioTotal;

    public Reserva() {
    }

    public Reserva(int idReserva, int idHuesped, int idHabitacion, LocalDate fechaCheckIn, LocalDate fechaCheckOut, double precioTotal) {
        this.idReserva = idReserva;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.precioTotal = precioTotal;
    }

    public Reserva(int idHuesped, int idHabitacion, LocalDate fechaCheckIn, LocalDate fechaCheckOut, double precioTotal) {
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.precioTotal = precioTotal;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public LocalDate getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(LocalDate fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public LocalDate getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(LocalDate fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idHuesped=" + idHuesped + ", idHabitacion=" + idHabitacion + '}';
    }
    
}
