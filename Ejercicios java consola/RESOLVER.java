/*RESUELVE 1: El instructor de formacion ING IRWING FONTALVO, tuvo un salario
inicial por honorarios de $2.500.000, en el año 2013, y ha recibido un incremento
de 10% anual durante los ultimos 5 años. Desarrolle un algoritmo que calcule
e imprima:

a.¿que salario ha recibido en cada uno de los 5 años(2013, 14,15,...18)?
b.¿cual es el monto total devengado por concepto de salarios hasta el año 2018?
c.imprimir los salarios de los años impares
d.si se aplica un impuesto de retención en la fuente, del 2% anual sobre el salario,
  ¿Cuánto ha pagado en impuesto hasta el año 2018?
e.por concepto de parafiscales se paga mensualmente: 3%por salud y 3% por pension
  del salario
f.¿Cual es el valor neto ganado en todos esos años?

NOTA:el valor neto ganado se puede deducir como el total recibido por concepto de
honorarios durante los años de servicio, menos lo pagado en impuestos y parafiscales. */
import java.util.Scanner;
public class Resolver{
        public static void main(String [] arg){
          Scanner sc = new Scanner(System.in);
         int i, año;
          double salarioI, salarioF,salario2013, salario2014, salario2015, salario2016;
            double salario2017, salario2018, salarioAño, salarioAu, salarioFII,salariot, pen, sal ;
              System.out.println("El instructor de formacion ING IRWING FONTALVO");
                System.out.println("tuvo un salario inicial por honorarios de $2.500.000, en el año 2013");
                  System.out.println("ha recibido un incremento anual de 10% ");
          //System.out.println("Digite hasta que año quire ver reflejada la aplicacion del incremento")
          //año = sc.nextInt();
          
          
          salarioI=250;
            salarioAño=250*12;
              salarioAu=(250*12)*0.1;
                salario2013=salarioAño;
                  salario2014=salarioAño+salarioAu;
                  salario2015=salario2014+salarioAu;
                salario2016=salario2015+salarioAu;
              salario2017=salario2016+salarioAu;
            salario2018=salario2017+salarioAu;
            salarioF=salario2013+salario2014+salario2015+salario2016+salario2017+salario2018;
          salariot=(salario2013+salario2014+salario2015+salario2016+salario2017+salario2018)*0.08;
          salarioFII=salarioF-salariot;


          

            System.out.println("El salario en el año 2013 fue: $"+salario2013);
            System.out.println("El salario en el año 2014 fue: $"+salario2014);
            System.out.println("El salario en el año 2015 fue: $"+salario2015);
            System.out.println("El salario en el año 2016 fue: $"+salario2016);
            System.out.println("El salario en el año 2017 fue: $"+salario2017);
            System.out.println("El salario en el año 2018 fue: $"+salario2018);

            System.out.println("El monto total devengado desde el año 2013 hasta el año 2018 es de: $"+salarioF);

            System.out.println("El salario en el año 2013 fue: $"+salario2013);
            System.out.println("El salario en el año 2015 fue: $"+salario2015);
            System.out.println("El salario en el año 2017 fue: $"+salario2017);

            System.out.println("El valor neto ganado en todos esos años es: $"+salarioFII);

            


          

         
            }
        }