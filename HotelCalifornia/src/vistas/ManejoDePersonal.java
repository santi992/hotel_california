/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.PersonalData;
import entidades.Personal;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import static vistas.VistaPrincipal.personalActivo;

/**
 *
 * @author chari
 */
public class ManejoDePersonal extends javax.swing.JInternalFrame {

    private int dni;
    private int celular;

    /**
     * Creates new form ManejoDeHuespedes
     */
    public ManejoDePersonal() {
        initComponents();
        if (!personalActivo.isAdmin()){
            jtID.setEditable(false);
            jtBuscar.setEditable(false);
            jbBuscar.setEnabled(false);
            jlBuscar.setText("Inicia sesión como administrador para buscar y modificar el personal");
            jbNuevo.setEnabled(false);
            jbGuardar.setEnabled(false);
            jrbAdminNo.setEnabled(false);
            jrbAdminSi.setEnabled(false);
            jrbEstadoActivo.setEnabled(false);
            jrbEstadoInactivo.setEnabled(false);
            mostrar(personalActivo);
        } else {
            jlBuscar.setText("Buscar miembro por id, nombre,  correo o username");
            nuevo();
        }
    }

    PersonalData persData = new PersonalData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombre = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlCelular = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlFechaNac = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        jlUsername = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jrbEstadoActivo = new javax.swing.JRadioButton();
        jdateFechaNac = new com.toedter.calendar.JDateChooser();
        jtUsername = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtPassword = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jrbAdminSi = new javax.swing.JRadioButton();
        jlAdmin = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jrbEstadoInactivo = new javax.swing.JRadioButton();
        jrbAdminNo = new javax.swing.JRadioButton();
        jbModificar = new javax.swing.JButton();

        setTitle("Manejo de Personal");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N

        jlNombre.setText("Nombre");

        jlDni.setText("Dni");

        jlCelular.setText("Celular");

        jlDireccion.setText("Direccion");

        jlEstado.setText("Estado");

        jlCorreo.setText("Correo electrónico");

        jlFechaNac.setText("Fecha De Nacimimento");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

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

        jlBuscar.setText("Buscar miembro por id, nombre,  correo o username");

        jlApellido.setText("Apellido");

        jlPassword.setText("Centraseña");

        jlUsername.setText("Username");

        jlTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlTitulo.setText("Manejo de personal");

        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });

        jtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCelularActionPerformed(evt);
            }
        });
        jtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCelularKeyTyped(evt);
            }
        });

        jrbEstadoActivo.setText("Activo");
        jrbEstadoActivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoActivoStateChanged(evt);
            }
        });
        jrbEstadoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActivoActionPerformed(evt);
            }
        });

        jdateFechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdateFechaNacPropertyChange(evt);
            }
        });

        jtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsernameActionPerformed(evt);
            }
        });

        jtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCorreoActionPerformed(evt);
            }
        });

        jtDni.setToolTipText("");
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordActionPerformed(evt);
            }
        });

        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });

        jrbAdminSi.setText("Si");
        jrbAdminSi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbAdminSiStateChanged(evt);
            }
        });
        jrbAdminSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAdminSiActionPerformed(evt);
            }
        });

        jlAdmin.setText("¿Es administrador/a?");

        jlID.setText("ID:");

        jtID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });

        jrbEstadoInactivo.setText("Inactivo");
        jrbEstadoInactivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoInactivoStateChanged(evt);
            }
        });
        jrbEstadoInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoInactivoActionPerformed(evt);
            }
        });

        jrbAdminNo.setText("No");
        jrbAdminNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbAdminNoStateChanged(evt);
            }
        });
        jrbAdminNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAdminNoActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jlTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlBuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlDni)
                                .addComponent(jlCelular)
                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlDireccion)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlID)
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbEstadoActivo)
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbAdminNo)
                                        .addComponent(jrbEstadoInactivo)))
                                .addComponent(jrbAdminSi)
                                .addComponent(jlAdmin)
                                .addComponent(jlEstado)
                                .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlUsername)
                                .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlFechaNac)
                                .addComponent(jlPassword)
                                .addComponent(jlCorreo)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtBuscar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFechaNac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbEstadoActivo)
                            .addComponent(jrbEstadoInactivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jlAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbAdminSi)
                            .addComponent(jrbAdminNo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBuscarActionPerformed

    private void jtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCelularActionPerformed

    private void jrbEstadoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActivoActionPerformed
        jrbEstadoInactivo.setSelected(!jrbEstadoActivo.isSelected());
    }//GEN-LAST:event_jrbEstadoActivoActionPerformed

    private void jdateFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdateFechaNacPropertyChange

    }//GEN-LAST:event_jdateFechaNacPropertyChange

    private void jtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsernameActionPerformed

    private void jtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCorreoActionPerformed

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordActionPerformed

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbEstadoActivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoActivoStateChanged

    }//GEN-LAST:event_jrbEstadoActivoStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jrbAdminSiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbAdminSiStateChanged

    }//GEN-LAST:event_jrbAdminSiStateChanged

    private void jrbAdminSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAdminSiActionPerformed
        jrbAdminNo.setSelected(!jrbAdminSi.isSelected());
    }//GEN-LAST:event_jrbAdminSiActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped

        (new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    dni = comprobarNumero(jtDni.getText());
                    jtDni.setText(dni + "");
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Error de interrupcion");
                }
                int posicion = jtDni.getText().length();
                jtDni.setCaretPosition(posicion);

            }

        }).start();


    }//GEN-LAST:event_jtDniKeyTyped

    private void jtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCelularKeyTyped

        (new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    celular = comprobarNumero(jtCelular.getText());
                    jtCelular.setText(celular + "");
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Error de interrupcion");
                }
                int posicion = jtCelular.getText().length();
                jtCelular.setCaretPosition(posicion);

            }

        }).start();

    }//GEN-LAST:event_jtCelularKeyTyped

    private void jrbEstadoInactivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoInactivoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoInactivoStateChanged

    private void jrbEstadoInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoInactivoActionPerformed
        jrbEstadoActivo.setSelected(!jrbEstadoInactivo.isSelected());
    }//GEN-LAST:event_jrbEstadoInactivoActionPerformed

    private void jrbAdminNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbAdminNoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAdminNoStateChanged

    private void jrbAdminNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAdminNoActionPerformed
        jrbAdminSi.setSelected(!jrbAdminNo.isSelected());
    }//GEN-LAST:event_jrbAdminNoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped

    }//GEN-LAST:event_jtIDKeyTyped

    // ----------------------------- ATENCION ------------------------------
    //Crear funcion que rellene el mail por tipeo, busca y ordena alfaveticament 5 primmeros resultados 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdateFechaNac;
    private javax.swing.JLabel jlAdmin;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaNac;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JRadioButton jrbAdminNo;
    private javax.swing.JRadioButton jrbAdminSi;
    private javax.swing.JRadioButton jrbEstadoActivo;
    private javax.swing.JRadioButton jrbEstadoInactivo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables

    private void nuevo() {
        celular = 0;
        dni = 0;
        jtID.setEditable(false);
        jtID.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtDni.setText("");
        jtCelular.setText("");
        jtDireccion.setText("");
        jtBuscar.setText("");
        jtCorreo.setText("");
        jtUsername.setText("");
        jtPassword.setText("");
        jdateFechaNac.setDate(null);
        jrbEstadoActivo.setSelected(true);
        jrbAdminSi.setSelected(true);
    }

    private boolean camposCompletados() {
        boolean nombre = !jtNombre.getText().isEmpty();
        boolean apellido = !jtApellido.getText().isEmpty();
        boolean dni = !jtDni.getText().isEmpty();
        boolean celular = !jtCelular.getText().isEmpty();
        boolean direccion = !jtDireccion.getText().isEmpty();
        boolean correo = !jtCorreo.getText().isEmpty();
        boolean user = !jtUsername.getText().isEmpty();
        boolean pass = !jtPassword.getText().isEmpty();
        boolean date = jdateFechaNac.getDate() != null;
        return (nombre && apellido && dni && celular && direccion && correo && user && pass && date);
    }

    private void guardar() {
        if (camposCompletados()) {
            Personal personal = new Personal();
            personal.setNombre(jtNombre.getText());
            personal.setApellido(jtApellido.getText());
            personal.setDni(dni);
            personal.setCelular(celular);
            personal.setDireccion(jtDireccion.getText());
            personal.setCorreo(jtCorreo.getText());
            personal.setUsername(jtUsername.getText());
            personal.setPassword(jtPassword.getText());
            personal.setFechaNacimiento(jdateFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            personal.setAdmin(jrbAdminSi.isSelected());
            personal.setEstado(jrbEstadoActivo.isSelected());
            persData.agregarPersonal(personal);
            nuevo();
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
    }

    private int comprobarNumero(String texto) {

        int n = 0;
        for (int i = 0; i < texto.length(); i++) {
            try {
                String digito = texto.charAt(i) + "";
                n = n * 10 + Integer.parseInt(digito);
            } catch (NumberFormatException nf) {
                JOptionPane.showMessageDialog(null, "El campo debe ontener sólo números");
            }
        }
        return n;
    }

    private void buscar() {

        Personal personal = new Personal();
        try {
            personal = persData.obtenerPersonal(Integer.parseInt(jtBuscar.getText()));
        } catch (NumberFormatException nf) {
            personal = persData.obtenerPersonalXBusqueda(jtBuscar.getText());
        }
        if (personal != null) {
            mostrar(personal);
        } else {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no corresponden\na un miembro del personal");
        }

    }

    private void modificar() {
        if (camposCompletados()) {
            Personal personal = new Personal();
            try {
                personal = persData.obtenerPersonal(Integer.parseInt(jtID.getText()));
            } catch (NumberFormatException nf) {
                personal = (null);
            }
            if (personal != null) {
                personal.setNombre(jtNombre.getText());
                personal.setApellido(jtApellido.getText());
                personal.setDni(dni);
                personal.setCelular(celular);
                personal.setDireccion(jtDireccion.getText());
                personal.setCorreo(jtCorreo.getText());
                personal.setUsername(jtUsername.getText());
                personal.setPassword(jtPassword.getText());
                personal.setFechaNacimiento(jdateFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                personal.setAdmin(jrbAdminSi.isSelected());
                personal.setEstado(jrbEstadoActivo.isSelected());
                persData.modificarPersonal(personal);
                nuevo();
            } else {
                JOptionPane.showMessageDialog(null, "El ID ingresado no corresponde\na un miembro del personal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
    }

    private void mostrar(Personal personal) {
            jtID.setText(personal.getIdPersonal() + "");
            jtNombre.setText(personal.getNombre());
            jtApellido.setText(personal.getApellido());
            dni = personal.getDni();
            jtDni.setText(dni + "");
            celular = personal.getCelular();
            jtCelular.setText(celular + "");
            jtDireccion.setText(personal.getDireccion());
            jtCorreo.setText(personal.getCorreo());
            jtUsername.setText(personal.getUsername());
            jtPassword.setText(personal.getPassword());
            jdateFechaNac.setDate(Date.valueOf(personal.getFechaNacimiento()));
            jrbAdminSi.setSelected(personal.isAdmin());
            jrbAdminNo.setSelected(!personal.isAdmin());
            jrbEstadoActivo.setSelected(personal.isEstado());
            jrbEstadoInactivo.setSelected(!personal.isEstado());
    }
}
