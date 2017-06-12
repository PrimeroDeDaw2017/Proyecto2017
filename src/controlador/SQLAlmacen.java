/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import modelo.Movil;
import modelo.Tableta;
import modelo.Producto;
import modelo.Empresa;
/**
 *
 * @author alumno
 */
public class SQLAlmacen {
    static SQLAlmacen instancia = null;
    
    public static SQLAlmacen instancia() {
        if (instancia == null) {
            instancia = new SQLAlmacen();
        }
        
        return instancia;
    }
    
    public void descargarDatos(Almacen a) {
        Animal an = null;
        Vegetal ve = null;
        // Nº de columna
        int i1 = 1;
        int i2 = 1;
        try {
            ResultSet rsi1 = ConexionBD.instancia().getStatement().executeQuery(
                "select * from productos_animales"
                );
            while (rsi1.next()) {
                //Cambiaremos de columna con el metodo absolute diciendole el nº.
                rsi1.absolute(i1);
                i1++;
                an = new Animal(rsi1.getString(5), rsi1.getString(6), rsi1.getString(1), rsi1.getString(2), rsi1.getDouble(3), rsi1.getString(4));                Producto p;
                p = an;
                a.addP(p);
            }
            
            ResultSet rsi2 = ConexionBD.instancia().getStatement().executeQuery(
                "select * from productos_vegetales"
                );
            while (rsi2.next()) {
                //Cambiaremos de columna con el metodo absolute diciendole el nº.
                rsi2.absolute(i2);
                i2++;
                ve = new Vegetal(rsi2.getString(5), rsi2.getString(6), rsi2.getString(1), rsi2.getString(2), rsi2.getDouble(3), rsi2.getString(4));
                
                Producto p;
                p = ve;
                a.addP(p);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void crear(Producto p) {        
        try {
            if(p instanceof Animal){
                Animal an;
                an = (Animal) p;
            ConexionBD.instancia().getStatement().execute(
                    "insert into productos_animales values (" +
                    "'" + p.getNombre()+ "'" + ", " +
                    "'" + p.getOrigen() + "'" + ", " +
                    Double.toString(p.getPrecio_compra()) + ", " +
                    "'" + p.getProductor()+ "'" + ", " +
                    "'" + an.getTipo_alimento()+ "'" + ", " +
                    "'" + an.getAlimentacion()+ "'" + ", " +
                    Double.toString(p.calcularPVP()) + ")"
                );
            }
            if(p instanceof Vegetal){
                Vegetal ve;
                ve = (Vegetal) p;
            ConexionBD.instancia().getStatement().execute(
                    "insert into productos_vegetales values (" +
                    "'" + p.getNombre()+ "'" + ", " +
                    "'" + p.getOrigen() + "'" + ", " +
                    Double.toString(p.getPrecio_compra()) + ", " +
                    "'" + p.getProductor()+ "'" + ", " +
                    "'" + ve.getDestino()+ "'" + ", " +
                    "'" + ve.getTipo_cultivo()+ "'" + ", " +
                    Double.toString(p.calcularPVP()) + ")"
                );
            }
        } catch (Exception e) {
            System.out.println("Error al crear la herramienta");
        }        
    }
    /*
    public void borrar(Producto p) {
        try {
            ConexionBD.instancia().getStatement().execute(
                    "delete from herramientas where modelo=" + 
                    "'"+ p.getModelo() +"'"
                    );
        } catch (Exception e) {
            System.out.println("Error al borrar la herramienta");
        }
    }
    
    public Producto buscarPorNombre(String nombre) {
        Producto p = null;
        try {
            ResultSet rsi = ConexionBD.instancia().getStatement().executeQuery(
                "select nombre, marca, modelo, tamaño, precio, existencias from herramientas where nombre=" + 
                    "'" + nombre + "'" 
                );

            while (rsi.next()) {
                
                p = new Producto(rsi.getString(1), rsi.getString(2), rsi.getString(3), rsi.getDouble(4), rsi.getDouble(5), rsi.getInt(6));
            }          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return p;        
    }
    */
}
