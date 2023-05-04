/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utp.incidencia.vista;

/**
 *
 * @author Cesar
 */
public class JFPrincipal extends javax.swing.JFrame {

    public JFPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        opIncidencia = new javax.swing.JMenu();
        opNuevaIncidencia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        opSistema = new javax.swing.JMenuItem();
        opTipo = new javax.swing.JMenuItem();
        opArea = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        jMenuBar2.add(opIncidencia);

        jMenu4.setText("Configuración");

        opSistema.setText("Sistemas");
        opSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSistemaActionPerformed(evt);
            }
        });
        jMenu4.add(opSistema);

        opTipo.setText("Tipos");
        opTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTipoActionPerformed(evt);
            }
        });
        jMenu4.add(opTipo);

        opArea.setText("Area");
        opArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAreaActionPerformed(evt);
            }
        });
        jMenu4.add(opArea);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jIncidencia.show();
    }//GEN-LAST:event_opNuevaIncidenciaActionPerformed

    private void opAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAreaActionPerformed
        JIFArea jArea = new JIFArea();
        escritorio.add(jArea);
        jArea.show();
    }//GEN-LAST:event_opAreaActionPerformed

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
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem opArea;
    private javax.swing.JMenu opIncidencia;
    private javax.swing.JMenuItem opNuevaIncidencia;
    private javax.swing.JMenuItem opSistema;
    private javax.swing.JMenuItem opTipo;
    // End of variables declaration//GEN-END:variables
}