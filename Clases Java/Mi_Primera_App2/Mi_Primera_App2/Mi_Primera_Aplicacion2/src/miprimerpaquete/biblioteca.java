
package miprimerpaquete;

import java.util.Scanner;

public class biblioteca {

    public static void main(String[] args) {
 int Resp1, Resp2, Resp3, Resp4, Resp5;
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Ingrese que categoria de libro desea ver");
    System.out.println("1. Romance");
    System.out.println("2. Misterio");
    System.out.println("3. Terror");
    Resp1 = sc.nextInt();
    
    switch (Resp1){
        case 1:
            System.out.println("Ingrese el libro desea ver");
            System.out.println("1. Cincuentas sombras de Gray");
            System.out.println("2. Romeo y Julieta");
            System.out.println("3. Bajo la misma estrella");
            Resp2 = sc.nextInt();
            
            switch (Resp2){
                case 1:
                  System.out.println("Usted eligio Cincuenta sombras de Gray");
                  break;
                 
                case 2:
                   System.out.println("Usted eligio Romeo y Julieta") ;
                   break;
                    
                case 3:
                   System.out.println("Usted eligio Bajo la misma estrella");
                   break;
                    
            }
            
            break;
            
        case 2:
         System.out.println("Ingrese el libro desea ver");
            System.out.println("1. Diez negritos");
            System.out.println("2. La sombra del viento");
            System.out.println("3. El codigo Da Vinci");
            Resp3 = sc.nextInt();
              switch (Resp3){
                case 1:
                  System.out.println("Usted eligio Cincuenta Diez negritos");
                  break;
                 
                case 2:
                   System.out.println("Usted eligio La sombra del viento") ;
                   break;
                    
                case 3:
                   System.out.println("Usted eligio El codigo Da Vinci");
                   break;
                    
            }
            break;
        
        case 3:    
        System.out.println("Ingrese el libro desea ver");
            System.out.println("1. It");
            System.out.println("2. Dracula");
            System.out.println("3. El gato negro");
            Resp4 = sc.nextInt();
            
              switch (Resp4){
                case 1:
                  System.out.println("Usted eligio It");
                  break;
                 
                case 2:
                   System.out.println("Usted eligio Dracula") ;
                   break;
                    
                case 3:
                   System.out.println("Usted eligio El gato negro");
                   break;
                    
            }
            
            break;
    }
     
        
    }
    
}