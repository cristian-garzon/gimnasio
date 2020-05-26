package Vista;

import Modelo.JavaConexion;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class AgregarProducto extends javax.swing.JFrame {

    public JTable tablaProducto;

    String nombre;
    String cedula;
    JavaConexion bd;
    productos productos;

    public AgregarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        i.setVisible(false);
        ti.setVisible(false);
        ca.setVisible(false);
        pr.setVisible(false);
        pe.setVisible(false);
        de.setVisible(false);
    }

    public void getBD(String nombre, String cedula, JavaConexion BD, productos p) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.bd = BD;
        this.productos = p;
    }

    public boolean validar() {
        if (txtId.getText().isEmpty()) {
            i.setVisible(true);
        } else {
            i.setVisible(false);
        }
        if ((opcionTipo(tipo) == "suplemento" || opcionTipo(tipo) == "mancuerna" || opcionTipo(tipo) == "barra" || opcionTipo(tipo) == "discos")) {
            if (txtPeso.getText().isEmpty()) {
                pe.setVisible(true);
            } else {
                pe.setVisible(false);
            }
        }
        else{
            txtPeso.setText(" ");
        }
        if (txtCantidad.getText().isEmpty()) {
            ca.setVisible(true);
        } else {
            ca.setVisible(false);
        }
        if (txtPrecio.getText().isEmpty()) {
            pr.setVisible(true);
        } else {
            pr.setVisible(false);
        }
        if (jtDetalles.getText().isEmpty()) {
            de.setVisible(true);
        } else {
            de.setVisible(false);
        }

        if (txtId.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtPeso.getText().isEmpty() || jtDetalles.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        salir1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lbDetalles = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lbTipo = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalles = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        pe = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        ti = new javax.swing.JLabel();
        ca = new javax.swing.JLabel();
        pr = new javax.swing.JLabel();
        de = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setForeground(new java.awt.Color(0, 122, 204));
        salir.setText("X");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Agregar Producto");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        salir1.setBackground(new java.awt.Color(255, 255, 255));
        salir1.setForeground(new java.awt.Color(0, 122, 204));
        salir1.setText("X");
        salir1.setBorder(null);
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        jPanel1.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCantidad.setBackground(new java.awt.Color(255, 255, 255));
        lbCantidad.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        lbCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lbCantidad.setText("Cantidad");
        jPanel2.add(lbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 100, -1));

        txtCantidad.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 150, -1));

        lbDetalles.setBackground(new java.awt.Color(255, 255, 255));
        lbDetalles.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        lbDetalles.setForeground(new java.awt.Color(0, 0, 0));
        lbDetalles.setText("Detalles");
        jPanel2.add(lbDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 20));

        txtPeso.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 150, -1));

        lbTipo.setBackground(new java.awt.Color(255, 255, 255));
        lbTipo.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTipo.setText("Tipo");
        jPanel2.add(lbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 100, -1));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setText("Id (Identificador)");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        txtId.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, -1));

        lbPrecio.setBackground(new java.awt.Color(255, 255, 255));
        lbPrecio.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lbPrecio.setText("Precio");
        jPanel2.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, -1));

        txtPrecio.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 150, -1));

        lbPeso.setBackground(new java.awt.Color(255, 255, 255));
        lbPeso.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        lbPeso.setForeground(new java.awt.Color(0, 0, 0));
        lbPeso.setText("Peso");
        jPanel2.add(lbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 140, 20));

        jtDetalles.setColumns(20);
        jtDetalles.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jtDetalles.setForeground(new java.awt.Color(0, 0, 0));
        jtDetalles.setLineWrap(true);
        jtDetalles.setRows(5);
        jtDetalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDetallesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtDetalles);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 270, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 0));
        btnGuardar.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        pe.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        pe.setForeground(new java.awt.Color(153, 0, 0));
        pe.setText("*Llenar Espacio");
        jPanel2.add(pe, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        i.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        i.setForeground(new java.awt.Color(153, 0, 0));
        i.setText("*Llenar Espacio");
        jPanel2.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        ti.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        ti.setForeground(new java.awt.Color(153, 0, 0));
        ti.setText("*Llenar Espacio");
        jPanel2.add(ti, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        ca.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        ca.setForeground(new java.awt.Color(153, 0, 0));
        ca.setText("*Llenar Espacio");
        jPanel2.add(ca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        pr.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        pr.setForeground(new java.awt.Color(153, 0, 0));
        pr.setText("*Llenar Espacio");
        jPanel2.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        de.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        de.setForeground(new java.awt.Color(153, 0, 0));
        de.setText("*Llenar Espacio");
        jPanel2.add(de, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "suplemento", "mancuerna", "barra", "discos", "camiseta", "esqueleto", "pantalon", "pantaloneta" }));
        tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoItemStateChanged(evt);
            }
        });
        tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoMouseClicked(evt);
            }
        });
        jPanel2.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        this.setVisible(false);
        productos.mostrar_tabla("");
    }//GEN-LAST:event_salir1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validar()) {
            if (bd.pk(Long.parseLong(txtId.getText().trim()), "ID_PRODUCTO", "PRODUCTOS", "ID_PRODUCTO")) {
                bd.insertarProducto(Integer.parseInt(txtId.getText().trim()),
                        opcionTipo(tipo),
                        Integer.parseInt(txtCantidad.getText().trim()),
                        Integer.parseInt(txtPrecio.getText().trim()),
                        txtPeso.getText().trim(), jtDetalles.getText().trim());
                JOptionPane.showMessageDialog(null, "Producto Agregado", "Agregando Producto", JOptionPane.INFORMATION_MESSAGE);

                txtId.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
                txtPeso.setText("");
                jtDetalles.setText("");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "identificador duplicado");
            }
        } else {

        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    public String opcionTipo(JComboBox x) {
        switch (x.getSelectedIndex() + 1) {
            case 1:
                return "suplemento";
            case 2:
                return "mancuerna";
            case 3:
                return "barra";
            case 4:
                return "discos";
            case 5:
                return "camiseta";
            case 6:
                return "esqueleto";
            case 7:
                return "pantalon";
            case 8:
                return "pantaloneta";
            default:
                return "";
        }

    }
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume(); //Desecha lo que no esta entre el rango
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
    }//GEN-LAST:event_txtPesoKeyTyped

    private void jtDetallesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetallesKeyTyped
    }//GEN-LAST:event_jtDetallesKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume(); //Desecha lo que no esta entre el rango
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume(); //Desecha lo que no esta entre el rango
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void tipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoMouseClicked

    }//GEN-LAST:event_tipoMouseClicked

    private void tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoItemStateChanged
        if (!(opcionTipo(tipo) == "suplemento" || opcionTipo(tipo) == "mancuerna" || opcionTipo(tipo) == "barra" || opcionTipo(tipo) == "discos")) {
            lbPeso.setVisible(false);
            txtPeso.setText("");
            txtPeso.setVisible(false);
        } else {
            txtPeso.setText(" ");
            lbPeso.setVisible(true);
            txtPeso.setVisible(true);
        }
    }//GEN-LAST:event_tipoItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel ca;
    private javax.swing.JLabel de;
    private javax.swing.JLabel i;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtDetalles;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbDetalles;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel pe;
    private javax.swing.JLabel pr;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    private javax.swing.JLabel ti;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
