
package examen.java;

import Clases_complementarias.Clientes;
import Clases_complementarias.Productos;
import Clases_complementarias.Vendedor;
import java.util.Scanner;

public class ExamenJava {

    public static void main(String[] args) {
    String nombre;
    String apellido;
    int doc;
    int telefono;
    String Marca;
    String nomp;
    
    Scanner sc = new Scanner(System.in);
    Vendedor vendedor=new Vendedor();
    Clientes clientes=new Clientes();
    Productos productos=new Productos();

    
//Marca
    System.out.println("***cuantos productos desea facturar***");
     int v;   
    v = sc.nextInt();
     for(int i=1; i<=v; i=i+1){
      
   System.out.println("Digite el Nombre del "+i+ " producto");
   nomp = sc.next();
   System.out.println("Digite la Marca del producto");
   Marca = sc.next();
   
   productos.SetNombre(nomp);
   productos.SetMarca(Marca);
   System.out.println("Se ha vendido el producto " +i +" "+ productos.getNombre()+" de la marca "+ productos.getMarca());
     }		
    
   
   //datos vendedor
   vendedor.SetNombre("Jhon");
   vendedor.SetApellido("Palacio");
   vendedor.Setdocumento(103765432);
   vendedor.Setsueldo(80000);
   
  //datos cliente
   System.out.println("DATOS CLIENTES");
  System.out.println("¿Cual es su nombre?");
   nombre = sc.next();
   System.out.println("¿Cual es su apellido?");
   apellido=sc.next();
   System.out.println("Digite su numero de documento");
   doc = sc.nextInt();
   System.out.println("Digite su numero de telefono");
   telefono =sc.nextInt();
    
     clientes.SetNombre(nombre);
   clientes.SetApellido(apellido);
   clientes.Setdocumento(doc);
   clientes.SetTelefono(telefono);
    
  
   
   
   //gets
   System.out.println("--------------------");
   System.out.println("*Sarmiento Limitada*");
   System.out.println("--------------------");
   
    System.out.println("Se ha vendido "+v+" productos "+  "al cliente "+ clientes.getNombre()+ clientes.getApellido()+"identificado con el numero de ceudla "+ clientes.getdocumento());
   System.out.println("Se puede contactar al cliente al numero "+ clientes.getTelefono());
   System.out.println("Vendido por " + vendedor.getNombre() + vendedor.getApellido()+ " identificado con el numero de cedula "+ vendedor.getdocumento()+" Con Un salario mendual de  "+ vendedor.getsueldo());
   System.out.println("--------------------");
   System.out.println("Gracias Por Su Compra...");
    }
  //nota:4.0
}

