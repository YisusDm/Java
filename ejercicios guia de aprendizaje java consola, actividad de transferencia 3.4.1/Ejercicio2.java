//2. Realice un programa que le permita calcular el área de un triángulo.
import java.util.Scanner;
public class Ejercicio2{
        public static void main(String [] arg){
                  double B,H,S;
                  Scanner sc = new Scanner(System.in);
		  System.out.println("Bienvenido a mi programa");
                  System.out.println("Ingrese la base del triangulo");
                  B=sc.nextDouble();
                  System.out.println("Ingrese la altura del triangulo");  
                  H=sc.nextDouble();
		  S=(B*H)/2;
                  System.out.println("El resultado es: " + S);
}}