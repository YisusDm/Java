
package expendio_de_naranjas;

import java.util.Scanner;

public class Expendio_De_Naranjas {
    double a, b, c, d, g, n1, acum ;
    public static void main(String[] args) {
 //al cerrar un expedio de naranjas, 15 clientes que aun no han pagado recibiran un 15% de descuento si compran mas de 10 kilos.
//determinar cuanto pagara cada cliente y cuanto recibira la tienda por compras.
     Scanner sc = new Scanner(System.in);
       double a, b, c, d, g, n1, acum=0 ;
       System.out.println("***Expendio de Naranjas***");
       System.out.println("+++ El kilo de Naranjas tiene un valor de: $2750 +++");
       System.out.println("Digite el numero de clientes");
       g = sc.nextInt();
       
           for(double i=1; i<=g; i=i+1){
        
         
           System.out.println("Digite cuantos kilos de naranjas lleva en su compra:");
        a = sc.nextInt();
    if ((a>10)){
                System.out.println( " * a su compra se le aplicara un descuento del 15% **");
                b= (2750 * a)*0.15 ;
                d=(2750*a)-b;
             acum = (acum + d);
             System.out.println("el total a pagar es : "+d);
         System.out.println("La tienda lleva un ingreso de : "+acum);
         
        }else{
                b= (2750 * a) ;
                d=b;
                acum = (acum + d);
                System.out.println("el total a pagar es : "+d);
         System.out.println("La tienda lleva un ingreso de : "+acum);
 
                }
           }
    }
}