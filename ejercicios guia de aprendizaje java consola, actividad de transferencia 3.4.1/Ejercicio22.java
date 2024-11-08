 /*22. Desarrolle un programa “Factura”, en el cual se pedirán los datos de 5 productos: Nombre,
descripción, cantidad y valor unitario.
Usted deberá calcular el total por producto y el total de la factura, además realizar un descuento
del 5% cuando el total de factura sea menor o igual que 100 y mayor que 60, si el total de la
factura es mayor que 100 aplicar un descuento de 10%, así mismo aplicar el valor del IVA a su
factura.*/
import java.util.Scanner;
public class Ejercicio22 {
        public static void main(String [] arg){
                  String Nombre,Descripcion;
		  int i,Producto;
                  double Cantidad,ValorU,Desc,Total,Total1,Total2,Total3,Total4;
                  Scanner sc = new Scanner(System.in);
                  for (i=1; i<=5; i++){
		        System.out.println("Ingrese el nombre del producto");
		        Nombre=sc.next();
		        System.out.println("Ingrese la cantidad de productos");
		        Cantidad=sc.nextDouble();
		        System.out.println("Ingrese la descripcion del producto");
    	 	        Descripcion=sc.next();
		        System.out.println("Ingrese el valor unitario del producto");
		        ValorU=sc.nextDouble();
		        Total=ValorU*Cantidad;
		        if (Total>=60 && Total<=100){
		        Desc=Total*0.05;
		        Total1=Desc+0.19;
		        Total3=Total1-Desc;
		        System.out.println("El total de su factura es " + Total3);
			}
  			if (Total>100){
			Desc=Total*0.10;
			Total2=Desc+0.19;
			Total4=Total2-Desc;
			System.out.println("El total de su factura es " + Total2);
			}



	    }                                            
	}

         }