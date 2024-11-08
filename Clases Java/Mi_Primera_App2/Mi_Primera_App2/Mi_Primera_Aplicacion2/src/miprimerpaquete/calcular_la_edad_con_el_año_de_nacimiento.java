
package miprimerpaquete;

import java.util.Scanner;


public class calcular_la_edad_con_el_año_de_nacimiento {

    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
       int a, b, c ;
       
       System.out.println("por favor digite su año de nacimiento");
        a = sc.nextInt();
        
        System.out.println("por favor digite el año actual");
        b = sc.nextInt();
        
        c= b-a;
        System.out.println("su edad es : "+c);
        
    }
    
 
    }
    

