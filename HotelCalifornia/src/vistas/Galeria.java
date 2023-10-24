/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;
import javax.swing.ImageIcon;
/**
 *
 * @author Usuario
 */
public class Galeria extends javax.swing.JInternalFrame {
    ImageIcon Imagen[]=new ImageIcon[11];
        int contador =1;
    /**
     * Creates new form Galeria
     */
    public Galeria() {
        initComponents();
        this.setTitle("Hotel California");
        for(int i=1; i<10; i++){
            Imagen[i]=new ImageIcon (getClass().getResource("GaleriaImagenes/Imagenes/hab"+ i +".jpg"));
            
        }    
        jCuadro.setIcon(Imagen[1]);
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCuadro = new javax.swing.JLabel();
        jbAnterior = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCuadro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(jCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 326, 230));

        jbAnterior.setText("Anterior");
        jbAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jbAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jbSiguiente.setText("Siguiente");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jbSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GaleriaImagenes/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 380, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnteriorActionPerformed
         if(contador==1){
          contador=10;
      }
      contador --;
      jCuadro.setIcon(Imagen[contador]);
                                         
    }//GEN-LAST:event_jbAnteriorActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
       if(contador == 9){
           contador= 0;
       }
       contador ++;
       jCuadro.setIcon(Imagen[contador]);
                                         
    }//GEN-LAST:event_jbSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCuadro;
    private javax.swing.JLabel jFondo;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbSiguiente;
    // End of variables declaration//GEN-END:variables
}

