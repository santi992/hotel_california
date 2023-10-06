package entidades;

public class Habitacion {

    private int idHabitacion;

    private TipoHabitacion tipoHabitacion;

    private int piso;

    private boolean reserva;

    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, TipoHabitacion tipoHabitacion, int piso, boolean reserva, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
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

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", piso=" + piso + '}';
    }
    
    public String toString1(){
        return "{" + tipoHabitacion.getIdTipoHab() + "-" + tipoHabitacion.getTipoCamas()+"}";
    }
    public int getIdTipoHab() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
