package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
   int Trabajadores,Horas,Num,Pago,Extra,D,A;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos obreros Trabajan?");
        Trabajadores = sc.nextInt();
        for (int i=1; i<=Trabajadores; i++){
            System.out.println("Cuantas horas Trabajo el obrero N* " + i);
            Horas = sc.nextInt();
            if (Horas>=40){
                D=(Horas/5);
                A=(D*25);
                Pago=(Horas*20);
                Extra=(Pago+A);
                System.out.println("El Pago para el obrero N°" + i + " es: " + Extra);
                
            }else{
                Pago=(Horas*20);
                System.out.println("El Pago para el obrero N°" + i + " es: " + Pago);
            }
    }
} 
}