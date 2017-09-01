/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main (String [] args){
        Scanner flujoEntrada = new Scanner (System.in);
        Producto[] productos = new Producto[4];
        System.out.println("BIENVENIDO A TIENDA");
        System.out.println(" ");
        System.out.println("Por favor cree los 4 productos de la tienda");
        for (int i = 0; i < 4; i++){
            System.out.println("Nombre del producto " + (i+1) + ": ");
            String nombre = flujoEntrada.next();
            System.out.println("Ingrese numero correspondiente al tipo del producto: ");
            String tipo = null;
            int numero_tipo = 0;
            do{
                System.out.println("1. Papeleria");
                System.out.println("2. Supermercado");
                System.out.println("3. Drogueria");
                numero_tipo = flujoEntrada.nextInt();
                if ((numero_tipo < 1) || (numero_tipo > 3)){
                    System.out.println("Opcion no disponible. Revise las opciones disponibles e intente nuevamente");
                }
            }while((numero_tipo < 1) || (numero_tipo > 3));
            switch (numero_tipo){
                case 1:
                    tipo = "papeleria";
                    break;
                case 2:
                    tipo = "supermercado";
                    break;
                case 3:
                    tipo = "drogueria";
                    break;
            }
            System.out.println("Cantidad actual del producto: ");
            int cantidad_actual = flujoEntrada.nextInt();
            System.out.println("Cantidad mínima recomendada del producto en bodega: ");
            int tope_minimo = flujoEntrada.nextInt();
            System.out.println("Precio base (sin impuestos) del producto ($): ");
            double precio_base = flujoEntrada.nextDouble();
            productos[i] = new Producto (nombre, tipo, cantidad_actual, tope_minimo, precio_base);
            System.out.println(" ");
        }
        Tienda t = new Tienda ("Tienda", productos);
        int salir = 0;
        int opcion = 0;
        while (salir == 0){
            System.out.println("MENU:");
        System.out.println(" ");
        System.out.println("1. Vender cierta cantidad de un producto.");
        System.out.println("2. Hacer pedido de un producto.");
        System.out.println("3. Mostrar estadisticas de la tienda.");
        System.out.println(" ");
        opcion = flujoEntrada.nextInt();
        switch (opcion){
            case 1:
                Producto producto_ = new Producto ("nombre", "supermercado", 0, 0, 0);
                String nombre_producto = null;
                String nombre1 = t.getProductos()[0].getNombre();
                String nombre2 = t.getProductos()[1].getNombre();
                String nombre3 = t.getProductos()[2].getNombre();
                String nombre4 = t.getProductos()[3].getNombre();
                do{
                System.out.println("Escriba nombre del producto que desea vender: ");
                System.out.println("Lista de productos: ");
                System.out.println(" ");
                for (int j = 0; j < 4; j++){
                    System.out.println(" - " + t.getProductos()[j].getNombre());
                }
                nombre_producto = flujoEntrada.next();
                if (!(((nombre_producto.equals(nombre1)) || (nombre_producto.equals(nombre2))) || ((nombre_producto.equals(nombre3)) || (nombre_producto.equals(nombre4))))){
                    System.out.println("Producto no disponible. Revise los productos disponibles e intente nuevamente");
                }
            }while(!(((nombre_producto.equals(nombre1)) || (nombre_producto.equals(nombre2))) || ((nombre_producto.equals(nombre3)) || (nombre_producto.equals(nombre4)))));
            if (nombre_producto.equals(nombre1)){
                producto_ = t.getProductos()[0];
            }else{
                if (nombre_producto.equals(nombre2)){
                    producto_ = t.getProductos()[1];
                }else{
                    if (nombre_producto.equals(nombre3)){
                        producto_ = t.getProductos()[2];
                    }else{
                        if (nombre_producto.equals(nombre4)){
                            producto_ = t.getProductos()[3];
                        }
                    }
                }
            }   
                System.out.println("Escriba cantidad de productos que desea vender: ");
                int cantidad = flujoEntrada.nextInt();
                if (t.vender(producto_, cantidad) == true){
                    t.vender(producto_, cantidad);
                    System.out.println(" ");
                    System.out.println("Venta realizada exitosamente");
                    System.out.println(" ");
                }else{
                    System.out.println("No hay suficiente cantidad del producto requerido. No es posible hacer la venta.");
                }
                break;
            case 2:
                Producto producto = new Producto ("nombre", "supermercado", 0, 0, 0);
                String nombreproducto = null;
                String nombre_1 = t.getProductos()[0].getNombre();
                String nombre_2 = t.getProductos()[1].getNombre();
                String nombre_3 = t.getProductos()[2].getNombre();
                String nombre_4 = t.getProductos()[3].getNombre();
                do{
                System.out.println("Escriba nombre del producto que desea pedir: ");
                System.out.println("Lista de productos: ");
                System.out.println(" ");
                for (int j = 0; j < 4; j++){
                    System.out.println(" - " + t.getProductos()[j].getNombre());
                }
                nombre_producto = flujoEntrada.next();
                if (!(((nombre_producto.equals(nombre_1)) || (nombre_producto.equals(nombre_2))) || ((nombre_producto.equals(nombre_3)) || (nombre_producto.equals(nombre_4))))){
                    System.out.println("Producto no disponible. Revise los productos disponibles e intente nuevamente");
                }
            }while(!(((nombre_producto.equals(nombre_1)) || (nombre_producto.equals(nombre_2))) || ((nombre_producto.equals(nombre_3)) || (nombre_producto.equals(nombre_4)))));
            if (nombre_producto.equals(nombre_1)){
                producto = t.getProductos()[0];
            }else{
                if (nombre_producto.equals(nombre_2)){
                    producto = t.getProductos()[1];
                }else{
                    if (nombre_producto.equals(nombre_3)){
                        producto = t.getProductos()[2];
                    }else{
                        if (nombre_producto.equals(nombre_4)){
                            producto = t.getProductos()[3];
                        }
                    }
                }
            }   
                System.out.println("Escriba cantidad de productos que desea pedir: ");
                int cantidad_ = flujoEntrada.nextInt();
                if (t.hacer_pedido(producto, cantidad_) == true){
                    t.hacer_pedido(producto, cantidad_);
                    System.out.println(" ");
                    System.out.println("Pedido realizado exitosamente");
                    System.out.println(" ");
                }else{
                    System.out.println("No es necesario hacer pedido de este producto. Aun hay suficiente cantidad en bodega.");
                }
                break;
            case 3:
                t.mostrar_estadisticas();
                break;
            default:
                System.out.println("OPCION NO DISPONIBLE");
                
                }
        System.out.println("¿SALIR?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                int respuesta = flujoEntrada.nextInt();
                switch (respuesta){
                    case 1:
                        salir = 1;
                        break;
                    default:
                        salir = 0;
                        break;
                }
        }
        
        
        
    }
    
}
