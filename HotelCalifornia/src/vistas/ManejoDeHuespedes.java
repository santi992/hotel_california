/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.HuespedData;
import entidades.Huesped;
import entidades.Personal;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import static vistas.VistaPrincipal.huespedActivo;
import static vistas.VistaPrincipal.personalActivo;

/**
 *
 * @author chari
 */
public class ManejoDeHuespedes extends javax.swing.JInternalFrame {

    private boolean emailValido;

    public ManejoDeHuespedes() {
        funcionesyVariablesDeInicio();

    }
    HuespedData huData = new HuespedData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtLocalidad = new javax.swing.JTextField();
        jtProvincia = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        JdFecha = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtPais = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jtDni = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jpContraseña = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jcbHuesped = new javax.swing.JComboBox<>();
        jbBuscarme = new javax.swing.JButton();
        jlBuscarme = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel14.setText("Apellido");

        jLabel10.setText("Informmacion Adicional");

        jlId.setText("Id");

        jLabel12.setText("Fecha de Nacimimento");

        jLabel7.setText("Pais");

        jLabel8.setText("Provincia");

        jLabel9.setText("Localidad");

        jrEstado.setText("Estado");
        jrEstado.setBorder(null);
        jrEstado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jrEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addGap(44, 44, 44)
                            .addComponent(jlId))
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlId)
                    .addComponent(jrEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JdFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel3.setBackground(new java.awt.Color(121, 128, 129));

        jLabel11.setText("Campos Obligatorios");

        jbSalir.setText("Salir");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 35));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.setPreferredSize(new java.awt.Dimension(100, 35));
        jbNuevo.setRolloverEnabled(true);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Dni");

        jLabel3.setText("Direccion");

        jLabel4.setText("Celular");

        jLabel6.setText("Correo");

        jbModificar.setText("Modificar");
        jbModificar.setMaximumSize(new java.awt.Dimension(32, 32));
        jbModificar.setMinimumSize(new java.awt.Dimension(100, 35));
        jbModificar.setName(""); // NOI18N
        jbModificar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel15.setText("Contraseña");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNombre)
                                    .addComponent(jtDni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jpContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                                .addGap(66, 66, 66))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );

        jbBuscar.setText("Buscar");
        jbBuscar.setName(""); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbBuscar.setRolloverEnabled(true);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlBuscar.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jlBuscar.setText("busca cliente por correo");

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jbBuscarme.setText("Buscarme");

        jlBuscarme.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jlBuscarme.setText("Busca por correo y contraseña");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbBuscarme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlBuscarme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlBuscar)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscar)
                    .addComponent(jbBuscarme)
                    .addComponent(jlBuscarme)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
       eliminarHuespedxCorreoyContraseña();// HACER UN CARTEL PARA CONFIRMA LA ELIMIMNACION DEL USUARIO
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        mostrar((Huesped)jcbHuesped.getSelectedItem());
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        buscarHuesped();
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardar();
        comprobarCorreo();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jbModificarActionPerformed

    // ----------------------------- ATENCION ------------------------------
    //Crear funcion que rellene el mail por tipeo, busca y ordena alfaveticament 5 primmeros resultados 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdFecha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscarme;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Huesped> jcbHuesped;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlBuscarme;
    private javax.swing.JLabel jlId;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtLocalidad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPais;
    private javax.swing.JTextField jtProvincia;
    // End of variables declaration//GEN-END:variables

    private void buscarHuesped() {
        jcbHuesped.removeAllItems();
        List huespedes = huData.listarHuespedesActivosYNoActivos();
        TreeSet<Huesped> mostrar = new TreeSet<>();
        for (Object hu : huespedes) {

            Huesped huesped = (Huesped) hu;

            String texto = jtBuscar.getText().toLowerCase();
            String nombre = huesped.getNombre().toLowerCase();
            String apellido = huesped.getApellido().toLowerCase();
            String dni = huesped.getDni() + "";
            String nomAp = nombre + " " + apellido;
            String apNom = apellido + " " + nombre;
            String correo = huesped.getCorreo().toLowerCase();

            boolean correoMatch = correo.startsWith(texto);
            boolean nombreMatch = nombre.startsWith(texto);
            boolean apellidoMatch = apellido.startsWith(texto);
            boolean dniMatch = dni.startsWith(texto);
            boolean nomApMatch = nomAp.startsWith(texto);
            boolean apNomMatch = apNom.startsWith(texto);

            if (nombreMatch || apellidoMatch || dniMatch || nomApMatch || apNomMatch || correoMatch) {
                //mostrar.add(huesped);
                jcbHuesped.addItem(huesped);
            }

            if (jtBuscar.getText().isEmpty()) {
                jcbHuesped.removeAllItems();

            }
        }
    }

    private boolean camposCompletos() {
        boolean nombre = !jtNombre.getText().isEmpty();
        boolean dni = !jtDni.getText().isEmpty();
        boolean direccion = !jtDireccion.getText().isEmpty();
        boolean celular = !jtCelular.getText().isEmpty();
        boolean correo = !jtCorreo.getText().isEmpty();
        boolean contraseña = !jpContraseña.getText().isEmpty();
        return (nombre && dni && direccion && celular && correo && contraseña);

    }

    private void guardar() {
        if (camposCompletos()) {
            HuespedData huesData = new HuespedData();
            Huesped hues = new Huesped();
            hues.setNombre(jtNombre.getText());
            hues.setDni(Integer.parseInt(jtDni.getText()));
            hues.setCelular(Integer.parseInt(jtCelular.getText()));
            hues.setDireccion(jtDireccion.getText());
            hues.setCorreo(jtCorreo.getText());
            hues.setPassword(jpContraseña.getText());

            hues.setApellido(jtApellido.getText());
            hues.setLocalidad(jtLocalidad.getText());
            hues.setProvincia(jtProvincia.getText());
            hues.setPais(jtPais.getText());
            try {
                hues.setFechaNac(JdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } catch (NullPointerException e) {

                hues.setFechaNac(LocalDate.of(0, 0, 0));

            }

            huesData.agregarHuesped(hues);
            nuevo();
        } else if (!emailValido) {
            JOptionPane.showMessageDialog(null, "Ingrese un email válido");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
    }

    private void cartasLayout() {

        // CardLayout
        /*
                import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private CardLayout cardLayout;

    public MainFrame() {
        // Configurar el JFrame
        setTitle("Mostrar/Ocultar Secciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Crear dos paneles (secciones)
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);

        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);

        // Crear un CardLayout
        cardLayout = new CardLayout();

        // Establecer el CardLayout en el JFrame
        setLayout(cardLayout);

        // Agregar los paneles al JFrame con nombres asociados
        add(panel1, "Panel 1");
        add(panel2, "Panel 2");

        // Crear botones para mostrar/ocultar las secciones
        JButton button1 = new JButton("Mostrar Panel 1");
        JButton button2 = new JButton("Mostrar Panel 2");

        // Agregar ActionListener para los botones
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getContentPane(), "Panel 1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getContentPane(), "Panel 2");
            }
        });

        // Agregar los botones al JFrame
        getContentPane().add(button1, BorderLayout.NORTH);
        getContentPane().add(button2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}

         */
    }

    private void nuevo() {
        jtCelular.setText("");
        jtDni.setText("");
        jtId.setText("");
        jtNombre.setText("");
        jtPais.setText("");
        jtDireccion.setText("");
        jtBuscar.setText("");
        jtCorreo.setText("");
        jtApellido.setText("");
        jtProvincia.setText("");
        jtLocalidad.setText("");
        JdFecha.setDate(null);
        jcbHuesped.removeAllItems();
        jpContraseña.setText("");
    }

    void funcionesyVariablesDeInicio() {
        initComponents();
        jtId.setEditable(false);
        if (huespedActivo != null) {

            jlBuscar.setVisible(false);
            jtBuscar.setVisible(false);
            jbBuscar.setVisible(false);
            jcbHuesped.setVisible(false);
            jrEstado.setVisible(false);
            mostrar(huespedActivo);
            comprobarCorreo();
        } else if (VistaPrincipal.login == false) {
            jlBuscar.setVisible(false);
            jtBuscar.setVisible(false);
            jbBuscar.setVisible(false);
            jcbHuesped.setVisible(false);
            jrEstado.setVisible(false);
            jbBuscarme.setVisible(false);
            jlBuscarme.setVisible(false);
            jlId.setVisible(false);
            jtId.setVisible(false);
        } else {
            jbBuscarme.setVisible(false);
            jlBuscarme.setVisible(false);
        }
    }

    private void mostrar(Huesped huesped) {

        jtNombre.setText(huesped.getNombre());
        jtDni.setText(Integer.toString(huesped.getDni()));
        jtDireccion.setText(huesped.getDireccion());
        jtCelular.setText(Integer.toString(huesped.getCelular()));
        jtCorreo.setText(huesped.getCorreo());
        jpContraseña.setText(huesped.getPassword());

        try {
            jtId.setText(Integer.toString(huesped.getIdHuesped()));
            jrEstado.setSelected(huesped.isEstado());
            jtApellido.setText(huesped.getApellido());
            jtPais.setText(huesped.getPais());
            System.out.println(huesped.getPais());
            jtProvincia.setText(huesped.getProvincia());
            jtLocalidad.setText(huesped.getLocalidad());
            JdFecha.setDate(Date.from(huesped.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));

        } catch (NullPointerException ex) {
        }

    }

    private void comprobarCorreo() {
        (new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    if (jtCorreo.getText().contains("@")) {
                        jtCorreo.setForeground(Color.black);
                        emailValido = true;
                    } else {
                        jtCorreo.setForeground(Color.red);
                        emailValido = false;
                    }
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Error de interrupcion");
                }

            }

        }).start();
    }
    
    
    private void eliminarHuespedxCorreoyContraseña(){
        Huesped hue = new Huesped();
       hue = huData.obtenerHuespedXCorreo(jtCorreo.getText());
        huData.eliminarHuesped(hue.getIdHuesped());
    }
    
        private void modificar() {
        if (camposCompletos()) {
            Huesped huesped = new Huesped();
            try {
                huesped = huData.obtenerHuespedXCorreoEstadoCero(jtCorreo.getText());
            } catch (NumberFormatException nf) {
                huesped = (null);
            }
            if (huesped != null && huesped.getPassword() == jpContraseña.getText()) {
            huesped.setNombre(jtNombre.getText());
            huesped.setDni(Integer.parseInt(jtDni.getText()));
            huesped.setCelular(Integer.parseInt(jtCelular.getText()));
            huesped.setDireccion(jtDireccion.getText());
            huesped.setCorreo(jtCorreo.getText());
            huesped.setPassword(jpContraseña.getText());

            huesped.setApellido(jtApellido.getText());
            huesped.setLocalidad(jtLocalidad.getText());
            huesped.setProvincia(jtProvincia.getText());
            huesped.setPais(jtPais.getText());
            huesped.setEstado(jrEstado.isSelected());
            huData.modificarHuesped(huesped);
            
               
            } else {
                JOptionPane.showMessageDialog(null, "El Correo/Contraseña ingresado no corresponde\na un Huesped");
            }
        } else if (!emailValido){
            JOptionPane.showMessageDialog(null, "Ingrese un email válido");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
    }
        

}
