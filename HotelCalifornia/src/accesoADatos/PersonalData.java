package accesoADatos;

import entidades.Personal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class PersonalData {

    private Connection con;

    public PersonalData() {
        con = Conexion.conectar();
    }

    public void agregarPersonal(Personal personal) {
        String sql = "INSERT INTO personal(nombre, apellido, dni, Domicilio, Correo, username, password, Celular, fechaNacimiento, admin, estado)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, personal.getNombre());
            ps.setString(2, personal.getApellido());
            ps.setInt(3, personal.getDni());
            ps.setString(4, personal.getDireccion());
            ps.setString(5, personal.getCorreo());
            ps.setString(6, personal.getUsername());
            ps.setString(7, personal.getPassword());
            ps.setInt(8, personal.getCelular());
            ps.setDate(9, Date.valueOf(personal.getFechaNacimiento()));
            ps.setBoolean(10, personal.isAdmin());
            ps.setBoolean(11, personal.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                personal.setIdPersonal(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Miembro de personal añadido con éxito");
            }
            ps.close();

        } catch (SQLException ef) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla personal " + ef.getMessage());

        }
    }

    public void modificarPersonal(Personal personal) {
        String sql = "UPDATE personal SET nombre=?, apellido=?, dni=?, Domicilio=?, Correo=?, username=?, password=?, Celular=?, fechaNacimiento=?, admin=?, estado=? " 
                + " WHERE idPersonal=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, personal.getNombre());
            ps.setString(2, personal.getApellido());
            ps.setInt(3, personal.getDni());
            ps.setString(4, personal.getDireccion());
            ps.setString(5, personal.getCorreo());
            ps.setString(6, personal.getUsername());
            ps.setString(7, personal.getPassword());
            ps.setInt(8, personal.getCelular());
            ps.setDate(9, Date.valueOf(personal.getFechaNacimiento()));
            ps.setBoolean(10, personal.isAdmin());
            ps.setBoolean(11, personal.isEstado());
            ps.setInt(12, personal.getIdPersonal());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El miembro de personal no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Personal" + ex.getMessage());
        }
    }

    public void eliminarPersonal(int id) {

        String sql = "UPDATE personal SET estado=0 WHERE idPersonal=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el miembro de personal.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla personal");
        }
    }

    public List listarPersonales() {
        List<Personal> personales = new ArrayList<>();

        try {
            String sql = "SELECT * From personal Where estado =1";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Personal personal = new Personal();
                personal.setIdPersonal(rs.getInt("idPersonal"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido(rs.getString("apellido"));
                personal.setDni(rs.getInt("dni"));
                personal.setDireccion(rs.getString("domicilio"));
                personal.setCorreo(rs.getString("Correo"));
                personal.setUsername(rs.getString("username"));
                personal.setPassword(rs.getString("password"));
                personal.setCelular(rs.getInt("Celular"));
                personal.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                personal.setAdmin(rs.getBoolean("admin"));
                personal.setEstado(rs.getBoolean("estado"));

                personales.add(personal);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla personal" + ex.getMessage());
        }
        return personales;
    }

    public Personal obtenerPersonal(int idPersonal) {
        Personal personal = null;
        String sql = " SELECT * FROM personal Where idPersonal=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPersonal);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                personal = new Personal();

                personal.setIdPersonal(rs.getInt("idPersonal"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido(rs.getString("apellido"));
                personal.setDni(rs.getInt("dni"));
                personal.setDireccion(rs.getString("Domicilio"));
                personal.setCorreo(rs.getString("Correo"));
                personal.setUsername(rs.getString("username"));
                personal.setPassword(rs.getString("password"));
                personal.setCelular(rs.getInt("Celular"));
                personal.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                personal.setAdmin(rs.getBoolean("admin"));
                personal.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "El miembro de personal no existe o se encuentra inactivo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Personal " + ex.getMessage());

        }
        return personal;

    }

    public Personal obtenerPersonalXDni(int dni) {
        Personal personal = null;
        String sql = " SELECT  * FROM personal WHERE dni = ? AND estado = 1"; //aca estaba el cambio dni
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                personal = new Personal();
                personal.setIdPersonal(rs.getInt("idPersonal"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido(rs.getString("apellido"));
                personal.setDni(rs.getInt("dni"));
                personal.setDireccion(rs.getString("Domicilio"));
                personal.setCorreo(rs.getString("Correo"));
                personal.setUsername(rs.getString("username"));
                personal.setPassword(rs.getString("password"));
                personal.setCelular(rs.getInt("Celular"));
                personal.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                personal.setAdmin(rs.getBoolean("admin"));
                personal.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el miembro de personal o se enuentra inactivo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla personal " + ex.getMessage());

        }
        return personal;
    }

    public Personal obtenerPersonalXBusqueda(String busqueda) {
        Personal personal = null;
        String sql = " SELECT  * FROM personal WHERE correo = ? OR nombre = ? OR apellido = ? OR username = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda);
            ps.setString(3, busqueda);
            ps.setString(4, busqueda);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                personal = new Personal();
                personal.setIdPersonal(rs.getInt("idPersonal"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido(rs.getString("apellido"));
                personal.setDni(rs.getInt("dni"));
                personal.setDireccion(rs.getString("domicilio"));
                personal.setCorreo(rs.getString("correo"));
                personal.setUsername(rs.getString("username"));
                personal.setPassword(rs.getString("password"));
                personal.setCelular(rs.getInt("celular"));
                personal.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                personal.setAdmin(rs.getBoolean("admin"));
                personal.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el miembro de personal o se enuentra inactivo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Personal " + ex.getMessage());

        }
        return personal;
    }
    public Personal obtenerPersonalXCorreo(String correo) {
        Personal personal = null;
        String sql = " SELECT  * FROM personal WHERE correo = ? AND estado = 1"; //aca estaba el cambio dni
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                personal = new Personal();
                personal.setIdPersonal(rs.getInt("idPersonal"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido(rs.getString("apellido"));
                personal.setDni(rs.getInt("dni"));
                personal.setDireccion(rs.getString("domicilio"));
                personal.setCorreo(rs.getString("correo"));
                personal.setUsername(rs.getString("username"));
                personal.setPassword(rs.getString("password"));
                personal.setCelular(rs.getInt("celular"));
                personal.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                personal.setAdmin(rs.getBoolean("admin"));
                personal.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el miembro de personal o se enuentra inactivo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Personal " + ex.getMessage());

        }
        return personal;
    }
    public Personal obtenerPersonalXUsuario(String username) {
        Personal personal = null;
        String sql = " SELECT  * FROM personal WHERE username = ? AND estado = 1"; //aca estaba el cambio dni
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                personal = new Personal();
                personal.setIdPersonal(rs.getInt("idPersonal"));
                personal.setNombre(rs.getString("nombre"));
                personal.setApellido(rs.getString("apellido"));
                personal.setDni(rs.getInt("dni"));
                personal.setDireccion(rs.getString("Domicilio"));
                personal.setCorreo(rs.getString("Correo"));
                personal.setUsername(rs.getString("username"));
                personal.setPassword(rs.getString("password"));
                personal.setCelular(rs.getInt("Celular"));
                personal.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                personal.setAdmin(rs.getBoolean("admin"));
                personal.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el miembro de personal o se enuentra inactivo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Personal " + ex.getMessage());

        }
        return personal;
    }
}
