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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAINFONET28
 */
public class Receta extends javax.swing.JFrame {

    /**
     * Creates new form Receta
     */
    public Receta() {
        initComponents();
        Crear_Modelo();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpla = new javax.swing.JTextField();
        txtrefe = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtuni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablerec = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("RECETA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 30, 180, 50);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setText("N° Platillo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 360, 120, 26);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setText("Referencia de producto ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 120, 280, 26);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setText("Unidad");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 240, 90, 26);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 300, 110, 26);

        txtpla.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        getContentPane().add(txtpla);
        txtpla.setBounds(550, 350, 260, 50);

        txtrefe.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        getContentPane().add(txtrefe);
        txtrefe.setBounds(550, 110, 260, 50);

        txtnom.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        getContentPane().add(txtnom);
        txtnom.setBounds(550, 170, 260, 50);

        txtuni.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        getContentPane().add(txtuni);
        txtuni.setBounds(550, 230, 260, 50);

        tablerec.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        tablerec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Platillo", "Referencia", "Unidad", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablerec);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 420, 680, 270);

        btnguardar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(930, 240, 150, 35);

        btnlimpiar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(930, 150, 150, 35);

        btnconsultar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar);
        btnconsultar.setBounds(910, 560, 170, 35);

        btneliminar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(910, 500, 160, 35);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 230, 200);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel8.setText("Nombre");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 180, 160, 30);
        getContentPane().add(txtcan);
        txtcan.setBounds(550, 290, 260, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1355, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         ConexionBD Con = new ConexionBD();
        Con.getConexion();
        String refe = txtrefe.getText();
        String nom = txtnom.getText();
        String uni = txtuni.getText();
        String can = txtcan.getText();
        String pla = txtpla.getText();
        if (!refe.isEmpty()){
            if (!nom.isEmpty()) {
                if (!uni.isEmpty()) {
                    if (!can.isEmpty()) {
                        if (!pla.isEmpty()) {
                           
                                    try {
                                        String SQL = "INSERT INTO receta"
                                                +"(ReferenciaProducto,Nombre,Unidad,Cantidad,nºPlatillo)"
                                                +" VALUES "
                                                +"('"+refe+"','"+nom+"','"+uni+"','"+can+"','"+pla+"');";
                                        Con.sentencia.execute(SQL);
                                        JOptionPane.showMessageDialog(null, "¡Los datos fueron guardados con exito!");
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE,null, ex);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese el numero del platillo");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad del platillo");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor la unidad del platillo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del platillo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese la referencia del producto");
                }
          
        Con.DesconectarBD();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
    txtrefe.setText("");
    txtnom.setText("");
    txtuni.setText("");
    txtcan.setText("");
    txtpla.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        Consultar();
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
         try{
        String refe = tablerec.getValueAt(tablerec.getSelectedRow(), 0) .toString();
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        String SQL = "DELETE FROM receta WHERE RefenciaProducto='"+refe+"'";
        Con.sentencia.execute(SQL);
        JOptionPane.showMessageDialog(null, "¡El registro fué eliminado!");
        Con.DesconectarBD();
        } catch (SQLException ex) {
	Logger.getLogger(Receta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receta().setVisible(true);
            }
        });
    }
DefaultTableModel modelo;
      private void Crear_Modelo() {
        try{
            modelo = (new DefaultTableModel(
                    null, new String[]{
                      "ReferenciaProducto", "Nombre", "Unidad", "Cantidad",
                      "NºPlatillo"}) {
                     Class[] types = new Class[]{
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false
                    };
                    public Class getColumnClass(int columnIndex){
                        return types[columnIndex];
                    }
                    public boolean isCellEditable(int rowIndex, int colIndex){
                        return canEdit[colIndex];
                    }
            });
            tablerec.setModel(modelo);
            
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.toString() + "Error");
                }
        }
      private void Consultar(){
          try{
            int i=0; Object ob[]=null;
            ConexionBD Con = new ConexionBD();
            Con.getConexion();
            String SQL = "SELECT * FROM receta";
            Con.resultado = Con.sentencia.executeQuery(SQL);
            while (Con.resultado.next()){
                modelo.addRow(ob);
                modelo.setValueAt(Con.resultado.getString("ReferenciaProducto"), i, 0);
                modelo.setValueAt(Con.resultado.getString("Nombre"), i, 1);
                modelo.setValueAt(Con.resultado.getString("Unidad"), i, 2);
                modelo.setValueAt(Con.resultado.getString("Cantidad"), i, 3);
                modelo.setValueAt(Con.resultado.getString("NºPlatillo"), i, 4);
                i++;
            }
            Con.DesconectarBD();
        } catch (SQLException ex){
            Logger.getLogger(Receta.class .getName()).log(Level.SEVERE, null, ex);
        }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablerec;
    private javax.swing.JTextField txtcan;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpla;
    private javax.swing.JTextField txtrefe;
    private javax.swing.JTextField txtuni;
    // End of variables declaration//GEN-END:variables
}
