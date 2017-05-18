/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumno
 */
public class Particular extends Cliente {
    
    private String dni;
    
    public Particular(String dni,String codigoCliente, String nombre, String telefono, String email) {
        super(codigoCliente, nombre, telefono, email);
        
        this.dni=dni;
      
        
    }
    public void mostrar(){
        
        super.mostrar();
        
        System.out.println("El dni del cliente es :"+dni);
        
    }
    
    public String getDNI (){
        return dni;
    }
    
    
    
    
}
