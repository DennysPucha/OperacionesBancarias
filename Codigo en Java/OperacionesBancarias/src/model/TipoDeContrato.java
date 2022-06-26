/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public enum TipoDeContrato {
    Finito,Temporal,Fijo,Aprendizaje;
    
    public static TipoDeContrato getFinito() {
        return Finito;
    }

    public static TipoDeContrato getTemporal() {
        return Temporal;
    }

    public static TipoDeContrato getFijo() {
        return Fijo;
    }

    public static TipoDeContrato getAprendizaje() {
        return Aprendizaje;
    }
}
