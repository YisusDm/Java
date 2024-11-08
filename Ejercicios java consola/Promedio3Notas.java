import java.util.Scanner;
public class Promedio3Notas {
   
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
       double a, b, c, not1, not2, not3, tot ;
       String nom;

       System.out.println("Digite el nombre del Estudiante");
        nom = sc.next();

       System.out.println("por favor digite la primera nota");
        a = sc.nextDouble();
        
        System.out.println("por favor digite la segunda nota");
        b = sc.nextDouble();
        
        System.out.println("por favor digite la tercera nota");
        c = sc.nextDouble();

        not1=a*0.3;
        not2=b*0.3;
        not3=c*0.4;
        tot=not1+not2+not3;
        System.out.println("La NOTA definitiva del estudiante "+nom+" es "+tot);
        System.out.println(a+"=30%");
        System.out.println(b+"=30%");
        System.out.println(c+"=40%");
        System.out.println(tot);


}
}