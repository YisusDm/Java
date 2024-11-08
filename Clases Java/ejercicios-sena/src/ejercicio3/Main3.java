
package ejercicio3;
import java.util.Scanner;

public class Main3 {

   
    public static void main(String[] args) {
      
        String Area="",rank,nombre,Email;
        int sw=0 ,id,edad;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingrese el nombre de usuario: ");
        nombre = sc.next();
        System.out.print("Ingrese su direccion de correo electronico: ");
        Email = sc.next();
        System.out.println("");
        do{
            System.out.println("(A): area administrativa");
            System.out.println("(D): area desarrollo");
            System.out.print("Seleccione su area laboral: ");
            rank = sc.next();
            if(rank.equalsIgnoreCase("A")){
                Area="Administrativa";
                sw=1;
                
            }else if(rank.equalsIgnoreCase("D")){
                Area="Desarrollo";
                sw=1;
            }else{
                System.out.println("Error \nverifique e intente nuevamente");
            }    
            
        }while(sw==0);
       
        System.out.print("Ingrese su numero de identificacion: ");
        id = sc.nextInt();
        System.out.print("Digite su edad: ");
        edad = sc.nextInt();
        
        Usuario usuario = new Usuario(nombre, Email, Area, id, edad, true);
        //Usuario usuario = new Usuario("Carlos Iriarte", "carlosiriarte950@gmail.com", "administrativa", 1001886671, 20, true);
        usuario.info();
    }
    
}
