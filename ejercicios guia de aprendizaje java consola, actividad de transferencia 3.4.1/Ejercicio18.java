import java.util.Scanner;
/*18. Escribir un programa que convierta un valor dado en siglos en años, minutos y segundos.*/
	public class Ejercicio18{
        	public static void main(String[] arg){
                Scanner sc = new Scanner (System.in);
                 int a, b=0, c, d=0, e=0;
		System.out.println("¿Qué cantidad de siglos desea convertir?");
			a = sc.nextInt();
       
              b = a*100;
              c = b*24;
             e = c*60;
             d = e*60;
  
            System.out.println("los siglos que ingreso en años son:"+ b );
             System.out.println("los siglos que ingreso en minutos son:"+ e  );
            System.out.println("los siglos que ingreso en segundos son:"+ d );
 

	}
}