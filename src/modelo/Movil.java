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
public class Movil extends Producto{
    private String cobertura;

    public Movil(String cobertura, String marca, String modelo, int codigo_producto, String descripcion, double precio, int cantidad) {
        super(marca, modelo, codigo_producto, descripcion, precio, cantidad);
        this.cobertura = cobertura;
    }
    
    public Movil() {
        super();
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader (entrada);
        try {
            System.out.println("Introduce el tipo de cobertura: ");
            cobertura = teclado.readLine();
        } 
        catch (IOException ex) {
            System.out.println("ERROR: Fallo al leer del teclado, ¡enchufalo!");
        }
    }
    //Getters
    public String getCobertura() {
        return cobertura;
    }
    
    //Métodos
    public void mostrar() {
        super.mostrar();
        System.out.println("El tipo de cobertura es: " + cobertura);
    }
}
