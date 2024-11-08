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
    private int identificacion, edad;
    private double total_devengado, descuentoSeguridadSocial, descuentoAporteFondo;
    private boolean jefe;

    int salario_minimo = 908526;
    double sueldo_desarrollo = 4500000, sueldo_administrativo = 3500000;
    double jefe_desarrollo = 2500000, jefe_administrativo = 3000000;
    double porcentajeDescuentoSeguridadSocial = 0.08, porcentajeAporteFondo = 0.01;

    public Usuario(String name_user, String email, String area, int identificacion, int edad, boolean jefe) {
        this.name_user = name_user;
        this.email = email;
        this.area = area;
        this.identificacion = identificacion;
        this.edad = edad;
        this.jefe = jefe;
        Switch();
        //elif();
        
        

        descuentoSeguridadSocial = total_devengado * porcentajeDescuentoSeguridadSocial;

        if (total_devengado > (salario_minimo * 4)) {
            descuentoAporteFondo = total_devengado * porcentajeAporteFondo;
        }
        total_devengado = (total_devengado - descuentoSeguridadSocial) - descuentoAporteFondo;

    }
    void Switch() {
    switch (area) {
            case "Desarrollo":
                total_devengado = sueldo_desarrollo;
                if (jefe == true) {
                    total_devengado = total_devengado + jefe_desarrollo;
                }else{
                    total_devengado = sueldo_desarrollo;
                }
                break;
            case "Administrativa":
                total_devengado = sueldo_administrativo;
                if (jefe == true) {
                    total_devengado = total_devengado + jefe_administrativo;
                }else{
                    total_devengado = sueldo_administrativo;
                }
                break;
        }
    }
    void elif() {
        if (area.equalsIgnoreCase("Desarrollo") && jefe == false) {
            total_devengado = sueldo_desarrollo;
        } else if (area.equalsIgnoreCase("Administrativa") && jefe == false) {
            total_devengado = sueldo_administrativo;
        } else if (area.equalsIgnoreCase("Desarrollo") && jefe == true) {
            total_devengado = sueldo_desarrollo + jefe_desarrollo;
        } else if(area.equalsIgnoreCase("Administrativo") && jefe == true){
            total_devengado = sueldo_administrativo + jefe_administrativo;
        }
    }
    void info() {
        System.out.println("Usuario"
                + "\nNombre: " + name_user
                + "\nIdentificacion: " + identificacion
                + "\nEmail: " + email
                + "\nEdad: " + edad
                + "\nArea: " + area
                + "\nSalario: " + total_devengado);
    }

}
