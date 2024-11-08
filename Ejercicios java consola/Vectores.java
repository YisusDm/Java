import java.util.Scanner;
public class Vectores{

public static void main (String[]args){
     	  int i,N,l=0;
     	  

     	  Scanner sc= new Scanner (System.in);
            System.out.println("Digite la cantidad de Nombres que desea leer:");
            N = sc.nextInt();
          String vect[]= new String [N];
     	  System.out.println("llenado vector.-------------------");
     	  for(i=0;i<=N-1;i++){
                l=l+1;
     	  	System.out.print("Digite el Nombre "+l+": ");
     	  	vect[i]= sc.next();
     	  }
     	  System.out.println("Imprimir vector.----------");
     	  for(i=0;i<=N-1;i++){
     	  	System.out.print(vect[i]+"-");
     	  }
     }

}