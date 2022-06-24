/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Registro {
    //private Cliente cliente;
    private String contrasenia;
    private String nroCuenta;

    public Registro() {
    }

    
    public Registro(String contrasenia, String nroCuenta) {
        this();
        this.contrasenia = contrasenia;
        this.nroCuenta = nroCuenta;
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
        return "Registro{" + "contrasenia=" + contrasenia + ", nroCuenta=" + nroCuenta + '}';
    }
    
}
