/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Tipo;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class TipoController {

    public List<Tipo> tipos() {

        List<Tipo> tipos = Arrays.asList(new Tipo("INCIDENCIA"),
                new Tipo("REQUERIMIENTO"));
        return tipos;
    }

    public List<Tipo> agregar(Tipo t) {
        List<Tipo> tipos = tipos();
        tipos = Arrays.asList(t);
        return tipos;
    }

}
