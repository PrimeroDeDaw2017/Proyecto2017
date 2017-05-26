/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class Particular extends Cliente {
    
    private String dni;
    
    public Particular(String dni, String nombre, String telefono, String email) {
        super(nombre, telefono, email);
        
        this.dni=dni;
    }
    
    public Particular() {
        super();
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        try {
            System.out.println("Introduce el dni: ");
            dni = teclado.readLine();
        } 
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, ¡enchufalo!");
        }
    }
    
    public void mostrar(){
        
        super.mostrar();
        
        System.out.println("El dni del cliente es :"+dni);
        
    }
    
    public String getDNI (){
        return dni;
    }
    
    
    
    
}
