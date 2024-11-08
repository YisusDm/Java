import java.util.Scanner;

public class EVector4 {
/*4.desarrolle un algoritmo que lea un vector de longitud "N" , luego imprima los valores ingresados
en pocisiones pares , y ademas calcule el promedio de dicho vector*/
    public static void main (String[]args){
     	   int i,N,l=0,tot=0, Prom=0;
          

          Scanner sc= new Scanner (System.in);
            System.out.println("Digite la longitud del vector");
            N = sc.nextInt();
          int Vect[]= new int [N];
          System.out.println("**********llenado de vector************");
          for(i=0;i<=N-1;i++){
                l=l+1;
            System.out.print("Digite Numero "+l+": ");
            Vect[i]= sc.nextInt();
                tot=tot+Vect[i];
                Prom=tot/N;

          } 
            System.out.println("***Imprimir vector*** ");
        for(i=1;i<=N-1;i=i+2){
            System.out.print(Vect[i]+"-");
        }
          System.out.println();      
          System.out.println("El promedio es: " + Prom );


          
     }

}
