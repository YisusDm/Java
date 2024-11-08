/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Platillos;

public class sqlPlatillos extends ConexionBD {
    
      public boolean registrar(Platillos pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO platillos (NombrePlatillo, Porciones, Categoria, PrecioPlatillo) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombrePlatillo());
            ps.setInt(2, pro.getPorciones());
            ps.setString(3, pro.getCategoria());
            ps.setInt(4, pro.getPrecioPlatillo());
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
       
 
