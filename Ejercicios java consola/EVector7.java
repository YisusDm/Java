import java.util.Scanner;
/*7. Desarrolle un algoritmo que lea un vector de N posiciones, y lo imprima.
en el vector no debenhaber numeros repetidos*/
public class EVector7 {
    public static void main(String [] arg){
            int sw;
       int i,j,N=0,l=0;
		Scanner sc= new Scanner (System.in);
       System.out.println("Digite la longitud del vector");
       N = sc.nextInt();
       int vect[]= new int [N];
       System.out.println("**********llenado de vector************");
        for(i=0;i<=N-1;i++){
            l=l+1;
            System.out.print("Digite Numero "+l+": ");
            	vect[i]= sc.nextInt();
            
            
        }    
            for(j=0;j<=N-1;j++){
                    vect[j]=vect[i];
            }
                if(vect[i]==vect[j]){
                sw=1;
		}else{
                System.out.println("*Valor no valido intente nueva mente*");
		sw=0;
                }

			 

		}
	
}