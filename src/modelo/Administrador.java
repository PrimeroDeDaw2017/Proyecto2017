/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class Administrador extends Trabajador{
    
    public Administrador(String dni, String nombre, String apellidos, String telefono, String contraseña) {
        super(dni, nombre, apellidos, telefono, contraseña);
    }
    
    public Administrador() {
        super();
    }
    
    //Métodos
    public void mostrar() {
        super.mostrar();
    }
    
    public Trabajador consultarTrabajador(Empresa e) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        Trabajador t = null;
        try {
            System.out.println("Introduce el DNI: ");
            String dni = teclado.readLine();
            
            t = e.consultar_trabajador(dni);
        }
        catch (Exception ex){
            System.out.println("Error al leer datos.");
        }
        
        if (t == null) {
            System.out.println("No se ha encontrado el trabajador");
        }
        
        return t;
    }
    
    public void darAltaTrabajador (Empresa e){
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        String dni, nombre, apellidos, telefono, contraseña;
        Trabajador tr = null;
        int opcion = 0;
        
        try {
            do {
                System.out.println("¿Qué tipo de trajador quieres añadir? Introduce el nº de la opción.");
                System.out.println("1. Empleado \n2. Administrador.");
                opcion = Integer.parseInt(teclado.readLine());
            }
            while(opcion !=1 && opcion !=2);
            if (opcion == 1){
                tr = new Empleado();
            }
            else {
                if (opcion == 2){
                    tr = new Administrador();
                }
            }
            
            if (tr != null){
                e.alta_Trabajador(tr);
            }
        }
        catch (Exception ex){
            System.out.println("Error al leer datos.");
        }
    }
    
    public void darBajaTrabajador (Trabajador tr, Empresa e){
        e.baja_Trabajador(tr);
    }
}
