
package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Cliente;


public class sqlCliente extends ConexionBD {
     
    public boolean registrar(Cliente pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO clientes (Cedula, Nombre, Telefono , correo) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getCedula());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getTelefono());
            ps.setString(4, pro.getCorreo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }   


}
