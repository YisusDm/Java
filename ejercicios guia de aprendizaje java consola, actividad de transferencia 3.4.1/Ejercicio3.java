/*3. Juan es un estudiante que desea saber su promedio de notas de seis actividades enviadas a su
instructor, se desea escribir un programa que realice esta operación y le diga a juan Si ganó o
perdió la materia.*/
import java.util.Scanner;
public class Ejercicio3{
        public static void main(String [] arg){
                  int sw=0;
		double nota,prom,acum=0;
                  Scanner sc = new Scanner(System.in);
		  System.out.println("Bienvenido Juan");
                  
		for(int i=1 ; i<=6 ; i++){

			do{

				System.out.println("Ingrese la nota: "+i);
					nota=sc.nextDouble();

				if(nota>=0 && nota<=5){

					sw=1;
					
				}else{

					System.out.println("Nota no valida");
					sw=0;

				}

			}while(sw==0); 

			acum=acum+nota;


		}
		
		prom=(acum/6);

		if(prom>=3.5){

			System.out.println("Juan ganó la materia con: "+prom);

		}else{

			System.out.println("Juan perdió la materia con: "+prom);

		}

	}
	

}