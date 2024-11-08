package centro_educativo_unisaber;
//miercoles 18 11:59pm
//correo: 
import java.util.Scanner;
public class Centro_Educativo_Unisaber {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String prof,grado,est1,est2,est3,est4,est5,est6,est7,est8,est9,est10;
         double a, b, c, d, x, y, z ,tot ;
         double fin1, e11,e12,e13,e14,e15,e16,e17,e18,e19,e20 ;
         double fin2, e21,e22,e23,e24,e25,e26,e27,e28,e29,e30 ;
         double fin3, e31,e32,e33,e34,e35,e36,e37,e38,e39,e40 ;
         double fin4, e41,e42,e43,e44,e45,e46,e47,e48,e49,e50 ;
         double fin5, e51,e52,e53,e54,e55,e56,e57,e58,e59,e60 ;
         double fin6, e61,e62,e63,e64,e65,e66,e67,e68,e69,e70 ;
         double calificaciones;int aprovado=0;int reprovado=0;
         int aprovado1=0,aprovado2=0,aprovado3=0,aprovado4=0,aprovado5=0,aprovado6=0;
         int reprovado1=0,reprovado2=0,reprovado3=0,reprovado4=0,reprovado5=0,reprovado6=0;
    
    System.out.println("¡¡Bienvenidos!!");
    System.out.println("***Claus app***");
    System.out.println("-------------------");
    System.out.println("Registre los datos");
    
    {System.out.println("Grado 1");    
         prof="paulo mirando";System.out.println(prof);
         grado="sexto grado";System.out.println(grado);

                     est1="María José";System.out.println(est1);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(38);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e11=(d);
       System.out.println("la nota final del estudiante es : "+e11);
                     est2="Juan Pablo";System.out.println(est2);
       System.out.println("por favor digite la primera nota"); x =(38);
       System.out.println("por favor digite la segunda nota"); y =(35);
       System.out.println("por favor digite la tercera nota"); z =(38);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e12=(d);
       System.out.println("la nota final del estudiante es : "+e12);
                     est3="Ana Sofía";System.out.println(est3);
       System.out.println("por favor digite la primera nota"); x =(10);
       System.out.println("por favor digite la segunda nota"); y =(20);
       System.out.println("por favor digite la tercera nota"); z =(25);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e13=(d);
       System.out.println("la nota final del estudiante es : "+e13);
                    est4="Juan José"; System.out.println(est4);
       System.out.println("por favor digite la primera nota"); x =(45);
       System.out.println("por favor digite la segunda nota"); y =(35);
       System.out.println("por favor digite la tercera nota"); z =(30);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e14=(d);
       System.out.println("la nota final del estudiante es : "+e14);
                   est5="María Fernanda";System.out.println(est5);
       System.out.println("por favor digite la primera nota"); x =(34);
       System.out.println("por favor digite la segunda nota"); y =(40);
       System.out.println("por favor digite la tercera nota"); z =(39);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e15=(d);
       System.out.println("la nota final del estudiante es : "+e15);
                   est6="Juan Diego";System.out.println(est6);
       System.out.println("por favor digite la primera nota"); x =(34);
       System.out.println("por favor digite la segunda nota"); y =(33);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e16=(d);
       System.out.println("la nota final del estudiante es : "+e16);
                   est7="Ana Paula";System.out.println(est7);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(41);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e17=(d);
       System.out.println("la nota final del estudiante es : "+e17);
                   est8="Gabriel Alejandro"; System.out.println(est8);
       System.out.println("por favor digite la primera nota"); x =(38);
       System.out.println("por favor digite la segunda nota"); y =(37);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e18=(d);
       System.out.println("la nota final del estudiante es : "+e18);
                   est9="Sara Valentina"; System.out.println(est9);
       System.out.println("por favor digite la primera nota"); x =(40);
       System.out.println("por favor digite la segunda nota"); y =(35);
       System.out.println("por favor digite la tercera nota"); z =(39);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e19=(d);
       System.out.println("la nota final del estudiante es : "+e19);
                   est10="Mathías Alejandro";System.out.println(est10);
       System.out.println("por favor digite la primera nota"); x =(43);
       System.out.println("por favor digite la segunda nota"); y =(38);
       System.out.println("por favor digite la tercera nota"); z =(30);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e20=(d);
       System.out.println("la nota final del estudiante es : "+e20);
         
 for (int i=1; i<=10;i=i+1){
     System.out.println("ingrese la nota definitiva del "+i+" estudiante:");
     calificaciones=sc.nextInt();
     if(calificaciones>=35){ aprovado1=aprovado1+1;}
     else {reprovado1=reprovado1+1;}    
 }System.out.println("el total de aprovados es: "+aprovado1);
 System.out.println("el total de reprovados es: "+reprovado1);
 
     fin1=(e11+e12+e13+e14+e15+e16+e17+e18+e19+e20)/10;
       System.out.println("el Promedio de notas del curso es: "+fin1);}
        
