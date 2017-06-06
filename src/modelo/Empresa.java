/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author alumno
 */
public class Empresa {
    
    private String cif, direccion, nombre;
    
    private LinkedList <Cliente> clientes;
    private ArrayList <Producto> productos;
    private LinkedList<Trabajador>trabajadores;
    private LinkedList<Venta>ventas;

    public Empresa(String cif, String direccion, String nombre) {
        this.cif = cif;
        this.direccion = direccion;
        this.nombre = nombre;
        clientes = new LinkedList <> ();
        productos = new ArrayList <> ();
        trabajadores = new LinkedList();
        ventas = new LinkedList();
    }

    public Empresa (){
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        try {
            System.out.println("Introduce el CIF: ");
            cif = teclado.readLine();
            System.out.println("Introduce la dirección: ");
            direccion = teclado.readLine();
            System.out.println("Introduce el nombre de la empresa: ");
            nombre = teclado.readLine();
            clientes = new LinkedList <> ();
            productos = new ArrayList <> ();
            trabajadores = new LinkedList ();
            ventas = new LinkedList();
        } 
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, enchufalo!");
        }
    }
    
    public String getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    //Metodos posible de mostrar Empleados / Productos / Clientes
  /*public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }
*/
  
    public Producto consultar_producto(int cod) {
        Iterator i = productos.iterator();
        Producto p = null;
        while (i.hasNext()){
            p = (Producto) i.next();
            if(p.getCodigo_producto() == cod) {
                //p ya está guardado.
            }
            else  {
                p = null;
                System.out.println("El producto buscado no existe.");
            }
        }
        return p;
    }
    
    public Trabajador consultar_trabajador(String dni) {
        Iterator i = trabajadores.iterator();
        Trabajador t = null;
        while (i.hasNext()){
            t = (Trabajador) i.next();
            if(t.getDni().equals(dni)) {
                //p ya está guardado.
            }
            else  {
                t = null;
                System.out.println("El trabajador buscado no existe.");
            }
        }
        return t;
    }
    
    public void alta_Trabajador (Trabajador t){
        if(trabajadores.contains(t)){
            t = null;
            System.out.println("El trabajador que quieres introducir ya existe.");
        }
        else {
            trabajadores.add(t);
            System.out.println("Se ha dado de alta el empleado");
            t.mostrar();
        }      
    }
    
    public void baja_Trabajador (Trabajador t){     
        trabajadores.remove(t);       
        System.out.println("Se ha dado de baja el empleado");
    }
    
    public void alta_Producto(Producto p) {
        if(productos.contains(p)){
            p = null;
            System.out.println("El trabajador que quieres introducir ya existe.");
        }
        else {
            productos.add(p);
            System.out.println("Se ha dado de alta un producto");
            p.mostrar();
        }      
    }
    
    public void baja_Producto(Producto p) {
        productos.remove(p);
        System.out.println("Se ha descatalogado el producto");
    }
    
    public void alta_Cliente (Cliente c){
        if(clientes.contains(c)){
            c = null;
            System.out.println("El cliente que quieres introducir ya existe.");
        }
        else {
            clientes.add(c);
            System.out.println("Se ha dado de alta el cliente");
            c.mostrar();
        }      
    }
    
    public void alta_Venta (Venta v){
        if(ventas.contains(v)){
            v = null;
            System.out.println("El cliente que quieres introducir ya existe.");
        }
        else {
            ventas.add(v);
            System.out.println("Se ha dado de alta el cliente");
            v.mostrar();
        }      
    }
    
    //Metodos de mostrar los arrays.
    public void mostrarTrabajadores() {
        System.out.println("\n======LISTA DE TRABAJADORES======");
        for (Trabajador t : trabajadores) {
            if (t instanceof Administrador) {
                System.out.println("Administrador:");
                t.mostrar();
                System.out.println("");
            }
            else {
                if (t instanceof Empleado) {
                    System.out.println("Empleado:");
                    t.mostrar();
                    System.out.println("");
                }
            }
        }
    }
    
    public void mostrarProductos() {
        System.out.println("\n======LISTA DE PRODUCTOS======");
        for (Producto p : productos) {
            if (p instanceof Movil) {
                System.out.println("Móvil:");
                p.mostrar();
                System.out.println("");
            }
            else {
                if (p instanceof Tableta) {
                    System.out.println("Tableta:");
                    p.mostrar();
                    System.out.println("");
                }
            }
        }
    }
    
    public void mostrarClientes() {
        System.out.println("\n======LISTA DE CLIENTES======");
        for (Cliente c : clientes) {
            if (c instanceof Particular) {
                System.out.println("Particular:");
                c.mostrar();
                System.out.println("");
            }
            else {
                if (c instanceof Empresario) {
                    System.out.println("Empresario:");
                    c.mostrar();
                    System.out.println("");
                }
            }
        }
    }
    
    public void mostrarVentas() {
        System.out.println("\n======LISTA DE VENTAS GENERAL======");
        for (Venta v : ventas) {
            v.mostrar();
            System.out.println("");
        }
    }
    
    public void mostrarVentas(Trabajador tr) {
        System.out.println("\n======LISTA DE VENTAS DE EMPLEADO======");
        for (Venta v : ventas) {
            if(v.getDni_empleado().equals(tr.getDni())){
                v.mostrar();
                System.out.println("");
            }
        }
    }
   /* public void alta_Trabajador (Producto p){}
    
    public void autenticar (){}
    
      public void ordenar(Producto p){}
    
    public void mostrarEmpleados (){}
    
    public void mostrarProductos (){} */
    
   
}
