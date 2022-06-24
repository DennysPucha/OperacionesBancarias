/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dennys
 */
public class Banco {
    
    private String direccion;
    private String nombre;
    private List<Persona> personaList;
    
    public Banco() {
        personaList=new LinkedList<>();
    }

    public Banco(String direccion, String nombre) {
        this();
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Banco{" + "direccion=" + direccion + ", nombre=" + nombre + '}';
    }
    
}
