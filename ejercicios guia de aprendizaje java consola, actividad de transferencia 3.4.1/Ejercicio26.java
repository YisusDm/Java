import java.util.Scanner;
/*26. Realice un programa para llevar a cabo el cálculo de las vacaciones de un trabajador, para ello
cuenta con la siguiente información: https://goo.gl/JqSWjf*/
	public class Ejercicio26{
		public static void main(String[] arg){
		Scanner sc = new Scanner (System.in);
		double DT, S, C, HE, RN, RDF, AT, T;
		double PS, AC, ISC, V;
		
		System.out.println("¿cuantos dias usted trabajo?");
		DT = sc.nextDouble();
		System.out.println("¿cual es su salario?");
                                S = sc.nextDouble();
		System.out.println("¿cuales son sus comisiones?");
                                C = sc.nextDouble();
		System.out.println("¿cuanto se gano en horas extras?");
                                HE = sc.nextDouble();
		System.out.println("¿cuanto fueron en sus recargos nocturnos?");
                                RN = sc.nextDouble(); 
		System.out.println("¿cuales fueron sus recargos dominicales festivos?");
		RDF = sc.nextDouble();
		System.out.println("cuantos fueron sus auxilios de transporte?");
                                AT = sc.nextDouble();
                   
       	               T = S+C+HE+RN+RDF+AT;
        
                            	PS = (T*DT)/360;
                            	AC = (T*DT)/360;
                            	ISC = (AC*DT*0.12)/360;
                            	V = ((T-HE-RDF)*DT)/720;

	
		System.out.println("vacaciones: "+V);
	
		}
	}


