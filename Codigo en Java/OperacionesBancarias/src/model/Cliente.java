/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public abstract class Cliente extends Persona{
    private String correo;
    private String numeroCuenta;
    private String numeroTelefono;

    public Cliente() {
    }

    
    public Cliente(String correo, String numeroCuenta, String numeroTelefono) {
        this();
        this.correo = correo;
        this.numeroCuenta = numeroCuenta;
        this.numeroTelefono = numeroTelefono;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", numeroCuenta=" + numeroCuenta + ", numeroTelefono=" + numeroTelefono + '}';
    }
    
}
