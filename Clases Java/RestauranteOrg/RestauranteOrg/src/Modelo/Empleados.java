/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SAINFONET34
 */
public class Empleados {
    private int idVendedor;
    private int Identificacion;
    private String nombre;
    private String apellido;
    private String Fecha_nac; 
    private String email;
    private String Tel;
    private String Usuario;
    private String Password;
    private String last_session;
    private String Tipoid;
    private String Rango;
    private String Sexo;
    private String Direccion;
    private double Sueldo;
    
    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
     public int getIdentificacion() {
        return Identificacion;
    }
    
    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }
    
    public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getapellido() {
        return apellido;
    }
    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    
     public String getFecha_nac() {
        return Fecha_nac;
    }
    
    public void setFecha_nac(String Fecha_nac) {
        this.Fecha_nac = Fecha_nac;
    }
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public String getTipoid() {
        return Tipoid;
    }

    public void setTipoid(String Tipoid) {
        this.Tipoid = Tipoid;
    }
    
    

}
