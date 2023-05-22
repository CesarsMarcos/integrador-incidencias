/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Sistema;
import com.utp.incidencia.vista.JIFSistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class SistemaController implements ActionListener {

    Sistema sistema;
    JIFSistema frmSistema;

    public List<Sistema> sistemas() {

        List<Sistema> sistemas = Arrays.asList(new Sistema("SISTEMA 1"),
                new Sistema("SISTEMA 2"),
                new Sistema("SISTEMA 3"));
        return sistemas;
    }

    public List<Sistema> agregar(Sistema s) {
        List<Sistema> sistemas = this.sistemas();
        sistemas = Arrays.asList(s);
        return sistemas;
    }

    public void iniciar() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
