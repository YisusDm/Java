import java.util.Scanner;
public class ExamenEjercicio1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double num,acum;
    System.out.println("calcular el factorial de n Numero"); 
      System.out.println("Digite un numero");
      num = sc.nextInt();
      acum = 1; 
      for(double i=1; i<=num; i=i+1){
         acum = (acum * i);
 }
       System.out.print(acum);  
    }
    
}