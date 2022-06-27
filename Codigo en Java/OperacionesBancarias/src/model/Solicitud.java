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
    private OperacionBancaria operacionBancaria;
    
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

    public Solicitud(Historial historial, List<Cuenta> cuentaList, List<Prestamo> prestamoList) {
        this.historial = historial;
        this.cuentaList = cuentaList;
        this.prestamoList = prestamoList;
    }
    public void solicitarTransferencia(Cliente clienteBenefactor,Cliente clienteBeneficiario,Boolean ingresoAlRegistro,OperacionBancaria operacion,Divisa divisa){
    if(operacion.getTipoDeOperacionBancaria()==TipoDeOperacionBancaria.Transferencia)
        if (ingresoAlRegistro==false){
            System.out.println("Antes ingrese al Registro por favor");
        }
        else{
            if(clienteBenefactor.getTipodeCliente()==TipoDeCliente.Benefactor&&clienteBeneficiario.getTipodeCliente()==TipoDeCliente.Beneficiario){
                if(clienteBenefactor.getCuenta().getCantDinero()<operacion.getMonto()){
                System.out.println("No existe dinero suficiente");
                System.out.println("Cantidad de dinero del Cliente Benefactor -->"+clienteBenefactor.getNombre()+" "+clienteBenefactor.getCuenta().getCantDinero());
            }
            else{
                Float aux=divisa.valorDeDivisa(divisa, operacion.getMonto());
                Float aux1=divisa.valorDeDivisa(divisa, clienteBenefactor.getCuenta().getCantDinero());
                Float aux2=divisa.valorDeDivisa(divisa, clienteBeneficiario.getCuenta().getCantDinero());
                clienteBenefactor.getCuenta().setCantDinero(aux1-aux);
                clienteBeneficiario.getCuenta().setCantDinero(aux2+aux);
                System.out.println("TRANFERENCIA REALIZADA");
                System.out.println("Cantidad de dinero del Cliente Benefactor: "+clienteBenefactor.getNombre()+" "+clienteBenefactor.getCuenta().getCantDinero());
                System.out.println("Cantidad de dinero del Cliente Beneficiario: "+clienteBeneficiario.getNombre()+ " "+clienteBeneficiario.getCuenta().getCantDinero());
            } 
            }
            else{
                System.out.println("Los clientes no son del tipo Beneficario-Benefactor");
            }
        }
    else{
        System.out.println("Seleccione correctamente la operacion a realizar");
    }
    
}
    public void solicitarRetiro(Cliente cliente,Boolean ingresoAlRegistro,OperacionBancaria operacion,Divisa divisa){
        if(operacion.getTipoDeOperacionBancaria()==TipoDeOperacionBancaria.Retiro){
            if (ingresoAlRegistro==true) {
                if (cliente.getCuenta().getCantDinero()<operacion.getMonto()) {
                    System.out.println("No dispone de la cantidad de dinero necesaria");
                }
                else{
                    Float aux1=divisa.valorDeDivisa(divisa, cliente.getCuenta().getCantDinero());
                    Float aux=aux1-divisa.valorDeDivisa(divisa, operacion.getMonto());
                    cliente.getCuenta().setCantDinero(aux);
                    System.out.println("Cantidad disponible luego del retiro: "+ cliente.getCuenta().getCantDinero());
                }   
            }
            else{
                System.out.println("Antes ingrese al Registro por favor");
            }
        }
        else{
            System.out.println("Seleccione correctamente la operacion a realizar");
        }
    }
    public void SolicitarDeposito(Cliente benefactor,Cliente beneficiario,Boolean ingresoAlRegistro,Boolean BenefactorDispuestoAPagar,OperacionBancaria operacion,Divisa divisa){
        if (operacion.getTipoDeOperacionBancaria()==TipoDeOperacionBancaria.Deposito) {
            if (ingresoAlRegistro==true) {
                if(benefactor.getTipodeCliente()==TipoDeCliente.Benefactor&&beneficiario.getTipodeCliente()==TipoDeCliente.Beneficiario){
                if (BenefactorDispuestoAPagar==true) {
                    if (benefactor.getCuenta().getCantDinero()>operacion.getMonto()) {
                        Float aux1=divisa.valorDeDivisa(divisa, benefactor.getCuenta().getCantDinero());
                        Float aux2=divisa.valorDeDivisa(divisa, beneficiario.getCuenta().getCantDinero());
                        Float aux=divisa.valorDeDivisa(divisa, operacion.getMonto());
                        benefactor.getCuenta().setCantDinero(aux1-aux);
                        beneficiario.getCuenta().setCantDinero(aux2+aux);
                         System.out.println("Cantidad de dinero del Cliente Benefactor: "+ benefactor.getNombre()+" "+benefactor.getCuenta().getCantDinero());
                         System.out.println("Cantidad de dinero del Cliente Beneficiario: "+ beneficiario.getNombre()+ " "+beneficiario.getCuenta().getCantDinero());
                    }
                    else{
                        System.out.println("no cuenta con el dinero suficiente");
                    }
                    }
                }
                else{
                    System.out.println("Los clientes no son del tipo Beneficario-Benefactor");
                }
            }
            else{
                System.out.println("Antes ingrese al Registro por favor");
            }
        }
        else{
            System.out.println("Seleccione correctamente la operacion a realizar");
        }
    }
    public void solicitarPrestamo(Prestamo prestamo,Boolean verificiacion,Divisa divisa){
        if (verificiacion==true) {
            Float n=divisa.valorDeDivisa(divisa, prestamo.getMonto());
            Float aux1=prestamo.generarIntereses(n, prestamo.getPlazo());
            System.out.println("Intereses del prestamo: "+aux1);
            Float aux2=prestamo.generarMontoAPagar(n,prestamo.getPlazo());
            System.out.println("Monto a pagar: "+aux2);    
        }
        else{
            System.out.println("Antes ingrese al Registro por favor");
        }
    }

    public OperacionBancaria getOperacionBancaria() {
        return operacionBancaria;
    }

    public void setOperacionBancaria(OperacionBancaria operacionBancaria) {
        this.operacionBancaria = operacionBancaria;
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
        return "Solicitud{" + "cliente=" + cliente + ", cuenta=" + cuenta + ", registro=" + registro + ", recibo=" + recibo + ", operacionBancaria=" + operacionBancaria + '}';
    }

   

    
}
