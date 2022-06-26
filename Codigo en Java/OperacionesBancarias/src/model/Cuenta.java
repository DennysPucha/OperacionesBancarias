/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Cuenta {
    private Float cantDinero;
    private Integer id;
    private Boolean Intereses;
    private String nroCuenta;
    private OrientacionDeCuenta orientacionCuenta;
    private Registro registro;
    private Solicitud solicitud;
    private Cliente cliente;

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

    public Cuenta(OrientacionDeCuenta orientacionCuenta, Registro registro, Solicitud solicitud) {
        this();
        this.orientacionCuenta = orientacionCuenta;
        this.registro = registro;
        this.solicitud = solicitud;
    }

    public Cuenta(Float cantDinero, Integer id, Cliente cliente) {
        this();
        this.cantDinero = cantDinero;
        this.id = id;
        this.cliente = cliente;
    }

    public Cuenta(Float cantDinero, Boolean Intereses, String nroCuenta, Cliente cliente) {
        this();
        this.cantDinero = cantDinero;
        this.Intereses = Intereses;
        this.nroCuenta = nroCuenta;
        this.cliente = cliente;
    }

    public Cuenta(OrientacionDeCuenta orientacionCuenta, Cliente cliente) {
        this.orientacionCuenta = orientacionCuenta;
        this.cliente = cliente;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
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
        return "cantDinero=" + cantDinero + "  nroCuenta=" + nroCuenta;
    }



}
