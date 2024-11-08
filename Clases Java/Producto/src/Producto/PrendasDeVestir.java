package Producto;

public class PrendasDeVestir extends Producto{

    private String talla;
    private boolean planchado;
    
    
    public PrendasDeVestir(int codigo, String desccripcion, String talla, float precioCompra, float precioVenta, float cantBodega, float cantMinRequeridaBodega, float cantMaxPermitidaBodega, float porcentajeDescuento, boolean planchado){
        
        super(codigo,desccripcion,precioCompra,precioVenta,cantBodega,cantMinRequeridaBodega,cantMaxPermitidaBodega,porcentajeDescuento);
        this.talla = talla;
        this.planchado = planchado;
    }
}
