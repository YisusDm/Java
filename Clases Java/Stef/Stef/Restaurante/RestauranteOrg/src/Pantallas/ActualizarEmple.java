/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import ConexionBD.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class ActualizarEmple extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarEmple
     */
    public ActualizarEmple() {
        initComponents();
    }

    ActualizarEmple(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atxtced = new javax.swing.JTextField();
        atxtnom = new javax.swing.JTextField();
        acbcar = new javax.swing.JComboBox<>();
        atxtsuel = new javax.swing.JTextField();
        atxtcor = new javax.swing.JTextField();
        atxttel = new javax.swing.JTextField();
        atxtdir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnaactualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        atxtced.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        atxtced.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(atxtced);
        atxtced.setBounds(260, 180, 180, 70);

        atxtnom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        atxtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atxtnomActionPerformed(evt);
            }
        });
        getContentPane().add(atxtnom);
        atxtnom.setBounds(260, 280, 180, 70);

        acbcar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        acbcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesero", "Administrador", "Cajero", "Encargado de compras", "Chef" }));
        getContentPane().add(acbcar);
        acbcar.setBounds(260, 380, 180, 59);

        atxtsuel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sueldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(atxtsuel);
        atxtsuel.setBounds(770, 169, 203, 70);

        atxtcor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 14))); // NOI18N
        atxtcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atxtcorActionPerformed(evt);
            }
        });
        getContentPane().add(atxtcor);
        atxtcor.setBounds(770, 449, 203, 70);

        atxttel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(atxttel);
        atxttel.setBounds(770, 259, 203, 70);

        atxtdir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        atxtdir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(atxtdir);
        atxtdir.setBounds(770, 359, 203, 70);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("ACTUALIZAR EMPLEADO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 70, 560, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 210, 200);

        btnaactualizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btnaactualizar.setText("ACTUALIZAR EMPLEADO");
        btnaactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaactualizar);
        btnaactualizar.setBounds(410, 560, 410, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atxtcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atxtcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atxtcorActionPerformed

    private void atxtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atxtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atxtnomActionPerformed

    private void btnaactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaactualizarActionPerformed
         try{
            ConexionBD Con= new ConexionBD();
            Con.getConexion();
            String ced = atxtced.getText();
            String nom = atxtnom.getText();
            String car = acbcar.getSelectedItem().toString();
            String suel = atxtsuel.getText();
            String tel = atxttel.getText();
            String dir = atxtdir.getText();
            String cor = atxtcor.getText();
            String SQL = "UPDATE empleados SET "
                    + "'IdEmpleado='"+ced+"'Nombre='"+nom+"'Cargo='"+car+"',Sueldo'"+suel+"',"
                    + "Telefono='"+tel+"',Direccion='"+dir+"',"
                    + "Correo='"+cor+"'"
                    + "WHERE IdEmpleado='"+ced+"'";
            Con.sentencia.execute(SQL); 		
            JOptionPane.showMessageDialog(null,
		"¡Registro Actualizado con Éxito!");
            Con.DesconectarBD(); 
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarEmple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnaactualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarEmple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> acbcar;
    public javax.swing.JTextField atxtced;
    public javax.swing.JTextField atxtcor;
    public javax.swing.JTextField atxtdir;
    public javax.swing.JTextField atxtnom;
    public javax.swing.JTextField atxtsuel;
    public javax.swing.JTextField atxttel;
    public javax.swing.JButton btnaactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
