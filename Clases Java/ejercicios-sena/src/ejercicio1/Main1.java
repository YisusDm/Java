/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el codigo del producto:");
        int codigo = sc.nextInt();
        System.out.println("Ingrese el precio de compra del producto:");
        float precioCompra = sc.nextFloat();
        System.out.println("Ingrese la cantidad del producto en bodega:");
        float cantBodega = sc.nextFloat();
        System.out.println("Ingrese la cantidad minima del producto en bodega:");
        float cantMinRequeridaBodega = sc.nextFloat();
        
        Producto producto = new Producto(codigo, precioCompra, cantBodega, cantMinRequeridaBodega);
        
        System.out.println(producto.solicitarPedido());
    }

}
