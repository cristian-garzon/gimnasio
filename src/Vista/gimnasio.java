package Vista;

import Modelo.JavaConexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class gimnasio extends javax.swing.JFrame {

    String nombre;
    String cedula;
    JavaConexion BD;

    public gimnasio() {
        initComponents();
        AsignarTransparencia();
        this.setSize(950, 550);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Logov1_opt.jpg")).getImage());
        this.repaint();
        AgregarPanel();
    }

    public void AgregarPanel() {
        contenedor_horario panel = new contenedor_horario();
        panel.setSize(750, 550);
        panel.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void AsignarTransparencia() {
        usuarios.setOpaque(false);
        usuarios.setBackground(new Color(0, 0, 0, 0));
        productos.setOpaque(false);
        productos.setBackground(new Color(0, 0, 0, 0));
        compra.setOpaque(false);
        compra.setBackground(new Color(0, 0, 0, 0));
        atras.setOpaque(false);
        atras.setBackground(new Color(0, 0, 0, 0));
        salir.setOpaque(false);
        salir.setBackground(new Color(0, 0, 0, 0));
        inventario.setOpaque(false);
        inventario.setBackground(new Color(0, 0, 0, 0));
        close_sesion.setOpaque(false);
        close_sesion.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        presentacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usuarios = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        productos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        compra = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        close_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        presentacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 750, 550));

        jPanel1.setBackground(new java.awt.Color(37, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      Menu de Opciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 161, 28));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 138, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 10));

        usuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuarios.setForeground(new java.awt.Color(255, 255, 255));
        usuarios.setText("Usuarios");
        usuarios.setToolTipText("");
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        jPanel1.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 188, 150, 10));

        productos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        productos.setForeground(new java.awt.Color(255, 255, 255));
        productos.setText("Productos");
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        jPanel1.add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 161, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 332, 150, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de Atención: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 161, 24));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("3194344312");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        compra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        compra.setForeground(new java.awt.Color(255, 255, 255));
        compra.setText("Comprar");
        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });
        jPanel1.add(compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, -1));

        atras.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 80, -1));

        salir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 80, -1));

        inventario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        inventario.setForeground(new java.awt.Color(255, 255, 255));
        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        jPanel1.add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 263, 150, 10));

        close_sesion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        close_sesion.setForeground(new java.awt.Color(255, 255, 255));
        close_sesion.setText("Cerrar Sesión");
        close_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(close_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 412, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        // TODO add your handling code here:
        listaU l1 = new listaU();
        l1.getcredenciales(nombre, cedula, BD);
        if (BD.estatus(nombre, cedula).equals("administrador")) {
            l1.mostrar_tabla_admin("");
        } else {
            l1.mostrar_tabla_empleado("");
        }
        l1.setSize(750, 550);
        l1.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(l1, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_usuariosActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
        productos p1 = new productos();
        p1.getcredenciales(nombre, cedula, BD);
        p1.mostrar_tabla("");
        p1.setSize(750, 550);
        p1.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p1, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_productosActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        // TODO add your handling code here:
        panel_comprar panel = new panel_comprar();
        panel.getcredenciales(nombre, cedula, BD);
        panel.Mostrar_productos("");
        panel.setSize(750, 550);
        panel.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_compraActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        AgregarPanel();
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir del programa?", "MENSAJE DE CONFIRMACION", JOptionPane.WARNING_MESSAGE);
        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }

    }//GEN-LAST:event_salirActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        inventario i1 = new inventario();
        i1.getcredenciales(nombre, cedula, BD);
        i1.mostrar_tabla("");
        i1.setSize(750, 550);
        i1.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(i1, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_inventarioActionPerformed

    private void close_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_sesionActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro de Cerrar Sesion?", "MENSAJE DE CONFIRMACION", JOptionPane.WARNING_MESSAGE);
        if (n == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            log login = new log();
            login.getBD(BD);
            login.setVisible(true);
            dispose();
        } else {

        }

    }//GEN-LAST:event_close_sesionActionPerformed

    public void getcredenciales(String nombre, String cedula, JavaConexion BD) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.BD = BD;
        presentacion.setText("BIENVENIDO " + nombre + " [" + BD.estatus(nombre, cedula) + "]");
        if (BD.estatus(nombre, cedula).equals("empleado")) {
            inventario.setEnabled(false);
            productos.setEnabled(false);
        }
    }

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
            java.util.logging.Logger.getLogger(gimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Aqui no se preocupen funciona igual, solo es para enviarlo como variable 
                gimnasio Gym = new gimnasio();
                Gym.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton close_sesion;
    private javax.swing.JButton compra;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel presentacion;
    private javax.swing.JButton productos;
    private javax.swing.JButton salir;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}
