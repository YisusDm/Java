/*10. Realice un programa del famoso juego de piedra papel o tijera, para este programa se tendrá
en cuenta que participan 2 jugadores,*/
package Algorimos_10;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      int juga1 , juga2 ;

     System.out.println("Por favor juagdor uno ingrese su jugada(1.piedra;2.papel;3.tijera)");
	juga1=sc.nextInt ();
  
	for (int i=6 ; i<=60 ; i++){
	System.out.println("");
		}

	System.out.println("Por favor juagdor dos ingrese su jugada(1.piedra;2.papel;3.tijera)");
	juga2=sc.nextInt ();
/*se usan los condicionales "if" para validar las jugadas de cada jugador y decirles cual gano y como*/

		if (juga1==1 & juga2==1){
			System.out.println("Empate entre jugador 1 y jugador 2");
			System.out.println("Piedra con piedra");
					}
			if (juga1==1 & juga2==2){
				System.out.println(" Gana jugador 2");
				System.out.println("Papel contra piedra");
						}
				if (juga1==1 & juga2==3){
					System.out.println(" Gana jugador 1");
					System.out.println("Piedra contra tijera");
							}
					if (juga1==2 & juga2==1){
						System.out.println(" Gana jugador 1 ");
						System.out.println("Papel contra piedra");
								}
						if (juga1==2 & juga2==2){
							System.out.println("Empate entre jugador 1 y jugador 2");
							System.out.println("Papel con papel");
									}
							if (juga1==2 & juga2==3){
								System.out.println("Gana jugador 2");
								System.out.println("Tijera contra papel");
										}
								if (juga1==3 & juga2==1){
									System.out.println("Gana jugador 2");
									System.out.println("Piedra contra tijera");
											}
									if (juga1==3 & juga2==2){
										System.out.println("Gana jugador 1");
										System.out.println("Tijera contra papel");
												}
										if (juga1==3 & juga2==3){
											System.out.println("Empate entre jugador 1 y jugador 2");
											System.out.println("Tijera con tijera");
													}



    }
}