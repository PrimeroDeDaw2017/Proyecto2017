/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author alumno
 */
public abstract class Producto {
    private String marca, modelo, codigo_producto, descripcion;
    private double precio;
    private int cantidad;

    public Producto(String marca, String modelo, String codigo_producto, String descripcion, double precio, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo_producto = codigo_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Producto (){
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        try {
            System.out.println("Introduce la marca: ");
            marca = teclado.readLine();
            System.out.println("Introduce el modelo: ");
            modelo = teclado.readLine();
            System.out.println("Introduce el código del producto: ");
            codigo_producto = teclado.readLine();
            System.out.println("Introduce la descripcion: ");
            descripcion = teclado.readLine();
            System.out.println("Introduce el precio: ");
            precio = Double.parseDouble(teclado.readLine());
            System.out.println("Introduce la cantidad: ");
            cantidad = Integer.parseInt(teclado.readLine());
        }
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, enchufalo!");
        }
    }
    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    //Métodos
    public void mostrar() {
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El código de producto es: " + codigo_producto);
        System.out.println("La descripción es: " + descripcion);
        System.out.println("El precio es: " + precio + "€");
        System.out.println("La cantidad en stock: " + cantidad);
    }
    
    public void modificar_precio (Producto p) {
        
    }
}
