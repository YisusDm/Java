import java.util.Scanner;
/*27. Realice un programa que calcule cuanto debe recibir un trabajador por su liquidación, para ello
se tienen los siguientes datos: https://goo.gl/pRkeLv*/
	public class Ejercicio27{
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

		System.out.println("su liquidacion es: ");
		System.out.println("prima de servicios: "+ PS);
		System.out.println("auxilio de cesantias: "+ AC);
		System.out.println("intereses sobre las cesantias: "+ISC);
		System.out.println("vacaciones: "+V);
	
		}
	}


