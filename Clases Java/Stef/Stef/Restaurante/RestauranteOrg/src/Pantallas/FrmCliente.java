/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import ConexionBD.ConexionBD;
import ConexionBD.Hash;
import Modelo.sqlCliente;
import Modelo.sqlEmpleados;
import javax.swing.JOptionPane;


public class FrmCliente extends javax.swing.JFrame {
    

    public FrmCliente() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtced = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("CLIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 280, 110));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 106, 52));

        txtnom.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 200, 50));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 120, 50));

        txtced.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedActionPerformed(evt);
            }
        });
        getContentPane().add(txtced, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 200, 50));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setText("Cedula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 106, 58));

        txtcor.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorActionPerformed(evt);
            }
        });
        getContentPane().add(txtcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 200, 50));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel5.setText("Correo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 106, 55));

        txttel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 200, 50));

        btnlimpiar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 190, 90));

        btnguardar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 210, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 213, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedActionPerformed

    private void txtcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        
        sqlCliente modSql = new sqlCliente();
        Modelo.Cliente mod = new Modelo.Cliente();


        if (txtnom.getText().equals("") || txtced.getText().equals("") ||
                txttel.getText().equals("") || txtcor.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {


                        mod.setNombre(txtnom.getText());
                        mod.setCedula(Integer.parseInt(txtced.getText()));
                        mod.setTelefono(Integer.parseInt(txttel.getText()));
                        mod.setCorreo(txtcor.getText());
                        
                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            limpiar();
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            
                        }
                    

            }
    
                                              

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }
            public void limpiar()
    {
        txtnom.setText(null);
        txtced.setText(null);
        txttel.setText(null);
        txtcor.setText(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField txtced;
    public javax.swing.JTextField txtcor;
    public javax.swing.JTextField txtnom;
    public javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
