
package Producto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void guardarProductos() {   
       int cant=1, cantProductosVestir,cantProductosCalzado;
        String tipoProducto;
        
        List<PrendasDeVestir> prendas = new ArrayList<PrendasDeVestir>();
        List<Calzado> calzados = new ArrayList<Calzado>();
        
        
        System.out.print("ingrese el numero de productos de prendas de vestir: ");
        cantProductosVestir = sc.nextInt();
        System.out.print("ingrese el numero de productos de prendas de Calzado: ");
        cantProductosCalzado = sc.nextInt();
        
        
        for(int i=1;i<=2;i++){
            switch (i) {
                case 1:
                    cant = cantProductosVestir;
                    tipoProducto = "Prenda de vestir";
                    break;
                case 2:
                    cant = cantProductosCalzado;
                    tipoProducto = "Calzado";
                    break;
            }
            for (int ii = 1; ii <= cant; ii++) {
                System.out.println("Ingrese el codigo del producto");
                int codigo = sc.nextInt();
                System.out.println("Ingrese una descripcion del producto");
                String descripcion = sc.next();
                System.out.println("Ingrese el precio de compra del producto");
                float precioCompra = sc.nextFloat();
                System.out.println("Ingrese el precio de venta del producto");
                float precioVenta = sc.nextFloat();
                System.out.println("Ingrese el stock del producto en bodega");
                float cantBodega = sc.nextFloat();
                System.out.println("Ingrese el minimo requerido de stock del producto en bodega");
                float cantMinRequeridaBodega = sc.nextFloat();
                System.out.println("Ingrese el maximo permitido de stock del producto en bodega");
                float cantMaxPermitidaBodega = sc.nextFloat();
                System.out.println("Ingrese el porcentaje de descuento del producto");
                float porcentajeDescuento = sc.nextFloat();

                switch (ii) {
                    case 1:
                        System.out.println("Ingrese la talla de la prenda");
                        String tallaPrenda = sc.next();
                        System.out.println("Ingrese si se puede planchar");
                        boolean planchado = sc.nextBoolean();
                        prendas.add(new PrendasDeVestir(codigo, descripcion, tallaPrenda, precioCompra, precioVenta, cantBodega, cantMinRequeridaBodega, cantMaxPermitidaBodega, porcentajeDescuento, planchado));
                        break;
                    case 2:
                        System.out.println("Ingrese la talla del calzado");
                        int tallaCalzado = sc.nextInt();
                        calzados.add(new Calzado(codigo, tallaCalzado, descripcion, precioCompra, precioVenta, cantBodega, cantMinRequeridaBodega, cantMaxPermitidaBodega, porcentajeDescuento));
                        break;
                }
            }
        }

    }    
  
    static void menu(){
        System.out.println("Menu");
        System.out.println("(1) Vender");
        System.out.println("(2) Verificar inventario");
        System.out.println("(3) Ver calzado con mayor cantidad de existencias");
        System.out.println("(4) Ver prenda con mayor cantidad de existencias");
        System.out.println("(5) Modificar cantidad minima requerida en bodega");
        System.out.print("Seleccione la accion que decea realizar");
        int accionMenu = sc.nextInt();
        switch (accionMenu) {
            case 1:
                System.out.println("Vender");
            case 2: 
                System.out.println("Verificando inventario");
            case 3:
                System.out.println("Ver calzado con mayor cantidad de existencias");
            case 4:
                System.out.println("Ver prenda con mayor cantidad de existencias");
            case 5: 
                System.out.println("Modificar cantidad minima requerida en bodega");
        }
    }
    public static void main(String[] args) {
    }
}
