
package miprimerpaquete;

import java.util.Scanner;

public class ALARMA {

    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    String venta ;
    String puerta ;
    String alarm ;
    System.out.print("deseea activar la alarma s/n");
    alarm=Sc.next ();
    if (alarm.equals("s")) {
    
    System.out.print("la ventana esta abierta s/n");
    venta=Sc.next();
    System.out.print("la puerta esta abierta s/n");
    puerta=Sc.next();
    if (venta.equals("s") && puerta.equals ("s")){
    for(int i=1; i<=5; i=i+1){
        System.out.print("alarma¡");
    }
    }else{
    System.out.print("la alrma no suena");}
        
    }}
    
    
}
