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

    public OperacionBancaria() {
    }

    public OperacionBancaria(TipoDeOperacionBancaria tipoDeOperacionBancaria) {
        this();
        this.tipoDeOperacionBancaria = tipoDeOperacionBancaria;
    }

    public TipoDeOperacionBancaria getTipoDeOperacionBancaria() {
        return tipoDeOperacionBancaria;
    }

    public void setTipoDeOperacionBancaria(TipoDeOperacionBancaria tipoDeOperacionBancaria) {
        this.tipoDeOperacionBancaria = tipoDeOperacionBancaria;
    }

    @Override
    public String toString() {
        return "OperacionBancaria{" + "tipoDeOperacionBancaria=" + tipoDeOperacionBancaria + '}';
    }
    
}
