package entidades;

public class Huesped {

    private int idHuesped;

    private String nombre;

    private String apellido;

    private int dni;

    private String direccion;

    private String provincia;

    private String localidad;

    private int celular;

    private String correo;
    
    private String password;

    private boolean estado;
    
    private String contraseña;
    
    public Huesped() {
    }

    public Huesped(int idHuesped, String nombre, String apellido, int dni, String direccion, String provincia, String localidad, int celular, String correo, String password, boolean estado,String contraseña) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.provincia = provincia;
        this.localidad = localidad;
        this.celular = celular;
        this.correo = correo;
        this.password = password;
        this.estado = estado;
    }


    public Huesped(String nombre, String apellido, int dni, String direccion, String provincia, String localidad, int celular, String correo,boolean estado,String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.provincia = provincia;
        this.localidad = localidad;
        this.celular = celular;
        this.correo = correo;
        this.password = password;
        this.estado = estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toStringOriginal() {
        return "Huesped{" + "idHuesped=" + idHuesped + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", provincia=" + provincia + ", localidad=" + localidad + ", celular=" + celular + ", correo=" + correo + ", estado=" + estado + '}';
    }
    
    @Override
    public String toString() {
        return apellido+", "+nombre+", DNI: "+dni+", ID: "+idHuesped;
    }

    
}
