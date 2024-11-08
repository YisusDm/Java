
import java.util.Scanner;

public class EVector2 {
/*2.desarrolle un algoritmo que calcule la suma de "n" numeros almacenados en un vector 
de nombre Suma[]*/
public static void main (String[]args){
     	  int i,N,l=0,tot=0;
     	  

     	  Scanner sc= new Scanner (System.in);
            System.out.println("Digite la cantidad de Numeros que desea leer:");
            N = sc.nextInt();
          int Suma[]= new int [N];
     	  System.out.println("llenado vector.-------------------");
     	  for(i=0;i<=N-1;i++){
                l=l+1;
     	  	System.out.print("Digite Numero "+l+": ");
     	  	Suma[i]= sc.nextInt();
                tot=tot+Suma[i];
     	  } 
          System.out.println();      
          System.out.println("La suma de los Numeros es: " + tot);


     	  
     }

}