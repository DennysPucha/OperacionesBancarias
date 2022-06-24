/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public enum TipoDeDivisa {
    Dolar,Euro,YenJapones,LibraEsterlina,FrancoSuizo;
    
    public static TipoDeDivisa getDolar() {
        return Dolar;
    }

    public static TipoDeDivisa getEuro() {
        return Euro;
    }

    public static TipoDeDivisa getYenJapones() {
        return YenJapones;
    }

    public static TipoDeDivisa getLibraEsterlina() {
        return LibraEsterlina;
    }

    public static TipoDeDivisa getFrancoSuizo() {
        return FrancoSuizo;
    }
    
}
