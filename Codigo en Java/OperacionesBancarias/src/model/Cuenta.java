/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public abstract class Cuenta {
    private Float cantDinero;
    private Integer id;
    private Boolean Intereses;
    private String nroCuenta;
    private OrientacionDeCuenta orientacionCuenta;

    public Cuenta() {
    }

    public Cuenta(Float cantDinero, String nroCuenta) {
        this();
        this.cantDinero = cantDinero;
        this.nroCuenta = nroCuenta;
    }

    
    public Cuenta(Float cantDinero, Integer id, Boolean Intereses, String nroCuenta) {
        this(cantDinero, nroCuenta);
        this.cantDinero = cantDinero;
        this.id = id;
        this.Intereses = Intereses;
        this.nroCuenta = nroCuenta;
    }

    public Cuenta(Float cantDinero, Integer id, Boolean Intereses, String nroCuenta, OrientacionDeCuenta orientacionCuenta) {
        this(cantDinero, id, Intereses, nroCuenta);
        this.cantDinero = cantDinero;
        this.id = id;
        this.Intereses = Intereses;
        this.nroCuenta = nroCuenta;
        this.orientacionCuenta = orientacionCuenta;
    }
    

    public Float getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(Float cantDinero) {
        this.cantDinero = cantDinero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIntereses() {
        return Intereses;
    }

    public void setIntereses(Boolean Intereses) {
        this.Intereses = Intereses;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public OrientacionDeCuenta getOrientacionCuenta() {
        return orientacionCuenta;
    }

    public void setOrientacionCuenta(OrientacionDeCuenta orientacionCuenta) {
        this.orientacionCuenta = orientacionCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cantDinero=" + cantDinero + ", id=" + id + ", Intereses=" + Intereses + ", nroCuenta=" + nroCuenta + ", orientacionCuenta=" + orientacionCuenta + '}';
    }

}
