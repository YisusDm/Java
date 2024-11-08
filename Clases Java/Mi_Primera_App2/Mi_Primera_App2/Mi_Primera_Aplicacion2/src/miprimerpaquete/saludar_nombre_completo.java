
package miprimerpaquete;

import java.util.Scanner;

public class saludar_nombre_completo {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        String x, p, c, d;
        
        System.out.println("digite su primer nombre");
        x = sc.next();
        System.out.println("digite su segundo nombre");
        p = sc.next();
        System.out.println("digite su primer apellido");
        c = sc.next();
        System.out.println("digite su segundo apellido");
        d = sc.next();
        System.out.println("Bienvenido " + x+" "+ p +" " + c + " " + d);
        
        
    }
    
}
