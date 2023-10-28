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
    Huesped huesped = new Huesped();
    HuespedData huData = new HuespedData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpBackgroundRightU = new javax.swing.JPanel();
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
        jpBackgroundLeft = new javax.swing.JPanel();
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
        jpBackgroundRightD = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jcbHuesped = new javax.swing.JComboBox<>();
        jbCargarMisDatos = new javax.swing.JButton();
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

        setTitle("Manejo de huespedes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBackgroundRightU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpBackgroundRightU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpBackgroundRightU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpBackgroundRightU.add(jtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 189, 152, -1));
        jpBackgroundRightU.add(jtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 149, 154, -1));
        jpBackgroundRightU.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 99, 154, -1));
        jpBackgroundRightU.add(JdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 289, 126, -1));

        jLabel14.setText("Apellido");
        jpBackgroundRightU.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 109, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Informmacion Adicional");
        jpBackgroundRightU.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 19, -1, -1));

        jlId.setText("Id");
        jpBackgroundRightU.add(jlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 63, -1, -1));

        jLabel12.setText("Fecha de Nacimimento");
        jpBackgroundRightU.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 289, -1, -1));
        jpBackgroundRightU.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 59, 154, -1));

        jLabel7.setText("Pais");
        jpBackgroundRightU.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 239, -1, -1));

        jLabel8.setText("Provincia");
        jpBackgroundRightU.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 149, -1, -1));

        jLabel9.setText("Localidad");
        jpBackgroundRightU.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 199, -1, -1));
        jpBackgroundRightU.add(jtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 239, 152, -1));

        jrEstado.setText("Estado");
        jrEstado.setBorder(null);
        jrEstado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });
        jpBackgroundRightU.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 55, 107, 32));

        getContentPane().add(jpBackgroundRightU, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3, 500, 340));

        jpBackgroundLeft.setBackground(new java.awt.Color(121, 128, 129));
        jpBackgroundLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpBackgroundLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpBackgroundLeft.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 270, -1));
        jpBackgroundLeft.add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 270, -1));
        jpBackgroundLeft.add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 270, -1));
        jpBackgroundLeft.add(jtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 270, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Campos Obligatorios");
        jpBackgroundLeft.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 35));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jpBackgroundLeft.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jpBackgroundLeft.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jpBackgroundLeft.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jbNuevo.setToolTipText("Limpiar formulario");
        jbNuevo.setPreferredSize(new java.awt.Dimension(100, 35));
        jbNuevo.setRolloverEnabled(true);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jpBackgroundLeft.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 40, -1));

        jLabel1.setText("Nombre");
        jpBackgroundLeft.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setText("Dni");
        jpBackgroundLeft.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Direccion");
        jpBackgroundLeft.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setText("Celular");
        jpBackgroundLeft.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setText("Correo");
        jpBackgroundLeft.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

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
        jpBackgroundLeft.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));
        jpBackgroundLeft.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, -1));

        jLabel15.setText("Contraseña");
        jpBackgroundLeft.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jpBackgroundLeft.add(jpContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 270, -1));

        getContentPane().add(jpBackgroundLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 480, 490));

        jpBackgroundRightD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpBackgroundRightD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbBuscar.setText("Buscar");
        jbBuscar.setName(""); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbBuscar.setRolloverEnabled(true);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jpBackgroundRightD.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jlBuscar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlBuscar.setText("Buscar por dni, nombre,apellido o correo");
        jpBackgroundRightD.add(jlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 10));

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });
        jpBackgroundRightD.add(jtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 418, -1));

        jpBackgroundRightD.add(jcbHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 418, -1));

        jbCargarMisDatos.setText("Cargar Mis Datos");
        jbCargarMisDatos.setPreferredSize(new java.awt.Dimension(140, 35));
        jbCargarMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarMisDatosActionPerformed(evt);
            }
        });
        jpBackgroundRightD.add(jbCargarMisDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jlBuscarme.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlBuscarme.setText("Busca por correo y contraseña");
        jpBackgroundRightD.add(jlBuscarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        getContentPane().add(jpBackgroundRightD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 341, 500, 150));

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
        // IMPLICACION EN CASO DE QUE OLVIDE LA CONTRASEÑA NO HAY FORMA DE HACER NINGUNA OPERACION Y SU CORREO QUEDA RESTRINGIDO
        // Y SU DNI TAMBIEN (SON DATOS UNICOS)
        // PODRIA PONER SU DNI Y LUEGO PONER OTRO BOTON QUE SEA MODIFICAR CONTRASEÑA QUE SE GUIE POR SU DNI Y OTRO DATO EJ FECHA DE NACIMIMENTO
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        mostrar((Huesped) jcbHuesped.getSelectedItem());

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        buscarHuesped();
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (comprobacionDeCuentaExistente()) {
            modificarYActivarEstado();
        } else {
            guardar();
        }
        // EN CASO DE QUE SE HAYA ELIMINADO SE BUSCA POR CORREO O DNI Y LUEGO SE ACTIVA Y CAMBIA SUS DATOS 

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCargarMisDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarMisDatosActionPerformed
        // CARGAR DATOS DEL USUARIO CON USUARI Y CONTRASEÑA
        cargarMisDatos();


    }//GEN-LAST:event_jbCargarMisDatosActionPerformed


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
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargarMisDatos;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Huesped> jcbHuesped;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlBuscarme;
    private javax.swing.JLabel jlId;
    private javax.swing.JPanel jpBackgroundLeft;
    private javax.swing.JPanel jpBackgroundRightD;
    private javax.swing.JPanel jpBackgroundRightU;
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

    void cargarMisDatos() {
        huesped = huData.obtenerHuespedXCorreo(jtCorreo.getText());
        try {
            huesped = huData.obtenerHuespedXCorreoEstadoCero(jtCorreo.getText());
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado este mail");
        }
        comprobarCorreo();
        if (emailValido && huesped.getPassword().equals(jpContraseña.getText())) {
            mostrar(huesped);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un contraseña/email válido");
        }
    }

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

    private boolean comprobacionDeCuentaExistente() {
        //REVISA SI LA CUENTA ESTA EN LA BASE DE DATOS Y SI ADEMMAS ESTA DESACTIVADA
        boolean condicion = false;
        try {
            huesped = huData.obtenerHuespedXCorreoEstadoCero(jtCorreo.getText());
        } catch (NumberFormatException nf) {
            huesped = (null);
        }
        if (huesped != null && huesped.isEstado() == false) {
            condicion = true;
        }

        return condicion;
    }

    private void guardar() {
        Huesped huesped = new Huesped();
        if (camposCompletos()) {
            try {
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
                try {
                    huesped.setFechaNac(JdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                } catch (NullPointerException e) {
                    huesped.setFechaNac(LocalDate.of(2000, 1, 1));
                }
                nuevo();
                huData.agregarHuesped(huesped);
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Formatos de datos incorractos, vuelva a intentarlo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
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
        jrEstado.setSelected(true);
    }

    void funcionesyVariablesDeInicio() {
        initComponents();
        jrEstado.setSelected(true);
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
            jbCargarMisDatos.setVisible(false);
            jlBuscarme.setVisible(false);
            jlId.setVisible(false);
            jtId.setVisible(false);
        } else {
            jbCargarMisDatos.setVisible(false);
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

    private void eliminarHuespedxCorreoyContraseña() {
        Huesped hue = new Huesped();
        hue = huData.obtenerHuespedXCorreo(jtCorreo.getText());
        huData.eliminarHuesped(hue.getIdHuesped());
    }

    private void modificar() {
        Huesped huesped = new Huesped();
        if (camposCompletos()) {

            try {
                huesped = huData.obtenerHuespedXCorreoEstadoCero(jtCorreo.getText());
            } catch (NumberFormatException nf) {
                huesped = (null);
            }

            if (huesped != null && huesped.getPassword().equals(jpContraseña.getText())) {
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
                buscarHuesped();

            } else {
                JOptionPane.showMessageDialog(null, "El Correo/Contraseña ingresado no corresponde\na un Huesped");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
    }

    private void modificarYActivarEstado() {
        Huesped huesped = new Huesped();
        if (camposCompletos()) {

            try {
                huesped = huData.obtenerHuespedXCorreoEstadoCero(jtCorreo.getText());
            } catch (NumberFormatException nf) {
                huesped = (null);
            }
            comprobarCorreo();
            if (emailValido) {
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
                huesped.setEstado(true);
                huData.modificarHuesped(huesped);
                buscarHuesped();

            }
        } else if (!emailValido) {
            JOptionPane.showMessageDialog(null, "Ingrese un email válido");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }
    }

}
