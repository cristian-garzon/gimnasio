/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.JavaConexion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class eleccion_gym_db extends javax.swing.JFrame {

    JavaConexion BD;

    public eleccion_gym_db() {
        initComponents();
        this.setSize(1090, 600);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Logov1_opt.jpg")).getImage());
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/o.jpeg"));
        Icon fondo1 = new ImageIcon(img.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(fondo1);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oracle = new javax.swing.JButton();
        mysql = new javax.swing.JButton();
        postgresql = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(12, 12, 12));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Escoja una Base de Datos.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 77));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logov1_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        oracle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oracle_opt.png"))); // NOI18N
        oracle.setToolTipText("");
        oracle.setPreferredSize(new java.awt.Dimension(100, 50));
        oracle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oracleActionPerformed(evt);
            }
        });
        getContentPane().add(oracle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 250, 80));

        mysql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MYSQL_opt.png"))); // NOI18N
        mysql.setPreferredSize(new java.awt.Dimension(100, 50));
        mysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysqlActionPerformed(evt);
            }
        });
        getContentPane().add(mysql, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 250, 80));

        postgresql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Postgresql_opt.png"))); // NOI18N
        postgresql.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        postgresql.setContentAreaFilled(false);
        postgresql.setDefaultCapable(false);
        postgresql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresqlActionPerformed(evt);
            }
        });
        getContentPane().add(postgresql, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 250, 80));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 122, 480, 40));

        fondo.setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postgresqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresqlActionPerformed
        // TODO add your handling code here
        BD = new JavaConexion("postgres");
        BD.conectar();
        log log = new log();
        log.getBD(BD);
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_postgresqlActionPerformed

    private void mysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysqlActionPerformed
        //Agregando conexion con Mysql, probarlo
        BD = new JavaConexion("mysql");
        BD.conectar();
        log log = new log();
        log.getBD(BD);
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_mysqlActionPerformed

    private void oracleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oracleActionPerformed
        // TODO add your handling code here:
        BD = new JavaConexion("oracle");
        BD.conectar();
        log login = new log();
        login.getBD(BD);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_oracleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mysql;
    private javax.swing.JButton oracle;
    private javax.swing.JButton postgresql;
    // End of variables declaration//GEN-END:variables
}
