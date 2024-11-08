/*3. Juan es un estudiante que desea saber su promedio de notas de seis actividades enviadas a su
instructor, se desea escribir un programa que realice esta operación y le diga a juan Si ganó o
perdió la materia.*/
import java.util.Scanner;
public class Ejercicio3{
        public static void main(String [] arg){
                  double N,Pro,Tot,Acum=0;
		  int i,sw=0;
                  Scanner sc = new Scanner(System.in);
		  System.out.println("Bienvenido Juan");
		          for (i=1; i<=6; i++){
                             System.out.println("Ingrese la "+ i + " nota");  
                             N=sc.nextDouble();
				  
                                  System.out.println("La " + i + " nota es: " + N);
		                  if (N>0 || N<=5)
                                     {Acum=Acum+N;
                                     }
                                     else{ System.out.println("El Valor ingresado no es Valido");
				     
 			             }
		  

}
                  Pro=Acum/6;               
		  System.out.println("El Promedio de Juan es: " + Pro);
                  if (Pro>=3.5){
                  System.out.println("Juan gano la materia");
                  }else {
                  System.out.println("Juan Perdio la materia");
}
}}