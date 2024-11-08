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
    private float precioCompra, cantBodega, cantMinRequeridaBodega;

    public Producto(int codigo, float precioCompra, float cantBodega, float cantMinRequeridaBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantBodega = cantBodega;
        this.cantMinRequeridaBodega = cantMinRequeridaBodega;
    }

    public boolean solicitarPedido() {
        
        if (cantBodega < cantMinRequeridaBodega){
            return true;
        }else{
            return false;
        }

    }

}
