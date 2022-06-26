/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */
public class main {

  
    public static void main(String[] args) {
        Banco b1=new Banco("000", "Bancosur");
        Cliente c1=new Cliente(TipoDeCliente.Benefactor);
        Cliente c2= new Cliente(TipoDeCliente.Beneficiario);
        c1.setBanco(b1);
        c1.setCorreo("dd.a@gmail.com");
        c2.setBanco(b1);
        c2.setCorreo("aa.z@gmail.com");
        
        
        Persona p1=new Persona();
        Empleado e1=new Empleado("Mateo", b1);
        e1.setCargo("de campo");
        e1.setTipoDeContrato(TipoDeContrato.Temporal);
        Empleado e2=new Empleado("Oficinista", TipoDeContrato.Finito);
        e2.setNombre("Samuel");
        Registro r1=new Registro("000", "1110001100");
        r1.getClienteList().add(c2);
        r1.getClienteList().add(c1);
        Cuenta cuenta1=new Cuenta(500.5f, true, "00111", c1);
        Cuenta cuenta2=new Cuenta(OrientacionDeCuenta.CuentaCorriente, c2);
        cuenta2.setNroCuenta("010110");
        c1.setNombre("Juan");
        c2.setNombre("Pedro");
        
        cuenta1.setCantDinero(2000.0f);
        cuenta2.setCantDinero(500.0f);
        Solicitud s1=new Solicitud(c1, cuenta1, r1);
        Solicitud s2=new Solicitud(c2, cuenta2, r1);
        Solicitud s3=new Solicitud(c2, cuenta2, r1);
        Solicitud s4=new Solicitud(c1,cuenta1, r1);
        Prestamo pres1=new Prestamo(500.0f,2,"De consumo");
        Recibo recibo1=new Recibo(c2, s1);
        
        c1.setCuenta(cuenta1);
        c2.setCuenta(cuenta2);
        
        OperacionBancaria op1=new OperacionBancaria(TipoDeOperacionBancaria.Transferencia,200.0f);
        OperacionBancaria op2=new OperacionBancaria(TipoDeOperacionBancaria.Retiro,300.0f);
        OperacionBancaria op3=new OperacionBancaria(TipoDeOperacionBancaria.Deposito,10.0f);
        Divisa d1=new Divisa(TipoDeDivisa.Dolar, op1, pres1);
        
        
        System.out.println(e2);
        
        Boolean verificacion=r1.IngresarAlRegistro(c1, "nnnn");
     
        s1.solicitarTransferencia(c1, c2,verificacion,op1,d1);
        s2.solicitarRetiro(c2, verificacion,op2,d1);
        s3.SolicitarDeposito(c1, c2, verificacion,true,op3,d1);
        s4.solicitarPrestamo(pres1, verificacion,d1);
        
        s1.setOperacionBancaria(op1);
        s2.setOperacionBancaria(op2);
        s3.setOperacionBancaria(op3);
        
        
        Historial h1=new Historial();
        h1.getSolicitudList().add(s1);
        h1.getSolicitudList().add(s2);
        h1.getSolicitudList().add(s3);
        h1.getSolicitudList().add(s4);
        
        //recibo1.presentarRecibo(c2, s1);
        
        p1.getEmpleadoList().add(e1);
        p1.getEmpleadoList().add(e2);
        p1.listarEmpleados();
        
        p1.getClienteList().add(c1);
        p1.getClienteList().add(c2);
        p1.listarClientes();
        
        h1.generarHistorial();
    }
    
}
