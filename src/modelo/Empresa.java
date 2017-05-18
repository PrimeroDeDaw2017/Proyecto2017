/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
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
    private static int indice = 0;

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
  
    public void alta_Trabajador (Trabajador t){     
        trabajadores.add(t);       
        System.out.println("Se ha dado de alta el empleado");
        t.mostrar();
        }
    //

    
   /* public void alta_Trabajador (Producto p){}
    
    public void autenticar (){}
    
      public void ordenar(Producto p){}
    
    public void mostrarEmpleados (){}
    
    public void mostrarProductos (){} */
    
   
}
