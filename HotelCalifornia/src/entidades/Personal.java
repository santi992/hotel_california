package entidades;

import java.time.LocalDate;

public class Personal {

    private int idPersonal;

    private String nombre;

    private String apellido;

    private int dni;

    private String direccion;
    
    private int celular;

    private String username;
    
    private String correo;
    
    private String password;    
    
    private LocalDate fechaNacimiento;    

    private boolean admin;

    private boolean estado;
    
    public Personal() {
    }

    public Personal(int idPersonal, String nombre, String apellido, int dni, String direccion, int celular, String username, String correo, String password, LocalDate fechaNacimiento, boolean admin, boolean estado) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.admin = admin;
        this.estado = estado;
    }

    public Personal(String nombre, String apellido, int dni, String direccion, int celular, String username, String correo, String password, LocalDate fechaNacimiento, boolean admin, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.admin = admin;
        this.estado = estado;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        String admin = "";
        if (this.isAdmin()){
            admin = " (Administrador/a) ";
        }
        return apellido+", "+nombre+admin+", ID: "+idPersonal;
    }

    
}
