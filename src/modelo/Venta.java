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
public class Venta {
    // id = DNI o CIF
    private String dni_empleado, id_cliente;
    private int codigo_producto, codigo_venta, cantidad_productos;
    private double importe;
    private Date fecha_venta;

    public Venta(String dni_empleado, String id_cliente, int codigo_producto, int cantidad_productos, double importe) {
        codigo_venta = (int) (Math.random() * 99999) + 10000;
        fecha_venta = new Date();
        
        this.dni_empleado = dni_empleado;
        
        this.id_cliente = id_cliente;
        this.codigo_producto = codigo_producto;
        this.cantidad_productos = cantidad_productos;
        this.importe = importe;
        
    }
    
    public Venta(String id_cliente, int codigo_producto, Producto pr, int cantidad_productos) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        try {
            codigo_venta = (int) (Math.random() * 99999) + 10000;
            fecha_venta = new Date();
        
            System.out.println("Introduce el DNI del empleado que realizará la venta: ");
            dni_empleado = teclado.readLine();
            // id = DNI o CIF
            this.id_cliente = id_cliente;
            this.codigo_producto = codigo_producto;
            this.cantidad_productos = cantidad_productos;
            importe = pr.getPrecio() * cantidad_productos;
        }
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, enchufalo!");
        }
        
    }

    //Getters
    public int getCodigo_venta() {
        return codigo_venta;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public String getid_cliente() {
        return id_cliente;
    }

    public double getImporte() {
        return importe;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }
    
    
    
    //Métodos
    public void generarRecibo(Cliente c) {
        if (c instanceof Particular) {
            //Ventana gráfica con el formato del ticket del particular.
        }
        else {
            if(c instanceof Empresario) {
                //Ventana gráfica con el formato de factura del empresario.
            }
        }
        
        //Posibilidad 1:
        //  Generar la ventana grafica con los formatos desde aqui.
        //Posibilidad 2:
        //  Pasarle a la ventana gráfica los datos por el return.
    }
}
