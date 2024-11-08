import java.util.Scanner;
public class Vector{
     public static void main (String[]args){
     	  int i;
     	  int vect[]= new int [5];

     	  Scanner sc= new Scanner (System.in);

     	  System.out.println("llenado vector.-------------------");
     	  for(i=0;i<=4;i++){
     	  	System.out.print("Digite un valor: ");
     	  	vect[i]= sc.nextInt();
     	  }
     	  System.out.println("Imprimir vector.----------");
     	  for(i=0;i<=4;i++){
     	  	System.out.print(vect[i]+"-");
     	  }
     }

}