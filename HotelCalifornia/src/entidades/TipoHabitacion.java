package entidades;

public class TipoHabitacion extends Habitacion {

    private int idTipoHab;

    private String nombre;

    private int cantPersonas;

    private int cantCamas;

    private double precioxNoche;
    
    private String tipoCamas; //agregado
    private boolean estado;//agregado
    private Habitacion habitacion;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int idTipoHab, String nombre, int cantPersonas, int cantCamas, double precioxNoche, String tipoCamas, boolean estado ,Habitacion habitacion) {
        this.idTipoHab = idTipoHab;
        this.nombre = nombre;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.precioxNoche = precioxNoche;
        this.tipoCamas= tipoCamas;
        this.estado=estado;
        this.habitacion=habitacion;
        
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

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    
    public String toStringOriginal() {
        return "TipoHabitacion{" + "idTipoHab=" + idTipoHab + ", nombre=" + nombre + ", precioxNoche=" + precioxNoche + ", tipoCamas= " + tipoCamas + " estado"+ estado+ " IdHabitacion"+ habitacion+ "}";
    }
     public String toString1(){
        return idTipoHab + " - " + tipoCamas +" - " + cantCamas + " camas";
    }
        @Override
    public String toString() {
        return nombre+" - Camas: "+cantCamas+" de tipo "+tipoCamas;
    }
    
}
