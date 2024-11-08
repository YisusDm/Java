
package modelo;


public class Acudiente {
    private String nombre;
    private String apellido;
    private String direccion;
    private Double telefono;
    
    public void SetNombre(String mNombre){
        this.nombre=mNombre;
    }
    
    public void SetApellido(String mApellido){
        this.apellido=mApellido;
    }
   
    public void SetDireccion(String mDireccion){
     this.direccion=mDireccion;   
    }
    
    public void SetTelefono(Double mTelefono){
        this.telefono=mTelefono;
    } 
   
     public String getNombre(){
        return this.nombre;
    }
     
     public String getApellido(){
        return this.apellido;
    }
     
     public String getDireccion(){
         return this.direccion;
     }
     public Double getTelefono(){
        return this.telefono;
     }
}
