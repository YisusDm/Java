
package mi_primer_poo;

import java.util.Scanner;
import modelo.Estudiante;

public class Ejercicio {

    public static void main(String[] args) {
         Estudiante estudiante=new Estudiante();
   Scanner sc = new Scanner(System.in);
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
   System.out.println("el estudiante " + estudiante.getNombre( ) + " " + estudiante.getApellido( ) + " identificado con el numero " + estudiante.getdocumento( ) + " ha ingresado al grado " + estudiante.getgrado( ) + " con " + estudiante.getedad()+ " años de edad"   );
    }
    
}
