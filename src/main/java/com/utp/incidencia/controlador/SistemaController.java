/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Sistema;
import com.utp.incidencia.vista.JIFSistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class SistemaController implements ActionListener {

    private Sistema sistema;
    private ArrayList<Sistema> sistemas;
    private JIFSistema frmSistema;
    private DefaultTableModel modelo;
    private String id;
    private boolean existe;

    public void iniciar() {
        frmSistema.getBtnAgregar().addActionListener(this);
        frmSistema.getBtnModificar().addActionListener(this);
        frmSistema.getBtnEliminar().addActionListener(this);
        frmSistema.getBtnListar().addActionListener(this);
        frmSistema.getBtnBuscar().addActionListener(this);
    }

    private boolean validaCampos() {
        boolean checkEmpty = false;
        if (this.frmSistema.getTxtDescripcion().getText().isEmpty() || this.frmSistema.getTxtDesCorta().getText().isEmpty()) {
            checkEmpty = true;
        }
        return checkEmpty;
    }

    private void limpiar() {
        this.frmSistema.getTxtId().setText("");
        this.frmSistema.getTxtDescripcion().setText("");
        this.frmSistema.getTxtDesCorta().setText("");

        this.frmSistema.getTxtDescripcion().setEnabled(false);
        this.frmSistema.getTxtDesCorta().setEnabled(false);

        this.frmSistema.getBtnAgregar().setEnabled(false);
        this.frmSistema.getBtnEliminar().setEnabled(false);
    }

    private void habilitarCampos() {
        this.frmSistema.getTxtDescripcion().setEnabled(true);
        this.frmSistema.getTxtDesCorta().setEnabled(true);

        this.frmSistema.getBtnModificar().setEnabled(true);
        this.frmSistema.getBtnAgregar().setEnabled(true);
        this.frmSistema.getBtnEliminar().setEnabled(true);
    }

    private void habilitarCampos2() {
        this.frmSistema.getTxtDescripcion().setEnabled(true);
        this.frmSistema.getTxtDesCorta().setEnabled(true);

        this.frmSistema.getBtnModificar().setEnabled(false);
        this.frmSistema.getBtnAgregar().setEnabled(true);
        this.frmSistema.getBtnEliminar().setEnabled(false);
    }

    private int obtenerPosicion(String id) {
        for (int i = 0; i < sistemas.size(); i++) {
            Sistema sis = sistemas.get(i);
            if (id.equalsIgnoreCase(sis.getId())) {
                return i;
            }
        }
        return -1;
    }
    
     private void inicarTabla() {
        modelo = (DefaultTableModel) frmSistema.getTbSistema().getModel();
        int filas = modelo.getRowCount();

        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < sistemas.size(); i++) {
            modelo.addRow(
                    new Object[]{
                        sistemas.get(i).getId(),
                        sistemas.get(i).getDesSistema(),
                        sistemas.get(i).getDesCorta()});
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(frmSistema.getBtnBuscar())) {
            if (frmSistema.getTxtId().getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Area registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
                frmSistema.getTxtId().requestFocus();
                frmSistema.getTxtId().setText("");
            } else {
                id = frmSistema.getTxtId().getText();
                existe = false;
                for (int i = 0; i < sistemas.size(); i++) {
                    sistema = sistemas.get(i);
                    if (id.equalsIgnoreCase(sistema.getId())) {
                        existe = true;
                        habilitarCampos();
                        frmSistema.getTxtId().setText(sistemas.get(i).getId());
                        frmSistema.getTxtDescripcion().setText(sistemas.get(i).getDesSistema());
                        frmSistema.getTxtDesCorta().setText(sistemas.get(i).getDesCorta());
                        break;
                    }
                }
                if (existe == false) {
                    JOptionPane.showMessageDialog(null, "Id: " + frmSistema.getTxtId().getText() + "  no encontrado", "Valida los Campos", 2);
                    habilitarCampos2();
                }
            }

        }

        if (e.getSource().equals(frmSistema.getBtnAgregar())) {
            if (validaCampos()) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                sistema = new Sistema(frmSistema.getTxtId().getText(), frmSistema.getTxtDescripcion().getText(), frmSistema.getTxtDesCorta().getText());
                sistemas.add(sistema);
                limpiar();
                JOptionPane.showMessageDialog(null, "Area registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (e.getSource().equals(frmSistema.getBtnModificar())) {
            if (validaCampos()) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                sistema.setDesSistema(frmSistema.getTxtDescripcion().getText());
                sistema.setDesCorta(frmSistema.getTxtDesCorta().getText());
                int posicion = obtenerPosicion(id);
                sistemas.set(posicion, sistema);
                JOptionPane.showMessageDialog(null, "Area actualizada", "Success", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }
        }

        if (e.getSource().equals(frmSistema.getBtnAgregar())) {
            id = frmSistema.getTxtId().getText();
            int posicion = obtenerPosicion(id);
            sistemas.remove(posicion);
            JOptionPane.showMessageDialog(null, "Registro eliminado", "Success", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }

        if (e.getSource().equals(frmSistema.getBtnListar())) {

            inicarTabla();
        }
    }

}
