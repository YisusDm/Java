

package miprimerpaquete;

import java.util.Scanner;



public class areadelcirculo {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a;
        double b;
        
System.out.println("por favor ingrese el radio del circulo");
a = sc.nextInt();
a=a*a;
b = 3.14*a ;

        System.out.println("el area del circulo es :"+ b);
    }
    
}
