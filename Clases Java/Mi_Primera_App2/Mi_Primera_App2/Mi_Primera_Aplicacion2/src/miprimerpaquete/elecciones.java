
package miprimerpaquete;

import java.util.Scanner;


public class elecciones {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x, p, c;
        float a, b;
        
        
        System.out.println("usted por que modalidad votara : ");
       System.out.println("personeria(p)");
       System.out.println("contraloria(c)");
       x = sc.next();
          if (x.equals("p")) {
                System.out.println( "por que candidato aspirante a personero votara 01,02 ");
              a = sc.nextInt();
              if (a==01){
                  System.out.println("USTED VOTO POR CRISTIAN NOGUERA 01");
                       
              }else{
                   System.out.println("USTED VOTO POR YELITSSA CASTILLO 02");
                          }     
              }else{
                 System.out.println( "por que candidato aspirante a contralor votara 01,02");
                    b = sc.nextInt();
                    if (b==01){
                       System.out.println("USTED VOTO POR MARNI RAMIREZ 01");
                       
                   }else{
                        System.out.println("USTED VOTO POR NAIRO PUPO 02");
                          }     
              }
                  
              }

        
  
}
