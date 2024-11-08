package poo2;

import java.util.Scanner;

public class IPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,pf,PES,peso,pesototal,promediopeso;
        int i,j;
        System.out.println("IPS SALUD");
        
        for(i=1; i<=5; i++){
                System.out.println("Peso inicial de la persona"+i);
         	p = sc.nextDouble();
                pesototal=0;
                peso=0;
                for(j=1; j<=10; j++){
                    System.out.println("Cual fue el peso de usted en la vascula "+j);
                    peso = sc.nextDouble();
                    pesototal=pesototal+peso;
                }
                promediopeso=pesototal/3;
                if (p < promediopeso) {
                    System.out.println("subio de peso");
                } else {
                    if (p > promediopeso) {
                        System.out.println("Bajo de peso");
                    }else {
                       if (p == promediopeso) {
                        System.out.println("EL PESO NO HA CAMBIADO");
                        } 
                    }
               
                }
                System.out.println("El promedio del peso es: "+promediopeso);
        }
    }
    
}
