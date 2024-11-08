/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Alumno {

    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void mostrarDatos() {
        System.out.println("El nombre del alumno es: " + nombre + " y su edad es :" + edad);
    }

    void mayorDeEdad() {
        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad.");
        } else {
            System.out.println("El alumno es menor de edad.");
        }
    }
}
