/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Empresa;
import modelo.Empleado;
import modelo.Administrador;
import modelo.Trabajador;

/**
 *
 * @author alumno
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa emp1 = new Empresa ("X21342", "Poligono Insdustrial - Palencia", "Authentic Movil");
        if(emp1 == null) {
            //Empresa emp1 = new Empresa();
        }
         
        Trabajador t1 = new Administrador ("X8012", "Moha", "Ben", "12345", "aaa111!!!");
        Trabajador t2 = new Empleado ("X8013", "Ronald", "Sanchez", "12346", "aaa111!!!", "Indefinido");
        Administrador ref = (Administrador) t1;
        
        ref.darAltaTrabajador(emp1);
        ref.darAltaProducto(emp1);
        
        t1.darBajaProducto(( t1.consultarProducto(emp1) ), emp1);
        ref.darBajaTrabajador(( ref.consultarTrabajador(emp1) ), emp1);
        
        ref.modificarPrecio(100,( ref.consultarProducto(emp1) ), emp1);
    
        t1.venderProducto(2, t1.consultarProducto(emp1), emp1);
    }
    
}
