/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public enum TipoDeCliente {
    Beneficiario,Benefactor;
    
    public static TipoDeCliente getBeneficiario() {
        return Beneficiario;
    }

    public static TipoDeCliente getBenefactor() {
        return Benefactor;
    }
}
