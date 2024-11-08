
package Clases_complementarias;

public class Vendedor {
       private
    String nombre;
    private
    String apellido;
    private
    int documento;
    private
    int sueldo;
    
    public void SetNombre(String mNombre){
        this.nombre=mNombre;
    }
    public void SetApellido(String mApellido){
        this.apellido=mApellido;
    }
     public void Setdocumento(int ndocumento) {
         this.documento=ndocumento;
    }
    public void Setsueldo(int msueldo){
        this.sueldo=msueldo;
    } 
   
     public String getNombre(){
        return this.nombre;
    }
     
     public String getApellido(){
        return this.apellido;
    }
      public int getdocumento(){
     return this.documento;
    }
      public int getsueldo(){
        return this.sueldo;
     
}
}
