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
            System.out.println("Ingrese nombre del producto: ");
            String nombre = flujoEntrada.next();
            System.out.println("Ingrese nombre del producto: ");
            String nombre = flujoEntrada.next();
            System.out.println("Ingrese nombre del producto: ");
            String nombre = flujoEntrada.next();
            System.out.println("Ingrese nombre del producto: ");
            String nombre = flujoEntrada.next();
            System.out.println("Ingrese precio base (sin impuestos) del producto: ");
            double precio = flujoEntrada.nextDouble();
        }
        Tienda t = new Tienda ("Tienda",productos);
        int salir = 0;
        int opcion = 0;
        System.out.println("MENU:");
        System.out.println(" ");
        System.out.println("1. Vender cierta cantidad de un producto.");
        System.out.println("2. Hacer pedido de un producto.");
        System.out.println("3. Mostrar estadisticas de la tienda.");
        
        
    }
    
}
