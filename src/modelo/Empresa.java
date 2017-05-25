/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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

    public Empresa(String cif, String direccion, String nombre) {
        this.cif = cif;
        this.direccion = direccion;
        this.nombre = nombre;
        clientes = new LinkedList <> ();
        productos = new ArrayList <> ();
        trabajadores = new LinkedList();
    }

    public Empresa (){
        this.cif = "X21342";
        this.direccion = "Poligono Insdustrial - Palencia";
        this.nombre = "Authentic Movil";
        clientes = new LinkedList <> ();
        productos = new ArrayList <> ();
        trabajadores = new LinkedList ();
        
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

  /*  public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }
*/
  
    public Producto consultar_producto(String cod) {
        Iterator i = productos.iterator();
        Producto p = null;
        while (i.hasNext()){
            p = (Producto) i.next();
            if(p.getCodigo_producto() == cod) {
                //p ya está guardado.
            }
            else  {
                p = null;
            }
        }
        return p;
    }
    
    public Trabajador consultar_trabajador(String dni) {
        Iterator i = trabajadores.iterator();
        Trabajador t = null;
        while (i.hasNext()){
            t = (Trabajador) i.next();
            if(t.getDni()== dni) {
                //p ya está guardado.
            }
            else  {
                t = null;
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
        t.mostrar();
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
        p.mostrar();
    }
    //

    
   /* public void alta_Trabajador (Producto p){}
    
    public void autenticar (){}
    
      public void ordenar(Producto p){}
    
    public void mostrarEmpleados (){}
    
    public void mostrarProductos (){} */
    
   
}
