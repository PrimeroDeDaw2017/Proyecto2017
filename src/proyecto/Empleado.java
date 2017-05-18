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
public class Empleado extends Trabajador{
    private String tipo_de_contrato;

    public Empleado(String dni, String nombre, String apellidos, String telefono, String contraseña, String tipo_de_contrato) {
        super(dni, nombre, apellidos, telefono, contraseña);
        this.tipo_de_contrato = tipo_de_contrato;
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
}
