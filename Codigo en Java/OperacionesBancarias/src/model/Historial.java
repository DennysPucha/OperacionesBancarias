/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dennys
 */

public class Historial {
   private Solicitud solicitud;

    public Historial(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public String toString() {
        return "Historial{" + "solicitud=" + solicitud + '}';
    }
   
}
