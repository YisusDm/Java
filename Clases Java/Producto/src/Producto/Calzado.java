
package Producto;

public class Calzado extends Producto{
    private int talla;
    
    public Calzado(int codigo, int talla, String desccripcion, float precioCompra, float precioVenta, float cantBodega, float cantMinRequeridaBodega, float cantMaxPermitidaBodega, float porcentajeDescuento){
        
        super(codigo,desccripcion,precioCompra,precioVenta,cantBodega,cantMinRequeridaBodega,cantMaxPermitidaBodega,porcentajeDescuento);
        this.talla = talla;
    }
}
