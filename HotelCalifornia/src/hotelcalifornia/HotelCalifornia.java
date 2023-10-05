/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcalifornia;

import accesoADatos.HabitacionData;
import accesoADatos.HuespedData;
import accesoADatos.ReservaData;
import accesoADatos.TipoHabData;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import vistas.VistaPrincipal;

/**
 *
 * @author SANTIAGONB
 */
public class HotelCalifornia {

    /**
     * @param args the command line arguments
     */
    static HabitacionData habData;
    static HuespedData huespedData;
    static ReservaData resData;
    static TipoHabData tipoData;
    static Huesped huesped;
    static TipoHabitacion tipoHabitacion;
    static Habitacion habitacion;
    static Reserva reserva;
    
    public static void main(String[] args) {
        
        //new VistaPrincipal().setVisible(true); // Crea la vista principal
        
        habData = new HabitacionData();
        huespedData = new HuespedData();
        resData = new ReservaData();
        tipoData = new TipoHabData();
        //Huesped prueba1 = new Huesped(1, "Huesped", "Prueba", 2000000, "Calle X", "Misiones", "Posadas", 20202020, "correo@gmail.com",true);
        //tipoHabitacion = new TipoHabitacion(1, "Tipo de prueba", 10, 10, 900);
        //habitacion = new Habitacion(101, tipoHabitacion, 1, false, true);        reserva = new Reserva(huesped, habitacion, LocalDate.now(), LocalDate.now(), 1, 900, true);

        //probarReservaData();
        probarHuespedData();
    }
    
    static void probarHuespedData(){
//    public void agregarHuesped(Huesped huesped) {
//    public void modificarHuesped(Huesped huesped) {
//    public void eliminarHuesped(int id) {
//    public List listarHuespedes() {
//    public Huesped obtenerHuesped(int idHuesped) {
//    public Huesped obtenerHuespedXDni(int dni) {
      // `nombre`, `apellido`, `dni`, `Domicilio`, `Provincia`, `Localidad`, `Correo`, `Celular`,estado
       //Huesped prueba1 = new Huesped("Huesped", "Prueba", 2000000, "Calle X", "Misiones", "Posadas", 20202020, "correo@gmail.com",true);
//
//       huespedData.agregarHuesped(prueba1);                      
//       prueba1.setNombre("pesacardo");
//       prueba1.setApellido("pesacardo");
//       prueba1.setDni(37449525);
//       prueba1.setDireccion("av xdddd");
//       prueba1.setProvincia("Santa Fe");
//       prueba1.setLocalidad("Galvez");
//       prueba1.setCelular(456315848);
//       prueba1.setCorreo("chari230893@gmail.com");
//       huespedData.modificarHuesped(prueba1);
       
       //huespedData.eliminarHuesped(14);
       
       List<Huesped> huespedList = new ArrayList<>();
       huespedList = huespedData.listarHuespedes();
        for (Huesped mostrar : huespedList) {
            System.out.println(mostrar);
        }
        
        Huesped traerxId = huespedData.obtenerHuesped(5);
        System.out.println(traerxId + " ejemplo obtener");
        Huesped traerxDni = huespedData.obtenerHuespedXDni(37449525);
        System.out.println(traerxDni + " ejemplo obtener por dni");
        

    }
    
    static void probarHabitacionData(){
        
    }
    
    static void probarReservaData(){
        
        // creando reserva con ID 7
        Reserva reserva2 = new Reserva(7,huesped, habitacion, LocalDate.now(), LocalDate.now(), 1, 900 , true);
        // creando lista de reservas
        List listaReservas = new ArrayList<>();
        //resData.agregarReserva(reserva); // agregando a db reserva sin ID
        //resData.eliminarReserva(reserva2); // eliminando de db reserva con ID 7 (borrado logico)
        //reserva2.setCantPersonas(2); // cambiando cantidad de personas en reserva2
        //resData.modificarReserva(reserva2); // actualizando cambios en db para reserva2 
        //resData.extenderReserva(reserva2, LocalDate.of(2024, Month.MARCH, 10), 2000); // extendiendo fecha hasta 2024
        
        
        /** Probar metodos cuando esten listos los otros Data
        
        // obteniendo de db la reserva con ID 3
        Reserva reservaB = resData.obtenerReserva(3);
        
        listaReservas = resData.listarReservas(); 
        listaReservas = resData.listarReservas(LocalDate.MIN, LocalDate.now());
        listaReservas = resData.listarReservasXDni(36123456);
        listaReservas = resData.listarReservasXDni(36123456, LocalDate.MIN, LocalDate.now());
        listaReservas = resData.listarReservasXHabitacion(habitacion);
        listaReservas = resData.listarReservasXHabitacion(habitacion, LocalDate.MIN, LocalDate.now());
        listaReservas = resData.listarReservasXHuesped(huesped);
        listaReservas = resData.listarReservasXHuesped(huesped, LocalDate.MIN, LocalDate.now());
        System.out.println(listaReservas);
        System.out.println(reservaB);
        
        */
        
    }
    
    static void probarTipoData(){
        
    }

}
