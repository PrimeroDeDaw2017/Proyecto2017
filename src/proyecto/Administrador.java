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
public class Administrador extends Trabajador{
    
    public Administrador(String dni, String nombre, String apellidos, String telefono, String contraseña) {
        super(dni, nombre, apellidos, telefono, contraseña);
    }
    
    public void mostrar() {
        super.mostrar();
    }
}
