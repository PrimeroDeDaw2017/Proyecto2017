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
        Empresa emp1 = new Empresa ("E12345678", "Poligono Insdustrial - Palencia", "Authentic Movil");
        if(emp1 == null) {
            //Empresa emp1 = new Empresa();
        }
         
        Trabajador t1 = new Administrador ("12345678A", "Moha", "Ben", "12345", "aaa111!!!");
        Trabajador t2 = new Empleado ("X8013", "Ronald", "Sanchez", "12346", "aaa111!!!", "Indefinido");
        Administrador ref = (Administrador) t1;
        
        ref.darAltaTrabajador(emp1);
        System.out.println("Debe mostrar 1 trabajador");
        emp1.mostrarTrabajadores();
        
        ref.darAltaProducto(emp1);
        System.out.println("Deber mostrar 1 producto");
        emp1.mostrarProductos();
        
        // 100 = Precio nuevo
        /*
        ref.modificarPrecio(100,( ref.consultarProducto(emp1) ), emp1);
        System.out.println("El precio del producto debe ser 100.");
        emp1.mostrarProductos();
        */
        // 2 = Cantidad
        t1.venderProducto(2, t1.consultarProducto(emp1), emp1);
        System.out.println("La cantidad disponible del producto debe ser 2 menos");
        emp1.mostrarProductos();
        /*
        t1.darBajaProducto(( t1.consultarProducto(emp1) ), emp1);
        System.out.println("Debe mostrar 0 productos");
        emp1.mostrarProductos();
        */
        /*
        ref.darBajaTrabajador(( ref.consultarTrabajador(emp1) ), emp1);
        System.out.println("Debe mostrar 0 trabajadores");
        emp1.mostrarTrabajadores();
        */
        emp1.mostrarVentas();
        emp1.mostrarClientes();
    }
    
}
