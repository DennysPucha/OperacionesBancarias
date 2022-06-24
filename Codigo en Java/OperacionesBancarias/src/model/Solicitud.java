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
public class Solicitud {
    private Cliente cliente;
    private Cuenta cuenta;
    private Registro registro;
    private Recibo recibo;
    private Historial historial;
    private List<Cuenta> cuentaList;
    private List<Prestamo> prestamoList;
    private List<OperacionBancaria> operacionBancariaList;
    
    public Solicitud() {
        cuentaList=new LinkedList<>();
        prestamoList= new LinkedList<>();
    }
    
    public Solicitud(Cliente cliente, Cuenta cuenta, Registro registro) {
        this();
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.registro = registro;
    }

    public Solicitud(Cliente cliente, Cuenta cuenta, Registro registro, Recibo recibo) {
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.registro = registro;
        this.recibo = recibo;
    }

    public Solicitud(Historial historial, List<Cuenta> cuentaList, List<Prestamo> prestamoList, List<OperacionBancaria> operacionBancariaList) {
        this.historial = historial;
        this.cuentaList = cuentaList;
        this.prestamoList = prestamoList;
        this.operacionBancariaList = operacionBancariaList;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }

    public void setPrestamoList(List<Prestamo> prestamoList) {
        this.prestamoList = prestamoList;
    }

    public List<OperacionBancaria> getOperacionBancariaList() {
        return operacionBancariaList;
    }

    public void setOperacionBancariaList(List<OperacionBancaria> operacionBancariaList) {
        this.operacionBancariaList = operacionBancariaList;
    }
    
    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
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
        return "Solicitud{" + "cliente=" + cliente + ", cuenta=" + cuenta + ", registro=" + registro + ", recibo=" + recibo + ", historial=" + historial + '}';
    }

    
}
