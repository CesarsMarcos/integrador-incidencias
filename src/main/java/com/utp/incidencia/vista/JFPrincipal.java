/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utp.incidencia.vista;

import com.utp.incidencia.controlador.AreaController;
import com.utp.incidencia.controlador.IncidenciaController;
import javax.swing.JMenu;

/**
 *
 * @author Cesar
 */
public class JFPrincipal extends javax.swing.JFrame {

    public JFPrincipal() {
        initComponents();
    }

    public JMenu getOpConfiguracion() {
        return opConfiguracion;
    }

    public void setOpConfiguracion(JMenu opConfiguracion) {
        this.opConfiguracion = opConfiguracion;
    }

    public JMenu getOpIncidencia() {
        return opIncidencia;
    }

    public void setOpIncidencia(JMenu opIncidencia) {
        this.opIncidencia = opIncidencia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        opIncidencia = new javax.swing.JMenu();
        opNuevaIncidencia = new javax.swing.JMenuItem();
        opConfiguracion = new javax.swing.JMenu();
        opSistema = new javax.swing.JMenuItem();
        opTipo = new javax.swing.JMenuItem();
        opArea = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar.add(jMenu1);

        opIncidencia.setText("Incidencia");
        opIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opIncidenciaActionPerformed(evt);
            }
        });

        opNuevaIncidencia.setText("Nuevo");
        opNuevaIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevaIncidenciaActionPerformed(evt);
            }
        });
        opIncidencia.add(opNuevaIncidencia);

        jMenuBar.add(opIncidencia);

        opConfiguracion.setText("Configuración");

        opSistema.setText("Sistemas");
        opSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSistemaActionPerformed(evt);
            }
        });
        opConfiguracion.add(opSistema);

        opTipo.setText("Tipos");
        opTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTipoActionPerformed(evt);
            }
        });
        opConfiguracion.add(opTipo);

        opArea.setText("Area");
        opArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAreaActionPerformed(evt);
            }
        });
        opConfiguracion.add(opArea);

        jMenuBar.add(opConfiguracion);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSistemaActionPerformed

        JIFSistema jSistema = new JIFSistema();
        escritorio.add(jSistema);
        jSistema.show();
    }//GEN-LAST:event_opSistemaActionPerformed

    private void opTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTipoActionPerformed
        JIFTipo jTipo = new JIFTipo();
        escritorio.add(jTipo);
        jTipo.show();
    }//GEN-LAST:event_opTipoActionPerformed

    private void opIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opIncidenciaActionPerformed
        JIFSistema jSistema = new JIFSistema();
        escritorio.add(jSistema);
        jSistema.show();

    }//GEN-LAST:event_opIncidenciaActionPerformed

    private void opNuevaIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevaIncidenciaActionPerformed
        JIFIncidencia jIncidencia = new JIFIncidencia();
        escritorio.add(jIncidencia);
        new IncidenciaController(jIncidencia).iniciar();
        jIncidencia.show();
    }//GEN-LAST:event_opNuevaIncidenciaActionPerformed

    private void opAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAreaActionPerformed
        JIFAreas jArea = new JIFAreas();
        escritorio.add(jArea);
        new AreaController(jArea).iniciar();
        jArea.show();
    }//GEN-LAST:event_opAreaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem opArea;
    private javax.swing.JMenu opConfiguracion;
    private javax.swing.JMenu opIncidencia;
    private javax.swing.JMenuItem opNuevaIncidencia;
    private javax.swing.JMenuItem opSistema;
    private javax.swing.JMenuItem opTipo;
    // End of variables declaration//GEN-END:variables
}
