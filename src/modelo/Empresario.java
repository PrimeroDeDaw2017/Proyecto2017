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
public class Empresario extends Cliente {
    
     private String cif;
    
    public Empresario(String cif,String codigoCliente, String nombre, String telefono, String email) {
        super(codigoCliente, nombre, telefono, email);
        
        this.cif=cif;  
    }
    
    public Empresario() {
        super();
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        try {
            System.out.println("Introduce el CIF: ");
            cif = teclado.readLine();
        } 
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, ¡enchufalo!");
        }
    }
    
    public void mostrar(){
        
        super.mostrar();
        
        System.out.println("El cif del empresario es :"+cif);
        
    }
    
    public String getCIF (){
        return cif;
    }
    
}
