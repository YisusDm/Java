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
import Modelo.Empleado;



/**
 *
 * @author SAINFONET34
 */
public class sqlEmpleados extends ConexionBD {
    
    public boolean registrar(Empleado usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO empleados (IdEmpleado, Nombre, Cargo, Sueldo, Telefono, Correo, Direccion, usuario, password ) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getIdEmpleado());
            ps.setString(2, usr.getnombre());
            ps.setString(3, usr.getCargo());
            ps.setInt(4, usr.getSueldo());
            ps.setInt(5, usr.getTel());
            ps.setString(6, usr.getEmail());
            ps.setString(7, usr.getDireccion());
            ps.setString(8, usr.getUsuario());
            ps.setString(9, usr.getPassword());
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
    
    public boolean login(Empleado usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT IdEmpleado, Nombre, Cargo, Sueldo, Telefono, Correo, Direccion, usuario, password FROM empleados WHERE usuario = ? LIMIT 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(9))) {
                    usr.setIdEmpleado(rs.getInt(1));
                    usr.setnombre(rs.getString(2));
                    usr.setCargo(rs.getString(3));
                    usr.setSueldo(rs.getInt(4));
                    usr.setTel(rs.getInt(5));
                    usr.setEmail(rs.getString(6));
                    usr.setDireccion(rs.getString(7));
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

        String sql = "SELECT count(IdEmpleado) FROM empleados WHERE usuario = ?";

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
    
    public boolean eliminar(Empleado pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM producto WHERE IdEmpleado=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getIdEmpleado());
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