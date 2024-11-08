package mi_primer_poo;

import java.util.Scanner;
import modelo.Acudiente;
import modelo.Estudiante;
import modelo.Matricula;


public class Mi_Segundo_POO {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Datos del estudiante:");
        
         System.out.println("digite su nombre");
        String nom = sc.next();
        System.out.println("digite su  apellido");
        String ape = sc.next();
        System.out.println("digite su numero de documento");
        int doc = sc.nextInt();
        System.out.println("digite su año de nacimiento");
        int nac = sc.nextInt();
        System.out.println("digite el grado que cursa");
        int gra = sc.nextInt();
        
        Estudiante estudiante=new Estudiante();
        estudiante.SetNombre(nom);
        estudiante.SetApellido(ape);
        estudiante.Setdocumento(doc);
        estudiante.Setnacimiento(nac);
        estudiante.Setgrado(gra);
       
        
         Acudiente acudiente=new Acudiente();
         acudiente.SetNombre(nom);
   acudiente.SetApellido(ape);
        String Dir;
        Dir="cedros";
   acudiente.SetDireccion(Dir);
        double T;
        T=30072;
   acudiente.SetTelefono(T);
        
        
        Matricula matricula= new Matricula();
        double x;
        x=1010101;
        matricula.setcodigo(x);
        matricula.setEstudiante(estudiante);
        matricula.setAcudiente(acudiente);
        
          System.out.println(matricula.getcodigo() );
          System.out.println(matricula.getEstudiante() );
          System.out.println(matricula.getAcudiente() );
          
          
    }   
      
    }