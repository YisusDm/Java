import java.util.Scanner;
/*13. Escriba un programa que pida tres números y valide cuál de los tres es mayor.*/
	public class Ejercicio13{
        	public static void main(String[] arg){
                	Scanner sc = new Scanner (System.in);
                       int a, b, c;
                      
                       System.out.println("por favor digite su primer numero");
                       a = sc.nextInt();
                       System.out.println("por favor digite su segundo numero");
                       b = sc.nextInt();
                       System.out.println("por favor digite su tercer numero");
                       c = sc.nextInt();

                   if (a>b && a>c){
                      System.out.println("el primer numero es el mayor de los tres");
                          }
         
                   if(b>a && b>c){
                       System.out.println("el segundo numero es el mayor de los tres");
                          }
                   
                   if (c>a && c>b ){
                         System.out.println("el tercer numero es el mayor de los tres");
                           }             
    
        	
	}
}