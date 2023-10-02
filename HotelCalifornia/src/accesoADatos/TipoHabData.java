package accesoADatos;


import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.List;
import java.sql.Connection;

public class TipoHabData {

    private Connection con;

    private HabitacionData habData;

    public void agregarTipo(TipoHabitacion tipo) {
    }

    public void modificarTipo(TipoHabitacion tipo) {
    }

    public void eliminarTipo(TipoHabitacion tipo) {
    }

    public List listarTipos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double cambiarPrecio(TipoHabitacion tipo, double precio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TipoHabitacion obtenerTipo(int idTipoHab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TipoHabitacion obtenerTipoXNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TipoHabitacion obtenerTipoXHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
