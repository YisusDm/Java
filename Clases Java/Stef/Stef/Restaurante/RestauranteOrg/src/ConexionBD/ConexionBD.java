/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionBD {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

    private static final String driver = "com.mysql.jdbc.Driver";
    private final String base = "restaurante";
    private final String user = "root";
    private final String password = "12345";
    private final String url = "jdbc:mysql://localhost:3306/"+base+"?useTimezone=true&serverTimezone=UTC";
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
}

 public void DesconectarBD(){
        try {
            if (conexion !=null){
                if (sentencia !=null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    
    
}


