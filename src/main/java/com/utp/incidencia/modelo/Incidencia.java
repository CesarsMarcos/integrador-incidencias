/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.modelo;

/**
 *
 * @author Cesar
 */
public class Incidencia {

    private String cdIncidencia, asunto, descripcion, prioridad, equipo, contacto, area, tipo;

    public Incidencia() {
    }

    public Incidencia(String cdIncidencia, String asunto, String descripcion, String prioridad, String equipo, String contacto, String area, String tipo) {
        this.cdIncidencia = cdIncidencia;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.equipo = equipo;
        this.contacto = contacto;
        this.area = area;
        this.tipo = tipo;
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

    public String getCdIncidencia() {
        return cdIncidencia;
    }

    public void setCdIncidencia(String cdIncidencia) {
        this.cdIncidencia = cdIncidencia;
    }

}
