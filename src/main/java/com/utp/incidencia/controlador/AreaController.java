/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Area;
import com.utp.incidencia.vista.JIFAreas;
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
public class AreaController implements ActionListener {

    private Area area;
    private ArrayList<Area> areas;
    private JIFAreas frmArea;
    private DefaultTableModel modelo;
    private String id;
    private boolean existe;

    public AreaController(JIFAreas frmArea) {
        this.frmArea = frmArea;
        areas = new ArrayList<>();
    }

    public void iniciar() {
        frmArea.getBtnAgregar().addActionListener(this);
        frmArea.getBtnModificar().addActionListener(this);
        frmArea.getBtnEliminar().addActionListener(this);
        frmArea.getBtnListar().addActionListener(this);
        frmArea.getBtnBuscar().addActionListener(this);
    }

    private boolean validaCampos() {
        boolean checkEmpty = false;
        if (this.frmArea.getTxtDescripcion().getText().isEmpty() || this.frmArea.getTxtDesCorta().getText().isEmpty()) {
            checkEmpty = true;
        }
        return checkEmpty;
    }

    private void limpiar() {
        this.frmArea.getTxtId().setText("");
        this.frmArea.getTxtDescripcion().setText("");
        this.frmArea.getTxtDesCorta().setText("");

        this.frmArea.getTxtDescripcion().setEnabled(false);
        this.frmArea.getTxtDesCorta().setEnabled(false);

        this.frmArea.getBtnAgregar().setEnabled(false);
        this.frmArea.getBtnEliminar().setEnabled(false);
    }

    private void habilitarCampos() {
        this.frmArea.getTxtDescripcion().setEnabled(true);
        this.frmArea.getTxtDesCorta().setEnabled(true);

        this.frmArea.getBtnModificar().setEnabled(true);
        this.frmArea.getBtnAgregar().setEnabled(true);
        this.frmArea.getBtnEliminar().setEnabled(true);
    }

    private void habilitarCampos2() {
        this.frmArea.getTxtDescripcion().setEnabled(true);
        this.frmArea.getTxtDesCorta().setEnabled(true);

        this.frmArea.getBtnModificar().setEnabled(false);
        this.frmArea.getBtnAgregar().setEnabled(true);
        this.frmArea.getBtnEliminar().setEnabled(false);
    }

    private int obtenerPosicion(String id) {
        for (int i = 0; i < areas.size(); i++) {
            Area a = areas.get(i);
            if (id.equalsIgnoreCase(a.getId())) {
                return i;
            }
        }
        return -1;

    }

    private void inicarTabla() {
        modelo = (DefaultTableModel) frmArea.getTbArea().getModel();
        int filas = modelo.getRowCount();

        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < areas.size(); i++) {
            modelo.addRow(
                    new Object[]{
                        areas.get(i).getId(),
                        areas.get(i).getDesArea(),
                        areas.get(i).getDesCorta()});
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt
    ) {

        if (evt.getSource().equals(frmArea.getBtnBuscar())) {
            if (frmArea.getTxtId().getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frmArea, "Area registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
                frmArea.getTxtId().requestFocus();
                frmArea.getTxtId().setText("");
            } else {
                id = frmArea.getTxtId().getText();
                existe = false;
                for (int i = 0; i < areas.size(); i++) {
                    area = areas.get(i);
                    if (id.equalsIgnoreCase(area.getId())) {
                        existe = true;
                        habilitarCampos();
                        frmArea.getTxtId().setText(areas.get(i).getId());
                        frmArea.getTxtDescripcion().setText(areas.get(i).getDesArea());
                        frmArea.getTxtDesCorta().setText(areas.get(i).getDesCorta());
                        break;
                    }
                }
                if (existe == false) {
                    JOptionPane.showMessageDialog(null, "Id: " + frmArea.getTxtId().getText() + "  no encontrado", "Valida los Campos", 2);
                    habilitarCampos2();
                }
            }

        }

        if (evt.getSource().equals(frmArea.getBtnAgregar())) {
            if (validaCampos()) {
                JOptionPane.showMessageDialog(frmArea, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                area = new Area(frmArea.getTxtId().getText(), frmArea.getTxtDescripcion().getText(), frmArea.getTxtDesCorta().getText());
                areas.add(area);
                limpiar();
                JOptionPane.showMessageDialog(frmArea, "Area registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (evt.getSource().equals(frmArea.getBtnModificar())) {
            if (validaCampos()) {
                JOptionPane.showMessageDialog(frmArea, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                area.setDesArea(frmArea.getTxtDescripcion().getText());
                area.setDesCorta(frmArea.getTxtDesCorta().getText());
                int posicion = obtenerPosicion(id);
                areas.set(posicion, area);
                JOptionPane.showMessageDialog(frmArea, "Area actualizada", "Success", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }
        }

        if (evt.getSource().equals(frmArea.getBtnAgregar())) {
            id = frmArea.getTxtId().getText();
            int posicion = obtenerPosicion(id);
            areas.remove(posicion);
            JOptionPane.showMessageDialog(null, "Registro eliminado", "Success", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }

        if (evt.getSource().equals(frmArea.getBtnListar())) {

            inicarTabla();
        }

    }

}
