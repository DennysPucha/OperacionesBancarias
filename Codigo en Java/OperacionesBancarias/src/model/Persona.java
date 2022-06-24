/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public abstract class Persona {
    private String cedula;
    private String nombre;
    private String sexo;
    private Banco banco;
    
    public Persona() {
    }
    public Persona(String nombre, Banco banco) {
        this();
        this.nombre = nombre;
        this.banco = banco;
    }
        
    public Persona(String cedula, String nombre, String sexo) {
        this();
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona(String cedula, String nombre, String sexo, Banco banco) {
        this(cedula, nombre, sexo);
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.banco = banco;
    }
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", sexo=" + sexo + ", banco=" + banco + '}';
    }
    
    
}
