//1. Realice un programa el cual multiplique dos números
import java.util.Scanner;
public class Ejercicio1{
        public static void main(String [] arg){
                  int P1,P2,S;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Ingrese Primer Digito");
                  P1=sc.nextInt();
                  System.out.println("Ingrese Segundo Digito");  
                  P2=sc.nextInt();
		  S=P1*P2;
                  System.out.println("El resultado es: " + S);
}
}
