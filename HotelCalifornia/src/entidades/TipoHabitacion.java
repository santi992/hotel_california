package entidades;

public class TipoHabitacion {

    private int idTipoHab;

    private String nombre;

    private int cantPersonas;

    private int cantCamas;

    private double precioxNoche;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int idTipoHab, String nombre, int cantPersonas, int cantCamas, double precioxNoche) {
        this.idTipoHab = idTipoHab;
        this.nombre = nombre;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.precioxNoche = precioxNoche;
    }

    public int getIdTipoHab() {
        return idTipoHab;
    }

    public void setIdTipoHab(int idTipoHab) {
        this.idTipoHab = idTipoHab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public double getPrecioxNoche() {
        return precioxNoche;
    }

    public void setPrecioxNoche(double precioxNoche) {
        this.precioxNoche = precioxNoche;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "idTipoHab=" + idTipoHab + ", nombre=" + nombre + ", precioxNoche=" + precioxNoche + '}';
    }
    
}
