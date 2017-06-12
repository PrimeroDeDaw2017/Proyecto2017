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
        Empresa empresa1 = new Empresa ("E12345678", "Poligono Insdustrial - Palencia", "Authentic Movil");
         
        Trabajador t1 = new Administrador ("12345678A", "Moha", "Ben", "12345", "aaa111!!!");
        Trabajador t2 = new Empleado ("X8013", "Ronald", "Sanchez", "12346", "aaa111!!!", "Indefinido");
        Administrador ref = (Administrador) t1;
        
        //Alta de 1 trabajador
        ref.darAltaTrabajador(empresa1);
        System.out.println("Debe mostrar 1 trabajador");
        empresa1.getTrabajadores();
        
        //Alta de 1 producto
        ref.darAltaProducto(empresa1);
        System.out.println("Deber mostrar 1 producto");
        empresa1.getProductos();
        
        // 100 € = Precio nuevo del producto dado de alta.
        ref.modificarPrecio(100,( ref.consultarProducto(empresa1) ), empresa1);
        System.out.println("El precio del producto debe ser 100.");
        empresa1.getProductos();
        
        // 2 = Cantidad a vender del producto dado de alta.
        t1.venderProducto(2, t1.consultarProducto(empresa1), empresa1);
        System.out.println("La cantidad disponible del producto debe ser 2 menos");
        empresa1.getProductos();
        
        //Mostrar ventas de t1
        //En caso de que sea admin: Historial de Ventas General
        //En caso de que sea empleado: Historial de Ventas Personal
        t1.verHistorialVentas(empresa1);
        
        //Baja del producto anterior.
        t1.darBajaProducto(( t1.consultarProducto(empresa1) ), empresa1);
        System.out.println("Debe mostrar 0 productos");
        empresa1.getProductos();
        
        //Baja del trabajador anterior
        ref.darBajaTrabajador(( ref.consultarTrabajador(empresa1) ), empresa1);
        System.out.println("Debe mostrar 0 trabajadores");
        empresa1.getTrabajadores();
        
        //Ventas generales
        empresa1.getVentas();
        
        //Clientes
        empresa1.getClientes();
    }
    
}
