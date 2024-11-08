
package calculatodo;
import java.util.Scanner;

public class Figuras {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        menu();
        
    }//FIN DEL MAIN
    
    public static void menu(){
        int  respuesta;
        System.out.println("Que figura desa calcular el area");
        System.out.println("1. Triangulo. ");
        System.out.println("2. Cuadrado. ");
        System.out.println("3. Circulo. ");
        respuesta = sc.nextInt();
        
        switch(respuesta){
            case 1:
                 System.out.println("elegiste el triangulo");
            break;       
           
            case 2:
                 System.out.println("elegiste el cuadrado");
            break; 
            
            case 3:
                 System.out.println("elegiste el circulo");
             break;     
            
            default:
                 System.out.println("verifique su respuesta");
             break;     
        }//FIN DEL SWITCH
        } //FIN DEL MENU
    
}//FIN DE LA CLASE

