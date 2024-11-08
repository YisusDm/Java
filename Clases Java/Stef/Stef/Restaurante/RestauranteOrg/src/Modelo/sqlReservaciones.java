
package Modelo;
import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Modelo.Reservaciones;
public class sqlReservaciones extends ConexionBD {
    
    public boolean registrar(Reservaciones usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO reservaciones (IdReservaciones, Nombre, Hora, Fecha, NumeroMesa, Cedula1 ) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getIdReservaciones());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getHora());
            ps.setString(4, usr.getFecha());
            ps.setInt(5, usr.getNumeroMesa());
            ps.setInt(6, usr.Cedula1());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }

    
}
        public boolean eliminar(Reservaciones pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM reservaciones WHERE IdReservaciones=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getIdReservaciones());
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

