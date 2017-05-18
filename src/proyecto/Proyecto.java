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
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        Empresa emp1 = new Empresa ();
         
        Trabajador t1 = new Administrador ("X8012", "Moha", "Ben", "12345", "aaa111!!!");
        Trabajador t2 = new Empleado ("X8013", "Ronald", "Sanchez", "12346", "aaa111!!!", "Indefinido");
    
       
            Administrador ref = (Administrador) t1;
            
            ref.darAltaTrabajadores(t2);
        
        
        
        
        
    
    
    }
    
}
