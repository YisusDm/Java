/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import ConexionBD.ConexionBD;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAINFONET27
 */
public class Domicilios extends javax.swing.JFrame {

    /**
     * Creates new form Domicilios
     */
    public Domicilios() {
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

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        txtcli = new javax.swing.JTextField();
        txthor = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledom = new javax.swing.JTable();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnfacturar = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setText("DOMICILIOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 40, 300, 100);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel3.setText("ID Cliente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 170, 93, 39);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(630, 170, 83, 39);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 240, 93, 38);

        txtdir.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(txtdir);
        txtdir.setBounds(330, 240, 200, 50);

        txtcli.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(txtcli);
        txtcli.setBounds(330, 170, 200, 50);

        txthor.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorActionPerformed(evt);
            }
        });
        getContentPane().add(txthor);
        txthor.setBounds(700, 230, 200, 40);

        btnguardar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(770, 310, 140, 50);

        btnlimpiar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(610, 310, 140, 50);

        tabledom.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        tabledom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Domicilio", "ID Cliente", "Direccion", "Fecha", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tabledom);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 400, 870, 270);

        btnconsultar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar);
        btnconsultar.setBounds(1000, 540, 140, 60);

        btneliminar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(1000, 440, 140, 60);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel6.setText("Hora");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 230, 72, 34);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOPEQUEÑO.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 200, 209);

        btnfacturar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnfacturar.setText("FACTURAR");
        btnfacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturarActionPerformed(evt);
            }
        });
        getContentPane().add(btnfacturar);
        btnfacturar.setBounds(930, 310, 140, 50);
        getContentPane().add(fecha);
        fecha.setBounds(700, 170, 200, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otromas.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1360, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtcli.setText("");
        txtdir.setText("");
        txthor.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
       Consultar();
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        String cli = txtcli.getText();
        String dir = txtdir.getText();
        String hor = txthor.getText();
         String hora = txthor.getText();
        String dia = Integer.toString(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(fecha.getCalendar().get(Calendar.MONTH)+1);
        String year = Integer.toString(fecha.getCalendar().get(Calendar.YEAR));
        String fi=(year + "-" +mes+ "-"+dia);
      
        if (!cli.isEmpty()){
            if (!dir.isEmpty()) {
                if (!hor.isEmpty()) {
                     if (!fi.isEmpty()) {
                                    try {
                                        String SQL = "INSERT INTO domicilios"
                                                +"(Cedula,Direccion,Hora)"
                                                +" VALUES "
                                                +"('"+cli+"','"+dir+"','"+hor+"');";
                                        Con.sentencia.execute(SQL);
                                        JOptionPane.showMessageDialog(null, "¡Los datos fueron guardados con exito!");
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Domicilios.class.getName()).log(Level.SEVERE,null, ex);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese la hora del domicilio");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese la direccion del domicilio");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor ingrese la cedula del cliente");
                        }
        }

        Con.DesconectarBD();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnfacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturarActionPerformed
        Factura obj = new Factura();
        obj.setVisible(true);    
        dispose();
    }//GEN-LAST:event_btnfacturarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    try{
        String IdDomicilios = tabledom.getValueAt(tabledom.getSelectedRow(), 0) .toString();
        ConexionBD Con = new ConexionBD();
        Con.getConexion();
        String SQL = "DELETE FROM domicilios WHERE IdDomicilios='"+IdDomicilios+"'";
        Con.sentencia.execute(SQL);
        JOptionPane.showMessageDialog(null, "¡El registro fué eliminado!");
        Con.DesconectarBD();
        } catch (SQLException ex) {
	Logger.getLogger(Domicilios.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Domicilios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Domicilios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Domicilios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Domicilios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Domicilios().setVisible(true);
            }        
        });

    }
    DefaultTableModel modelo;
      private void Crear_Modelo() {
        try{
            modelo = (new DefaultTableModel(
                    null, new String[]{
                      "IdDomicilios", "Cedula", "Hora",
                      "Direccion"}) {
                     Class[] types = new Class[]{
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                     java.lang.String.class,java.lang.String.class,
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };
                    public Class getColumnClass(int columnIndex){
                        return types[columnIndex];
                    }
                    public boolean isCellEditable(int rowIndex, int colIndex){
                        return canEdit[colIndex];
                    }
            });
            tabledom.setModel(modelo);
            
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.toString() + "Error");
                }
        }
      private void Consultar(){
          try{
            int i=0; Object ob[]=null;
            ConexionBD Con = new ConexionBD();
            Con.getConexion();
            String SQL = "SELECT * FROM domicilios";
            Con.resultado = Con.sentencia.executeQuery(SQL);
            while (Con.resultado.next()){
                modelo.addRow(ob);
                modelo.setValueAt(Con.resultado.getString("IdDomicilios"), i, 0);
                modelo.setValueAt(Con.resultado.getString("Cedula"), i, 1);
                modelo.setValueAt(Con.resultado.getString("Hora"), i, 2);
                modelo.setValueAt(Con.resultado.getString("Direccion"), i, 3);
            
                i++;
            }
            Con.DesconectarBD();
        } catch (SQLException ex){
            Logger.getLogger(Domicilios.class .getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnfacturar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabledom;
    private javax.swing.JTextField txtcli;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txthor;
    // End of variables declaration//GEN-END:variables
}
