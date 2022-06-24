/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public enum TipoDeOperacionBancaria {
    Retiro,Deposito,Transferencia;
    
    public static TipoDeOperacionBancaria getRetiro() {
        return Retiro;
    }

    public static TipoDeOperacionBancaria getDeposito() {
        return Deposito;
    }

    public static TipoDeOperacionBancaria getTransferencia() {
        return Transferencia;
    }
}
