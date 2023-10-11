/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.HuespedData;
import accesoADatos.PersonalData;
import entidades.Huesped;
import entidades.Personal;
import java.util.List;
import javax.swing.JOptionPane;
import static vistas.VistaPrincipal.login;
import static vistas.VistaPrincipal.huespedActivo;
import static vistas.VistaPrincipal.personalActivo;
import static vistas.VistaPrincipal.mostrarVista;
import static vistas.VistaPrincipal.vistaP;

/**
 *
 * @author SANTIAGONB
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    private boolean personal;
    private String passOculta;

    public Login(boolean personal) {
        this.personal = personal;
        passOculta = "";
        initComponents();
        if (personal) {
            jlEmail.setText("email o nombre de usuario:");
            jbRegistrar.setVisible(false);
            jlNoCuenta.setText("Ingrese como administrador para agregar un nuevo miembro");
            try {
                if (personalActivo.isAdmin()) {
                    jbRegistrar.setVisible(true);
                    jlNoCuenta.setText("Agregar un nuevo miembro");
                }
            } catch (NullPointerException np) {

            }
        } else {
            jlEmail.setText("email:");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlPasswrod = new javax.swing.JLabel();
        jtPassword = new javax.swing.JTextField();
        jbIngresar = new javax.swing.JButton();
        jbVer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();
        jlNoCuenta = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setTitle("Iniciar sesión");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTitulo.setText("Iniciar sesión");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlEmail.setText("email:");

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        jlPasswrod.setText("contraseña/password:");

        jtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordActionPerformed(evt);
            }
        });
        jtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPasswordKeyTyped(evt);
            }
        });

        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        jbVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        jbVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbVerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbVerMouseReleased(evt);
            }
        });
        jbVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jtPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jlPasswrod, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(jtEmail)
                            .addComponent(jlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlPasswrod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbVer)
                    .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIngresar)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbRegistrar.setText("Registrarse");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jlNoCuenta.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlNoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNoCuenta.setText("¿Aún no tiene una cuenta?");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrar)
                .addGap(29, 29, 29)
                .addComponent(jbSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbRegistrar)
                        .addComponent(jbSalir))
                    .addComponent(jlNoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        if (acceso()) {
            login = true;
            vistaP.get(0).repaint();
            mostrarVista(new ReservarHabitacion());
        }
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if (!personal) {
            mostrarVista(new ManejoDeHuespedes());
        } else {
            mostrarVista(new ManejoDePersonal());
        }

    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPasswordKeyTyped
        (new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    // INSERTAR CODIGO A MOVER AQUI

                    int longitud = jtPassword.getText().length();
                    int longOculta = passOculta.length();
                    if (longitud > longOculta) {
                        char letra = jtPassword.getText().charAt(longitud - 1);
                        passOculta += letra;
                    } else {
                        passOculta = passOculta.substring(0, longitud);
                    }
                    jtPassword.setText(ocultarPass());
                    jtPassword.setCaretPosition(longitud);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Error de interrupcion");
                }

            }

        }).start();
    }//GEN-LAST:event_jtPasswordKeyTyped

    private void jtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPasswordKeyReleased

    }//GEN-LAST:event_jtPasswordKeyReleased

    private void jtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPasswordKeyPressed

    }//GEN-LAST:event_jtPasswordKeyPressed

    private void jbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVerActionPerformed

    private void jbVerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVerMousePressed
        jtPassword.setText(passOculta);
    }//GEN-LAST:event_jbVerMousePressed

    private void jbVerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVerMouseReleased
        jtPassword.setText(ocultarPass());
    }//GEN-LAST:event_jbVerMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVer;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNoCuenta;
    private javax.swing.JLabel jlPasswrod;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtPassword;
    // End of variables declaration//GEN-END:variables

    public boolean accesoHuesped() {
        String correo = jtEmail.getText();
        String passIngresada = passOculta;

        HuespedData huData = new HuespedData();
        Huesped huesped = huData.obtenerHuespedXCorreo(correo);

        if (huesped == null) {
            JOptionPane.showMessageDialog(null, "El email ingresado no corresponde a un huesped activo");
            return false;
        }

        String passHuesped = huesped.getPassword();

        if (passHuesped.equals(passIngresada)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido/a, " + huesped.getNombre() + "!");
            huespedActivo = huesped;
            personalActivo = null;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            return false;
        }

    }

    public boolean accesoPersonal() {
        String correoUsername = jtEmail.getText();
        String passIngresada = passOculta;
        PersonalData pData = new PersonalData();
        List<Personal> staff = pData.listarPersonales();
        Personal p = null;

        for (Personal personal : staff) {
            if (personal.getUsername().equals(correoUsername) || personal.getCorreo().equals(correoUsername)) {
                p = personal;
            }
        }

        if (p == null) {
            JOptionPane.showMessageDialog(null, "El email o username ingresado no corresponde\na un miembro de personal activo");
            return false;
        }

        String passPersonal = p.getPassword();

        if (passPersonal.equals(passIngresada)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido/a, " + p.getNombre() + "!");
            personalActivo = p;
            huespedActivo = null;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            return false;
        }

    }

    public boolean acceso() {

        if (personal) {
            return accesoPersonal();
        } else {
            return accesoHuesped();
        }

    }

    private String ocultarPass() {
        String asteriscos = "";
        for (int i = 0; i < passOculta.length(); i++) {
            asteriscos += "*";
        }
        return asteriscos;
    }

}
