package Vista;

import Modelo.JavaConexion;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class agregar_inventario extends javax.swing.JFrame {

    JavaConexion BD;
    inventario i1;

    public agregar_inventario() {
        initComponents();
        this.setSize(615, 442);
        this.setResizable(false);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        caracteristicas = new javax.swing.JTextArea();
        tipo_objeto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        estado = new javax.swing.JComboBox<>();
        unidades = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caracteristicas.setColumns(20);
        caracteristicas.setLineWrap(true);
        caracteristicas.setRows(5);
        jScrollPane1.setViewportView(caracteristicas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 140));

        tipo_objeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "maquina", "pesa", "barra", "limpieza", "computador" }));
        tipo_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_objetoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo_objeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 160, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Unidades:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tipo de objeto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jlabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlabel4.setText("Estado:");
        getContentPane().add(jlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Caracteristicas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setForeground(new java.awt.Color(0, 122, 204));
        salir.setText("X");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 20, 20));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "dañado", "en reparacion" }));
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 160, -1));
        getContentPane().add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 150, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        agregar.setText("agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getBD(JavaConexion BD, inventario i1) {
        this.BD = BD;
        this.i1 = i1;
    }
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
        i1.mostrar_tabla("");
    }//GEN-LAST:event_salirActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (vacio(nombre) + vacio(unidades) + vacio(caracteristicas) + numeros(unidades) == 4) {
            BD.inserti(nombre.getText().trim(), opcionTipo(tipo_objeto), caracteristicas.getText().trim(), opcionEstado(estado), Integer.parseInt(unidades.getText().trim()));
            this.setVisible(false);
            i1.mostrar_tabla("");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void tipo_objetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_objetoActionPerformed
    }//GEN-LAST:event_tipo_objetoActionPerformed
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
            java.util.logging.Logger.getLogger(agregar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_inventario().setVisible(true);
            }
        });
    }

    public int vacio(JTextArea x) {
        if (x.getText().trim() == "") {
            return 0;
        } else {
            return 1;
        }
    }

    public int vacio(JTextField x) {
        if (x.getText().trim() == "") {
            return 0;
        } else {
            return 1;
        }
    }

    public int numeros(JTextField x) {
        try {
            Integer.parseInt(x.getText().trim());
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hay datos que son invalidos");
            return 0;
        }
    }
    public String opcionTipo(JComboBox x) {
        switch (x.getSelectedIndex() + 1) {
            case 1:
                return "maquina";
            case 2:
                return "pesa";
            case 3:
                return "barra";
            case 4:
                return "limpieza";
            case 5:
                return "computadora";
            default:
                return "";
        }

    }

    public String opcionEstado(JComboBox x) {
        switch (x.getSelectedIndex() + 1) {
            case 1:
                return "activo";
            case 2:
                return "dañado";
            case 3:
                return "en reparacion";
            default:
                return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextArea caracteristicas;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> tipo_objeto;
    private javax.swing.JTextField unidades;
    // End of variables declaration//GEN-END:variables

}
