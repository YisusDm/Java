//leer una cantidad de n numeros ya acada numero hallarle el cuadrado por medio de sumas sucesivas.
//condicionar a traves de una validaciona adecuada el numero de cifras de los numeros ingresados 
//permitiendo solo numeros de una o dos cifras
import java.util.Scanner;
public class ExamenEjercicio3 {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num,sw=0,i,acum=0;
         
         do{
            System.out.println("Digite numero");
         	num = sc.nextInt();
            if(num<=99){
                sw=1;
            }else{
                System.out.println("valor no valido");
                sw=0;
            }
        }while(sw==0);
         for(i=1; i<=num; i++){
             acum=acum+num;
             
         }
         System.out.println(num+" al cuadrado es: "+acum);
   }
}