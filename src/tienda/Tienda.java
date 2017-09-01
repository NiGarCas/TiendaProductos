/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Estudiante
 */
public class Tienda {
    private String nombre;
    private Producto[] productos;
    private double valor_total_ventas;
    private int cantidad_productos;

    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public double getValor_total_ventas() {
        return valor_total_ventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setValor_total_ventas(double valor_total_ventas) {
        this.valor_total_ventas = valor_total_ventas;
    }

    public Tienda(String nombre, Producto[] productos) {
        this.nombre = nombre;
        this.productos = productos;
        this.valor_total_ventas = 0;
    }
    
    public boolean vender (Producto producto, int cantidad){
        if (cantidad < producto.getCantidad_actual()){
            this.valor_total_ventas = this.valor_total_ventas + ( cantidad * producto.getPrecio_final());
            producto.setCantidad_actual(producto.getCantidad_actual()- cantidad);
            producto.setCantidad_vendida(producto.getCantidad_vendida() + cantidad);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean hacer_pedido (Producto producto, int cantidad){
        if (producto.getTope_minimo()> producto.getCantidad_actual()){
            producto.setCantidad_actual(producto.getCantidad_actual() + cantidad);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean mostrar_estadisticas (){
        Producto mas_vendido = new Producto("nombre","supermercado",0,0,0);
        for (int i = 0; i < 4; i++){
            if(this.productos[i].getCantidad_vendida() > mas_vendido.getCantidad_vendida()){
                mas_vendido = this.productos[i];
            }
        }
        Producto menos_vendido = new Producto("nombre","supermercado",0,0,0);
        menos_vendido.setCantidad_vendida(999999999);
        for (int i = 0; i < 4; i++){
            if(this.productos[i].getCantidad_vendida() < mas_vendido.getCantidad_vendida()){
                menos_vendido = this.productos[i];
            }
        }
        if (mas_vendido.getCantidad_vendida()!= 0){
            System.out.println("Producto mas vendido: " + mas_vendido.getNombre());
        }else{
            System.out.println("En este momento no hay ningun producto con mas ventas que los demas");
        }
        if (menos_vendido.getCantidad_vendida()!= 999999999){
            System.out.println("Producto menos vendido: " + menos_vendido.getNombre());
        }else{
            System.out.println("En este momento no hay ningun producto con menos ventas que los demas");
        }
        System.out.println("Total de dinero obtenido por ventas: $" + this.valor_total_ventas);
        int total_unidades_vendidas = 0;
        for (int j = 0; j < 4; j++){
            total_unidades_vendidas = total_unidades_vendidas + this.productos[j].getCantidad_vendida();
        }
        if (total_unidades_vendidas != 0){
            System.out.println("Promedio de ventas: $" + (this.valor_total_ventas / total_unidades_vendidas));
        }else{
            System.out.println("No es posible mostrar promedio de ventas ya que aun no se han vendido productos");
        }
        return true;
    }
}
