/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.modelo;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class Area {

    private String desArea;
    private String desCorta;

    private ArrayList<Area> areas;

    public Area(ArrayList<Area> areas) {
        this.areas = areas;

    }

    public Area() {
        this.areas = new ArrayList<>();

    }

    public Area(String desArea, String desCorta) {
        this.desArea = desArea;
        this.desCorta = desCorta;
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

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public void addArea(Area area) {
        areas.add(area);
    }

    public void eliminar(int index) {
        this.areas.remove(index);
    }

    public Area getArea(int index) {
        return this.areas.get(index);
    }

    
    
}
