import java.util.Scanner;
/*23. Construya un programa que permita calcular el IMC (Índice de masa corporal), deberá mostrar
al paciente el resultado según a siguiente tabla:
Composición corporal Índice de masa corporal (IMC)
Peso inferior al normal Menos de 18.5
Normal 18.5 – 24.9
Peso superior al normal 25.0 – 29.9
Obesidad Más de 30.0*/
	public class Ejercicio23{
        	public static void main(String[] arg){
             Scanner sc = new Scanner (System.in);
	     double M;
             System.out.println("¿cual es su indice de masa corporal?");
             M = sc.nextDouble();

             if (M < 18.5){
             System.out.println("su peso es inferior al normal ");
               }
             
              if (M >= 18.5 && M <= 24.9){
              System.out.println("su peso es normal");
               }
             
              if(M >=25 && M <= 29.9){
              System.out.println("su peso es superior al normal");
               }
            
              if(M >= 30){
              System.out.println("usted tiene obesidad ");
                }







	}
}