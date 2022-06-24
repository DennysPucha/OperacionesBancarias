/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Solicitud {
    private Cliente cliente;
    private Cuenta cuenta;
    private Registro registro;

    public Solicitud() {
    }
    
    public Solicitud(Cliente cliente, Cuenta cuenta, Registro registro) {
        this();
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.registro = registro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "cliente=" + cliente + ", cuenta=" + cuenta + ", registro=" + registro + '}';
    }
    
    
}
