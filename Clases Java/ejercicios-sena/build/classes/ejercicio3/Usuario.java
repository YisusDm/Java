/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Usuario {
    private String name_user, email, area;
    private int identificacion, edad, total_devengado;
    private boolean jefe;
    
    int salario_minimo = 908526;
    int sueldo_desarrollo = 4500000, sueldo_administrativo = 3500000;
    int jefe_desarrollo = 2500000, jefe_administrativo = 3000000;
    
    public Usuario(String name_user, String email, String area, int identificacion, int edad, int ingreso_basico, boolean jefe) {
        this.name_user = name_user;
        this.email = email;
        this.area = area;
        this.identificacion = identificacion;
        this.edad = edad;
        this.total_devengado = ingreso_basico;
        this.jefe = jefe;
        
        if (area == "desarrollo" && jefe == false){
            
        }
    }
    
    void sueldo_final(int sueldo) {
        double total_devengado = sueldo * 0.08;
    }
    
    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTotal_devengado() {
        return total_devengado;
    }

    public void setTotal_devengado(int total_devengadoo) {
        this.total_devengado = total_devengado;
    }

    public boolean isJefe() {
        return jefe;
    }

    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }

}
