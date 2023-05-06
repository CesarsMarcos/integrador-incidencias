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

    private Integer id;
    private String desArea;
    private String desCota;

    public Area() {
    }

    public Area(Integer id, String desArea, String desCota) {
        this.id = id;
        this.desArea = desArea;
        this.desCota = desCota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesArea() {
        return desArea;
    }

    public void setDesArea(String desArea) {
        this.desArea = desArea;
    }

    public String getDesCota() {
        return desCota;
    }

    public void setDesCota(String desCota) {
        this.desCota = desCota;
    }

}
