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
public abstract class Trabajador {
    private String dni, nombre, apellidos, telefono, contraseña;
    private Date fecha_de_alta;

    public Trabajador(String dni, String nombre, String apellidos, String telefono, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.fecha_de_alta = new Date();
    }
    
    public Trabajador() {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        try {
            System.out.println("Introduce DNI: ");
            dni = teclado.readLine();
            System.out.println("Introduce el nombre: ");
            nombre = teclado.readLine();
            System.out.println("Introduce los apellidos: ");
            apellidos = teclado.readLine();
            System.out.println("Introduce el teléfono: ");
            telefono = teclado.readLine();
            System.out.println("Introduce la contraseña: ");
            contraseña = teclado.readLine();
            fecha_de_alta = new Date();
        } 
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, enchufalo!");
        }
    }
    
    //Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Date getFecha_de_alta() {
        return fecha_de_alta;
    }
    
    //Métodos
    public void mostrar() {
        System.out.println("El DNI es: " + dni);
        System.out.println("El nombre es: " + nombre);
        System.out.println("Los apellidos son: " + apellidos);
        System.out.println("El telefono es: " + telefono);
        System.out.println("La fecha de alta es: " + fecha_de_alta);
    }
    
    
    public Producto consultarProducto(Empresa e) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        Producto p = null;
        try {
            System.out.println("Introduce el código del producto: ");
            String cod = teclado.readLine();
            
            p = e.consultar_producto(cod);
        }
        catch (Exception ex){
            System.out.println("Error al leer datos.");
        }
        
        if (p == null) {
            System.out.println("No se ha encontrado el producto");
        }
        
        return p;
    }
    
    public void darAltaProducto (Empresa e){
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        String dni, nombre, apellidos, telefono, contraseña;
        Producto pr = null;
        int opcion = 0;
        
        try {
            do {
                System.out.println("¿Qué tipo de producto quieres añadir? Introduce el nº de la opción.");
                System.out.println("1. Móvil \n2. Tableta.");
                opcion = Integer.parseInt(teclado.readLine());
            }
            while(opcion !=1 && opcion !=2);
            if (opcion == 1){
                pr = new Movil();
            } 
            else {
                if (opcion == 2){
                    pr = new Tableta();
                }
            }
            
            if (pr != null){
                e.alta_Producto(pr);
            }
        }
        catch (Exception ex){
            System.out.println("Error al leer datos.");
        }
    }
    
    public void darBajaProducto (Producto pr, Empresa e){
        e.baja_Producto(pr);
    }
}
