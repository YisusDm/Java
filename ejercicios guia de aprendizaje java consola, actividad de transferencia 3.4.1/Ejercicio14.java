import java.util.Scanner;
/*14. Escriba un programa que valide la entrada al sistema, se solicitara:
Usuario y contrase�a. Los cuales no pueden ser vac�os y deben ser los establecidos en el
programa, el usuario ser� root y la contrase�a ser� 1234, si se ingresan valores err�neos el
programa deber� permitir intentarlo nuevamente (Solo 3 veces), a la tercera vez mostrar un
mensaje al usuario que ha sido bloqueado.*/
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
     int conteo=0,pass;
     String usuario;
     
        do{ 
            conteo=conteo+1;
            System.out.println("Digite su nombre de USUARIO");
            usuario = sc.next();
            System.out.println("Digite su CONTRASE�A");
            pass = sc.nextInt();
                if ( "root".equals(usuario) & pass==1234){
                 System.out.println("Bienvenido");
                    conteo=conteo+3;
                }else{ 
                    System.out.println("Usuario bloqueado");
                    System.out.println("exedio el limite de intentos");
                    System.out.println("fallidos");
                }
        }while(conteo<=2);
        
     
    }
}

