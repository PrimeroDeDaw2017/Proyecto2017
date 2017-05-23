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
public class Cliente {
    
    private String codigoCliente, nombre, telefono, email, direccion;

    public Cliente(String codigoCliente, String nombre, String telefono, String email) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    public Cliente() {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        
        try {
            System.out.println("Introduce el código del cliente: ");
            codigoCliente = teclado.readLine();
            System.out.println("Introduce el nombre: ");
            nombre = teclado.readLine();
            System.out.println("Introduce el teléfono: ");
            telefono = teclado.readLine();
            System.out.println("Introduce el email: ");
            email = teclado.readLine();
            System.out.println("Introduce la dirección: ");
            direccion = teclado.readLine();
        }
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, enchufalo!");
        }
    }
    
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }


    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void mostrar(){
        
        System.out.println("El codigo cliente es :"+codigoCliente);
        System.out.println("El nombre del cliente es :"+nombre);
        System.out.println("El telefono del cliente es :"+telefono);
        System.out.println("El email del cliente es :"+email);
        System.out.println("La direccion del cliente es :"+direccion);
        
    }

    
}
