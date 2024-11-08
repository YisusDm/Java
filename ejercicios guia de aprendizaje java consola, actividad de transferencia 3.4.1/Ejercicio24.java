import java.util.Scanner;
/*24. Construya un programa que permita manejar las finanzas del hogar de Carlos y Luisa, este
inicialmente solicitará los sueldos de cada uno, también pedirá:
? Gastos en comida al mes.
? Gastos en servicio de agua.
? Gastos en servicio de luz.
? Gastos en servicio de gas.
? Gastos en servicio de Internet.
? Gastos en transporte.
Adicional Carlos los días sábados trabaja para una multinacional, la cual le paga 100.000 por cada
sábado que trabaje.
Usted deberá calcular cuánto es el gasto mensual del hogar, cuanto devengan entre ambos y
cuanto les queda luego de pagar todas sus deudas.*/
public class Ejercicio24{
        public static void main(String [] arg){
 int salarioI,gc,ga,gl,gt,gg,gi,gastos,sabado=0;
 int salarioII,ingresos,mas,sobrante;
 Scanner sc = new Scanner(System.in);
	System.out.println("Sr carlos digite sus ingresos mensuales: ");
        salarioI=sc.nextInt();
	System.out.println("digite la cantidad de sabados trabajados en el mes actual:");
	sabado=sc.nextInt();
	System.out.println("Sra luisa digite sus ingresos mensuales: ");
        salarioII=sc.nextInt();
	sabado=sabado*100000;
 	ingresos=salarioI+salarioII+sabado;
		
		System.out.println("Digite la cantidad de dinero total que gasta en el mercado:");
               	gc=sc.nextInt();
		System.out.println("Digite la cantidad de dinero total que gasta en servicio de agua:");
		ga=sc.nextInt();
		System.out.println("Digite la cantidad de dinero total que gasta en servicio de luz:");
		gl=sc.nextInt();
		System.out.println("Digite la cantidad de dinero total que gasta en servicio de gas:");
		gg=sc.nextInt();
		System.out.println("Digite la cantidad de dinero total que gasta en servicio de internet:");
		gi=sc.nextInt();
		System.out.println("Digite la cantidad de dinero total que gasta en servicios de transporte");
     		gt=sc.nextInt();

		gastos=gc+ga+gl+gg+gi+gt;

		sobrante=ingresos-gastos;

			System.out.println("Los ingresos totales entre carlos y luisa es de: $"+ingresos);
			System.out.println("El gasto total durante el mes es: $"+gastos);
			System.out.println("El sobrante durante el mes es: $"+sobrante);		
}
}