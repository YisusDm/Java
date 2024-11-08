
package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Inventario;


public class sqlInventario extends ConexionBD{
 
        public boolean registrar(Inventario pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO inventario (ReferenciaProducto, NombreIngrediente, Cantidad, ValorUnitario, Unidad, IdProveedor) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getReferenciaProducto());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getCantidad());
            ps.setString(4, pro.getUnidad());
            ps.setInt(4, pro.getValorUnitario());
            ps.setInt(4, pro.getIdProveedor());
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
           public boolean eliminar(Inventario pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM inventario WHERE ReferenciaProducto=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getReferenciaProducto());
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
