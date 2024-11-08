import java.util.Scanner;
/*15. Construir un programa que pida un valor inicial y un valor final, a continuación deberá sumar
los números contenidos entre el rango dado.*/
public class Ejercicio15{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
             int valorin , valorfi , proxnum , acum ;
           System.out.println("escriba un valor inicial");
                  valorin= sc.nextInt ();
           System.out.println("escriba el valor final");
                  valorfi= sc.nextInt ();
                    proxnum=valorin;
                    acum=0;
                  for ( int i=valorin; i<=valorfi ; i++){/*se utiliza el ciclo repetitivo "for" para poder acumular el valor de la suma de todos los numeros que                                                                             pertenecen a el rango dado*/ 
                       acum=acum+proxnum;
                       proxnum=proxnum+1;
                 }
                       System.out.println("el resultado es "+ acum );
  }
}