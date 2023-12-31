/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.ReservaData;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import entidades.Huesped;
import entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INTEL
 */
public class ReservasActuales extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo= new DefaultTableModel();  
    public ReservasActuales() {
        initComponents();
        armarCabezera();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        llenarTabla(); Si quiero que me muestre la tabla llena desde el inicio  --> descomentar 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jtfBuscar = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbFechaSeleccionada = new javax.swing.JButton();
        jtfFechaSeleccionada = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Reservas Actuales");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Reservas Actuales");

        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtReservas);

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel3.setText("* Introduzca  nombre o DNI  del huesped");

        jbFechaSeleccionada.setText("Seleccionar Fecha");
        jbFechaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFechaSeleccionadaActionPerformed(evt);
            }
        });

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jbLimpiar.setToolTipText("Limpiar formulario");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar todas las reservas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jtfBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbBuscar)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbSalir))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfFechaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbFechaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(98, 98, 98))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFechaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfFechaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbFechaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFechaSeleccionadaActionPerformed
        jtfFechaSeleccionada.setText(jdcFecha.getDate().toString());
//        jtfFechaSeleccionada.setText(jdcFecha.getCalendar().toString());
        jtfFechaSeleccionada.setEditable(false);
        //.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
        
        try{
            List<Reserva> reservasFiltradas = new ArrayList<>();
                ReservaData rd= new ReservaData();
               LocalDate fechaIngresada = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
               int anio= fechaIngresada.getYear();
               int mes= fechaIngresada.getMonthValue();
               int dia= fechaIngresada.getDayOfMonth();
               boolean fechaEncontrada = false;
               List <Reserva> listaReservas= rd.listarReservas();
               for(Reserva rs: listaReservas ){
               int aniod= rs.getFechaCheckIn().getYear();
               int mesd= rs.getFechaCheckIn().getMonthValue();
               int diad= rs.getFechaCheckIn().getDayOfMonth();
              
                   if(anio==aniod && mes==mesd && dia==diad ){
                       fechaEncontrada=true;
                       reservasFiltradas.add(rs);
                       System.out.println(" reservasFiltadas"+ reservasFiltradas);
                       
                       //break; Si quiero que solo me busque la primera opcion guardada en la lista --> descomentar
                   }
               }
              
             if(fechaEncontrada ){
//                   llenarTabla(reservasFiltradas);
               modelo.setRowCount(0);
//        ReservaData reservaData = new ReservaData();
//        List<Reserva> listarReservas = reservaData.listarReservas();
        for (Reserva res : reservasFiltradas) {
                modelo.addRow(new Object[]{
                    res.getIdReserva(),
                    res.getHabitacion(),
                    res.getHuesped().getNombre(),
                    res.getCantPersonas(),
                    res.getHabitacion().getTipoHabitacion(),
                    res.getFechaCheckIn(),
                    res.getFechaCheckOut(),
                    
                });}
               }else{
                   JOptionPane.showMessageDialog(this, " No existen reservas actuales  para la fecha ingresada ");
               }
           }catch(NumberFormatException nf){
               JOptionPane.showMessageDialog(this, " *ERROR! el dato ingresado debe ser una fecha* ");
               
           }
       
    
       
    }//GEN-LAST:event_jbFechaSeleccionadaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       // declarar dos reservas si reservaNombreHuesped == a  reservaNombreHuesped de la lista--> llene la tabla
       if(jtfBuscar.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para iniciar la busqueda");
       }else{
           List<Reserva> reservasFiltradas = new ArrayList<>();
           try{
                ReservaData rd= new ReservaData();
               int dni = Integer.parseInt(jtfBuscar.getText());
//               
               boolean dniEncontrado = false;
               List <Reserva> listaReservas= rd.listarReservas();
               for(Reserva rs: listaReservas ){
                   if(rs.getHuesped().getDni()== dni){
//                   if(rs.getHuesped().getNombre().equals(nombre)){
                       dniEncontrado=true;
                       reservasFiltradas.add(rs);
                      // break; si quisiera que me muestre solo la primera opcion de la lista ---> descomentar.
                   }
               }
              
             if(dniEncontrado ){
//                   llenarTabla(reservasFiltradas);//pero solo con los datos encontrados para ese dni
                   modelo.setRowCount(0);
//        ReservaData reservaData = new ReservaData();
//        List<Reserva> listarReservas = reservaData.listarReservas();
        for (Reserva res : reservasFiltradas) {
                modelo.addRow(new Object[]{
                    res.getIdReserva(),
                    res.getHabitacion(),
                    res.getHuesped().getNombre(),
                    res.getCantPersonas(),
                    res.getHabitacion().getTipoHabitacion(),
                    res.getFechaCheckIn(),
                    res.getFechaCheckOut(),
                    
                });}
               }else{
                   JOptionPane.showMessageDialog(this, " El dni ingresado no posee una reserva ");
               }
           }catch(NumberFormatException nf){
               ReservaData rd= new ReservaData();
               String nombre = jtfBuscar.getText().toLowerCase();
               boolean nombreEncontrado= false;
               List <Reserva> listaReservas= rd.listarReservas();
               for(Reserva rs: listaReservas ){
                    if(rs.getHuesped().getNombre().toLowerCase().equals(nombre)){
                       nombreEncontrado=true;
                       reservasFiltradas.add(rs);
                       //break;
                   }}
               if(nombreEncontrado){
//                   llenarTabla(reservasFiltradas);// solo con los datos correspondientes al nombre encontrado
                modelo.setRowCount(0);
//        ReservaData reservaData = new ReservaData();
//        List<Reserva> listarReservas = reservaData.listarReservas();
        for (Reserva res : reservasFiltradas) {
                modelo.addRow(new Object[]{
                    res.getIdReserva(),
                    res.getHabitacion(),
                    res.getHuesped().getNombre(),
                    res.getCantPersonas(),
                    res.getHabitacion().getTipoHabitacion(),
                    res.getFechaCheckIn(),
                    res.getFechaCheckOut(),
                    
                });}
               }else{
                 JOptionPane.showMessageDialog(this, " El nombre ingresado no posee una reserva ");  
               }
//               JOptionPane.showMessageDialog(this, " *ERROR! el dato ingresado debe ser un número* ");
               
           
               }
       }       
    
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
      jtfBuscar.setText("");
      jtfFechaSeleccionada.setText("");
      limpiarTabla();
      jdcFecha.setDate(null);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbFechaSeleccionada;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfFechaSeleccionada;
    // End of variables declaration//GEN-END:variables

    //armar tabla...
    
    public void armarCabezera(){
        modelo.addColumn("Id Reserva");
        modelo.addColumn("N° Habitación");
        modelo.addColumn("Nombre Reserva"); 
        modelo.addColumn("Huespedes");
        modelo.addColumn("Tipo de Habitación");
        modelo.addColumn("Check In");
        modelo.addColumn("Check Out");
        jtReservas.setModel(modelo);
    }

public void limpiarTabla(){

for(int i = modelo.getRowCount() - 1; i >= 0; i--){
        modelo.removeRow(i);
    }
}
public final void llenarTabla(){
    //idRserva- nro habitacion - ReservaNombre- cantHuested- tipoHabitacion- check in -check out
    limpiarTabla();
//       Reserva r=new Reserva();
        modelo.setRowCount(0);
        ReservaData reservaData = new ReservaData();
        List<Reserva> listarReservas = reservaData.listarReservas();
        for (Reserva res : listarReservas) {
                modelo.addRow(new Object[]{
                    res.getIdReserva(),
                    res.getHabitacion(),
                    res.getHuesped().getNombre(),
                     res.getCantPersonas(),
                    res.getHabitacion().getTipoHabitacion(),
                    res.getFechaCheckIn(),
                    res.getFechaCheckOut(),
                    
                });
            }
   
}

}

