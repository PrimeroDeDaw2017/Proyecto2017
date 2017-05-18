/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Venta {
    private String codigo_de_venta, dni_empleado, codigo_cliente;
    private double importe;
    private Date fecha_venta;

    public Venta(String codigo_de_venta, String dni_empleado, String codigo_cliente, double importe) {
        this.codigo_de_venta = codigo_de_venta;
        this.dni_empleado = dni_empleado;
        this.codigo_cliente = codigo_cliente;
        this.importe = importe;
        this.fecha_venta = new Date();
    }

    //Getters
    public String getCodigo_de_venta() {
        return codigo_de_venta;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public double getImporte() {
        return importe;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }
    
    
    //Métodos
    public void generarRecibo(Cliente c) {
        if (c instanceof Particular) {
            //Ventana gráfica con el formato del ticket del particular.
        }
        else {
            if(c instanceof Empresario) {
                //Ventana gráfica con el formato de factura del empresario.
            }
        }
        
        //Posibilidad 1:
        //  Generar la ventana grafica con los formatos desde aqui.
        //Posibilidad 2:
        //  Pasarle a la ventana gráfica los datos por el return.
    }
}
