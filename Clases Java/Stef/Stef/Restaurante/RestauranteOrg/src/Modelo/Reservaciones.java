
package Modelo;

public class Reservaciones {
   private int IdReservaciones;
    private String Nombre;
    private String Hora;
    private String Fecha;
    private int NumeroMesa;
    private int Cedula1;

    public int getIdReservaciones() {
        return IdReservaciones;
    }

    public void setIdReservaciones(int IdReservaciones) {
        this.IdReservaciones = IdReservaciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getNumeroMesa() {
        return NumeroMesa;
    }

    public void setNumeroMesa(int NumeroMesa) {
        this.NumeroMesa = NumeroMesa;
    }

    public int getCedula1() {
        return Cedula1;
    }

    public void setCedula1(int Cedula1) {
        this.Cedula1 = Cedula1;
    }

    int Cedula1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumeroMesa(String txtmes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
