
package modelo;

public class Profesores {
    private
    String nombre;
    private
    String apellido;
    private
    String asignatura;
    private
    int documento;
    private
    int nacimiento;
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
     public void setasignatura(String pasignatura) {
         this.asignatura=pasignatura;
    }
      public void Setnacimiento(int anacimiento ) {
         this.nacimiento=anacimiento;
    }   
    public String getNombre(){
    return this.nombre;
    }
    public String getApellido(){
    return this.apellido;
    }
    public String getAsignatura(){
    return this.asignatura;
    }
     public int getdocumento(){
     return this.documento;
    }
    public int getnacimiento(){
     return this.nacimiento;
    }
    public int getedad(){
         this.edad=1986-nacimiento;
     return this.edad;
    }
    
    
    
}
