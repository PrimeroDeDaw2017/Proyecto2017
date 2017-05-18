/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author alumno
 */
public abstract class Trabajador {
    private String dni, nombre, apellidos, telefono, contraseña;
    private Date fecha_de_alta;

    public Trabajador(String dni, String nombre, String apellidos, String telefono, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.fecha_de_alta = new Date();
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
}
