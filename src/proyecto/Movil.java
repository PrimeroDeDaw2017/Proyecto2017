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
public class Movil extends Producto{
    private String cobertura;

    public Movil(String cobertura, String marca, String modelo, String codigo_producto, String descripcion, double precio, int cantidad) {
        super(marca, modelo, codigo_producto, descripcion, precio, cantidad);
        this.cobertura = cobertura;
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
