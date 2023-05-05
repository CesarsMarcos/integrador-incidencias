/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.modelo;

import java.util.List;

/**
 *
 * @author Cesar
 */
public class Incidencia {

    private int id;
    private String asunto, descripcion, prioridad, equipo, contacto, area, tipo;

    public Incidencia() {
    }

    public Incidencia(int id, String asunto, String descripcion, String prioridad, String equipo, String contacto, String area, String tipo) {
        this.id = id;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.equipo = equipo;
        this.contacto = contacto;
        this.area = area;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "asunto=" + asunto + ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", equipo=" + equipo + ", contacto=" + contacto + ", area=" + area + ", tipo=" + tipo + '}';
    }

}
