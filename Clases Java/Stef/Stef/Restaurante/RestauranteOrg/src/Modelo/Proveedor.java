
package Modelo;

public class Proveedor {
    private int IdProveedor;
    private String Nombre;
    private String ProductoVenta;
    private int Telefono;
    private String correo;

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProductoVenta() {
        return ProductoVenta;
    }

    public void setProductoVenta(String ProductoVenta) {
        this.ProductoVenta = ProductoVenta;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
