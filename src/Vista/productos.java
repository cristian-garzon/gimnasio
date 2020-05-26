package Vista;

import Controlador.lista_producto;
import Modelo.JavaConexion;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class productos extends javax.swing.JPanel {

    JavaConexion BD;
    String nombre;
    String cedula;
    String tipo;
    long id_producto;

    public productos() {
        initComponents();
        peso.setEnabled(false);
        cantidad.setEnabled(false);
        precio.setEnabled(false);
        detalles.setEnabled(false);
        update.setEnabled(false);
        eliminar.setEnabled(false);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/mancuernas1.png"));
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        this.setOpaque(false);
        super.paint(g);
    }

    public void getcredenciales(String Nombre, String cedula, JavaConexion BD) {
        this.BD = BD;
        this.nombre = nombre;
        this.cedula = cedula;
        presentacion.setText("BIENVENIDO " + Nombre + " [" + BD.estatus(Nombre, cedula) + "]");
    }

    public void mostrar_tabla(String filtro) {
        lista_producto lista = new lista_producto();
        String titulos[] = {"ID PRODUCTO", "TIPO", "CANTIDAD", "PRECIO", "PESO", "DETALLES"};
        String informacion[][] = lista.listado(BD, filtro);
        tabla = new JTable(informacion, titulos);
        contenedor.setViewportView(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        presentacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filtrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTextArea();
        update = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        peso1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        contenedor.setViewportView(tabla);

        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 738, 155));

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 80, -1));

        consultar.setText("consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 90, -1));

        presentacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        presentacion.setForeground(new java.awt.Color(0, 0, 0));
        add(presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETALLES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 110, 30));

        filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtradoKeyReleased(evt);
            }
        });
        add(filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 160, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por tipo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CANTIDAD");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, 30));
        add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 150, -1));
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, -1));
        add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 150, -1));

        detalles.setColumns(20);
        detalles.setForeground(new java.awt.Color(0, 0, 0));
        detalles.setLineWrap(true);
        detalles.setRows(5);
        detalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                detallesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(detalles);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 260, 160));

        update.setText("modificar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 90, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 80, -1));

        peso1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        peso1.setForeground(new java.awt.Color(255, 255, 255));
        peso1.setText("PESO");
        add(peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtradoKeyReleased
        mostrar_tabla(filtrado.getText().trim());
    }//GEN-LAST:event_filtradoKeyReleased

    private void detallesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detallesKeyReleased

    }//GEN-LAST:event_detallesKeyReleased

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        BD.eliminarp(id_producto);
        mostrar_tabla("");
        peso.setEnabled(false);
        cantidad.setEnabled(false);
        precio.setEnabled(false);
        detalles.setEnabled(false);
        update.setEnabled(false);
        eliminar.setEnabled(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (vacio(cantidad) + vacio(precio) + detallesA(detalles) == 3) {
            System.out.println(cantidad.getText());
            BD.updatep(id_producto, tipo, Integer.parseInt(precio.getText().trim()), peso.getText().trim(), detalles.getText().trim(), Integer.parseInt(cantidad.getText().trim()));
            mostrar_tabla("");
            peso.setEnabled(false);
            cantidad.setEnabled(false);
            precio.setEnabled(false);
            detalles.setEnabled(false);
            update.setEnabled(false);
            eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarProducto agregar = new AgregarProducto();
        agregar.getBD(nombre, cedula, BD, this);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            cantidad.setEnabled(true);
            precio.setEnabled(true);
            detalles.setEnabled(true);
            update.setEnabled(true);
            eliminar.setEnabled(true);
            String declaracion = tabla.getValueAt(tabla.getSelectedRow(), 4).toString();
            System.out.println(declaracion);
            if (!declaracion.equals("")&&!declaracion.equals(" ")) {
                peso1.setVisible(true);
                peso.setVisible(true);
                peso.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
                peso.setEnabled(true);
            } else {
                peso1.setVisible(false);
                peso.setVisible(false);
            }
            tipo=tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
            cantidad.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            precio.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            detalles.setText(tabla.getValueAt(tabla.getSelectedRow(), 5).toString());
            id_producto = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_consultarActionPerformed
    public int detallesA(JTextArea x) {
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
            Long.parseLong(x.getText().trim());
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hay datos que son invalidos");
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton consultar;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JTextArea detalles;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField filtrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField peso;
    private javax.swing.JLabel peso1;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel presentacion;
    private javax.swing.JTable tabla;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
