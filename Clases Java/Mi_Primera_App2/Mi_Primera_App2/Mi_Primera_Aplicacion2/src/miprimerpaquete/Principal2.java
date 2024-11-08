
package miprimerpaquete;

import java.util.Scanner;


public class Principal2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a, b ;
       String nombre;
       
       System.out.println("por favor escriba su nombre");
       nombre = sc.next();
       
       System.out.println("Bienvenido señor");
       System.out.println(nombre);
       
       System.out.println("por favor escriba un numero");
        a = sc.nextInt();
        
        b= a*2;
        System.out.println("el doble del numero es: "+b);
      }
       
    }
    

