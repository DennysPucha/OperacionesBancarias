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
        Empleado e1=new Empleado("Mateo", b1);
        Empleado e2=new Empleado("Oficinista", TipoDeContrato.Finito);
        Registro r1=new Registro("000", "1111");
        r1.getClienteList().add(c2);
        r1.getClienteList().add(c1);
        Cuenta cuenta1=new Cuenta(500.5f, true, "00111", c1);
        Cuenta cuenta2=new Cuenta(OrientacionDeCuenta.CuentaCorriente, c2);
        
        c1.setNombre("Juan");
        c2.setNombre("Pedro");
        
        cuenta1.setCantDinero(2000.0f);
        cuenta2.setCantDinero(500.0f);
        Solicitud s1=new Solicitud(c1, cuenta1, r1);
        Prestamo pres1=new Prestamo(50.000f,2,"De consumo");
        
        c1.setCuenta(cuenta1);
        c2.setCuenta(cuenta2);
        
        OperacionBancaria op1=new OperacionBancaria(TipoDeOperacionBancaria.Transferencia);
        Divisa d1=new Divisa(TipoDeDivisa.Euro, op1, pres1);
        
        System.out.println(e2);
        
        Boolean verificacion=r1.IngresarAlRegistro(c2, "nnnn");
     
        s1.solicitarTransferencia(c1, c2,verificacion, 200.0f,op1,d1);
        s1.solicitarRetiro(c2, verificacion, 300.0f);
        s1.SolicitarDeposito(c1, c2, 10.0f, verificacion,true);

        
    }
    
}
