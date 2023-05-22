/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Incidencia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Cesar
 */
public class IncidenciaController {

    JPanel msg = new JPanel();
    List<Incidencia> incidencias;

    public IncidenciaController() {
        incidencias = new ArrayList<>();
    }

    public void agregar(Incidencia i) {
        if (!find(i.getId())) {
            JOptionPane.showMessageDialog(msg, "Incidencia registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
            incidencias.add(i);
        }
    }

    public boolean find(int idNumber) {
        for (Incidencia i : incidencias) {
            if (i.getId() == idNumber) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    public Incidencia findRegistro(int idNumber) {
        for (Incidencia l : incidencias) {
            if (l.getId() == idNumber) {
                return l;
            }
        }
        return null;
    }

    public void modificar(int id, Incidencia i) {
        if (find(id)) {
            Incidencia rec = findRegistro(id);
            rec.setId(i.getId());
            rec.setArea(i.getArea());
            rec.setAsunto(i.getAsunto());
            rec.setContacto(i.getContacto());
            rec.setDescripcion(i.getDescripcion());
            rec.setEquipo(i.getEquipo());
            rec.setPrioridad(i.getPrioridad());
            rec.setTipo(i.getTipo());
            JOptionPane.showMessageDialog(msg, "Incidencia actualizada", "Success", JOptionPane.INFORMATION_MESSAGE);

        } else {
            System.out.println("No encontrado");
        }
    }

    public void eliminar(int id) {
        Incidencia recordDel = null;
        for (Incidencia ll : incidencias) {
            if (ll.getId() == id) {
                recordDel = ll;
            }
        }
        if (recordDel == null) {
            System.out.println("Id invalido");
        } else {
            incidencias.remove(recordDel);
            JOptionPane.showMessageDialog(msg, "Registro eliminado con éxito", "Success", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public List<Incidencia> incidencias() {
        return incidencias;
    }

}
