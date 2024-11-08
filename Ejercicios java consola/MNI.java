import java.util.Scanner;
public class MNI {
   
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
       double a, b;
       
       System.out.println("por favor escriba un numero");
        a = sc.nextDouble();
        
        System.out.println("por favor escriba un numero");
        b = sc.nextDouble();
       
       if (a>b){
          System.out.println(a+" es el numero mayor");
       }else{
          if(a<b){
               System.out.println(a+" es el numero menor");
           }else{
              System.out.println(a+"="+b+" los numeros son de igual valor");
       }
       }
    }
    
}
