
package modelo;

public class Estudiante {
    private
    String nombre;
    private
    String apellido;
    private
    int documento;
    private
    int nacimiento;        
    private
    int grado;   
    private 
    int edad;
    public void SetNombre(String mNombre) {
        this.nombre=mNombre;
    }
     public void SetApellido(String lapellido) {
        this.apellido=lapellido;
    }
      public void Setdocumento(int ndocumento) {
         this.documento=ndocumento;
    }
      public void Setnacimiento(int anacimiento ) {
         this.nacimiento=anacimiento;
    }
      public void Setgrado(int curso) {
         this.grado=curso;
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
    public int getnacimiento(){
     return this.nacimiento;
    }
    public int getgrado(){
     return this.grado;
    }
    public int getedad(){
      this.edad=2018-nacimiento;
     return this.edad;
    }

    
}
