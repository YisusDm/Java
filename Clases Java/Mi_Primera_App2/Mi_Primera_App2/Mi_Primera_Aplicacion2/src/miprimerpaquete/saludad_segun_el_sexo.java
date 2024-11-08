
package miprimerpaquete;

import java.util.Scanner;


public class saludad_segun_el_sexo {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sexo;
    System.out.println("--------------------------");
    System.out.println("BIENVENIDO A LA APLICACION");
    System.out.println("--------------------------");
    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("POR FAVOR INGRESE SU SEXO (M O F):");
    System.out.println("----------------------------------");
    sexo= sc.next();
    if (sexo.equals("m")) 
            System.out.println("Hola señor");
    else 
        System.out.println("Hola señora ");
    }
    
}
