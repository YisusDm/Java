import java.util.Scanner;


public class Ejercicio19 {
   public static void main(String[] args) {
        double n1,n2,n3,n4,b,acum=0;
        //una persona desea invertir en un banco el cual otorga el 2% de interes mensual cual sera la cantidad 
        //de dinero que esta persona tendra al cabo de un año si laganancia de cada mes es reinvertida?
          Scanner sc = new Scanner(System.in);
         
         System.out.println("******Tu Banca Movil******");
         System.out.println("Tenga en cuenta que su dinero sera reinvertido cada mes");
         System.out.println("Usted Tendra una ganancia del 2% cada mes");
    System.out.println("Cuanto dinero desea invertir:"); 
      n1 = sc.nextInt();
      System.out.println("");
      
       
      for(double i=1; i<=12; i=i+1){
          n2=(n1*0.02);
           acum = (acum + n2);
          System.out.println(acum);
        }
      n3=(n1+acum);
     System.out.println("al finalizar el añor tendra un total de: "+n3);
    }
}