/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Tipo;
import com.utp.incidencia.vista.JIFTipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class TipoController implements ActionListener {

    private Tipo tipo;
    private ArrayList<Tipo> tipos = new ArrayList<>();
    private JIFTipo frmTipo;

    public TipoController(JIFTipo frmTipo) {
        this.tipo = new Tipo();
        this.frmTipo = frmTipo;

    }

    public void iniciar() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmTipo.getBtnAgregar())) {
            
            
            
            
        }

    }

    public boolean validaCampos() {
        boolean checkEmpty = false;
        if (this.frmTipo.getTxtDescripcion().getText().isEmpty() || this.frmTipo.getTxtDesCorta().getText().isEmpty()) {
            checkEmpty = true;
        }
        return checkEmpty;
    }

    public void limpiar() {
        this.frmTipo.getTxtDescripcion().setText("");
        this.frmTipo.getTxtDesCorta().setText("");
        this.frmTipo.getBtnAgregar().setEnabled(true);
        this.frmTipo.getBtnEliminar().setEnabled(true);
    }

    public void inicarTabla(JTable tabla) {
        DefaultTableModel plantilla
                = (DefaultTableModel) tabla.getModel();
        int tam = plantilla.getRowCount();
        for (int i = tam - 1; i >= 0; i++) {
            plantilla.removeRow(i);
        }
    }

}
