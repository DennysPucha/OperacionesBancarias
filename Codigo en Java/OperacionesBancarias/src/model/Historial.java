/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Dennys
 */

public class Historial {
   private List<Solicitud> solicitudList;

    public Historial(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }
   

    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    @Override
    public String toString() {
        return "Historial{" + "solicitudList=" + solicitudList + '}';
    }
   
}
