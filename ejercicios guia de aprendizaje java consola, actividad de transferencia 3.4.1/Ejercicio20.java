import java.util.Scanner;
/*20. Desarrolle un programa que permita leer 5 números y valide cuál de todos es menor y cual es
mayor.*/
public class Ejercicio20{
  public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
             int n1 , n2 , n3 , n4 , n5 ;
            System.out.println("Por favor ingrese el primer numero");
             n1 = sc.nextInt ();
             System.out.println("Por favor ingrese el segundo numero");
             n2 = sc.nextInt ();
               System.out.println("Por favor ingrese el tercer numero");
             n3 = sc.nextInt ();
              System.out.println("Por favor ingrese el cuarto numero");
             n4 = sc.nextInt ();
              System.out.println("Por favor ingrese el quinto numero");
             n5 = sc.nextInt ();
                if (n1>n2 & n1>n3 & n1>n4 & n1>n5){
                            System.out.println("el numero  "+ n1+" es el numero mayor");}
	        if (n2>n1 & n2>n3 & n2 >n4 & n2>n5){
                            System.out.println("el numero  "+ n2+" es el numero mayor"); }
	        if (n3>n1 & n3>n2 & n3 >n4 & n3>n5){
                            System.out.println("el numero  "+ n3+" es el numero mayor"); }
	        if (n4>n1 & n4>n2 & n4 >n3 & n4>n5){
                            System.out.println("el numero  "+ n4+" es el numero mayor");}
	        if (n5>n1 & n5>n2 & n5 >n3 & n5>n4){
                            System.out.println("el numero  "+ n5+" es el numero mayor"); }
                if (n1<n2 & n1<n3 & n1<n4 & n1<n5){
                            System.out.println("el numero  "+ n1+" es el numero menor"); }
	        if (n2<n1 & n2<n3 & n2<n4 & n2<n5){
                             System.out.println("el numero  "+ n2+" es el numero menor"); }
	        if (n3<n1 & n3<n2 & n3<n4 & n3<n5){
                            System.out.println("el numero  "+ n3+" es el numero menor");}
	        if (n4<n1 & n4<n2 & n4<n3 & n4<n5){
                            System.out.println("el numero  "+ n4+" es el numero menor");}
                if (n5<n1 & n5<n2 & n5<n3 & n2<n4){
                            System.out.println("el numero  "+ n5+" es el numero menor");}
  }
}