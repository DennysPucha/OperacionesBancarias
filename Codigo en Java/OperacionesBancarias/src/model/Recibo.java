/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dennys
 */
public class Recibo {
    private Cliente cliente;
    private Solicitud solicitud;

    public Recibo() {
    }

    
    public Recibo(Cliente cliente, Solicitud solicitud) {
        this();
        this.cliente = cliente;
        this.solicitud = solicitud;
    }
    public LocalDate obtenerFechaActual(){
        LocalDate fecha=LocalDate.now();
        return fecha;
    }
    public void obtenerHoraActual(){
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Tiempo realizada la operacion: "+dtf2.format(LocalDateTime.now()));
    }
    
    public void presentarRecibo(Cliente cliente, Solicitud solicitud){
        System.out.println("\n \n ");
        System.out.println("-----------Banco: "+cliente.getBanco().getNombre()+"------------");
        System.out.println("--------------------------------------");
        System.out.println("Fecha :"+this.obtenerFechaActual());
        this.obtenerHoraActual();
        System.out.println("--------------------------------------");
        System.out.println(""+solicitud.getOperacionBancaria());
        System.out.println("Monto: "+solicitud.getOperacionBancaria().getMonto());
        System.out.println("Nro de cuenta:  "+solicitud.getRegistro().getNroCuenta());
        System.out.println("Balance: "+solicitud.getCliente().getCuenta().getCantDinero());
        System.out.println("---------------------------------------");
        System.out.println("---Gracias por usar el programa---");

    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    

    @Override
    public String toString() {
        return "Recibo{" + "cliente=" + cliente + ", solicitud=" + solicitud + '}';
    }
    
}
