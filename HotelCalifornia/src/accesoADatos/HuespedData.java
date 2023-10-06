package accesoADatos;

import entidades.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class HuespedData {

    private Connection con;
        public HuespedData(){
        con= Conexion.conectar();
        }
   
        public void agregarHuesped(Huesped huesped) {
           String sql= "INSERT INTO huesped(nombre, apellido, dni, Domicilio, Provincia, Localidad, Correo, Celular,estado)"
                   + " VALUES (?,?,?,?,?,?,?,?,?)";
           
           
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDireccion());
            ps.setString(5, huesped.getProvincia());
            ps.setString(6, huesped.getLocalidad());
            ps.setString(7, huesped.getCorreo());
            ps.setInt(8, huesped.getCelular());
            ps.setBoolean(9, huesped.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped añadido con éxito");
            }
            ps.close();
    
        } catch (SQLException ef) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped "+ ef.getMessage());
            
        }
        }
    
        public void modificarHuesped(Huesped huesped) {
    String sql="UPDATE huesped SET nombre=?, apellido=?, dni=?, Domicilio=?, Provincia=?, Localidad=?, Correo=?, Celular=?"
            + " WHERE idHuesped=?";
    PreparedStatement ps=null;
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDireccion());
            ps.setString(5, huesped.getProvincia());
            ps.setString(6, huesped.getLocalidad());
            ps.setString(7, huesped.getCorreo());
            ps.setInt(8, huesped.getCelular());
            ps.setInt(9, huesped.getIdHuesped());
            int exito= ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El huesped no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped"+ex.getMessage());
        }
        }
    public void eliminarHuesped(int id) {
    
        String sql= "UPDATE huesped SET estado=0 WHERE idHuesped=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if (fila==1){
                JOptionPane.showMessageDialog(null, "Se eliminó el huesped.");
            }
        }
      catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");
        }
}

    public List listarHuespedes() {
           List<Huesped> huespedes= new ArrayList<>();
                     
        try {
            String sql= "SELECT * From huesped Where estado =1";
        
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Huesped huesped= new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDireccion(rs.getString("Domicilio"));
                huesped.setProvincia(rs.getString("Localidad"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getInt("Celular"));
                huesped.setEstado(rs.getBoolean("estado"));  //no se que tan necesario es en este metodo
                
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped"+ex.getMessage());
        }
           return huespedes;
    }

    public Huesped obtenerHuesped(int idHuesped) {
         Huesped huesped=null;
            String sql= " SELECT nombre, apellido, dni, Domicilio, Provincia, Localidad, Correo, Celular,estado  FROM huesped Where idHuesped=? AND estado=1";
            PreparedStatement ps= null;
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                huesped=new Huesped();
                
                huesped.setIdHuesped(idHuesped);
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDireccion(rs.getString("Domicilio"));
                huesped.setProvincia(rs.getString("Provincia"));
                huesped.setLocalidad(rs.getString("Localidad"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getInt("Celular"));
                huesped.setEstado(rs.getBoolean("estado"));  //no se que tan necesario es en este metodo
            } else {
                JOptionPane.showMessageDialog(null, "El huesped no existe o se encuentra inactivo");
                ps.close();
            }
        }
           catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Huesped "+ ex.getMessage());
            
           } return huesped;
            
                 
      
    
    }

    public Huesped obtenerHuespedXDni(int dni) {
         Huesped huesped=null;
            String sql= " SELECT  idHuesped,nombre, apellido, dni, Domicilio, Provincia, Localidad, Correo, Celular,estado FROM huesped WHERE dni = ? AND estado = 1"; //aca estaba el cambio dni
            PreparedStatement ps= null;
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                huesped=new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDireccion(rs.getString("Domicilio"));
                huesped.setProvincia(rs.getString("Provincia"));
                huesped.setLocalidad(rs.getString("Localidad"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getInt("Celular"));
                huesped.setEstado(rs.getBoolean("estado"));  //no se que tan necesario es en este metodo
            } else {
                JOptionPane.showMessageDialog(null, "No existe el huesped o se enuentra inactivo.");
                ps.close();
            }
        }
           catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Huesped "+ ex.getMessage());
            
           } return huesped;
    }
}
