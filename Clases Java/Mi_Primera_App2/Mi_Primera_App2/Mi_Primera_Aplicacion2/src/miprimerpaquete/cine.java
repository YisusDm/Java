
package miprimerpaquete;

import java.util.Scanner;

public class cine {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int p ;
  System.out.println ("Ingrese la Categoria de Peliculas que Desea Ver:");
  System.out.println ("1*Accion");
  System.out.println ("2*Terror");
  System.out.println ("3*Comedia");
          p = sc.nextInt();
          if (p==1){
  System.out.println ("Usted a elegido Accion");
  System.out.println ("*Las peliculas de esta Categoria Son:");
  System.out.println ("*Rapido y Furiosos");
  System.out.println("*Duro de Matar");
  System.out.println ("Rambo");
          
          }else{
                  if (p==2){ 
  System.out.println ("Usted a elegido Terror");
  System.out.println("*Las peliculas de esta Categoria Son:");
  System.out.println ("*Chucky");
  System.out.println ("*Anabelle");
  System.out.println ("*El Conjuro");
                  }else {
                          if (p==3){ 
                  System.out.println ("Usted a elegido Comedia");
  System.out.println ("*Las peliculas de esta Categoria Son:");
  System.out.println ("*Sherk");
  System.out.println ("*Chiquito pero peligroso");
  System.out.println ("Teddy bear");
      }
                  }                    
          }
    }
}


