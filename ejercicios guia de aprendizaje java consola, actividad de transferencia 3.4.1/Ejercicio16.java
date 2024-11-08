import java.util.Scanner;
/*16. Realizar un programa que pida un valor en MegaByte y lo convierta a: GigaByte, TeraByte y
PetaByte.*/
public class Ejercicio16{
	public static void main (String[] arg){
 Scanner  sc = new Scanner(System.in);
     double a,b,c,d;
        int opcion;
 System.out.println("ingrese el valor en megabyte");
        a=sc.nextDouble();
        b=a/1000;
        c=a/1000000;
        d=a/1000000000;
        System.out.println( b + " Gigabyte:");
         System.out.println( c + " Terabyte:");
          System.out.println( d + " Petabyte:");

	}
}