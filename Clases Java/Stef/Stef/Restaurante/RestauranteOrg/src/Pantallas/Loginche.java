/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

/**
 *
 * @author User
 */
public class Loginche extends javax.swing.JFrame {

    /**
     * Creates new form Loginche
     */
    public Loginche() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        btnpla = new javax.swing.JButton();
        btnrec = new javax.swing.JButton();
        btncom = new javax.swing.JButton();
        btnlog = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 240, 200);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel2.setText("BIENVENIDO CHEF");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 50, 439, 128);

        btnpla.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnpla.setText("Platillos");
        btnpla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaActionPerformed(evt);
            }
        });
        getContentPane().add(btnpla);
        btnpla.setBounds(460, 220, 480, 80);

        btnrec.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnrec.setText("Receta");
        btnrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecActionPerformed(evt);
            }
        });
        getContentPane().add(btnrec);
        btnrec.setBounds(460, 320, 480, 80);

        btncom.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btncom.setText("Comanda");
        btncom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomActionPerformed(evt);
            }
        });
        getContentPane().add(btncom);
        btncom.setBounds(460, 420, 480, 80);

        btnlog.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnlog.setText("Cerrar sesion");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });
        getContentPane().add(btnlog);
        btnlog.setBounds(460, 520, 480, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -70, 1355, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaActionPerformed
        Platillos obj = new Platillos();
        obj.setVisible(true);    
        dispose();
    }//GEN-LAST:event_btnplaActionPerformed

    private void btnrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecActionPerformed
        Receta obj = new Receta();
        obj.setVisible(true);    
        dispose();
    }//GEN-LAST:event_btnrecActionPerformed

    private void btncomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomActionPerformed
        Comanda obj = new Comanda();
        obj.setVisible(true);    
        dispose();
    }//GEN-LAST:event_btncomActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        Login obj = new Login();
        obj.setVisible(true);    
        dispose();
    }//GEN-LAST:event_btnlogActionPerformed

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
            java.util.logging.Logger.getLogger(Loginche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncom;
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnpla;
    private javax.swing.JButton btnrec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
