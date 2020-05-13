package Vista;

import Controlador.lista_inventario;
import Modelo.JavaConexion;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class inventario extends javax.swing.JPanel {

    JavaConexion BD;
    String Nombre, cedula;
    int id;
    String tipo_objeto;

    @Override
    public void paint(Graphics g) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo inventario.jpg"));
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        this.setOpaque(false);
        super.paint(g);
    }

    public inventario() {
        initComponents();
        this.setSize(750, 550);
        nombre.setEnabled(false);
        estado.setEnabled(false);
        caracteristicas.setEnabled(false);
        unidades.setEnabled(false);
        actualizar.setEnabled(false);
        eliminar.setEnabled(false);
    }

    public void mostrar_tabla(String filtro) {
        lista_inventario lista = new lista_inventario();
        String titulos[] = {"ID", "fecha de ingreso", "nombre", "tipo de objeto", "caracteristicas", "estado", "unidades"};
        String informacion[][] = lista.listado(BD, filtro);
        tabla = new JTable(informacion, titulos);
        contenedor.setViewportView(tabla);
    }

    public void getcredenciales(String Nombre, String cedula, JavaConexion BD) {
        this.BD = BD;
        this.Nombre = Nombre;
        this.cedula = cedula;
        presentacion.setText("BIENVENIDO " + Nombre + " [" + BD.estatus(Nombre, cedula) + "]");
        if (BD.estatus(Nombre, cedula).equals("empleado")) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        presentacion = new javax.swing.JLabel();
        contenedor = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        filtrado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        unidades = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caracteristicas = new javax.swing.JTextArea();
        estado = new javax.swing.JComboBox<>();
        actualizar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        presentacion.setBackground(new java.awt.Color(255, 255, 255));
        presentacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        presentacion.setForeground(new java.awt.Color(255, 255, 255));
        add(presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 30));

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

        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 170));

        filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtradoKeyReleased(evt);
            }
        });
        add(filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 150, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("filtrar por Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 150, -1));
        add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 150, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Caracteristicas:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unidades:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        caracteristicas.setColumns(20);
        caracteristicas.setLineWrap(true);
        caracteristicas.setRows(5);
        jScrollPane1.setViewportView(caracteristicas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, 160));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo", "en reparacion" }));
        add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 150, -1));

        actualizar.setText("actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));

        consultar.setText("consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

        agregar.setText("agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtradoKeyReleased
        mostrar_tabla(filtrado.getText().trim());
    }//GEN-LAST:event_filtradoKeyReleased

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            nombre.setEnabled(true);
            estado.setEnabled(true);
            caracteristicas.setEnabled(true);
            unidades.setEnabled(true);
            actualizar.setEnabled(true);
            eliminar.setEnabled(true);
            tipo_objeto=(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            nombre.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            caracteristicas.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
            unidades.setText(tabla.getValueAt(tabla.getSelectedRow(), 6).toString());
            id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if (vacio(nombre) + vacio(caracteristicas) + vacio(unidades) + numeros(unidades) == 4) {
            BD.updatei(nombre.getText().trim(), tipo_objeto, caracteristicas.getText().trim(), opcion(estado), Integer.parseInt(unidades.getText().trim()), id);
            mostrar_tabla("");
            filtrado.setText("");
            actualizar.setEnabled(false);
            eliminar.setEnabled(false);
            nombre.setEnabled(false);
            nombre.setText("");
            estado.setEnabled(false);
            caracteristicas.setEnabled(false);
            caracteristicas.setText("");
            unidades.setEnabled(false);
            unidades.setText("");
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        BD.deletei(id);
        mostrar_tabla("");
        filtrado.setText("");
        actualizar.setEnabled(false);
        eliminar.setEnabled(false);
        nombre.setEnabled(false);
        nombre.setText("");
        estado.setEnabled(false);
        caracteristicas.setEnabled(false);
        caracteristicas.setText("");
        unidades.setEnabled(false);
        unidades.setText("");
    }//GEN-LAST:event_eliminarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregar_inventario a1 = new agregar_inventario();
        a1.setVisible(true);
        a1.getBD(BD, this);
    }//GEN-LAST:event_agregarActionPerformed

    public int numeros(JTextField x) {
        try {
            Integer.parseInt(x.getText().trim());
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hay datos que son invalidos");
            return 0;
        }
    }

    public String opcion(JComboBox x) {
        switch (x.getSelectedIndex() + 1) {
            case 1:
                return "activo";
            case 2:
                return "inactivo";
            case 3:
                return "en reparacion";
            default:
                return "";
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
                return "computador";
            default:
                return "";
        }

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JTextArea caracteristicas;
    private javax.swing.JButton consultar;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JTextField filtrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel presentacion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField unidades;
    // End of variables declaration//GEN-END:variables
}
