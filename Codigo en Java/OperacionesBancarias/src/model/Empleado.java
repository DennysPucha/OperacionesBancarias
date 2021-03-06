/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class Empleado extends Persona{
    private String cargo;
    private TipoDeContrato tipoDeContrato;

    public Empleado() {
    }

    public Empleado(String cargo, String cedula, String nombre, String sexo) {
        super(cedula, nombre, sexo);
        this.cargo = cargo;
    }

    public Empleado(String cargo, TipoDeContrato tipoDeContrato) {
        this();
        this.cargo = cargo;
        this.tipoDeContrato = tipoDeContrato;
    }
    
    
    public Empleado(String nombre, Banco banco) {
        super(nombre, banco);
    }

    public Empleado(String cedula, String nombre, String sexo) {
        super(cedula, nombre, sexo);
    }

    public Empleado(String cedula, String nombre, String sexo, Banco banco) {
        super(cedula, nombre, sexo, banco);
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public TipoDeContrato getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(TipoDeContrato tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    @Override
    public String toString() {
        return "Nombre: "+super.getNombre() + " Cargo: "+cargo + " Tipo de contrato: "+tipoDeContrato;
    }
    
    
}