       {System.out.println("Grado 2");
         prof="alberto fabregas";System.out.println(prof);
         grado="septimo grado";System.out.println(grado);

                  est1="Ana Victoria";System.out.println(est1);
       System.out.println("por favor digite la primera nota"); x =(25);
       System.out.println("por favor digite la segunda nota"); y =(48);
       System.out.println("por favor digite la tercera nota"); z =(37);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e21=(d);
       System.out.println("la nota final del estudiante es : "+e21);
                   est2="Juan Ignacio";System.out.println(est2);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(41);
       System.out.println("por favor digite la tercera nota"); z =(24);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e22=(d);
       System.out.println("la nota final del estudiante es : "+e22);
                   est3="María Victoria";System.out.println(est3);
       System.out.println("por favor digite la primera nota"); x =(33);
       System.out.println("por favor digite la segunda nota"); y =(40);
       System.out.println("por favor digite la tercera nota"); z =(30);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e23=(d);
       System.out.println("la nota final del estudiante es : "+e23);
                   est4="Francisco Javier"; System.out.println(est4);
       System.out.println("por favor digite la primera nota"); x =(20);
       System.out.println("por favor digite la segunda nota"); y =(10);
       System.out.println("por favor digite la tercera nota"); z =(28);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e24=(d);
       System.out.println("la nota final del estudiante es : "+e24);
                   est5="María Camila";System.out.println(est5);
       System.out.println("por favor digite la primera nota"); x =(43);
       System.out.println("por favor digite la segunda nota"); y =(38);
       System.out.println("por favor digite la tercera nota"); z =(30);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e25=(d);
       System.out.println("la nota final del estudiante es : "+e25);
                    est6="David Alejandro";System.out.println(est6);
       System.out.println("por favor digite la primera nota"); x =(25);
       System.out.println("por favor digite la segunda nota"); y =(20);
       System.out.println("por favor digite la tercera nota"); z =(30);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e26=(d);
       System.out.println("la nota final del estudiante es : "+e26);
                     est7="Victoria Sofía";System.out.println(est7);
       System.out.println("por favor digite la primera nota"); x =(33);
       System.out.println("por favor digite la segunda nota"); y =(47);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e27=(d);
       System.out.println("la nota final del estudiante es : "+e27);
                     est8="Diego Alejandro"; System.out.println(est8);
       System.out.println("por favor digite la primera nota"); x =(31);
       System.out.println("por favor digite la segunda nota"); y =(30);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e28=(d);
       System.out.println("la nota final del estudiante es : "+e28);
                    est9="Mía Valentina"; System.out.println(est9);
       System.out.println("por favor digite la primera nota"); x =(29);
       System.out.println("por favor digite la segunda nota"); y =(35);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e29=(d);
       System.out.println("la nota final del estudiante es : "+e29);
                    est10="Juan Esteban";System.out.println(est10);
       System.out.println("por favor digite la primera nota"); x =(28);
       System.out.println("por favor digite la segunda nota"); y =(37);
       System.out.println("por favor digite la tercera nota"); z =(45);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e30=(d);
       System.out.println("la nota final del estudiante es : "+e30);
       
 for (int i=1; i<=10;i=i+1){
     System.out.println("ingrese la nota definitiva del "+i+" estudiante:");
     calificaciones=sc.nextInt();
     if(calificaciones>=35){ aprovado2=aprovado2+1;}
     else {reprovado2=reprovado2+1;}   
 }System.out.println("el total de aprovados es: "+aprovado2);
 System.out.println("el total de reprovados es: "+reprovado2);
 
     fin2=(e21+e22+e23+e24+e25+e26+e27+e28+e29+e30)/10;
       System.out.println("el Promedio de notas del curso es: "+fin2);}
       
