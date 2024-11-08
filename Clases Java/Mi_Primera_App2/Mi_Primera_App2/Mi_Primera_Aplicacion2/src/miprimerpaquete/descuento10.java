
package miprimerpaquete;

import java.util.Scanner;

public class descuento10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       float a, b,c ;
       String x;
   
        System.out.println("digite su nombre");
        x = sc.next();
       System.out.println("por favor digite su sueldo $");
        a = sc.nextInt();
        b=(float) (a*0.1);
        c=(float) (a-b);
        System.out.println("señor" +x);
        System.out.println("su sueldo con el decuento del 10% es: "+c);
        
        
    }
    
    }
    

