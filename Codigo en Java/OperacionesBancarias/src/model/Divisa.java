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
    private OperacionBancaria operacionBancaria;
    private Prestamo prestamo;
    
    public Divisa() {
    }

    public Divisa(TipoDeDivisa tipoDeDivisa) {
        this();
        this.tipoDeDivisa = tipoDeDivisa;
    }

    public Divisa(TipoDeDivisa tipoDeDivisa, OperacionBancaria operacionBancaria, Prestamo prestamo) {
        this(tipoDeDivisa);
        this.tipoDeDivisa = tipoDeDivisa;
        this.operacionBancaria = operacionBancaria;
        this.prestamo = prestamo;
    }
    public Float valorDeDivisa(Divisa divisa,Float cant){
        switch (divisa.getTipoDeDivisa()) {
            case Euro -> {
                return  cant*0.95f;
            }
            case Dolar -> {
                return cant*1f;
            }
            case YenJapones -> {
                return cant*135.21f;
            }
            case FrancoSuizo -> {
                return cant*0.96f;
            }
            case LibraEsterlina -> {
                return cant*0.82f;
            }
            default -> throw new AssertionError();
        }
    }
    
    public OperacionBancaria getOperacionBancaria() {
        return operacionBancaria;
    }

    public void setOperacionBancaria(OperacionBancaria operacionBancaria) {
        this.operacionBancaria = operacionBancaria;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    public TipoDeDivisa getTipoDeDivisa() {
        return tipoDeDivisa;
    }

    public void setTipoDeDivisa(TipoDeDivisa tipoDeDivisa) {
        this.tipoDeDivisa = tipoDeDivisa;
    }

    @Override
    public String toString() {
        return "Divisa{" + "tipoDeDivisa=" + tipoDeDivisa + ", operacionBancaria=" + operacionBancaria + ", prestamo=" + prestamo + '}';
    }

    
    
}
