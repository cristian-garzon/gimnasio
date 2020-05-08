package Vista;

import Modelo.JavaConexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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
        Agregar_usuario.setOpaque(false);
        Agregar_usuario.setBackground(new Color(0, 0, 0, 0));
        listar_usuarios1.setOpaque(false);
        listar_usuarios1.setBackground(new Color(0, 0, 0, 0));
        listar_productos1.setOpaque(false);
        listar_productos1.setBackground(new Color(0, 0, 0, 0));
        comprar.setOpaque(false);
        comprar.setBackground(new Color(0, 0, 0, 0));
        atras.setOpaque(false);
        atras.setBackground(new Color(0, 0, 0, 0));
        salir.setOpaque(false);
        salir.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        presentacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Agregar_usuario = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        listar_usuarios1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        listar_productos1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        listar_inventario = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

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

        Agregar_usuario.setBackground(new java.awt.Color(0, 0, 0));
        Agregar_usuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Agregar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_usuario.setText("Agregar Usuario");
        Agregar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 161, 10));

        listar_usuarios1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listar_usuarios1.setForeground(new java.awt.Color(255, 255, 255));
        listar_usuarios1.setText("Listar Usuarios");
        listar_usuarios1.setToolTipText("");
        listar_usuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_usuarios1ActionPerformed(evt);
            }
        });
        jPanel1.add(listar_usuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 188, 161, 10));

        listar_productos1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listar_productos1.setForeground(new java.awt.Color(255, 255, 255));
        listar_productos1.setText("Listar Productos");
        listar_productos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_productos1ActionPerformed(evt);
            }
        });
        jPanel1.add(listar_productos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 161, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 332, 161, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de Atención: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 161, 24));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("3194344312");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        comprar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comprar.setForeground(new java.awt.Color(255, 255, 255));
        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        jPanel1.add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, -1));

        atras.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 170, -1));

        salir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 170, -1));

        listar_inventario.setBackground(new java.awt.Color(0, 0, 0));
        listar_inventario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listar_inventario.setForeground(new java.awt.Color(255, 255, 255));
        listar_inventario.setText("listar inventario");
        listar_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_inventarioActionPerformed(evt);
            }
        });
        jPanel1.add(listar_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 263, 161, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_usuarioActionPerformed
        //Agregando la Funcionalidad del Boton
        AgregarUsuario agregar = new AgregarUsuario();
        agregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Agregar_usuarioActionPerformed

    private void listar_usuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_usuarios1ActionPerformed
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
    }//GEN-LAST:event_listar_usuarios1ActionPerformed

    private void listar_productos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_productos1ActionPerformed
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
    }//GEN-LAST:event_listar_productos1ActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        // TODO add your handling code here:
        panel_comprar panel = new panel_comprar();
        panel.getcredenciales(nombre, cedula, BD);
        panel.Mostrar_productos();
        panel.setSize(750, 550);
        panel.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_comprarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        AgregarPanel();
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void listar_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_inventarioActionPerformed
        inventario i1 = new inventario();
        i1.getcredenciales(nombre, cedula, BD);
        i1.mostrar_tabla("");
        i1.setSize(750, 550);
        i1.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(i1, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_listar_inventarioActionPerformed

    public void getcredenciales(String nombre, String cedula, JavaConexion BD) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.BD = BD;
        presentacion.setText("BIENVENIDO " + nombre + " [" + BD.estatus(nombre, cedula) + "]");
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
    private javax.swing.JButton Agregar_usuario;
    private javax.swing.JButton atras;
    private javax.swing.JButton comprar;
    private javax.swing.JPanel contenedor;
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
    private javax.swing.JButton listar_inventario;
    private javax.swing.JButton listar_productos1;
    private javax.swing.JButton listar_usuarios1;
    private javax.swing.JLabel presentacion;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
