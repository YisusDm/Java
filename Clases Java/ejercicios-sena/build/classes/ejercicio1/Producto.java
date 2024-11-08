/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Producto {

    private int codigo;
    private float precioCompra;
    private float cantBodega;
    private float cantMinRequeridaBodega;

    public Producto(int codigo, float precioCompra, float cantBodega, float cantMinRequeridaBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantBodega = cantBodega;
        this.cantMinRequeridaBodega = cantMinRequeridaBodega;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getCantBodega() {
        return cantBodega;
    }

    public void setCantBodega(float cantBodega) {
        this.cantBodega = cantBodega;
    }

    public float getCantMinRequeridaBodega() {
        return cantMinRequeridaBodega;
    }

    public void setCantMinRequeridaBodega(float cantMinRequeridaBodega) {
        this.cantMinRequeridaBodega = cantMinRequeridaBodega;
    }

}
