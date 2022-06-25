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
public class Cliente extends Persona{
    private String correo;
    private String numeroCuenta;
    private String numeroTelefono;
    private TipoDeCliente tipodeCliente;
    private List<Recibo> reciboList;
    private Registro registro;
    private Cuenta cuenta;
            
            
    public Cliente() {
        reciboList=new LinkedList<>();
    }
    
    
    public Cliente(String correo, String numeroCuenta, String numeroTelefono) {
        this();
        this.correo = correo;
        this.numeroCuenta = numeroCuenta;
        this.numeroTelefono = numeroTelefono;
    }

    public Cliente(String numeroCuenta, String nombre, Banco banco) {
        super(nombre, banco);
        this.numeroCuenta = numeroCuenta;
    }

    public Cliente(TipoDeCliente tipodeCliente) {
        this();
        this.tipodeCliente = tipodeCliente;
    }

    public Cliente(String cedula, String nombre, String sexo, Banco banco) {
        super(cedula, nombre, sexo, banco);
    }

    public Cliente(String numeroCuenta, Cuenta cuenta) {
        this.numeroCuenta = numeroCuenta;
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
    public List<Recibo> getReciboList() {
        return reciboList;
    }

    public void setReciboList(List<Recibo> reciboList) {
        this.reciboList = reciboList;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }


    public TipoDeCliente getTipodeCliente() {
        return tipodeCliente;
    }

    public void setTipodeCliente(TipoDeCliente tipodeCliente) {
        this.tipodeCliente = tipodeCliente;
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
