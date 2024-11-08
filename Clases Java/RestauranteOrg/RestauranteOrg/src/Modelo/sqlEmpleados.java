/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Modelo.Empleados;



/**
 *
 * @author SAINFONET34
 */
public class sqlEmpleados extends ConexionBD {
    public boolean registrar(Empleados usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO empleados (IdEmpleados,Usuario Password, Nombre, Telefono,Direccion, correo, Sueldo, Cargo ) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getIdentificacion());
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getPassword());
            ps.setString(4, usr.getnombre());
            ps.setString(5, usr.getTel());
            ps.setString(6, usr.getDireccion());
            ps.setString(7, usr.getEmail());
            ps.setDouble(8, usr.getSueldo());
            ps.setString(9, usr.getRango());
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

    public boolean login(Empleados usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT IdEmpleados,Usuario Password, Nombre, Telefono,Direccion, correo, Sueldo, Cargo FROM empleados WHERE empleados = ? LIMIT 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(3))) {
                    usr.setIdVendedor(rs.getInt(1));
                    usr.setRango(rs.getString(4));
                    usr.setTipoid(rs.getString(5));
                    usr.setIdentificacion(rs.getInt(6));
                    usr.setnombre(rs.getString(7));
                    usr.setapellido(rs.getString(8));
                    usr.setFecha_nac(rs.getString(9));
                    usr.setSexo(rs.getString(10));
                    usr.setTel(rs.getString(11));
                    return true;
                } else {
                    return false;
                }
            }

            return false;
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

    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(IdEmpleados) FROM empleados WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

  }