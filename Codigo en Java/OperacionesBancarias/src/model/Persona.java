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
public class Persona {
    private String cedula;
    private String nombre;
    private String sexo;
    private Banco banco;
    private List<Empleado> empleadoList;
    private List<Cliente> clienteList;
    
    public Persona() {
        this.clienteList=new LinkedList<>();
        this.empleadoList=new LinkedList<>();
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
    
    public void listarEmpleados(){
        for (int i = 0; i < this.empleadoList.size(); i++) {
            System.out.println(this.empleadoList.get(i).toString());   
        }
    }
    public void listarClientes(){
        for (int i = 0; i < this.clienteList.size(); i++) {
            System.out.println(this.clienteList.get(i).toString());   
        }
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

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }
    
    
    
}
