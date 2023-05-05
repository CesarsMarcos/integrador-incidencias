/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.utp.incidencia.vista;

import com.utp.incidencia.controlador.IncidenciaController;
import com.utp.incidencia.modelo.Incidencia;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class JIFIncidencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFIncidencia
     */
    IncidenciaController incidenciaController = new IncidenciaController();
    DefaultTableModel modelo; //= (DefaultTableModel) tbIncidencias.getModel();
    JPanel msg = new JPanel();

    //
    public boolean checkEmpty() {
        boolean checkEmpty = false;
        if (this.txtAsunto.getText().isEmpty() || this.txtContacto.getText().isEmpty() || this.txtDescripcion.getText().isEmpty()
                || this.txtEquipo.getText().isEmpty() || txtArea.getText().isEmpty()
                || this.cboPrioridad.getSelectedIndex() == 0 || this.cboTipo.getSelectedIndex() == 0) {
            checkEmpty = true;
        }
        return checkEmpty;
    }

    public void limpiar() {
        this.txtId.setText("");
        this.txtAsunto.setText("");
        this.txtContacto.setText("");
        this.txtDescripcion.setText("");
        this.txtEquipo.setText("");
        this.txtArea.setText("");
        this.cboPrioridad.setSelectedIndex(0);
        this.cboTipo.setSelectedIndex(0);
    }

    public void llenarTabla() {
        modelo = new DefaultTableModel();//(DefaultTableModel) tbIncidencias.getModel();
        modelo.addColumn("ID");
        modelo.addColumn("ASUNTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRIORIDAD");
        modelo.addColumn("EQUIPO");
        modelo.addColumn("CONTACTO");
        modelo.addColumn("TIPO");

        List<Incidencia> lista = incidenciaController.incidencias();

        if (!lista.isEmpty()) {
            String[] fila = new String[7];

            for (int i = 0; i < lista.size(); i++) {
                fila[0] = String.valueOf(lista.get(i).getId());
                fila[1] = lista.get(i).getAsunto();
                fila[2] = lista.get(i).getDescripcion();
                fila[3] = lista.get(i).getPrioridad();
                fila[4] = lista.get(i).getEquipo();
                fila[5] = lista.get(i).getContacto();
                fila[6] = lista.get(i).getTipo();
                modelo.addRow(fila);
            }
            tbIncidencias.setModel(modelo);
        } else {
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Obtenemos el primer dato del renglon seleccionado

    }

    public JIFIncidencia() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        cboPrioridad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtContacto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbIncidencias = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnObtener = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Incidencias");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("REGISTRO DE INCIDENCIA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Asunto");

        txtArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEquipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tipo");

        cboTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Incidencia", "Requerimiento" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        cboPrioridad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Bajo", "Medio", "Alto" }));
        cboPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPrioridadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Contacto");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtContacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descripción");

        tbIncidencias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbIncidencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ASUNTO", "DESCRIPCION", "PRIORIDAD", "EQUIPO", "CONTACTO", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbIncidencias);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Equipo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prioridad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Área");

        txtAsunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsuntoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnObtener.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnObtener.setText("OBTENER");
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtArea)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(cboPrioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addGap(11, 11, 11)
                .addComponent(btnObtener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnObtener))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

    private void cboPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPrioridadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Incidencia incidencia = new Incidencia();
        incidencia.setId(Integer.parseInt(txtId.getText()));
        incidencia.setArea(txtArea.getText());
        incidencia.setAsunto(txtAsunto.getText());
        incidencia.setContacto(txtContacto.getText());
        incidencia.setDescripcion(txtDescripcion.getText());
        incidencia.setEquipo(txtEquipo.getText());
        incidencia.setPrioridad(cboPrioridad.getSelectedItem().toString());
        incidencia.setTipo(cboTipo.getSelectedItem().toString());

        if (checkEmpty()) {
            JOptionPane.showMessageDialog(msg, "Completa todos los campos!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            incidenciaController.agregar(incidencia);
            llenarTabla();
            limpiar();

            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiar();
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtId.setEditable(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsuntoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Incidencia incidencia = new Incidencia();
        incidencia.setId(Integer.parseInt(txtId.getText()));
        incidencia.setArea(txtArea.getText());
        incidencia.setAsunto(txtAsunto.getText());
        incidencia.setContacto(txtContacto.getText());
        incidencia.setDescripcion(txtDescripcion.getText());
        incidencia.setEquipo(txtEquipo.getText());
        incidencia.setPrioridad(cboPrioridad.getSelectedItem().toString());
        incidencia.setTipo(cboTipo.getSelectedItem().toString());

        incidenciaController.update(incidencia.getId(), incidencia);

        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtId.setEditable(true);
        llenarTabla();
        limpiar();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tbIncidencias.getSelectedRow() != -1) {
            String codigo = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 0);
            incidenciaController.eliminar(Integer.parseInt(codigo));
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(msg, "Seleccione un renglon primero", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed

        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtId.setEditable(false);

        if (tbIncidencias.getSelectedRow() != -1) {
            String codigo = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 0);
            String area = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 1);
            String asunto = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 2);
            String contacto = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 2);
            String descripcion = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 3);
            String equipo = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 4);
            String prioridad = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 5);
            String tipo = (String) modelo.getValueAt(tbIncidencias.getSelectedRow(), 6);

            txtId.setText(codigo);
            txtArea.setText(area);
            txtAsunto.setText(asunto);
            txtContacto.setText(contacto);
            txtDescripcion.setText(descripcion);
            txtEquipo.setText(equipo);
            cboPrioridad.setSelectedItem(prioridad);
            cboTipo.setSelectedItem(tipo);

        } else {
            JOptionPane.showMessageDialog(msg, "Seleccione una fila primero", "Success", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnObtenerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnObtener;
    private javax.swing.JComboBox<String> cboPrioridad;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbIncidencias;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
