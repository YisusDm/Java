package poo2;

import java.util.Scanner;
 public class Notas_Do_While {
        /*con a estructura repetitiva repita hasta (do-while), escriba un programa que
        solicite ingresar N notas de alumnos y nos informe cuantos tienen notas 
         mayores o iguales a 7 y cuantos menores. el programa termina cuando se 
        ingrese un valor de 0*/
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cont1=0,cont2=0,sw=0;
    int Nota;
     
        do{
            System.out.println("Digite Nota");
            Nota = sc.nextInt();
            //sw=2;
                if(Nota>=7){
                    cont1=cont1+1;
                    //sw=1;
		}else{
                    if(Nota<7){
                        cont2=cont2+1;
                        //sw=1;    
                    }
                }
                if(Nota==0){
                            sw=2;
                        }

	}while(sw!=2);
        System.out.println("las cantidad de notas mayores o iguales a 7 es: "+cont1);
        System.out.println("las cantidad de notas menores a 7 es: "+cont2);
    }
    
}
