
package modelo;


public class Asignatura {
    private
    String nombre;
    private
    int CantidadHoras;
    
    public void SetNombre(String mNombre) {
        this.nombre=mNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setCantidadHoras(int mCantidadHoras){
        this.CantidadHoras=mCantidadHoras;
        
    }
   public int getCantdadHoras(){
       return this.CantidadHoras;
   } 
 
    
}

    


         

