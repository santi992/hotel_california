package accesoADatos;


import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.List;
import java.sql.Connection;

public class HabitacionData {

    private Connection con;

    private TipoHabData tipoData;

    public void agregarHabitacion(Habitacion Habitacion) {
    }

    public void modificarHabitacion(Habitacion habitacion) {
    }

    public void eliminarHabitacion(Habitacion habitacion) {
    }

    public List listarHabitacoinesDisponibles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarHabitacoinesNoDisponibles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarHabitacionesTodas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List listarHabitacionesXPiso(int piso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void activarHabitacion(int idHabitacion) {
    }

    public void desactivarHabitacion(int idHabitacion) {
    }

    public Habitacion obtenerHabitacion(int idHAbitacion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void cambiarTipo(Habitacion habitacion, TipoHabitacion tipo) {
    }
}
