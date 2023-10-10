/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.HuespedData;
import entidades.Huesped;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author chari
 */
public class ManejoDeHuespedes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManejoDeHuespedes
     */
    public ManejoDeHuespedes() {
        initComponents();
    }
    HuespedData huData = new HuespedData() ;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();

        jLabel1.setText("Nombre");

        jLabel2.setText("Dni");

        jLabel3.setText("Domicilio");

        jLabel4.setText("Celular");

        jLabel5.setText("Estado");

        jLabel6.setText("Correo");

        jLabel7.setText("Pais");

        jLabel8.setText("Provincia");

        jLabel9.setText("Localidad");

        jLabel10.setText("Informmacion Adicional");

        jLabel11.setText("Campos Obligatorios");

        jLabel12.setText("Fecha De Nacimimento");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel13.setText("busca cliente por correo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addGap(187, 187, 187))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar)
                        .addGap(39, 39, 39)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addGap(70, 70, 70)
                        .addComponent(jbGuardar)
                        .addGap(70, 70, 70)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(70, 70, 70))))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jbBuscar)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarActionPerformed

    // ----------------------------- ATENCION ------------------------------
    //Crear funcion que rellene el mail por tipeo, busca y ordena alfaveticament 5 primmeros resultados 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtBuscar;
    // End of variables declaration//GEN-END:variables
    
//    private void buscarHuesped(){
//        List huespedes = huData.listarHuespedes();
//        TreeSet<Huesped> mostrar = new TreeSet<>();
//        for (Object hu: huespedes){
//            
//            Huesped huesped = (Huesped) hu;
//            
//            String texto = jtBuscar.getText().toLowerCase();
//            String nombre = huesped.getNombre().toLowerCase();
//            String apellido = huesped.getApellido().toLowerCase();
//            String dni = huesped.getDni()+"";
//            String nomAp = nombre+" "+apellido;
//            String apNom = apellido+" "+nombre;
//            
//            boolean nombreMatch = nombre.startsWith(texto);
//            boolean apellidoMatch = apellido.startsWith(texto);
//            boolean dniMatch =  dni.startsWith(texto);
//            boolean nomApMatch = nomAp.startsWith(texto);
//            boolean apNomMatch = apNom.startsWith(texto);
//            
//            if (nombreMatch || apellidoMatch || dniMatch || nomApMatch || apNomMatch) {
//                //mostrar.add(huesped);
//                jcbHuesped.addItem(huesped);
//            }
//        }
//    }
}

