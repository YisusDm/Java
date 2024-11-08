package poo2;

import java.util.Scanner;

public class Edad_Estatura {
    /*con la estructura repetitiva para (FOR), dadas las edades y alturas de 10 alumnos.
    mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años
    y la cantidad de alumnos que miden mas de 1,75 mts*/

    public static void main(String [] arg){
         Scanner sc = new Scanner(System.in);
             int edad,i,sw,conted,contes;
             double estatura,acumed,promed=0,acumes,promes=0;
             
             acumed=0;
             acumes=0;
             conted=0;
             contes=0;
             
    
            for(i=1; i<=2; i++){
                System.out.println("Digite la edad del "+i+" alumno");
         	edad = sc.nextInt();
                acumed=acumed+edad;
                promed=acumed/2;
                if(edad>=18){
                conted=conted+1;
                }
                
               System.out.println("Digite la altura "+i+" alumno");
         	estatura = sc.nextDouble();
                acumes=acumes+estatura;
                promes=acumes/2;
                if(estatura>1.75){
                contes=contes+1;
                }
                
                
         }
            System.out.println("la edad media de los alumnos es: "+promed);
            System.out.println("la cantidad de alumnos con 18 o mas años de edad es: "+conted);
            System.out.println("la estatura media de los alumnos es: "+promes);
            System.out.println("la cantidad de alumnos con altura mayor a 1.75 es: "+contes);
    }      
}
