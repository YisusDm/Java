import java.util.Scanner;
/*12. Crear un programa que muestre un menú de opciones tipo:
*** MENU PRINCIPAL ***
1 = Sumar
2 = Multiplicar
3 = Dividir
4 = Restar
Por favor ingrese su opción:
Se deberá realizar la opción que el usuario indique solicitando dos números para la operación.*/
public class Ejercicio12{
	public static void main (String[] arg){
  Scanner  sc = new Scanner(System.in);
         double a,b,c;
        int opcion;
      System.out.println("*** MENU PRINCIPAL ***");
          System.out.println("1=Suma");
              System.out.println("2=Multiplicar");
                  System.out.println("3=Dividir");
                      System.out.println("4=Restar");
                      opcion = sc.nextInt();
    switch(opcion){
        case 1:
                        System.out.println("suma");
    System.out.println("ingrese el primer numero");
    a= sc.nextDouble();
        System.out.println("ingrese el segundo numero");
    b= sc.nextDouble();
    c=a+b; 
                System.out.println("El resultado es: " + c);
             break;
        case 2:
                        System.out.println("Multiplicacion");
                System.out.println("ingrese el primer numero");
    a= sc.nextDouble();
        System.out.println("ingrese el segundo numero");
    b= sc.nextDouble();
    c=a*b;    
        System.out.println("El resultado es: " + c );
            break;
        case 3:
                        System.out.println("Division");
            System.out.println("ingrese el primer numero");
    a= sc.nextDouble();
        System.out.println("ingrese el segundo numero");
    b= sc.nextDouble();
    c=a/b; 
        System.out.println("El resultado es: " + c);
            break;
        case 4:
            System.out.println("Resta");
                System.out.println("ingrese el primer numero");
    a= sc.nextDouble();
        System.out.println("ingrese el segundo numero");
    b= sc.nextDouble();
    c=a-b; 
        System.out.println("El resultado es: " + c);
            break;
        default:
                System.out.println("Opcion invalida");
            break;
    
    }
	}
}