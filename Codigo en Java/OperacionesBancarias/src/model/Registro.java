/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dennys
 */
public class Registro {
    //private Cliente cliente;
    private String contrasenia;
    private String nroCuenta;
    private Cliente cliente;
    private Solicitud solicitud;
    private List<Cuenta> cuentaList;

    public Registro() {
        cuentaList=new LinkedList<>();
    }
    
    public Registro(String contrasenia, String nroCuenta) {
        this();
        this.contrasenia = contrasenia;
        this.nroCuenta = nroCuenta;
    }

    public Registro(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    @Override
    public String toString() {
        return "Registro{" + "contrasenia=" + contrasenia + ", nroCuenta=" + nroCuenta + ", cliente=" + cliente + ", solicitud=" + solicitud + '}';
    }



    
}
