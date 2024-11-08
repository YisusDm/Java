
package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class sqlProveedores extends ConexionBD  {
    public boolean registrar(Proveedor pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO proveedores (IdProveedor, Nombre, ProductoVenta, Telefono , Correo) VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getIdProveedor());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getProductoVenta());
            ps.setInt(4, pro.getTelefono());
            ps.setString(5, pro.getCorreo());
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
