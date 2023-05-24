/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.modelo;

/**
 *
 * @author Cesar
 */
public class Area {

    private String id;
    private String desArea;
    private String desCorta;

    public Area(String id, String desArea, String desCorta) {
        this.id = id;
        this.desArea = desArea;
        this.desCorta = desCorta;
    }

    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesArea() {
        return desArea;
    }

    public void setDesArea(String desArea) {
        this.desArea = desArea;
    }

    public String getDesCorta() {
        return desCorta;
    }

    public void setDesCorta(String desCorta) {
        this.desCorta = desCorta;
    }

}
