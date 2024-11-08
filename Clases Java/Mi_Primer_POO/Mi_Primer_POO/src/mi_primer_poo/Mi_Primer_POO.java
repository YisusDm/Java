
package mi_primer_poo;

import java.io.PrintStream;
import modelo.Estudiante;
import modelo.Profesores;

public class Mi_Primer_POO {

    public static void main(String[] args) {
    Estudiante estudiante=new Estudiante();
    Profesores profesores=new Profesores();
    
   estudiante.SetNombre("layla");
   estudiante.SetApellido("conrado palencia");
   estudiante.Setdocumento(103765432);
   estudiante.Setnacimiento(2002);
   estudiante.Setgrado(10);
   profesores.SetNombre("fabian");
   profesores.SetApellido("miranda meza");
   profesores.Setdocumento(67382332);
   profesores.Setnacimiento(1986);
   profesores.setasignatura("fisica");
  
   
   System.out.println("el estudiante " + estudiante.getNombre( ) + " " + estudiante.getApellido( ) + " identificado con el numero " + estudiante.getdocumento( ) + " ha ingresado al grado " + estudiante.getgrado( ) + " con " + estudiante.getedad()+ " años de edad"   );
   System.out.println("el profesor " + profesores.getNombre() + " "+ profesores.getApellido() + " presente para la asignatura " + profesores.getAsignatura() + " identificado con el numero de documento " + profesores.getdocumento() + " con " + profesores.getedad()+ "años de edad");
   
    }
}
