/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Incidencia;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class IncidenciaController {

    public List<Incidencia> incidencias() {

        List<Incidencia> incidencias = Arrays.asList(new Incidencia("PROBLEMA", "MI PC NO PRENDE", "ALTA", "PC_OFPSIS16", "123456789", "NEGOCIOS", "INCIDENCIA"),
                new Incidencia("PROBLEMA", "MI PC NO PRENDE", "ALTA", "PC_OFPSIS16", "123456789", "NEGOCIOS", "INCIDENCIA"),
                new Incidencia("PROBLEMA", "MI PC NO PRENDE", "ALTA", "PC_OFPSIS16", "123456789", "NEGOCIOS", "INCIDENCIA"));
        return incidencias;
    }

    public List<Incidencia> agregarIncidencia(Incidencia i) {
        List<Incidencia> incidencias = incidencias();
        incidencias = Arrays.asList(i);
        return incidencias;
    }

}