       {System.out.println("Grado 3");
         prof="Anthony cervantes";System.out.println(prof);
         grado="octavo grado";System.out.println(grado);

                  est1="María Paula";System.out.println(est1);
       System.out.println("por favor digite la primera nota"); x =(40);
       System.out.println("por favor digite la segunda nota"); y =(42);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e31=(d);
       System.out.println("la nota final del estudiante es : "+e31);
                  est2="Juan Manuel";System.out.println(est2);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(44);
       System.out.println("por favor digite la tercera nota"); z =(38);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e32=(d);
       System.out.println("la nota final del estudiante es : "+e32);
                  est3="María AntoniaAna María";System.out.println(est3);
       System.out.println("por favor digite la primera nota"); x =(39);
       System.out.println("por favor digite la segunda nota"); y =(40);
       System.out.println("por favor digite la tercera nota"); z =(41);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e33=(d);
       System.out.println("la nota final del estudiante es : "+e33);
                  est4="Juan David"; System.out.println(est4);
       System.out.println("por favor digite la primera nota"); x =(42);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(38);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e34=(d);
       System.out.println("la nota final del estudiante es : "+e34);
                  est5="María Paz";System.out.println(est5);
       System.out.println("por favor digite la primera nota"); x =(39);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(37);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e35=(d);
       System.out.println("la nota final del estudiante es : "+e35);
                    est6="Miguel Ángel";System.out.println(est6);
       System.out.println("por favor digite la primera nota"); x =(30);
       System.out.println("por favor digite la segunda nota"); y =(29);
       System.out.println("por favor digite la tercera nota"); z =(31);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e36=(d);
       System.out.println("la nota final del estudiante es : "+e36);
                  est7="Emma Sofía";System.out.println(est7);
       System.out.println("por favor digite la primera nota"); x =(37);
       System.out.println("por favor digite la segunda nota"); y =(41);
       System.out.println("por favor digite la tercera nota"); z =(29);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e37=(d);
       System.out.println("la nota final del estudiante es : "+e37);
                  est8="Samuel David"; System.out.println(est8);
       System.out.println("por favor digite la primera nota"); x =(20);
       System.out.println("por favor digite la segunda nota"); y =(25);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e38=(d);
       System.out.println("la nota final del estudiante es : "+e38);
                   est9="Isabella ValentinaDulce María"; System.out.println(est9);
       System.out.println("por favor digite la primera nota"); x =(35);
       System.out.println("por favor digite la segunda nota"); y =(40);
       System.out.println("por favor digite la tercera nota"); z =(31);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e39=(d);
       System.out.println("la nota final del estudiante es : "+e39);
                   est10="Juan Andrés";System.out.println(est10);
       System.out.println("por favor digite la primera nota"); x =(38);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(43);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e40=(d);
       System.out.println("la nota final del estudiante es : "+e40);
       
      for (int i=1; i<=10;i=i+1){
     System.out.println("ingrese la nota definitiva del "+i+" estudiante:");
     calificaciones=sc.nextInt();
     if(calificaciones>=35){ aprovado3=aprovado3+1;}
     else {reprovado3=reprovado3+1;}   
 }System.out.println("el total de aprovados es: "+aprovado3);
 System.out.println("el total de reprovados es: "+reprovado3);
     
       fin3=(e31+e32+e33+e34+e35+e36+e37+e38+e39+e40)/10;
       System.out.println("el Promedio de notas del curso es: "+fin3);}
        
