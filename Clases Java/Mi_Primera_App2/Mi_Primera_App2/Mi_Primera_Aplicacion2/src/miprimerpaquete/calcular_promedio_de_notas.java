
package miprimerpaquete;

import java.util.Scanner;


public class calcular_promedio_de_notas {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int a, b, c, d, e ;
       
       System.out.println("por favor digite la primera notaa");
        a = sc.nextInt();
        
        System.out.println("por favor digite la segunda nota");
        b = sc.nextInt();
        
        System.out.println("por favor digite la segunda nota");
        c = sc.nextInt();
        
        d= a+b+c;
        e= d/3;
        System.out.println("el promedio de las 3 notas es: "+e);
    }
    
}
