/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Divisa {
    private TipoDeDivisa tipoDeDivisa;
    
    public Divisa() {
    }

    public Divisa(TipoDeDivisa tipoDeDivisa) {
        this.tipoDeDivisa = tipoDeDivisa;
    }

    public TipoDeDivisa getTipoDeDivisa() {
        return tipoDeDivisa;
    }

    public void setTipoDeDivisa(TipoDeDivisa tipoDeDivisa) {
        this.tipoDeDivisa = tipoDeDivisa;
    }

    @Override
    public String toString() {
        return "Divisa{" + "tipoDeDivisa=" + tipoDeDivisa + '}';
    }
    
    
}
