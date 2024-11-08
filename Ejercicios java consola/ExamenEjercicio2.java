import java.util.Scanner;
public class ExamenEjercicio2 {
	/*validar que conbinacion de numero no se repite ningun numero del 0 al 999 */

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int i=0,j=0,k=0,n1,n2,sw=0;
        
        	for(i=0; i<=9; i++){
               for(j=0; j<=9; j++){
         			for(k=0; k<=9; k++){
                        if((i!=j)&&(i!=k)&&(j!=k)){
                            System.out.println(i+" "+j+" "+k+" ");
          				}else{  
                     	}	
					}	
        		}
        	}
  	}
}