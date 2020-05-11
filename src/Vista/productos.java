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
    long id_producto;

    public productos() {
        initComponents();
        peso.setEnabled(false);
        cantidad.setEnabled(false);
        precio.setEnabled(false);
        tipo.setEnabled(false);
        detalles.setEnabled(false);
        consultar.setVisible(false);
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/mancuernas1.png"));;
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        this.setOpaque(false);
        super.paint(g);
    }
    
    public void getcredenciales(String Nombre, String cedula, JavaConexion BD) {
        this.BD = BD;
        this.nombre = nombre;
        this.cedula = cedula;
        presentacion.setText("BIENVENIDO " + Nombre + " [" + BD.estatus(Nombre, cedula) + "]");
        if (BD.estatus(Nombre, cedula).equals("empleado")) {
            eliminar.setEnabled(false);
            modificar.setEnabled(false);
            consultar.setVisible(true);
        }
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
        modificar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        presentacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filtrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pesol = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTextArea();
        update = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

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
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        modificar.setText("modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        consultar.setText("consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        presentacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        jLabel2.setText("Filtrar por tipo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPO");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CANTIDAD");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 70, 30));

        pesol.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pesol.setForeground(new java.awt.Color(255, 255, 255));
        pesol.setText("PESO");
        add(pesol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 70, 30));
        add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 150, -1));
        add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, -1));
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 150, -1));
        add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 150, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 90));

        update.setText("modificar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtradoKeyReleased
        mostrar_tabla(filtrado.getText().trim());
    }//GEN-LAST:event_filtradoKeyReleased

    private void detallesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detallesKeyReleased

    }//GEN-LAST:event_detallesKeyReleased

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            BD.eliminarp(tabla.getValueAt(fila, 0).toString());
            mostrar_tabla("");
        } else {
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para eliminarla");
            
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            tipo.setEnabled(true);
            cantidad.setEnabled(true);
            precio.setEnabled(true);
            detalles.setEnabled(true);
            String declaracion = tabla.getValueAt(tabla.getSelectedRow(), 4).toString();
            if (!declaracion.equals("")) {
                pesol.setVisible(true);
                peso.setVisible(true);
                peso.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
                peso.setEnabled(true);
            } else {
                pesol.setVisible(false);
                peso.setVisible(false);
            }
            tipo.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            cantidad.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            precio.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            detalles.setText(tabla.getValueAt(tabla.getSelectedRow(), 5).toString());
            id_producto = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            tipo.setEnabled(true);
            cantidad.setEnabled(true);
            precio.setEnabled(true);
            detalles.setEnabled(true);
            String declaracion = tabla.getValueAt(tabla.getSelectedRow(), 4).toString();
            if (!declaracion.equals("")) {
                pesol.setVisible(true);
                peso.setVisible(true);
                peso.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
                peso.setEnabled(true);
            } else {
                pesol.setVisible(false);
                peso.setVisible(false);
            }
            tipo.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            cantidad.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            precio.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            detalles.setText(tabla.getValueAt(tabla.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (vacio(tipo) + vacio(cantidad) + vacio(precio) + detallesA(detalles) == 4) {
            BD.updatep(id_producto, tipo.getText().trim(), Integer.parseInt(precio.getText().trim()), peso.getText().trim(), detalles.getText().trim(), Integer.parseInt(cantidad.getText().trim()));
            mostrar_tabla("");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarProducto agregar = new AgregarProducto();
        agregar.getBD(nombre, cedula, BD, this);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField peso;
    private javax.swing.JLabel pesol;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel presentacion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tipo;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
