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
        llenarTabla();
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
        jLabel3.setText("* Introduzca DNI  del huesped");

        jbFechaSeleccionada.setText("Seleccionar Fecha");
        jbFechaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFechaSeleccionadaActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbBuscar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbFechaSeleccionada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtfFechaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbFechaSeleccionada)
                        .addComponent(jbSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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
                       break;
                   }
               }
              
             if(fechaEncontrada ){
                   llenarTabla();
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
           
           try{
                ReservaData rd= new ReservaData();
               int dni = Integer.parseInt(jtfBuscar.getText());
//               String nombre = jtfBuscar.getText();
               boolean dniEncontrado = false;
               List <Reserva> listaReservas= rd.listarReservas();
               for(Reserva rs: listaReservas ){
                   if(rs.getHuesped().getDni()== dni){
//                   if(rs.getHuesped().getNombre().equals(nombre)){
                       dniEncontrado=true;
                       break;
                   }
               }
              
             if(dniEncontrado ){
                   llenarTabla();
               }else{
                   JOptionPane.showMessageDialog(this, " El dni ingresado no posee una reserva ");
               }
           }catch(NumberFormatException nf){
               JOptionPane.showMessageDialog(this, " *ERROR! el dato ingresado debe ser un número* ");
               
           }
       }
    
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
      jtfBuscar.setText("");
      jtfFechaSeleccionada.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    for( int i=modelo.getRowCount() ;i >0; i --){
        modelo.removeRow(-1);
    }
}
public void llenarTabla(){
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
    //modelo.addRow(os);
}

}

