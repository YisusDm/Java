/*7.Desarrolle un algoritmo que lea un vector de hasta maximo 10 posiciones
(se debe solicitar la lonfitud del vectoral usuario, y validar que esta
longitud no sea mayor que 10(,y luego lo imprima ordenado ascendentemente.*/

import java.util.Scanner;
public class EVector7.0 {
public static void main(String [] arg){
     Scanner sc= new Scanner (System.in);
        int sw=0,N,l=0,i,j,aux;
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
                    for (i=0; i<N; i++){
                        for(j=0; j<N; j++){
                            if (Vect[i]<Vect[j]){
                                aux = Vect[i];
                                Vect[i] = Vect[j];
                                Vect[j] = aux;
                            }
                        }
                    }
                    System.out.println("**Vector orden ascendente**");
                    for (i=0; i<=N-1; i++){
                        System.out.print(Vect[i] + "-");
                    }
        }
    }