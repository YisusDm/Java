
package miprimerpaquete;

import java.util.Scanner;

public class multiplicacion3numeros {

   
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
       int a, b, c, d ;
       
       System.out.println("por favor escriba un numero");
        a = sc.nextInt();
        
        System.out.println("por favor escriba un numero");
        b = sc.nextInt();
        
        System.out.println("por favor escriba un numero");
        c = sc.nextInt();
        
        d= a*b*c;
        System.out.println("la multiplicacion de los numeros es: "+d);
   
    }
    
}
