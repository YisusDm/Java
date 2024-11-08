
package calculatodo;

import java.util.Scanner;

public class CalculaTodo {
      static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
    menu();
    
    }//FIN MAIN 
    
    public static void menu(){
        escribir ("Bienvenidos!!");
        escribir ("CalculaTodo version:");
        escribir (12);
        escribir ("-------------------");
        
        escribir("que desea hacer??");
        escribir ("1. Calcular figuras");
        escribir ("2. Salir");
        
        int respuesta;
        respuesta = sc.nextInt();
        ejecutar (respuesta);
       
        
    }//FIN MENU
public static void escribir (int x){
    System.out.println(x);
}//FIN ESCRIBIR 

public static void escribir (String x){
    System.out.println(x);
}//FIN ESCRIBIR 

public static void ejecutar(int a){
    switch (a){
        case 1:
            Figuras.main(null);
        break;    
    }
}
}//FIN CLASE

