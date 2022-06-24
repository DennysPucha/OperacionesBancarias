/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Recibo {
    private Cliente cliente;
    private Cliente solicitud;

    public Recibo() {
    }

    
    public Recibo(Cliente cliente, Cliente solicitud) {
        this();
        this.cliente = cliente;
        this.solicitud = solicitud;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Cliente solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public String toString() {
        return "Recibo{" + "cliente=" + cliente + ", solicitud=" + solicitud + '}';
    }
    
}
