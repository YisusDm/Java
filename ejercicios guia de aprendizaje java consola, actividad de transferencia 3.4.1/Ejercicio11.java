/*11. Elabora un programa que sirva para identificar el tipo de triangulo conociendo sus tres lados
(Isósceles, Escaleno o Equilátero).*/

import java.util.Scanner;


public class Ejercicio11 {
        public static void main(String [] arg){
                
                  String lados;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Ingrese las medidas de los lados separadas por ' , ' ");
                  lados=sc.next();
                  String Numeros = lados;
                  String[] Numero = Numeros.split(",");
	String l1= Numero[0];
                  String l2= Numero[1];
                  String l3= Numero[2];
                  int lado1=Integer.parseInt(l1);
                  int lado2=Integer.parseInt(l2);
                  int lado3=Integer.parseInt(l3);
                  if (lado1==lado2 & lado2==lado3){System.out.println("El triangulo es equilatero");}
                     else{if (lado1==lado2 & lado2!=lado3 || lado1==lado3 & lado3!=lado2 || lado1!=lado2 & lado2==lado3) {System.out.println("El triagulo es isoceles");}
                        else {System.out.println("El triangulo es escaleno");}}
                         
} 
}