       {System.out.println("Grado 4");
         prof="Dilson suarez";System.out.println(prof);
         grado="noveno grado";System.out.println(grado);

                  est1="Mía Isabella";System.out.println(est1);
       System.out.println("por favor digite la primera nota"); x =(31);
       System.out.println("por favor digite la segunda nota"); y =(48);
       System.out.println("por favor digite la tercera nota"); z =(39);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e41=(d);
       System.out.println("la nota final del estudiante es : "+e41);
                  est2="José Luis";System.out.println(est2);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(40);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e42=(d);
       System.out.println("la nota final del estudiante es : "+e42);
                  est3="Emma Victoria";System.out.println(est3);
       System.out.println("por favor digite la primera nota"); x =(35);
       System.out.println("por favor digite la segunda nota"); y =(33);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e43=(d);
       System.out.println("la nota final del estudiante es : "+e43);
                  est4="Juan Carlos"; System.out.println(est4);
       System.out.println("por favor digite la primera nota"); x =(47);
       System.out.println("por favor digite la segunda nota"); y =(44);
       System.out.println("por favor digite la tercera nota"); z =(39);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e44=(d);
       System.out.println("la nota final del estudiante es : "+e44);
                  est5="Sofía Valentina";System.out.println(est5);
       System.out.println("por favor digite la primera nota"); x =(39);
       System.out.println("por favor digite la segunda nota"); y =(48);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e45=(d);
       System.out.println("la nota final del estudiante es : "+e45);
                  est6="Carlos Daniel";System.out.println(est6);
       System.out.println("por favor digite la primera nota"); x =(25);
       System.out.println("por favor digite la segunda nota"); y =(29);
       System.out.println("por favor digite la tercera nota"); z =(36);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e46=(d);
       System.out.println("la nota final del estudiante es : "+e46);
                  est7="Danna SofíaEmily Sofía";System.out.println(est7);
        System.out.println("por favor digite la primera nota"); x =(30);
       System.out.println("por favor digite la segunda nota"); y =(38);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e47=(d);
       System.out.println("la nota final del estudiante es : "+e47);
                  est8="Luis Fernando"; System.out.println(est8);
       System.out.println("por favor digite la primera nota"); x =(45);
       System.out.println("por favor digite la segunda nota"); y =(31);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e48=(d);
       System.out.println("la nota final del estudiante es : "+e48);
                  est9="María Emilia"; System.out.println(est9);
       System.out.println("por favor digite la primera nota"); x =(45);
       System.out.println("por favor digite la segunda nota"); y =(44);
       System.out.println("por favor digite la tercera nota"); z =(36);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e49=(d);
       System.out.println("la nota final del estudiante es : "+e49);
                  est10="Juan Bautista";System.out.println(est10);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(39);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e50=(d);
       System.out.println("la nota final del estudiante es : "+e50);
       
             for (int i=1; i<=10;i=i+1){
     System.out.println("ingrese la nota definitiva del "+i+" estudiante:");
     calificaciones=sc.nextInt();
     if(calificaciones>=35){ aprovado4=aprovado4+1;}
     else {reprovado4=reprovado4+1;}   
 }System.out.println("el total de aprovados es: "+aprovado4);
 System.out.println("el total de reprovados es: "+reprovado4);
 
     fin4=(e41+e42+e43+e44+e45+e46+e47+e48+e49+e50)/10;
       System.out.println("el Promedio de notas del curso es: "+fin4);}
       
