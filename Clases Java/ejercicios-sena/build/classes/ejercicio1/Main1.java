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

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Ingrese el codigo del producto:");
        int codigo = entradaTeclado.nextInt();
        System.out.println("Ingrese el precio de compra del producto:");
        float precioCompra = entradaTeclado.nextFloat();
        System.out.println("Ingrese la cantidad del producto en bodega:");
        float cantBodega = entradaTeclado.nextFloat();
        System.out.println("Ingrese la cantidad minima del producto en bodega:");
        float cantMinRequeridaBodega = entradaTeclado.nextFloat();
        
        Producto producto1 = new Producto(codigo, precioCompra, cantBodega, )
    }

}
