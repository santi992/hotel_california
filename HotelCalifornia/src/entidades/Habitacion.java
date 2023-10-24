package entidades;

import accesoADatos.HabitacionData;
import java.time.LocalDate;
import java.util.List;

public class Habitacion {

    private int idHabitacion;

    private TipoHabitacion tipoHabitacion;

    private int piso;
    
    private List<LocalDate> fechasReservadas;

    private boolean reserva;

    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, TipoHabitacion tipoHabitacion, int piso, List<LocalDate> fechasReservadas, boolean reserva, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.fechasReservadas = fechasReservadas;
        this.reserva = reserva;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public List<LocalDate> getFechasReservadas() {
        return fechasReservadas;
    }

    public void setFechasReservadas(List<LocalDate> fechasReservadas) {
        this.fechasReservadas = fechasReservadas;
    }
    
    public void actualizarFechasReservadas(){
        fechasReservadas = new HabitacionData().fechasReservadas(this);
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toStringOriginal() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", piso=" + piso + '}';
    }
    
    @Override
    public String toString(){
        return "N° "+idHabitacion;
    }
    
    public String toString1(){
        return tipoHabitacion.getIdTipoHab() + "-" + tipoHabitacion.getTipoCamas()+ " camas";
    }

}
   