       {System.out.println("Grado 5");
         prof="Angel polo";System.out.println(prof);
         grado="Decimo grado";System.out.println(grado);

                  est1="María Victoria";System.out.println(est1);
       System.out.println("por favor digite la primera nota"); x =(35);
       System.out.println("por favor digite la segunda nota"); y =(39);
       System.out.println("por favor digite la tercera nota"); z =(38);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e51=(d);
       System.out.println("la nota final del estudiante es : "+e51);
                  est2="Juan Martín";System.out.println(est2);
       System.out.println("por favor digite la primera nota"); x =(41);
       System.out.println("por favor digite la segunda nota"); y =(28);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e52=(d);
       System.out.println("la nota final del estudiante es : "+e52);
                  est3="Isabella Victoria";System.out.println(est3);
       System.out.println("por favor digite la primera nota"); x =(40);
       System.out.println("por favor digite la segunda nota"); y =(38);
       System.out.println("por favor digite la tercera nota"); z =(30);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e53=(d);
       System.out.println("la nota final del estudiante es : "+e53);
                  est4="José Ignacio"; System.out.println(est4);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(10);
       System.out.println("por favor digite la tercera nota"); z =(20);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e54=(d);
       System.out.println("la nota final del estudiante es : "+e54);
                  est5="María Isabel";System.out.println(est5);
       System.out.println("por favor digite la primera nota"); x =(39);
       System.out.println("por favor digite la segunda nota"); y =(46);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e55=(d);
       System.out.println("la nota final del estudiante es : "+e55);
                  est6="Miguel Alejandro";System.out.println(est6);
       System.out.println("por favor digite la primera nota"); x =(31);
       System.out.println("por favor digite la segunda nota"); y =(33);
       System.out.println("por favor digite la tercera nota"); z =(28);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e56=(d);
       System.out.println("la nota final del estudiante es : "+e56);
                  est7="Sarah Lucía";System.out.println(est7);
       System.out.println("por favor digite la primera nota"); x =(39);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e57=(d);
       System.out.println("la nota final del estudiante es : "+e57);
                  est8="Santiago David"; System.out.println(est8);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(46);
       System.out.println("por favor digite la tercera nota"); z =(44);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e58=(d);
       System.out.println("la nota final del estudiante es : "+e58);
                  est9="María Celeste"; System.out.println(est9);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(50);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e59=(d);
       System.out.println("la nota final del estudiante es : "+e59);
                 est10="Carlos Eduardo";System.out.println(est10);
       System.out.println("por favor digite la primera nota"); x =(43);
       System.out.println("por favor digite la segunda nota"); y =(39);
       System.out.println("por favor digite la tercera nota"); z =(36);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e60=(d);
       System.out.println("la nota final del estudiante es : "+e60);
       
             for (int i=1; i<=10;i=i+1){
     System.out.println("ingrese la nota definitiva del "+i+" estudiante:");
     calificaciones=sc.nextInt();
     if(calificaciones>=35){ aprovado5=aprovado5+1;}
     else {reprovado5=reprovado5+1;}    
 }System.out.println("el total de aprovados es: "+aprovado5);
 System.out.println("el total de reprovados es: "+reprovado5);
 
     fin5=(e51+e52+e53+e54+e55+e56+e57+e58+e59+e60)/10;
       System.out.println("el Promedio de notas del curso es: "+fin5);}
       
