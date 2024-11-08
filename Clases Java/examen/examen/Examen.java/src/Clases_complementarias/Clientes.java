/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_complementarias;

/**
 *
 * @author USUARIO
 */
public class Clientes {
       private
    String nombre;
    private
    String apellido;
    private
    int documento;
    private
    int telefono;
    
    public void SetNombre(String mNombre){
        this.nombre=mNombre;
    }
    public void SetApellido(String mApellido){
        this.apellido=mApellido;
    }
     public void Setdocumento(int ndocumento) {
         this.documento=ndocumento;
    }
    public void SetTelefono(int mTelefono){
        this.telefono=mTelefono;
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
    public int getTelefono(){
        return this.telefono;
     }
}
