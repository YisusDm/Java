
package modelo;

import java.util.Date;

public class Matricula {
    private Double codigo;
    private Date fecha; 
    private Estudiante estudiante;
    private Acudiente acudiente;
    
    public Double getcodigo(){
        return codigo;
    }
    public void setcodigo (Double codigo){
        this.codigo=codigo;
    }
    public Estudiante getEstudiante(){
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante){
       this.estudiante=estudiante;
    }
    public Acudiente getAcudiente(){
        return acudiente;
    }
    public void setAcudiente(Acudiente acudiente){
       this.acudiente=acudiente;
    }
}
