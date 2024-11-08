/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendio_de_naranjas;

import java.util.Scanner;


public class Naranjas {

    public static void main(String[] args) {
     double Kilo, Pago, Costo = 2000, Total, Descuento = 1,Cliente=1,Acum=0,Sum;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Cada Kilo de Naranjas cuesta 2000");
        System.out.println("Cuantos Kilos desea comprar?");
        Kilo = sc.nextInt();
        Cliente=(Cliente+1);
        if (Kilo > 10)
        {
            Pago = Costo * Kilo;
            Descuento = (Pago * 0.15);
            Total = Pago - Descuento;
            System.out.println("Por " + Kilo + " de naranjas con 15% de descuento costaria " + Total);
            Acum=(Acum + Total);
            System.out.println("La suma de los clientes hasta ahora es: " + Acum);
        }
        else{
        Pago=Costo*Kilo;
        System.out.println("Por " + Kilo + " de naranjas costaria " + Pago);
        Total = Acum;
        Acum=(Acum + Total);
        System.out.println("La suma de los clientes hasta ahora es: " + Acum);
        }
        }while (Cliente<5);{ }
    }
    
}
