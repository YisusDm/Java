import java.util.Scanner;
/*4. El restaurante Internacional cuenta con los siguientes platos y sus respectivos valores:
Pollo a la Plancha = 23000
Mote de Queso = 15000
Churrasco Argentino = 25000
Chuletas = 25000
Arroz Chino = 30000
Al final del día se desea saber cuánto es el total en ventas para cada plato, como también el total
del día.*/
public class Ejercicio4 {
 public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
Double p,m,ch1,ch2,a,pt,mt,ch1t,ch2t,at,N1,N2,N3,N4,N5,tot;
/*pollo a la plancha= 23000
  mote de queso= 15000
  churrasco argentino=25000
  chuletas=25000
  arroz chino=30000
*/
p=23000.0;
m=15000.0;
ch1=25000.0;
ch2=25000.0;
a=30000.0;

System.out.println("Digite el numero de pollos a la plancha vendidos en el dia: ");
N1 = sc.nextDouble();
System.out.println("Digite el numero de Motes de queso vendidos en el dia: ");
N2 = sc.nextDouble();
System.out.println("Digite el numero de Churrasco argentino vendidos en el dia: ");
N3 = sc.nextDouble();
System.out.println("Digite el numero de Chuletas vendidas en el dia: ");
N4 = sc.nextDouble();
System.out.println("Digite el numero de Arroz chino vendidos en el dia: ");
N5 = sc.nextDouble();
pt=N1*p;
mt=N2*m;
ch1t=N3*ch1;
ch2t=N4*ch2;
at=N5*a;
tot=pt+mt+ch1t+ch2t+at;
System.out.println("La cantidad de pollos a la plancha vendidos en el dia es: "+N1);
System.out.println("La ganancia de pollos a la plancha vendidos en el dia es: $"+pt);
System.out.println("La cantidad de Motes de queso vendidos en el dia es: "+N2);
System.out.println("La ganancia de Motes de queso vendidos en el dia es: $"+mt);
System.out.println("La cantidad de Churrasco argentino vendidos en el dia es: "+N3);
System.out.println("La ganancia de Churrasco argentino vendidos en el dia es: $"+ch1t);
System.out.println("La cantidad de Chuletas vendidas en el dia es: "+N4);
System.out.println("La ganancia de Chuletas vendidas en el dia es: $"+ch2t);
System.out.println("La cantidad de Arroz chino vendidos en el dia es: "+N5);
System.out.println("La ganancia de Arroz chino vendidos en el dia es: $"+at);
System.out.println("La ganancia Total en el dia es: $"+tot);

 }
}