import java.util.Scanner;
	public class Actividad8{
		public static void main (String [] args){
			Scanner sc = new Scanner (System.in);
			
			int i, cantidad=0, promedio=0, tot=0, cpromediar=0;

			do{

					System.out.println("ingrese la longitud de su vector");
			 		 cantidad = sc.nextInt();

					}while (cantidad>=8);

						int vector[] = new int [cantidad];


						for (i=0; i<=cantidad-1; i++){
								System.out.println("ingrese el numero: ");
								vector[i] = sc.nextInt();
						}


						System.out.println("cuantos numeros quiere promediar: ");
						cpromediar = sc.nextInt();

						for (i=0; i<=cantidad-1; i++){
							tot=tot+vector[i];


						}

						for (i=0; i<=cantidad-1; i++){
								System.out.print(vector[i]+ "-");
								}
						
						promedio=tot/cpromediar;
							System.out.println(" ");
						System.out.println("  el promedio de los numeros es: "+ promedio);






		}
	}