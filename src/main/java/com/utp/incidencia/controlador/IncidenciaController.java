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
            System.out.println("Registro creado");
            incidencias.add(i);
        }
        //incidencias.add(i);
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

    public Incidencia findRecord(int idNumber) {
        for (Incidencia l : incidencias) {
            if (l.getId() == idNumber) {
                return l;
            }
        }
        return null;
    }

    public void update(int id, Incidencia i) {
        if (find(id)) {
            Incidencia rec = findRecord(id);
            rec.setId(i.getId());
            rec.setArea(i.getArea());
            rec.setAsunto(i.getAsunto());
            rec.setContacto(i.getContacto());
            rec.setDescripcion(i.getDescripcion());
            rec.setEquipo(i.getEquipo());
            rec.setPrioridad(i.getPrioridad());
            rec.setTipo(i.getTipo());
            System.out.println("Record Updated Successfully");
        } else {
            System.out.println("Record Not Found in the Student list");
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
            System.out.println("Registro eliminado de la lista");
            JOptionPane.showMessageDialog(msg, "Registro eliminado con éxito", "Success", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public List<Incidencia> incidencias() {
        System.out.println("tamanio " + incidencias.size());
        return incidencias;
    }

}
