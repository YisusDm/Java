
package Modelo;


public class Inventario {
  private int ReferenciaProducto;
  private String Nombre;
  private int Cantidad;
  private String Unidad;
  private int ValorUnitario;
  private int IdProveedor;

    public int getReferenciaProducto() {
        return ReferenciaProducto;
    }

    public void setReferenciaProducto(int ReferenciaProducto) {
        this.ReferenciaProducto = ReferenciaProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public int getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(int ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }
  
  
  
          
}
