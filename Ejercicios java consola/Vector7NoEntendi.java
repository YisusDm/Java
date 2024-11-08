/*7.Desarrolle un algoritmo que lea un vector de hasta maximo 10 posiciones
(se debe solicitar la lonfitud del vectoral usuario, y validar que esta
longitud no sea mayor que 10(,y luego lo imprima ordenado ascendentemente.*/

import java.util.Scanner;
public class Vector7NoEntendi{
 public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int sw=0,N,l=0,i;
        do{
            System.out.println("Digite la longitud del vector");
            N = sc.nextInt();
                if(N<=10){
                    sw=1;
		}else{
                    System.out.println("Nota no valida");
                    sw=0;
                }

	}while(sw==0); 
          int Vect[]= new int [N];
          System.out.println("**********llenado de vector************");
          for(i=0;i<=N-1;i++){
                l=l+1;
            	System.out.print("Digite Numero "+l+": ");
            	Vect[i]= sc.nextInt();
         	} 
            
        //imprimimos por pantalla el arreglo de números enteros
        System.out.println("Arreglo sin orden:");
        for (int num : Vect) {
            System.out.print(num+"-");
        }
 
        System.out.println();
 
        //ordenamos en forma ascendente el arreglo de números enteros y lo imprimimos por pantalla
        System.out.println("Orden ascendente:");
        ordSelAsc(Vect);
        for (int num : Vect) {
            System.out.print(num+"-");
        }
 
        System.out.println();
 
        //ordenamos en forma descendente el arreglo de números enteros 
        System.out.println("Orden descendente:");
        ordSelDesc(Vect);
        for (int num : Vect) {
            System.out.print(num+"-");
        }
    }
 
    /*ordena en ascendente el arreglo*/
    static void ordSelAsc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
 
    /**
     * Este método ordena en forma descendente el arreglo pasado como argumento usando el
     * algoritmo de selección.
     * 
     * @param arreglo el arreglo que sera ordenado.
     */
    static void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
}