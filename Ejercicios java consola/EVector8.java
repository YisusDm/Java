/*8.desarrolle un algoritmo que lea un vector de hasta maximo 7 posiciones 
(se debe solicitar la longitud del vector al usuario, y validar que esta 
longitud no sea mayor que 7), luego calcular el promedio de los primeros "n"
números (n es unvalor que debo solicitar al usuario).*/
import java.util.Scanner;
public class EVector8 {
public static void main(String [] arg){
     Scanner sc= new Scanner (System.in);
        int sw=0,N,l=0,i,tot,Npromedio,promedio;
	do{
            System.out.println("Digite la longitud del vector");
                N = sc.nextInt();
            if(N<=7){
                sw=1;
            }else{
                System.out.println("valor no valido");
                sw=0;
            }
        }while(sw==0);
        int vect[] = new int [N];


						for (i=0; i<=N-1; i++){
								System.out.println("ingrese el numero: ");
								vect[i] = sc.nextInt();
						}


						System.out.println("cuantos numeros quiere promediar: ");
						Npromedio = sc.nextInt();
						do{
            				if(Npromedio<=7){
               				 	sw=1;
           				 	}else{
               					 System.out.println("valor no valido");
                					sw=0;
            				}
        				}while(sw==0);

						for (i=0; i<=N-1; i++){
							tot=tot+vect[i];


						}

						for (i=0; i<=N-1; i++){
								System.out.print(vect[i]+ "-");
								}
						
						promedio=tot/Npromedio;
							System.out.println(" ");
						System.out.println("  el promedio de los numeros es: "+ promedio);






		}
	}