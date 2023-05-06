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

    private Integer id;
    private String desSistema;
    private String desCota;

    public Sistema() {
    }

    public Sistema(Integer id, String desSistema, String desCota) {
        this.id = id;
        this.desSistema = desSistema;
        this.desCota = desCota;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesCota() {
        return desCota;
    }

    public void setDesCota(String desCota) {
        this.desCota = desCota;
    }

}
