/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Incidencia;
import com.utp.incidencia.vista.JIFIncidencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class IncidenciaController implements ActionListener {

    private Incidencia incidencia;
    private ArrayList<Incidencia> incidencias;
    private JIFIncidencia frmIncidencia;

    private String id;
    private boolean existe;
    private DefaultTableModel modelo;

    public IncidenciaController(JIFIncidencia frmIncidencia) {
        this.frmIncidencia = frmIncidencia;
        incidencias = new ArrayList<>();
    }

    public void iniciar() {
        frmIncidencia.getBtnAgregar().addActionListener(this);
        frmIncidencia.getBtnModificar().addActionListener(this);
        frmIncidencia.getBtnBuscar().addActionListener(this);
        frmIncidencia.getBtnEliminar().addActionListener(this);
        frmIncidencia.getBtnListar().addActionListener(this);

    }

    public void limpiarCampos() {
        this.frmIncidencia.getTxtId().setText("");
        this.frmIncidencia.getTxtAsunto().setText("");
        this.frmIncidencia.getTxtContacto().setText("");
        this.frmIncidencia.getTxtDescripcion().setText("");
        this.frmIncidencia.getTxtEquipo().setText("");
        this.frmIncidencia.getTxtArea().setText("");
        this.frmIncidencia.getCboPrioridad().setSelectedIndex(0);
        this.frmIncidencia.getCboTipo().setSelectedIndex(0);

        this.frmIncidencia.getTxtAsunto().setEnabled(false);
        this.frmIncidencia.getTxtContacto().setEnabled(false);
        this.frmIncidencia.getTxtDescripcion().setEnabled(false);
        this.frmIncidencia.getTxtEquipo().setEnabled(false);
        this.frmIncidencia.getTxtArea().setEnabled(false);
        this.frmIncidencia.getCboPrioridad().setEnabled(false);
        this.frmIncidencia.getCboTipo().setEnabled(false);

        this.frmIncidencia.getTxtId().setEnabled(true);
        this.frmIncidencia.getBtnAgregar().setEnabled(false);
        this.frmIncidencia.getBtnModificar().setEnabled(false);
        this.frmIncidencia.getBtnEliminar().setEnabled(false);
        this.frmIncidencia.getBtnBuscar().setEnabled(true);

    }

    public boolean validaCampos() {
        boolean checkEmpty = false;
        if (this.frmIncidencia.getTxtAsunto().getText().isEmpty()
                || this.frmIncidencia.getTxtContacto().getText().isEmpty()
                || this.frmIncidencia.getTxtDescripcion().getText().isEmpty()
                || this.frmIncidencia.getTxtEquipo().getText().isEmpty()
                || this.frmIncidencia.getTxtArea().getText().isEmpty()
                || this.frmIncidencia.getCboPrioridad().getSelectedIndex() == 0
                || this.frmIncidencia.getCboTipo().getSelectedIndex() == 0) {
            checkEmpty = true;
        }
        return checkEmpty;
    }

    public void habilitarCampos() {
        this.frmIncidencia.getTxtAsunto().setEnabled(true);
        this.frmIncidencia.getTxtContacto().setEnabled(true);
        this.frmIncidencia.getTxtDescripcion().setEnabled(true);
        this.frmIncidencia.getTxtEquipo().setEnabled(true);
        this.frmIncidencia.getTxtArea().setEnabled(true);
        this.frmIncidencia.getCboPrioridad().setEnabled(true);
        this.frmIncidencia.getCboTipo().setEnabled(true);

        this.frmIncidencia.getBtnAgregar().setEnabled(false);
        this.frmIncidencia.getBtnBuscar().setEnabled(true);
        this.frmIncidencia.getBtnModificar().setEnabled(true);
        this.frmIncidencia.getBtnEliminar().setEnabled(true);

    }

    public void habilitarCampos2() {
        this.frmIncidencia.getTxtId().setEnabled(false);
        this.frmIncidencia.getTxtAsunto().setEnabled(true);
        this.frmIncidencia.getTxtContacto().setEnabled(true);
        this.frmIncidencia.getTxtDescripcion().setEnabled(true);
        this.frmIncidencia.getTxtEquipo().setEnabled(true);
        this.frmIncidencia.getTxtArea().setEnabled(true);
        this.frmIncidencia.getCboPrioridad().setEnabled(true);
        this.frmIncidencia.getCboTipo().setEnabled(true);

        this.frmIncidencia.getBtnAgregar().setEnabled(true);
        this.frmIncidencia.getBtnBuscar().setEnabled(false);
        this.frmIncidencia.getBtnEliminar().setEnabled(false);

    }

    private int obtenerPosicion(String id) {
        for (int i = 0; i < incidencias.size(); i++) {
            Incidencia in = incidencias.get(i);
            if (id.equalsIgnoreCase(in.getCdIncidencia())) {
                return i;
            }
        }
        return -1;
    }

    public void iniciarTabla() {
        modelo = (DefaultTableModel) frmIncidencia.getJTIncidencia().getModel();
        int filas = modelo.getRowCount();

        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < incidencias.size(); i++) {
            modelo.addRow(
                    new Object[]{i + 1,
                        incidencias.get(i).getDescripcion(),
                        incidencias.get(i).getAsunto(),
                        incidencias.get(i).getPrioridad(),
                        incidencias.get(i).getEquipo(),
                        incidencias.get(i).getContacto(),
                        incidencias.get(i).getTipo()});
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmIncidencia.getBtnBuscar())) {
            if (frmIncidencia.getTxtId().getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El id no puede estar vacio", "Valida los Campos", 2);
                frmIncidencia.getTxtId().setText("");
                frmIncidencia.getTxtId().requestFocus();
            } else {
                id = frmIncidencia.getTxtId().getText();
                existe = false;
                for (int i = 0; i < incidencias.size(); i++) {
                    incidencia = incidencias.get(i);
                    if (id.equalsIgnoreCase(incidencia.getCdIncidencia())) {
                        existe = true;
                        habilitarCampos();
                        frmIncidencia.getTxtId().setText(incidencia.getCdIncidencia());
                        frmIncidencia.getTxtArea().setText(incidencia.getArea());
                        frmIncidencia.getTxtAsunto().setText(incidencia.getAsunto());
                        frmIncidencia.getTxtContacto().setText(incidencia.getContacto());
                        frmIncidencia.getTxtDescripcion().setText(incidencia.getDescripcion());
                        frmIncidencia.getTxtEquipo().setText(incidencia.getEquipo());
                        frmIncidencia.getCboPrioridad().setSelectedItem(incidencia.getPrioridad());
                        frmIncidencia.getCboTipo().setSelectedItem(incidencia.getTipo());
                        break;
                    }
                }
                if (existe == false) {
                    JOptionPane.showMessageDialog(null, frmIncidencia.getTxtId().getText() + "  no encontrado", "Valida los Campos", 2);
                    habilitarCampos2();
                }
            }
        }

        if (e.getSource().equals(frmIncidencia.getBtnAgregar())) {
            if (validaCampos()) {
                JOptionPane.showMessageDialog(frmIncidencia, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                incidencia = new Incidencia(
                        frmIncidencia.getTxtId().getText(),
                        frmIncidencia.getTxtAsunto().getText(),
                        frmIncidencia.getTxtDescripcion().getText(),
                        frmIncidencia.getCboPrioridad().getSelectedItem().toString(),
                        frmIncidencia.getTxtEquipo().getText(),
                        frmIncidencia.getTxtContacto().getText(),
                        frmIncidencia.getTxtArea().getText(),
                        frmIncidencia.getCboTipo().getSelectedItem().toString()
                );
                incidencias.add(incidencia);
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Incidencia registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        if (e.getSource().equals(frmIncidencia.getBtnModificar())) {
            if (validaCampos()) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                incidencia = new Incidencia(
                        frmIncidencia.getTxtId().getText(),
                        frmIncidencia.getTxtAsunto().getText(),
                        frmIncidencia.getTxtDescripcion().getText(),
                        frmIncidencia.getCboPrioridad().getSelectedItem().toString(),
                        frmIncidencia.getTxtEquipo().getText(),
                        frmIncidencia.getTxtContacto().getText(),
                        frmIncidencia.getTxtArea().getText(),
                        frmIncidencia.getCboTipo().getSelectedItem().toString()
                );
                int posicion = obtenerPosicion(id);
                incidencias.set(posicion, incidencia);
                JOptionPane.showMessageDialog(null, "Incidencia modificada", "Success", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }
        }

        if (e.getSource().equals(frmIncidencia.getBtnEliminar())) {
            id = frmIncidencia.getTxtId().getText();
            int posicion = obtenerPosicion(id);
            incidencias.remove(posicion);
            JOptionPane.showMessageDialog(null, "Registro eliminado", "Success", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        }

        if (e.getSource().equals(frmIncidencia.getBtnListar())) {
            iniciarTabla();

        }

    }

}
