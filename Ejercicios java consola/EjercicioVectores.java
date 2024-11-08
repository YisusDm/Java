import java.util.Scanner;

public class EjercicioVectores {

    public static void main (String[]args){
     	 int i,N=0,l=0;
     	  
     	  Scanner sc= new Scanner (System.in);
          String vect[]= new String [10];
     	  System.out.print("llenado vector.-------------------");
     	  for(i=0;i<=10-1;i++){
                l=l+1;
     	  	System.out.print("Digite el Nombre "+l+": ");
     	  	vect[i]= sc.next();
     	  }
     	  System.out.println("Imprimir vector.----------");
     	  for(i=0;i<=10-1;i++){
     	  	if(vect[i].equals("luis")){
                    N=N+1;
                    
                }
                 
     	  }
          System.out.println(N+" Es el total de nombres luis agregados en el areglo");   
     }

}