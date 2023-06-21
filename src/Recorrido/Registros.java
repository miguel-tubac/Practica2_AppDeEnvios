/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recorrido;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Registros implements Serializable {
    public String vehiculo;
    public int distancia;
    public double monto;
    public String creacion;
    public String entrega;
    public String productos;

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public int getDistancia() {
        return distancia;
    }

    public double getMonto() {
        return monto;
    }

    public String getCreacion() {
        return creacion;
    }

    public String getEntrega() {
        return entrega;
    }

    public String getProductos() {
        return productos;
    }

    public Registros(String vehiculo, int distancia, double monto, String creacion, String entrega,String productos) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.monto = monto;
        this.creacion = creacion;
        this.entrega = entrega;
        this.productos = productos;
    }
    
     
}
