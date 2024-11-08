import java.util.Scanner;
public class ExamenEjercicio4 {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                   int N,i,sw;
        do{
            System.out.println("Digite numero");
         	N = sc.nextInt();
            if(N>=1){
                sw=1;
            }else{
                System.out.println("valor no valido");
                sw=0;
            }
        }while(sw==0);
        for(i=1; i<=N; i++){
             System.out.print(i+"-1/");
             i=i+1;
             System.out.print(i+"+1/");
             
         }
   }    
} 