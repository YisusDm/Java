package Inicio;

import java.util.Scanner;
import miprimerpaquete.ALARMA;
import miprimerpaquete.aire;
import miprimerpaquete.areadelcirculo;
import miprimerpaquete.biblioteca;
import miprimerpaquete.calcular_la_edad_con_el_año_de_nacimiento;
import miprimerpaquete.calcular_promedio_de_notas;
import miprimerpaquete.cine;
import miprimerpaquete.descuento10;
import miprimerpaquete.elecciones;
import miprimerpaquete.multiplicacion3numeros;
import miprimerpaquete.saludad_segun_el_sexo;
import miprimerpaquete.saludar_nombre_completo;
import miprimerpaquete.sumar2numeros;

public class Inicio {
      static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
    menu();
    
    }//FIN MAIN 
    
    public static void menu(){
        escribir ("¡¡Bienvenidos!!");
        escribir ("Claus app");
        escribir (00);
        escribir ("-------------------");
        
        escribir("que desea hacer??");
        escribir ("1.Sumar 2 numeros ");
        escribir ("2. Multiplicar 3 numeros ");
        escribir ("3. Saludar con nombre completo  ");
        escribir ("4. Calcular la edad con el año de nacimiento ");
        escribir ("5. Descuento 10% en una compra ");
        escribir ("6. Saludar segun el sexo ");
        escribir ("7. Calcular el área de un circulo ");
        escribir ("8. Calcular promedio de notas ");
        escribir ("9. Elecciones ");
        escribir ("10. Biblioteca ");
        escribir ("11. Alarma ");
        escribir ("12. Cine ");
        escribir ("13. Aire ");
      
        
        
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
            sumar2numeros.main(null);
        break;    
        case 2:
            multiplicacion3numeros.main(null);
        break;
        case 3:
            saludar_nombre_completo.main(null);
        break; 
        case 4:
            calcular_la_edad_con_el_año_de_nacimiento.main(null);
        break;  
        case 5:
            descuento10.main(null);
        break;  
        case 6:
            saludad_segun_el_sexo.main(null);
        break;
        case 7:
            areadelcirculo.main(null);
        break;  
        case 8:
            calcular_promedio_de_notas.main(null);
        break; 
        case 9:
            elecciones.main(null);
        break;
        case 10:
            biblioteca.main(null);
        break;
        case 11:
            ALARMA.main(null);
        break;
        case 12:
            cine.main(null);
        break;
        case 13:
            aire.main(null);
        break;
        
    }
}
}//FIN CLASE

