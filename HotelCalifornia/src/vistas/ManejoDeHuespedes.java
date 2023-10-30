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
        jsRightLineSep = new javax.swing.JSeparator();
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
        jsMiddleLineSep = new javax.swing.JSeparator();
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

        jpBackgroundRightU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel14.setText("Apellido");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Informacion Adicional");

        jlId.setText("Id");

        jLabel12.setText("Fecha de Nacimimento");

        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });

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

        jsRightLineSep.setBackground(new java.awt.Color(153, 153, 153));
        jsRightLineSep.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jpBackgroundRightULayout = new javax.swing.GroupLayout(jpBackgroundRightU);
        jpBackgroundRightU.setLayout(jpBackgroundRightULayout);
        jpBackgroundRightULayout.setHorizontalGroup(
            jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jsRightLineSep, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                                        .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlId)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel14))))
                                .addGap(28, 28, 28)
                                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpBackgroundRightULayout.setVerticalGroup(
            jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundRightULayout.createSequentialGroup()
                        .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundRightULayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId))
                        .addGap(15, 15, 15)))
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(15, 15, 15)
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(15, 15, 15)
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(jpBackgroundRightULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(JdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jsRightLineSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jpBackgroundRightU, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 500, 330));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jbNuevo.setToolTipText("Limpiar formulario");
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

        jsMiddleLineSep.setBackground(new java.awt.Color(153, 153, 153));
        jsMiddleLineSep.setForeground(new java.awt.Color(102, 102, 102));
        jsMiddleLineSep.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jpBackgroundLeftLayout = new javax.swing.GroupLayout(jpBackgroundLeft);
        jpBackgroundLeft.setLayout(jpBackgroundLeftLayout);
        jpBackgroundLeftLayout.setHorizontalGroup(
            jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57)
                .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsMiddleLineSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBackgroundLeftLayout.setVerticalGroup(
            jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(15, 15, 15)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(48, 48, 48)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jpBackgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpBackgroundLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jsMiddleLineSep, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        getContentPane().add(jpBackgroundLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, 490));

        jbBuscar.setText("Buscar");
        jbBuscar.setName(""); // NOI18N
        jbBuscar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbBuscar.setRolloverEnabled(true);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlBuscar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlBuscar.setText("Buscar por dni, nombre,apellido o correo");

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jbCargarMisDatos.setText("Cargar Mis Datos");
        jbCargarMisDatos.setPreferredSize(new java.awt.Dimension(140, 35));
        jbCargarMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarMisDatosActionPerformed(evt);
            }
        });

        jlBuscarme.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlBuscarme.setText("Busca por correo y contraseña");

        javax.swing.GroupLayout jpBackgroundRightDLayout = new javax.swing.GroupLayout(jpBackgroundRightD);
        jpBackgroundRightD.setLayout(jpBackgroundRightDLayout);
        jpBackgroundRightDLayout.setHorizontalGroup(
            jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundRightDLayout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundRightDLayout.createSequentialGroup()
                        .addGroup(jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundRightDLayout.createSequentialGroup()
                        .addGroup(jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBackgroundRightDLayout.createSequentialGroup()
                                .addComponent(jlBuscarme)
                                .addGap(29, 29, 29)
                                .addComponent(jlBuscar))
                            .addGroup(jpBackgroundRightDLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbCargarMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))))
        );
        jpBackgroundRightDLayout.setVerticalGroup(
            jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundRightDLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBuscarme))
                .addGap(6, 6, 6)
                .addGroup(jpBackgroundRightDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbCargarMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jcbHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jpBackgroundRightD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 500, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarHuespedxCorreoyContraseña();
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
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCargarMisDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarMisDatosActionPerformed
        // CARGAR DATOS DEL USUARIO CON USUARI Y CONTRASEÑA
        cargarMisDatos();


    }//GEN-LAST:event_jbCargarMisDatosActionPerformed

    private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdActionPerformed


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
    private javax.swing.JSeparator jsMiddleLineSep;
    private javax.swing.JSeparator jsRightLineSep;
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
