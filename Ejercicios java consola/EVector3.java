import java.util.Scanner;

public class EVector3 {
/*3.desarrolle un algoritmo que lea dos vectores y en un tercer vector y realice la 
multiplicscion de cada elemento de indice igual	*/
    public static void main (String[]args){
     	 int i,N=0,l;
     	  
     	  
Scanner sc= new Scanner (System.in);
System.out.println("Digite la longitud del vectores:");
N = sc.nextInt();
int vect[]= new int [N];
int vect1[]= new int [N];
int vect2[]= new int [N];

    System.out.println("*****llenado vector 1 *****");
	l=0;
     	for(i=0;i<=N-1;i++){
            l=l+1;
     	 System.out.print("Digite Numero "+l+": ");
     	 vect1[i]= sc.nextInt();
                
     	} 
    System.out.println("*****llenado vector 2 *****");
	l=0;
     	for(i=0;i<=N-1;i++){
           l=l+1;
     	 System.out.print("Digite Numero "+l+": ");
         vect2[i]= sc.nextInt();
                
     	} 
     	 	for(i=0;i<=N-1;i++){
     	 	vect[i]=vect1[i]*vect2[i];
     	 	}
	System.out.println("***Imprimir  vector1*** ");
        for(i=0;i<=N-1;i++){
     	 System.out.print(vect1[i]+"-");
     	}
	System.out.println("***Imprimir  vector2*** ");
        for(i=0;i<=N-1;i++){
     	 System.out.print(vect2[i]+"-");
     	}

    System.out.println("***Imprimir Multiplicacion de vector de indice igual*** ");
        for(i=0;i<=N-1;i++){
     	 System.out.print(vect[i]+"-");
     	}
    }
}