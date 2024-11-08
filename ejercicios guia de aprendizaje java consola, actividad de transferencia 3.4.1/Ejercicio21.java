import java.util.Scanner;
/*21. La empresa Alg Net paga a sus trabajadores 10 por hora trabajada, 12 por cada hora extra y 15
por horas trabajadas los domingos y festivos, así mismo se otorga un bono adicional de 20 a los
empleados que trabajaron más de 10 horas al mes. Juan, Carlos y Luis desean saber cuál es su total
a devengar a final de mes.*/

public class Ejercicio21 {

    public static void main(String[] args) {
   int Htrabajada,Hextra,DF,Bono,pago,toth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de Horas trabajadas por Juan");
        Htrabajada = sc.nextInt();
        System.out.println("Digite la cantidad de Horas Extras trabajadas por Juan");
        Hextra = sc.nextInt();
        System.out.println("Digite la cantidad de Horas trabajadas domingos y festivo por Juan");
        DF = sc.nextInt();
		toth=Htrabajada+Hextra+DF;
                
            
            if (toth>=10){
               System.out.println("Juan trabajo un total de "+toth+" Horas en el mes");
               pago=(Htrabajada*10)+(Hextra*12)+(DF*15)+20;
               System.out.println("Juan recibio un pago total de: "+pago);
            }else{
		System.out.println("Juan trabajo un total de "+toth+" Horas en el mes");
		pago=(Htrabajada*10)+(Hextra*12)+(DF*15);
		System.out.println("Juan recibio un pago total de: $"+pago);
		}

	System.out.println("Digite la cantidad de Horas trabajadas por Carlos");
        Htrabajada = sc.nextInt();
        System.out.println("Digite la cantidad de Horas Extras trabajadas por Carlos");
        Hextra = sc.nextInt();
        System.out.println("Digite la cantidad de Horas trabajadas domingos y festivo por Carlos");
        DF = sc.nextInt();
		toth=Htrabajada+Hextra+DF;
                
            
            if (toth>=10){
               System.out.println("Carlos trabajo un total de "+toth+" Horas en el mes");
               pago=(Htrabajada*10)+(Hextra*12)+(DF*15)+20;
               System.out.println("Carlos recibio un pago total de: "+pago);
            }else{
		System.out.println("Carlos trabajo un total de "+toth+" Horas en el mes");
		pago=(Htrabajada*10)+(Hextra*12)+(DF*15);
		System.out.println("Carlos recibio un pago total de: $"+pago);
		}

	System.out.println("Digite la cantidad de Horas trabajadas por Luis");
        Htrabajada = sc.nextInt();
        System.out.println("Digite la cantidad de Horas Extras trabajadas por Luis");
        Hextra = sc.nextInt();
        System.out.println("Digite la cantidad de Horas trabajadas domingos y festivo por Luis");
        DF = sc.nextInt();
		toth=Htrabajada+Hextra+DF;
                
            
            if (toth>=10){
               System.out.println("Luis trabajo un total de "+toth+" Horas en el mes");
               pago=(Htrabajada*10)+(Hextra*12)+(DF*15)+20;
               System.out.println("Luis recibio un pago total de: "+pago);
            }else{
		System.out.println("Luis trabajo un total de "+toth+" Horas en el mes");
		pago=(Htrabajada*10)+(Hextra*12)+(DF*15);
		System.out.println("Luis recibio un pago total de: $"+pago);
		}
} 
}