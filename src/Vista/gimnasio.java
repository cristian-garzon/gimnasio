package Vista;

import Modelo.JavaConexion;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class gimnasio extends javax.swing.JFrame {

    String nombre;
    String cedula;
    JavaConexion BD;

    public gimnasio() {
        initComponents();
        this.setSize(950, 550);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Logov1_opt.jpg")).getImage());
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        listar_usuarios = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        presentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("listar productos");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        listar_usuarios.setText("listar usuarios");
        listar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_usuariosActionPerformed(evt);
            }
        });
        jPanel1.add(listar_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        presentacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(505, 505, 505))
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 750, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_usuariosActionPerformed
        //if(BD.estatus(nombre, cedula).equals("administrador")){
        listaU l1 = new listaU();
        l1.getcredenciales(nombre, cedula, BD);
        if (BD.estatus(nombre, cedula).equals("administrador")) {
            l1.mostrar_tabla_admin();
        }
        else{
            l1.mostrar_tabla_empleado();
        }
        l1.setSize(750, 550);
        l1.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(l1, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        //}
    }//GEN-LAST:event_listar_usuariosActionPerformed

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
                new gimnasio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listar_usuarios;
    private javax.swing.JLabel presentacion;
    // End of variables declaration//GEN-END:variables
}
