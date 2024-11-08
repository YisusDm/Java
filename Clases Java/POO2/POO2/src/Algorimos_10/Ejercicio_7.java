/*7. Realice un programa que pida la cantidad de notas que el usuario desea promediar y calcule el
promedio.*/
package Algorimos_10;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
                   int i;
                  double N,Prom,Cont=0,x;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Bienvenido");
                  System.out.println("Cuantas notas desea promediar?");
                  N=sc.nextDouble();
                  for (i=1; i<=N; i++){
                  System.out.println("Ingrese " + i +" nota");
                  x=sc.nextDouble();
  		  Cont=Cont+x;
}                       
 		  Prom=(Cont/i);
                  System.out.println("el promedio de sus " + i + " notas es: " + Prom);      
}
}