       {System.out.println("Grado 6");
         prof="Sixta carbono";System.out.println(prof);
         grado="Undecimo grado";System.out.println(grado);

                  est1="Nicole Alejandra";System.out.println(est1);
       System.out.println("por favor digite la primera nota"); x =(31);
       System.out.println("por favor digite la segunda nota"); y =(49);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e61=(d);
       System.out.println("la nota final del estudiante es : "+e61);
                  est2="Juan Sebastián";System.out.println(est2);
       System.out.println("por favor digite la primera nota"); x =(43);
       System.out.println("por favor digite la segunda nota"); y =(44);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e62=(d);
       System.out.println("la nota final del estudiante es : "+e62);
                   est3="Paula Isabella";System.out.println(est3);
       System.out.println("por favor digite la primera nota"); x =(45);
       System.out.println("por favor digite la segunda nota"); y =(45);
       System.out.println("por favor digite la tercera nota"); z =(45);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e63=(d);
       System.out.println("la nota final del estudiante es : "+e63);
                   est4="José Manuel"; System.out.println(est4);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(39);
       System.out.println("por favor digite la tercera nota"); z =(41);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e64=(d);
       System.out.println("la nota final del estudiante es : "+e64);
                   est5="Ana Regina";System.out.println(est5);
       System.out.println("por favor digite la primera nota"); x =(29);
       System.out.println("por favor digite la segunda nota"); y =(32);
       System.out.println("por favor digite la tercera nota"); z =(34);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e65=(d);
       System.out.println("la nota final del estudiante es : "+e65);
                   est6="David Santiago";System.out.println(est6);
       System.out.println("por favor digite la primera nota"); x =(34);
       System.out.println("por favor digite la segunda nota"); y =(33);
       System.out.println("por favor digite la tercera nota"); z =(35);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e66=(d);
       System.out.println("la nota final del estudiante es : "+e66);
                  est7="Camila Victoria";System.out.println(est7);
       System.out.println("por favor digite la primera nota"); x =(50);
       System.out.println("por favor digite la segunda nota"); y =(40);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e67=(d);
       System.out.println("la nota final del estudiante es : "+e67);
                  est8="Andrés Felipe"; System.out.println(est8);
       System.out.println("por favor digite la primera nota"); x =(45);
       System.out.println("por favor digite la segunda nota"); y =(50);
       System.out.println("por favor digite la tercera nota"); z =(40);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e68=(d);
       System.out.println("la nota final del estudiante es : "+e68);
                  est9="Paula Valentina"; System.out.println(est9);
       System.out.println("por favor digite la primera nota"); x =(38);
       System.out.println("por favor digite la segunda nota"); y =(41);
       System.out.println("por favor digite la tercera nota"); z =(44);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e69=(d);
       System.out.println("la nota final del estudiante es : "+e69);
                  est10="Juan Camilo";System.out.println(est10);
       System.out.println("por favor digite la primera nota"); x =(35);
       System.out.println("por favor digite la segunda nota"); y =(46);
       System.out.println("por favor digite la tercera nota"); z =(50);
       a=(x*0.35); b=(y*0.35);c=(z*0.3);d=a+b+c;e70=(d);
       System.out.println("la nota final del estudiante es : "+e70);
       
            for (int i=1; i<=10;i=i+1){
     System.out.println("ingrese la nota definitiva del "+i+" estudiante:");
     calificaciones=sc.nextInt();
     if(calificaciones>=35){ aprovado6=aprovado6+1;}
     else {reprovado6=reprovado6+1;}   
 }System.out.println("el total de aprovados es: "+aprovado6);
 System.out.println("el total de reprovados es: "+reprovado6);
 
     fin6=(e61+e62+e63+e64+e65+e66+e67+e68+e69+e70)/10;
       System.out.println("el Promedio de notas del curso es: "+fin6);}
       
