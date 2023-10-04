package entidades;


import java.time.LocalDate;

public class Reserva {

    private int idReserva;

    private Huesped huesped;

    private Habitacion habitacion;

    private LocalDate fechaCheckIn;

    private LocalDate fechaCheckOut;
    
    private int cantPersonas;

    private double precioTotal;
    
    private boolean estado;

    public Reserva() {
    }

    public Reserva(int idReserva, Huesped huesped, Habitacion habitacion, LocalDate fechaCheckIn, LocalDate fechaCheckOut, int cantPersonas, double precioTotal, boolean estado) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.cantPersonas = cantPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fechaCheckIn, LocalDate fechaCheckOut, int cantPersonas, double precioTotal, boolean estado) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.cantPersonas = cantPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
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

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", huesped=" + huesped + ", habitacion=" + habitacion + ", precioTotal=" + precioTotal + '}';
    }

}
