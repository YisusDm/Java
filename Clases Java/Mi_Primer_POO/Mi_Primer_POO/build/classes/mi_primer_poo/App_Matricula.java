
package mi_primer_poo;

import java.util.Scanner;
import modelo.Acudiente;
import modelo.Estudiante;
import modelo.Matricula;

public class App_Matricula {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      Estudiante estudiante=new Estudiante();
      Acudiente acudiente=new Acudiente();
      Matricula matricula=new Matricula();
        String x,c,z,v,y;
        int d, a, b;
        double t,k;
        
        System.out.println("----------------------------------");
      System.out.println("Bienvenidos a la APP de Matriculas");
      System.out.println("----------------------------------");
      System.out.println("");
      System.out.println("");
      System.out.println("Por favor ingrese Sus Datos");
      System.out.println("");
        System.out.println("digite el nombre del estudiante");
        x = sc.next();
        System.out.println("digite los apellidos del estudiante");
        c = sc.next();
        System.out.println("digite el numero de documento del estudiante");
        d = sc.nextInt();
        System.out.println("digite el año de nacimiento del estudiante");
        a = sc.nextInt();
        System.out.println("digite el grado a cursar");
        b = sc.nextInt();
        System.out.println("digite el nombre del acudiente");
        z = sc.next();
        System.out.println("digite los apellidos del acudiente");
        v = sc.next();
        System.out.println("digite su barrio");
        y = sc.next();
        System.out.println("digite su telefono de contacto");
        t = sc.nextDouble();
        System.out.println("digite codigo de matricula");
        k = sc.nextDouble();
       
        
        
        
   estudiante.SetNombre(x);
   estudiante.SetApellido(c);
   estudiante.Setdocumento(d);
   estudiante.Setnacimiento(a);
   estudiante.Setgrado(b);
   acudiente.SetNombre(z);
   acudiente.SetApellido(v);
   acudiente.SetDireccion(y);
   acudiente.SetTelefono(t); 
   matricula.setcodigo(k);
                                         
 System.out.println("Usted Ha Matriculado al estudiante: "+ estudiante.getNombre( )+" "+estudiante.getApellido( ));
 System.out.println("identificado con el numero de documento : " +estudiante.getdocumento( ) );
 System.out.println("asignado a cursar el grado: " + estudiante.getgrado( ) );
 System.out.println("con la edad de: "+ estudiante.getedad()+" años. " );
 System.out.println("Acudido por el o la señor(a): "+acudiente.getNombre()+" "+acudiente.getApellido());
 System.out.println("con barrio de residencia : "+acudiente.getDireccion()+" en soledad ");
 System.out.println("con el telefono de contacto: "+acudiente.getTelefono());
 System.out.println("el codigo de matricula asignado es: "+matricula.getcodigo());
    }
 
         
     
    }
    

