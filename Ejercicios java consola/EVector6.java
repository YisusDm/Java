import java.util.Scanner;

public class EVector6 {
/*6. Desarrolle un algoritmo que lea una secuencia de números y los 
almacene en un vector, luego imprimir el vector en oreden inverso*/
    public static void main (String[]args){
 int i,N=0,l=0;

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
           System.out.println("Imprimir vector.----------");
     	  for(i=N-1;i>=0;i=i-1){
     	  	System.out.print(vect[i]+"-");
           
        }
          


          
     }

}