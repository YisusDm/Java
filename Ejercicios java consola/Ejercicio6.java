import java.util.Scanner;
public class Ejercicio6{
	public static void main (String[] arg){
	double a , b , c , d;
	 Scanner sc = new Scanner(System.in);
	System.out.println("ingrese el primer numero");
		a = sc.nextDouble();
	System.out.println("Ingrese el segundo Numero");
		b = sc.nextDouble();
	System.out.println("Ingrese el tercer Numero");
		c = sc.nextDouble();
	a = a + 40;
	b = b * 20;
	c = c + 23;
	d = a + b + c;
	d=d/2;
	System.out.println("Procedimiento 1: " + a);
		System.out.println("Procedimiento 2: " + b);
		System.out.println("Procedimiento 3: " + c);
	System.out.println("El resultado final: " + d);

	}
}