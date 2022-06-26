/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class OperacionBancaria {
    private TipoDeOperacionBancaria tipoDeOperacionBancaria;
    private Solicitud solicitud;
    private Divisa divisa;
    private Float monto;

    public OperacionBancaria() {
    }

    public OperacionBancaria(TipoDeOperacionBancaria tipoDeOperacionBancaria,Float monto) {
        this();
        this.tipoDeOperacionBancaria = tipoDeOperacionBancaria;
        this.monto=monto;
    }
    

    public OperacionBancaria(TipoDeOperacionBancaria tipoDeOperacionBancaria, Solicitud solicitud, Divisa divisa) {
        this.tipoDeOperacionBancaria = tipoDeOperacionBancaria;
        this.solicitud = solicitud;
        this.divisa = divisa;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
    
    public TipoDeOperacionBancaria getTipoDeOperacionBancaria() {
        return tipoDeOperacionBancaria;
    }

    public void setTipoDeOperacionBancaria(TipoDeOperacionBancaria tipoDeOperacionBancaria) {
        this.tipoDeOperacionBancaria = tipoDeOperacionBancaria;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Divisa getDivisa() {
        return divisa;
    }

    public void setDivisa(Divisa divisa) {
        this.divisa = divisa;
    }

    @Override
    public String toString() {
        return "Tipo de Operacion Bancaria: "+tipoDeOperacionBancaria;
    }
    

}
