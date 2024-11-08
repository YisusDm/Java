package factoriales;

import java.util.Scanner;
//System.out.print(+i+"*");
//1*2*3*4*5*6=
//b = (i*i);
public class Factoriales {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double n1,b,acum;
    System.out.println("calcular el factorial de n Numero"); 
      System.out.println("Digite un numero");
      n1 = sc.nextInt();
      acum = 1; 
      for(double i=1; i<=n1; i=i+1){
         acum = (acum * i);
 }
       System.out.print(acum);  
    }
    
}


