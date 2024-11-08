package Producto;

public class Producto {
    protected int codigo;
    protected String desccripcion;
    protected float precioCompra, precioVenta, precioPagar, cantBodega, cantMinRequeridaBodega, cantMaxPermitidaBodega, porcentajeDescuento;

    public Producto(int codigo, String desccripcion, float precioCompra, float precioVenta, float cantBodega, float cantMinRequeridaBodega, float cantMaxPermitidaBodega, float porcentajeDescuento) {
        this.codigo = codigo;
        this.desccripcion = desccripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantBodega = cantBodega;
        this.cantMinRequeridaBodega = cantMinRequeridaBodega;
        this.cantMaxPermitidaBodega = cantMaxPermitidaBodega;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean solicitarPedido(){
        if(cantBodega < cantMinRequeridaBodega){
            return true;
        }else{
            return false;
        }
    }
    
    public float totalPagar(int cantidadAComprar){
        precioPagar = cantidadAComprar * precioCompra;
        return precioPagar;
    }
    
    
}
