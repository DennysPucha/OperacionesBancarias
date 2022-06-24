/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Prestamo {
    private String monto;
    private Integer plazo;
    private String tipoDePrestamo;

    public Prestamo() {
    }

    public Prestamo(String monto, Integer plazo, String tipoDePrestamo) {
        this();
        this.monto = monto;
        this.plazo = plazo;
        this.tipoDePrestamo = tipoDePrestamo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public String getTipoDePrestamo() {
        return tipoDePrestamo;
    }

    public void setTipoDePrestamo(String tipoDePrestamo) {
        this.tipoDePrestamo = tipoDePrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "monto=" + monto + ", plazo=" + plazo + ", tipoDePrestamo=" + tipoDePrestamo + '}';
    }
    
}
