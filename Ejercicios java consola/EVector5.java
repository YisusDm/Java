import java.util.Scanner;

public class EVector5 {
/*5. Desarrolle un algoritmo que lea un vector de 5 posiciones, y posteriormente
 imprima las posiciones donde hayan numeros multiplos de 3 */
    public static void main (String[]args){
    	int i,l=0,pos=0;
     	  int vect[]= new int [5];

     	  Scanner sc= new Scanner (System.in);

     	  System.out.println("llenado vector.");
     	  for(i=0;i<=4;i++){
     	  	l=l+1;
            System.out.print("Digite valor "+l+": ");
     	  	vect[i]= sc.nextInt();
     	  }
     	  System.out.println("Validar vector Multiplos de 3.");
     	  for(i=0;i<=4;i++){
		pos=i+1;
     	  	if (vect[i]%3==0){
			
			System.out.println("******* "+"En la pocision "+pos+" del vector se ha ingresado Numero multiplo de 3*******");
     	  		System.out.println("******* "+vect[i]+" Si es Multiplo de 3 *******");
			}
     	  	
     	  }
     	  
     }

}