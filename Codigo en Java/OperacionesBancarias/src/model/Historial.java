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

public class Historial {
   private List<Solicitud> solicitudList;

    public Historial() {
        solicitudList=new LinkedList<>();
    }
   
    public Historial(List<Solicitud> solicitudList) {
        this();
        this.solicitudList = solicitudList;
    }
    public void generarHistorial(){
        for (int i = 0; i < this.solicitudList.size(); i++) {
            System.out.println(this.solicitudList.get(i).toString());   
        }
    } 

    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    
}
