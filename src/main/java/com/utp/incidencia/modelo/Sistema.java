/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.modelo;

/**
 *
 * @author Cesar
 */
public class Sistema {

    private String id;
    private String desSistema;
    private String desCorta;

    public Sistema() {
    }

    public Sistema(String id, String desSistema, String desCorta) {
        this.id = id;
        this.desSistema = desSistema;
        this.desCorta = desCorta;
    }

    public Sistema(String desSistema) {
        this.desSistema = desSistema;
    }

    public String getDesSistema() {
        return desSistema;
    }

    public void setDesSistema(String desSistema) {
        this.desSistema = desSistema;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesCorta() {
        return desCorta;
    }

    public void setDesCorta(String desCorta) {
        this.desCorta = desCorta;
    }

}
