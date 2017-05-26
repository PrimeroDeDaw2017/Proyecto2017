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
public class Tableta extends Producto{

    public Tableta(String marca, String modelo, int codigo_producto, String descripcion, double precio, int cantidad) {
        super(marca, modelo, codigo_producto, descripcion, precio, cantidad);
    }
    
    public Tableta(){
        super();
    }
    //Métodos
    public void mostrar() {
        super.mostrar();
    }
}
