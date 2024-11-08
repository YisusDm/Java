
package miprimerpaquete;

import java.util.Scanner;

public class aire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a, b ;
       
       
       do{
           System.out.println("digite el numero de personas en la sala: ");
       
        a = sc.nextInt();
        
        System.out.println("digite la temperatura en grados de la sala: ");
        b = sc.nextInt();
        
        if ((a>10) && (b>=30)){
                System.out.println( "encendiendo aire");
                
        }else{
            System.out.println("no es necesario encender el aire");
                }
       }while(true);
            
    }  
}

	