    tot= (fin1+fin2+fin3+fin4+fin5+fin6)/6;
    int u; 
    do{
    System.out.println("**********************************");
    System.out.println("----------------------------------");
    System.out.println("que desea hacer??");
    System.out.println("1.Mostrar Numero de aprobados y reprobados nota mayor o igual a 35");
    System.out.println("2.Mostrar Promedio de notas final por grado ");
    System.out.println("3.Mostrar Promedio final de notas a nivel general en la institucion");
    System.out.println("4.decidir si el docente continua o no con el grado el año siguiente");
    System.out.println("----------------------------------");
     u = sc.nextInt();
    switch (u){
        case 1:
            System.out.println("usted eligio ver el numero de aprovados y reprovados por grado");
            System.out.println("----------------------------------");
         System.out.println("Grado 1");
         prof="paulo mirando";System.out.println(prof);
         grado="sexto grado";System.out.println(grado);
         System.out.println("el total de aprovados es: "+aprovado1
          );
         System.out.println("el total de reprovados es: "+reprovado1);
         System.out.println("----------------------------------");
         System.out.println("Grado 2");
         prof="alberto fabregas";System.out.println(prof);
         grado="septimo grado";System.out.println(grado);
         System.out.println("el total de aprovados es: "+aprovado2);
         System.out.println("el total de reprovados es: "+reprovado2);
         System.out.println("----------------------------------");
         System.out.println("Grado 3");
         prof="Anthony cervantes";System.out.println(prof);
         grado="octavo grado";System.out.println(grado);
         System.out.println("el total de aprovados es: "+aprovado3);
         System.out.println("el total de reprovados es: "+reprovado3);
         System.out.println("----------------------------------");
         System.out.println("Grado 4");
         prof="Dilson suarez";System.out.println(prof);
         grado="noveno grado";System.out.println(grado);
         System.out.println("el total de aprovados es: "+aprovado4);
         System.out.println("el total de reprovados es: "+reprovado4);
         System.out.println("----------------------------------");
         System.out.println("Grado 5");
         prof="Angel polo";System.out.println(prof);
         grado="Decimo grado";System.out.println(grado);
         System.out.println("el total de aprovados es: "+aprovado5);
         System.out.println("el total de reprovados es: "+reprovado5);
         System.out.println("----------------------------------");
         System.out.println("Grado 6");
         prof="Sixta carbono";System.out.println(prof);
         grado="Undecimo grado";System.out.println(grado);
         System.out.println("el total de aprovados es: "+aprovado6);
         System.out.println("el total de reprovados es: "+reprovado6);
         System.out.println("----------------------------------");
        break;    
       
        case 2:
            System.out.println("usted eligio ver promedio de notas por grado");
            System.out.println("----------------------------------");
            System.out.println("Grado 1");
         prof="paulo mirando";System.out.println(prof);
         grado="sexto grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin1);
         System.out.println("----------------------------------");
         System.out.println("Grado 2");
         prof="alberto fabregas";System.out.println(prof);
         grado="septimo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin2);
         System.out.println("----------------------------------");
         System.out.println("Grado 3");
         prof="Anthony cervantes";System.out.println(prof);
         grado="octavo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin3);
         System.out.println("----------------------------------");
         System.out.println("Grado 4");
         prof="Dilson suarez";System.out.println(prof);
         grado="noveno grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin4);
         System.out.println("----------------------------------");
         System.out.println("Grado 5");
         prof="Angel polo";System.out.println(prof);
         grado="Decimo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin5);
         System.out.println("----------------------------------");
         System.out.println("Grado 6");
         prof="Sixta carbono";System.out.println(prof);
         grado="Undecimo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin6);
         System.out.println("----------------------------------");
        break;
        case 3:
            System.out.println("usted eligio ver el promedio de notas general de la intitucion");
            System.out.println("***Promedio de notas de la institucion***");
            System.out.println("*****************"+tot+"*****************");
            System.out.println("----------------------------------");
        break;
        case 4:
            System.out.println("----------------------------------");
            System.out.println("Grado 1");
         prof="paulo mirando";System.out.println(prof);
         grado="sexto grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin1);
         if (fin1>=35){System.out.println( "EL Docente **CONTINUA**");
          }else{System.out.println("El Docente sera **DESPEDIDO** ");}
         System.out.println("----------------------------------");
         System.out.println("Grado 2");
         prof="alberto fabregas";System.out.println(prof);
         grado="septimo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin2);
         if (fin2>=35){System.out.println( "EL Docente **CONTINUA**");
          }else{System.out.println("El Docente sera **DESPEDIDO** ");}
         System.out.println("----------------------------------");
         System.out.println("Grado 3");
         prof="Anthony cervantes";System.out.println(prof);
         grado="octavo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin3);
         if (fin3>=35){System.out.println( "EL Docente **CONTINUA**");
          }else{System.out.println("El Docente sera **DESPEDIDO** ");}
         System.out.println("----------------------------------");
         System.out.println("Grado 4");
         prof="Dilson suarez";System.out.println(prof);
         grado="noveno grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin4);
         if (fin4>=35){System.out.println( "EL Docente **CONTINUA**");
          }else{System.out.println("El Docente sera **DESPEDIDO** ");}
         System.out.println("----------------------------------");
         System.out.println("Grado 5");
         prof="Angel polo";System.out.println(prof);
         grado="Decimo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin5);
         if (fin5>=35){System.out.println( "EL Docente **CONTINUA**");
          }else{System.out.println("El Docente sera **DESPEDIDO** ");}
         System.out.println("----------------------------------");
         System.out.println("Grado 6");
         prof="Sixta carbono";System.out.println(prof);
         grado="Undecimo grado";System.out.println(grado);
         System.out.println("el Promedio de notas del curso es: "+fin6);
         if (fin6>=35){System.out.println( "EL Docente **CONTINUA**");
          }else{System.out.println("El Docente sera **DESPEDIDO** ");}
         System.out.println("----------------------------------");
        break;
        }}while(true);}  }
   