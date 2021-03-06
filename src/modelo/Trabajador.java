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
    private boolean modificado;

    public Trabajador(String dni, String nombre, String apellidos, String telefono, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.contraseña = contraseña;
        fecha_de_alta = new Date();
        modificado = true;
    }
    
    public Trabajador() {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        try {
            System.out.println("Introduce el DNI: ");
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
            modificado = true;
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
            int cod = Integer.parseInt(teclado.readLine());
            
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
    
    public void venderProducto (int cantidadV ,Producto pr, Empresa e) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        Cliente c = null;
        Venta v = null;
        
        String id_cliente = null;
        int opcion1 = 0;
        int opcion2 = 0;
        
        if (pr != null) {
            if (cantidadV <= pr.getCantidad()) {
                try {
                    do {
                        System.out.println("¿Quién realizará la compra? Introduce el nº de la opción.");
                        System.out.println("1. Nuevo Cliente \n2. Cliente Existente");
                        opcion1 = Integer.parseInt(teclado.readLine());
                    }
                    while(opcion1 !=1 && opcion1 !=2);
                    
                    if (opcion1 == 1){
                        do{
                            System.out.println("¿Que tipo de cliente crearemos? Introduce el nº de la opción.");
                            System.out.println("1. Particular \n2. Empresario");
                            opcion2 = Integer.parseInt(teclado.readLine());
                        }
                        while(opcion2 !=1 && opcion2 !=2);
                        
                        if (opcion2 == 1){
                            c = new Particular();
                        }
                        else{
                            if (opcion2 == 2){
                                c = new Empresario();
                            }
                        }
                        
                    }
                    else {
                        if (opcion1 == 2){
                            //No hay que dar de alta al cliente porque ya lo está.
                        }
                    }
                    
                    if (c != null){
                        e.alta_Cliente(c);
                    }
                    
                    try {
                        System.out.println("Introduce el DNI o CIF del comprador: ");
                        System.out.println("NOTA: Si es un cliente nuevo, puedes verlo arriba.");
                        System.out.println("Si no, debes saberlo o puedes consultar tus clientes disponibles.");
                        id_cliente = teclado.readLine();
                    }
                    catch (Exception ex){
                        System.out.println("Error al leer datos.");
                    }
                    
                    //Reducir cantidad de Stock
                    pr.setCantidad((pr.getCantidad()-cantidadV));
                    
                    //Creación de la venta simple.
                    v = new Venta(id_cliente, pr.getCodigo_producto(), pr, cantidadV);
                    e.alta_Venta(v);
                    
                    //Llamada al método de creación de la factura.
                    
                }
                catch (Exception ex){
                    System.out.println("Error al leer datos.");
                }
            }
        }
    }
    
    abstract public void verHistorialVentas(Empresa e);
}
