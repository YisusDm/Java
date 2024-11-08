/*5. Realice un programa que le permita calcular el área de un cuadrado, si el resultado es mayor
que 28 informar al usuario, de lo contrario muestre solo el resultado del área.*/
package Algorimos_10;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
            Double n1, resul;
    Scanner sc = new Scanner (System.in);
    System.out.println("escriba la medida de el largo del cuadrado");
     n1 = sc.nextDouble ();
     resul=n1*n1;
if(resul>28){  /*se usa el condicional "if" para poner una condicion y validar informacion*/ 
           System.out.println("el area del cuadrado es  "+ resul);
           System.out.println("el area del cuadrado es mayor a 28");
     }else{
            System.out.println("el area del cuadrado es  "+ resul);
     }
    
  }
}