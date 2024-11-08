import java.util.Scanner;
/*25. En una granja se producen: Pollos de engorde, huevos criollos, gallinas ponedoras y leche,
diariamente se gasta en alimento para pollos de engorde 100.000 si no es un día lluvioso, de lo
contrario se gasta 50.000, las canastas de huevos criollos son vendidas a 8000 y las gallinas
ponedoras a 40.000, la leche se vende a 5000 por litro, se desea saber el total obtenido en el día
por la granja, como también las ganancias por Pollos de engorde, huevos criollos, gallinas
ponedoras y leche, por último se debe tener en cuenta los gastos varios que resultan en el día.*/
public class Ejercicio25{
  public static void main(String[] args) {
      String a;
      int b, c, d,e,f,g,h,clima;
    Scanner sc = new Scanner (System.in);
         System.out.println ("favor decir si es dia es lluvioso o soleado");
 a= sc.next();
 if(a ==  "lluvioso") { 
clima = 50000;
} else {
clima=100000;

}  
 System.out.println ("cuantas canastas de huevos se vendieron en el dia ");
  b= sc.nextInt();
  c=b*8000;
  
 System.out.println ("cuantas gallinas ponedoras se vendieron en el dia ");
d=sc.nextInt();
e=d*40000;


 System.out.println ("cuantas litros de leche se vendieron en el dia ");
f=sc.nextInt();
g=f*5000;
h=g+c+e-clima;
 

 System.out.println (" las ganancias que se obtuvieron en el dia fueron de: " + h);
 System.out.println (" las ganancias que se obtuvieron Por los pollos de engorde fueron de: 0 " );
 System.out.println (" las ganancias que se obtuvieron Por las canastas de huevo fueron de: " + c);
 System.out.println (" las ganancias que se obtuvieron por las gallinas ponedoras fueron de:  " + e);
 System.out.println (" las ganancias que se obtuvieron Por los litros de leche fueron de: " + g);
 System.out.println ("los gastos varios que se tuvieron en el dia fueron de: " + clima );
  }
}