/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ConexionBD;
import controlador.SQLAlmacen;
/**
 *
 * @author alumno
 */
public class SistemaAlmacen {
    
    public SistemaAlmacen() {
        ConexionBD.crearConexion();
    }
    
    public void descargarDatos(Empresa e) {
        SQLAlmacen.instancia().descargarDatos(e);
    }
    
    
    public void nuevoProducto(Producto p) {
        SQLAlmacen.instancia().crearP(p);
    }
    
    public void borrarProducto(Producto p) {
        SQLAlmacen.instancia().borrarP(p);
    }
    
    public Producto buscarProducto(String cod) {
        return SQLAlmacen.instancia().buscarProductoCod(cod);
    }

    
    public void nuevoTrabajador(Trabajador t) {
        SQLAlmacen.instancia().crearT(t);
    }
    
    public void borrarTrabajador(Trabajador t) {
        SQLAlmacen.instancia().borrarT(t);
    }
    
    public Trabajador buscarTrabajador(String dni) {
        return SQLAlmacen.instancia().buscarTrabajadorDNI(dni);
    }
    
    
    public void nuevoCliente(Cliente c) {
        SQLAlmacen.instancia().crearC(c);
    }
    
    
    public void nuevaVenta(Venta v) {
        SQLAlmacen.instancia().crearV(v);
    }
    
    public Venta buscarVenta(String dni) {
        return SQLAlmacen.instancia().buscarTrabajadorDNI(dni);
    }
    
    
    public void cerrar() {
        ConexionBD.desconectar();
    }
}
