
package mi_primer_poo;

import java.util.Scanner;
import modelo.Estudiante;

public class Ejercico2 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int v;
        
        System.out.println("***cuantos estudiantes quiere registrar***");
        v = sc.nextInt();
        Estudiante estudiante=new Estudiante();
     for(int i=1; i<=v; i=i+1){
      
   
        String x,c;
        int d, a, b;
        
        System.out.println("digite su nombre");
        x = sc.next();
        System.out.println("digite su primer apellido");
        c = sc.next();
        System.out.println("digite su numero de documento");
        d = sc.nextInt();
        System.out.println("digite su año de nacimiento");
        a = sc.nextInt();
        System.out.println("digite el grado que cursa");
        b = sc.nextInt();
        
        
   estudiante.SetNombre(x);
   estudiante.SetApellido(c);
   estudiante.Setdocumento(d);
   estudiante.Setnacimiento(a);
   estudiante.Setgrado(b);
  System.out.println(i+" el estudiante " + estudiante.getNombre( ) + " " + estudiante.getApellido( ) + " identificado con el numero " + estudiante.getdocumento( ) + " ha ingresado al grado " + estudiante.getgrado( ) + " con " + estudiante.getedad()+ " años de edad"   );
    }
 
         
     }
    }
    

