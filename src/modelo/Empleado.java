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
public class Empleado extends Trabajador{
    private String tipo_de_contrato;

    public Empleado(String dni, String nombre, String apellidos, String telefono, String contraseña, String tipo_de_contrato) {
        super(dni, nombre, apellidos, telefono, contraseña);
        this.tipo_de_contrato = tipo_de_contrato;
    }
    
    public Empleado() {
        super();
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        try {
            System.out.println("Tipo de contrato: ");
            tipo_de_contrato = teclado.readLine();
        } 
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, ¡enchufalo!");
        }
    }
    //Getters
    public String getTipo_de_contrato() {
        return tipo_de_contrato;
    }
    
    //Métodos
    public void mostrar() {
        super.mostrar();
        System.out.println("El tipo de contrato es: " + tipo_de_contrato);
    }

    @Override
    public void verHistorialVentas(Empresa e) {
        try {
            e.getVentasTrabajador(this);
        }
        catch (Exception ex) {
            System.out.println("Error");
        }
    }
}
