/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Producto {
    
    private String nombre;
    private String tipo;
    private int cantidad_actual;
    private int tope_minimo;
    private double precio_base;
    private double precio_final;
    private int cantidad_vendida;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public void setTope_minimo(int tope_minimo) {
        this.tope_minimo = tope_minimo;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
    
    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public int getTope_minimo() {
        return tope_minimo;
    }

    public double getPrecio_base() {
        return precio_base;
    }
    
    public double getPrecio_final() {
        return precio_final;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public Producto(String nombre, String tipo, int cantidad_actual, int tope_minimo, double precio_base) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad_actual = cantidad_actual;
        this.tope_minimo = tope_minimo;
        this.precio_base = precio_base;
        this.cantidad_vendida = 0;
        switch (tipo){
            case "papeleria":
                this.precio_final = this.precio_base * 1.16;
                break;
            case "supermercado":
                this.precio_final = this.precio_base * 1.04;
                break;
            case "drogueria":
                this.precio_final = this.precio_base * 1.12;
                break;
        }
    }
    
    
    
}
