/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author SANTIAGONB
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        // COMENTARIO DE PRUEBA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        ImageIcon fondoIcon = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        Image fondoImagen = fondoIcon.getImage();
        jEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(fondoImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHuespedes = new javax.swing.JMenu();
        jMenuManejoHu = new javax.swing.JMenuItem();
        jMenuHabitaciones = new javax.swing.JMenu();
        jMenuManejoHab = new javax.swing.JMenuItem();
        jMenuTiposHab = new javax.swing.JMenuItem();
        jMenuReservas = new javax.swing.JMenu();
        jMenuReservarHab = new javax.swing.JMenuItem();
        jMenuAmpliarRes = new javax.swing.JMenuItem();
        jMenuAbanonarHab = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuHuActuales = new javax.swing.JMenuItem();
        jMenuDispHab = new javax.swing.JMenuItem();
        jMenuResActuales = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel California: Sistema de gestión para hotelería");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/hc_logo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(700, 400));

        jEscritorio.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenuHuespedes.setText("Huespedes");

        jMenuManejoHu.setText("Manejo de huéspedes");
        jMenuManejoHu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManejoHuActionPerformed(evt);
            }
        });
        jMenuHuespedes.add(jMenuManejoHu);

        jMenuBar1.add(jMenuHuespedes);

        jMenuHabitaciones.setText("Habitaciones");

        jMenuManejoHab.setText("Manejo de habitaciones");
        jMenuManejoHab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuManejoHabMouseClicked(evt);
            }
        });
        jMenuManejoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManejoHabActionPerformed(evt);
            }
        });
        jMenuHabitaciones.add(jMenuManejoHab);

        jMenuTiposHab.setText("Tipos de habitaciones");
        jMenuTiposHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTiposHabActionPerformed(evt);
            }
        });
        jMenuHabitaciones.add(jMenuTiposHab);

        jMenuBar1.add(jMenuHabitaciones);

        jMenuReservas.setText("Reservas");
        jMenuReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReservasActionPerformed(evt);
            }
        });

        jMenuReservarHab.setText("Reservar habitación");
        jMenuReservarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReservarHabActionPerformed(evt);
            }
        });
        jMenuReservas.add(jMenuReservarHab);

        jMenuAmpliarRes.setText("Ampliar reserva");
        jMenuReservas.add(jMenuAmpliarRes);

        jMenuAbanonarHab.setText("Abandonar habitación");
        jMenuAbanonarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbanonarHabActionPerformed(evt);
            }
        });
        jMenuReservas.add(jMenuAbanonarHab);

        jMenuBar1.add(jMenuReservas);

        jMenuConsultas.setText("Consultas");

        jMenuHuActuales.setText("Huespedes actuales");
        jMenuConsultas.add(jMenuHuActuales);

        jMenuDispHab.setText("Disponibilidad de habitaciones");
        jMenuDispHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDispHabActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuDispHab);

        jMenuResActuales.setText("Reservas actuales");
        jMenuConsultas.add(jMenuResActuales);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuManejoHuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManejoHuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuManejoHuActionPerformed

    private void jMenuDispHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDispHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuDispHabActionPerformed

    private void jMenuReservarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReservarHabActionPerformed
        ReservarHabitacion rHab = new ReservarHabitacion();
        mostrarVista(rHab);
    }//GEN-LAST:event_jMenuReservarHabActionPerformed

    private void jMenuTiposHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTiposHabActionPerformed
         TipoHabitaciones tipoHabVista = new TipoHabitaciones();
         mostrarVista(tipoHabVista);
    }//GEN-LAST:event_jMenuTiposHabActionPerformed

    private void jMenuAbanonarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbanonarHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbanonarHabActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuManejoHabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuManejoHabMouseClicked
       
    }//GEN-LAST:event_jMenuManejoHabMouseClicked

    private void jMenuManejoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManejoHabActionPerformed
        ManejodeHabitaciones manejoH = new ManejodeHabitaciones();
        mostrarVista(manejoH);
       
    }//GEN-LAST:event_jMenuManejoHabActionPerformed

    private void jMenuReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReservasActionPerformed
       ManejoDeHuespedes manejoHue = new ManejoDeHuespedes();
        mostrarVista(manejoHue);
           }//GEN-LAST:event_jMenuReservasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuAbanonarHab;
    private javax.swing.JMenuItem jMenuAmpliarRes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuDispHab;
    private javax.swing.JMenu jMenuHabitaciones;
    private javax.swing.JMenuItem jMenuHuActuales;
    private javax.swing.JMenu jMenuHuespedes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuManejoHab;
    private javax.swing.JMenuItem jMenuManejoHu;
    private javax.swing.JMenuItem jMenuResActuales;
    private javax.swing.JMenuItem jMenuReservarHab;
    private javax.swing.JMenu jMenuReservas;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenuItem jMenuTiposHab;
    // End of variables declaration//GEN-END:variables

    private void mostrarVista(JInternalFrame vista){
        jEscritorio.removeAll();
        jEscritorio.repaint();
        vista.setVisible(true);
        jEscritorio.add(vista);
        Dimension desktopSize = jEscritorio.getSize();
        Dimension FrameSize = vista.getSize();
        vista.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        jEscritorio.moveToFront(vista);
    }
    
    
    
}


