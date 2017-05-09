/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

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



    
}
