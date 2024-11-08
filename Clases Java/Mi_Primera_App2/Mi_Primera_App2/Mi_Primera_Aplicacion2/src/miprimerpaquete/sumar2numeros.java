
package miprimerpaquete;

import java.util.Scanner;


public class sumar2numeros {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a, b, c ;
       
       System.out.println("por favor escriba un numero");
        a = sc.nextInt();
        
        System.out.println("por favor escriba un numero");
        b = sc.nextInt();
        
        c= a+b;
        System.out.println("la suma de los numeros es: "+c);
        
    }
    
}
