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
    
    private String nombre;
    private String nomCorto;
    private int siguiente;
    
    private Area area;
    ArrayList<Area> areas = new ArrayList<>();
    private JIFAreas frmArea;
    
    public AreaController(JIFAreas frmArea) {
        this.area = new Area();
        this.frmArea = frmArea;
        this.siguiente = 0;
    }
    
    public void iniciar() {
        frmArea.getBtnAgregar().addActionListener(this);
        frmArea.getBtnModificar().addActionListener(this);
        frmArea.getBtnEliminar().addActionListener(this);
        frmArea.getBtnCancelar().addActionListener(this);
        frmArea.getBtnObtener().addActionListener(this);
        frmArea.getBtnListar().addActionListener(this);
        frmArea.getTxtId().setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        
        if (evt.getSource().equals(frmArea.getBtnAgregar())) {
            System.out.println("getBtnAgregar [area]");
            if (validaCampos()) {
                JOptionPane.showMessageDialog(frmArea, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Area a = new Area(frmArea.getTxtDescripcion().getText(), frmArea.getTxtDesCorta().getText());
                
                areas.add(a);
                limpiar();
                JOptionPane.showMessageDialog(frmArea, "Area registrada", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (evt.getSource().equals(frmArea.getBtnModificar())) {
            System.out.println("getBtnModificar [area]");
            if (validaCampos()) {
                JOptionPane.showMessageDialog(frmArea, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                
                Area xx = this.areas.get(Integer.parseInt(frmArea.getTxtId().getText()) - 1);
                
                System.out.println(xx.getDesArea());
                System.out.println(xx.getDesCorta());
                
                xx.setDesArea(frmArea.getTxtDescripcion().getText());
                xx.setDesCorta(frmArea.getTxtDesCorta().getText());
                
                limpiar();
                JOptionPane.showMessageDialog(frmArea, "Area actualizada", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (evt.getSource().equals(frmArea.getBtnObtener())) {
            System.out.println("getBtnObtener [area]");
            DefaultTableModel modelo = (DefaultTableModel) frmArea.getTbArea().getModel();
            if (frmArea.getTbArea().getSelectedRow() != -1) {
                int id = (Integer) modelo.getValueAt(frmArea.getTbArea().getSelectedRow(), 0);
                String des = (String) modelo.getValueAt(frmArea.getTbArea().getSelectedRow(), 1);
                String desCorta = (String) modelo.getValueAt(frmArea.getTbArea().getSelectedRow(), 2);
                
                frmArea.getTxtId().setText(String.valueOf(id));
                frmArea.getTxtDescripcion().setText(des);
                frmArea.getTxtDesCorta().setText(desCorta);
            } else {
                JOptionPane.showMessageDialog(frmArea, "Seleccione una fila primero", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (evt.getSource().equals(frmArea.getBtnListar())) {
            System.out.println("getBtnListar [area]");
            inicarTabla(frmArea.getTbArea());
            DefaultTableModel modelo = (DefaultTableModel) frmArea.getTbArea().getModel();
            for (int i = 0; i < areas.size(); i++) {
                modelo.addRow(new Object[]{i + 1, areas.get(i).getDesArea(), areas.get(i).getDesCorta()});
            }
        } else if (evt.getSource().equals(frmArea.getBtnCancelar())) {
            limpiar();
        }
    }
    
    public boolean validaCampos() {
        boolean checkEmpty = false;
        if (this.frmArea.getTxtDescripcion().getText().isEmpty() || this.frmArea.getTxtDesCorta().getText().isEmpty()) {
            checkEmpty = true;
        }
        return checkEmpty;
    }
    
    public void limpiar() {
        this.frmArea.getTxtDescripcion().setText("");
        this.frmArea.getTxtDesCorta().setText("");
        this.frmArea.getBtnAgregar().setEnabled(true);
        this.frmArea.getBtnEliminar().setEnabled(true);
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
