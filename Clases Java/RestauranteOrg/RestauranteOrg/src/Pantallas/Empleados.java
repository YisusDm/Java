/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import ConexionBD.ConexionBD;
import ConexionBD.Hash;
import Modelo.sqlEmpleados;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAINFONET27
 */
public class Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Empleados
     */
    String txtcar;
    public Empleados() {
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

        cbxcar = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableempl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtcor = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtNIde = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        txtsuel1 = new javax.swing.JTextField();
        txtConfirmaPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxcar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxcar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mesero", "Administrador", "Cajero", "Encargado de compras", "Chef" }));
        cbxcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcarActionPerformed(evt);
            }
        });
        getContentPane().add(cbxcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 240, 60));

        tableempl.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        tableempl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombres", "Cargo", "Sueldo", "Telefono", "Correo", "Direccion"
            }
        ));
        jScrollPane2.setViewportView(tableempl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 1220, 160));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("EMPLEADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 290, 120));

        txttel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txttel.setToolTipText("");
        txttel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 240, 60));

        txtdir.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtdir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        txtdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdirActionPerformed(evt);
            }
        });
        getContentPane().add(txtdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 240, 60));

        txtcor.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtcor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        txtcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorActionPerformed(evt);
            }
        });
        getContentPane().add(txtcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 240, 60));

        txtUser.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 240, 60));

        txtnom.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtnom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 240, 60));

        txtNIde.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtNIde.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        txtNIde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIdeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 240, 60));

        btnconsultar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 180, 60));

        btnguardar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 240, 60));

        btneliminar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 200, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 25, -1, 0));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 97, 49, 14));

        btnactualizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 190, 60));

        txtsuel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtsuel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sueldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        txtsuel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuel1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtsuel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 240, 60));

        txtConfirmaPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirmar Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(txtConfirmaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 250, 60));

        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 250, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcarActionPerformed

    private void txtdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdirActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
      Consultar();
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        /*ConexionBD Con = new ConexionBD();
        Con.ConectarBD();
        String ced = txtced.getText();
        String nom = txtnom.getText();
        String car = cbcar.getSelectedItem().toString();
        String suel = txtusuario.getText();
        String dir = txtdir.getText();
        String cor = txtcor.getText();
        String tel = txttel.getText();
        if (!ced.isEmpty()){
            if (!nom.isEmpty()) {
                if (!suel.isEmpty()) {
                    if (!dir.isEmpty()) {
                        if (!cor.isEmpty()) {
                            if (!tel.isEmpty()) {
                                try {
                                        String SQL = "INSERT INTO empleados"
                                                +"(cedula,nombre,cargo,sueldo,direccion,correo,telefono)"
                                                +" VALUES "
                                                +"('"+ced+"','"+nom+"','"+car+"','"+suel+"','"+dir+"','"+cor+"','"+tel+"');";
                                        Con.sentencia.execute(SQL);
                                        JOptionPane.showMessageDialog(null, "¡Los datos fueron guardados con exito!");
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE,null, ex);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese el telefono del empleado");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese el correo del empleado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor ingrese la direccion del empleado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese el sueldo del empleado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del empleado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la cedula del empleado");
            }
        
        Con.DesconectarBD();*/
        
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        
        //Seleccion de Rango de vendedor
        txtcar=cbxcar.getSelectedItem().toString();
        
        sqlEmpleados modSql = new sqlEmpleados();
        Modelo.Empleados mod = new Modelo.Empleados();

        String pass = new String(txtPassword.getText());
        String passC = new String(txtConfirmaPassword.getText());

        if (txtUser.getText().equals("") || pass.equals("") || passC.equals("") || txtnom.getText().equals("") || txtcor.getText().equals("") ||
                txtdir.getText().equals("") || txttel.getText().equals("") || txtNIde.getText().equals("") || txtsuel1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {

            if (pass.equals(passC)) {

                if (modSql.existeUsuario(txtUser.getText()) == 0) {

                    if (modSql.esEmail(txtcor.getText())) {

                        String nuevoPass = Hash.sha1(pass);

                        mod.setUsuario(txtUser.getText());
                        mod.setPassword(nuevoPass);
                        mod.setRango(txtcar);
                        mod.setDireccion(txtdir.getText());
                        mod.setIdentificacion(Integer.parseInt(txtNIde.getText()));
                        mod.setnombre(txtnom.getText());
                        mod.setSueldo(Double.parseDouble(txtsuel1.getText()));
                        mod.setEmail(txtcor.getText());
                        mod.setTel(txttel.getText());
                        
                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El email es incorrecto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try{
        String ced = tableempl.getValueAt(tableempl.getSelectedRow(), 0) .toString();
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        String SQL = "DELETE FROM empleados WHERE cedula='"+ced+"'";
        Con.sentencia.execute(SQL);
        JOptionPane.showMessageDialog(null, "¡El registro fué eliminado!");
        Con.DesconectarBD();
        } catch (SQLException ex) {
	Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        String ced = tableempl.getValueAt(tableempl.getSelectedRow(), 0).toString();
        String nom = tableempl.getValueAt(tableempl.getSelectedRow(), 1).toString();
        String car = tableempl.getValueAt(tableempl.getSelectedRow(), 2).toString();
        String suel = tableempl.getValueAt(tableempl.getSelectedRow(), 3).toString();
        String dir = tableempl.getValueAt(tableempl.getSelectedRow(), 4).toString();
        String cor = tableempl.getValueAt(tableempl.getSelectedRow(), 5).toString();
        String tel = tableempl.getValueAt(tableempl.getSelectedRow(), 6).toString();
        ActualizarEmple Act = new ActualizarEmple (null, true);
        Act.atxtced.setText(ced);
        Act.atxtnom.setText(nom);
        Act.acbcar.setSelectedItem(car);
        Act.atxtsuel.setText(suel);
        Act.atxtdir.setText(dir);
        Act.atxtcor.setText(cor);
        Act.atxttel.setText(tel);
        Act.setVisible(true);
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtsuel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuel1ActionPerformed

    private void txtcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorActionPerformed

    private void txtNIdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIdeActionPerformed

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }
     
    DefaultTableModel modelo;
      private void Crear_Modelo() {
        try{
            modelo = (new DefaultTableModel(
                    null, new String[]{
                      "cedula", "nombre", "cargo",
                      "sueldo", "direccion", "correo","telefono"}) {
                     Class[] types = new Class[]{
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false
                    };
                    public Class getColumnClass(int columnIndex){
                        return types[columnIndex];
                    }
                    public boolean isCellEditable(int rowIndex, int colIndex){
                        return canEdit[colIndex];
                    }
            });
            tableempl.setModel(modelo);
            
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.toString() + "Error");
                }
        }
      private void Consultar(){
          try{
            int i=0; Object ob[]=null;
            ConexionBD Con = new ConexionBD();
            Con.getConexion();
            String SQL = "SELECT * FROM empleados";
            Con.resultado = Con.sentencia.executeQuery(SQL);
            while (Con.resultado.next()){
                modelo.addRow(ob);
                modelo.setValueAt(Con.resultado.getString("cedula"), i, 0);
                modelo.setValueAt(Con.resultado.getString("nombre"), i, 1);
                modelo.setValueAt(Con.resultado.getString("cargo"), i, 2);
                modelo.setValueAt(Con.resultado.getString("sueldo"), i, 3);
                modelo.setValueAt(Con.resultado.getString("direccion"), i, 4);
                modelo.setValueAt(Con.resultado.getString("correo"), i, 5);
                modelo.setValueAt(Con.resultado.getString("telefono"), i, 6);
                i++;
            }
            Con.DesconectarBD();
        } catch (SQLException ex){
            Logger.getLogger(Empleados.class .getName()).log(Level.SEVERE, null, ex);
        }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbxcar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableempl;
    private javax.swing.JPasswordField txtConfirmaPassword;
    private javax.swing.JTextField txtNIde;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtcor;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtsuel1;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
