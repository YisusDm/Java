
package poo2;

import java.util.Scanner;

public class Num_Hasta_Negativo_Mientras {
/*con la estructura repetitiva mientras(while), pedir numeros hasta que se teclee
    uno negativo y mostrar cuantos numeros se han introducido*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sw=1,num,cont=0;
        while ( sw==1 ) {
            System.out.println("Digite un numero");
            num = sc.nextInt();
            cont=cont+1;
            if (num<0) {
                sw=2;
            } else {
               
            }
         
        }
        System.out.println("Se digitaron "+cont+" numeros");
    }
    
}
