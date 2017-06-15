/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import modelo.Movil;
import modelo.Tableta;

import modelo.Particular;
import modelo.Empresario;

import modelo.Empleado;
import modelo.Administrador;
import modelo.Cliente;

import modelo.Producto;
import modelo.Empresa;
import modelo.Trabajador;

import modelo.Venta;
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
    
    public void descargarDatos(Empresa e) {
        Movil mo = null;
        Tableta ta = null;
        
        Empleado empl = null;
        Administrador ad = null;
        
        Particular pa = null;
        Empresario empr = null;
        
        Venta ve = null;
        
        Producto p = null;
        Trabajador t = null;
        Cliente c = null;
        // Nº de columna
        int i = 1;
        try {
            ResultSet rsi1 = ConexionBD.instancia().getStatement().executeQuery(
                "select * from productos"
                );
            while (rsi1.next()) {
                //Cambiaremos de columna con el metodo absolute diciendole el nº.
                rsi1.absolute(i);
                i++;
                if(rsi1.getInt(7)==1) {
                    // Moviles --> 1
                    mo = new Movil(rsi1.getString(6), rsi1.getString(1), rsi1.getString(2), rsi1.getInt(3), rsi1.getString(5), rsi1.getDouble(4), rsi1.getInt(8));
                    p = mo;
                } 
                else {
                    // Tabletas --> 2
                    ta = new Tableta(rsi1.getString(1), rsi1.getString(2), rsi1.getInt(3), rsi1.getString(5), rsi1.getDouble(4), rsi1.getInt(8));
                    p = ta;
                }
                e.addP(p);
            }
            
            i = 0;
            
            ResultSet rsi2 = ConexionBD.instancia().getStatement().executeQuery(
                "select * from productos_vegetales"
                );
            while (rsi2.next()) {
                //Cambiaremos de columna con el metodo absolute diciendole el nº.
                rsi2.absolute(i);
                i++;
                if(rsi2.getInt(8)==1) {
                    ad = new Administrador(rsi2.getString(1), rsi2.getString(3), rsi2.getString(4), rsi2.getString(6), rsi2.getString(5));
                    t = ad;
                }
                else {
                    empl = new Empleado(rsi2.getString(1), rsi2.getString(3), rsi2.getString(4), rsi2.getString(6), rsi2.getString(5), rsi2.getString(7));
                    t = empl;
                }
                e.addT(t);
            }
        } 
        catch (Exception exc) {
            exc.printStackTrace();
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
