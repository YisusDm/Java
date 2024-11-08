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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del alumno");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la edad del alumno");
        int edad = sc.nextInt();
        
        Alumno alumno = new Alumno(nombre, edad);
        alumno.mostrarDatos();
        alumno.mayorDeEdad();
    }

}
