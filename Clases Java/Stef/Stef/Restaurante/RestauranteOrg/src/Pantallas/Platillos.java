
package Pantallas;
import ConexionBD.ConexionBD;
import ConexionBD.Hash;
import Modelo.sqlPlatillos;
import Modelo.sqlPlatillos;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Platillos extends javax.swing.JFrame {

     DefaultTableModel modelo = new DefaultTableModel();
     
    public Platillos() {
        initComponents();
        
        
        try {
            tablepla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            java.sql.Connection con = conn.getConexion();

            String sql = "SELECT NumPlatillo, NombrePlatillo, Porciones, Categoria, PrecioPlatillo FROM platillos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("N°Platillo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Porciones");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio");


            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
    }
    public static Platillos prin;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtpor = new javax.swing.JTextField();
        txtpre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepla = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("PLATILLOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 270, 90));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 71, 22));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setText("Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 120, 22));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel5.setText("Porciones");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, 22));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, 22));

        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 230, 40));
        getContentPane().add(txtpor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 230, 40));

        txtpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreActionPerformed(evt);
            }
        });
        getContentPane().add(txtpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 362, 230, 40));

        tablepla.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        tablepla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Platillo", "Nombre", "Porciones", "Categoria", "Precio"
            }
        ));
        tablepla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableplaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablepla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 730, 240));

        btnguardar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 230, 80));

        btnlimpiar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 230, 80));

        btnconsultar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 230, 60));

        btnactualizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 230, 60));

        btneliminar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 230, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 227, -1));

        txtcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcatActionPerformed(evt);
            }
        });
        getContentPane().add(txtcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 230, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtpla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplaActionPerformed(evt);
            }
        });
        getContentPane().add(txtpla, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        int Fila = tablepla.getSelectedRow();

        PreparedStatement ps = null;
        try {
            ConexionBD objCon = new ConexionBD();
            Connection conn = (Connection) objCon.getConexion();
            ps = conn.prepareStatement("UPDATE platillos SET NombrePlatillo=?, Porciones=?, Categoria=?, PrecioPlatillo=? WHERE NumPlatillo=?");

            ps.setString(1, txtnom.getText());
            ps.setString(2, txtpor.getText());
            ps.setString(3, txtcat.getText());
            ps.setString(4, txtpre.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Producto Modificado");
            tablepla.setValueAt(txtnom.getText(), Fila, 1);
            tablepla.setValueAt(txtpor.getText(), Fila, 2);
            tablepla.setValueAt(txtcat.getText(), Fila, 3);
            tablepla.setValueAt(txtpre.getText(), Fila, 4);

            limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Producto");
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
          PreparedStatement ps = null;
        try {

            ConexionBD objCon = new ConexionBD();
            Connection conn = (Connection) objCon.getConexion();

            int Fila = tablepla.getSelectedRow();
            String NPlatillo = tablepla.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM platillos WHERE NumPlatillo=?");
            ps.setString(1, NPlatillo);
            ps.execute();

            modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Platillo Eliminado");
            limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Platillo");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreActionPerformed

    private void txtcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcatActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
    limpiar();

    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        
        sqlPlatillos modSql = new sqlPlatillos();
        Modelo.Platillos mod = new Modelo.Platillos();


        if (txtnom.getText().equals("") || txtpor.getText().equals("") || txtcat.getText().equals("")  || txtpre.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {

                        mod.setNombrePlatillo(txtnom.getText());
                        mod.setPorciones(Integer.parseInt(txtpor.getText()));
                        mod.setCategoria(txtcat.getText());
                        mod.setPrecioPlatillo(Integer.parseInt(txtpre.getText()));
                        
                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            Object[] fila = new Object[5];
                            fila[0] = txtpla.getText();
                            fila[1] = txtnom.getText();
                            fila[2] = txtpor.getText();
                            fila[3] = txtcat;
                            fila[4] = txtpre.getText();
                            modelo.addRow(fila);
                            limpiar();
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            
                        }
                    

            }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void tableplaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableplaMouseClicked
       
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ConexionBD objCon = new ConexionBD();
            Connection conn = (Connection) objCon.getConexion();

            int Fila = tablepla.getSelectedRow();
            String platillo = tablepla.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("SELECT NombrePlatillo, Porciones, Categoria, PrecioPlatillo FROM platillos WHERE NumPlatillo=?");
            ps.setString(1, platillo);
            rs = ps.executeQuery();

            while (rs.next()) {

                txtnom.setText(rs.getString("Nombre"));
                txtpor.setText(rs.getString("Porciones"));
                txtcat.setText(rs.getString("Categoria"));
                txtpre.setText(rs.getString("Precio"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_tableplaMouseClicked

    private void txtplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplaActionPerformed

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
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Platillos().setVisible(true);
            }
        });
    }
      public void limpiar(){
        txtnom.setText(null);
        txtpor.setText(null);
        txtcat.setText(null);
        txtpre.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnactualizar;
    public javax.swing.JButton btnconsultar;
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablepla;
    public javax.swing.JTextField txtcat;
    public javax.swing.JTextField txtnom;
    public javax.swing.JTextField txtpla;
    public javax.swing.JTextField txtpor;
    public javax.swing.JTextField txtpre;
    // End of variables declaration//GEN-END:variables
}
