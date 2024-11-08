
package Clases_complementarias;

public class Productos {
  private
    String nombre;
    private
    String Marca;
 
    
    public void SetNombre(String mNombre){
        this.nombre=mNombre;
    }
    public void SetMarca(String marca){
        this.Marca=marca;
    }
    public String getNombre(){
        return this.nombre;
    }
     
     public String getMarca(){
        return this.Marca;
     }
     
}
