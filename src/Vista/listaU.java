package Vista;

import Controlador.lista_usuarios;
import Modelo.JavaConexion;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class listaU extends javax.swing.JPanel {

    JavaConexion BD;
    String Nombre, cedula;
    long cedulaM;

    @Override
    public void paint(Graphics g) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondoGimnasio.jpg"));;
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        this.setOpaque(false);
        super.paint(g);
    }

    public void getcredenciales(String Nombre, String cedula, JavaConexion BD) {
        this.BD = BD;
        this.Nombre = Nombre;
        this.cedula = cedula;
        presentacion.setText("BIENVENIDO " + Nombre + " [" + BD.estatus(Nombre, cedula) + "]");
        if (BD.estatus(Nombre, cedula).equals("empleado")) {
            eliminar.setEnabled(false);
            modificar.setEnabled(false);
        }
    }

    public void mostrar_tabla_empleado(String filtro) {
        lista_usuarios lista = new lista_usuarios();
        String Titulos[] = {"NOMBRE", "TELEFONO", "CORREO", "ESTADO"};
        String informacion[][] = lista.listado_empleado(BD, filtro);
        tabla = new JTable(informacion, Titulos);
        contenedor.setViewportView(tabla);
    }

    public void mostrar_tabla_admin(String filtro) {
        lista_usuarios lista = new lista_usuarios();
        String Titulos[] = {"CEDULA", "NOMBRE", "TELEFONO", "CORREO", "DIRECCION", "ESTATUS", "TIPO USUARIO"};
        String informacion[][] = lista.listado_admin(BD, filtro);
        tabla = new JTable(informacion, Titulos);
        contenedor.setViewportView(tabla);
    }

    public listaU() {
        initComponents();
        this.setSize(750, 550);
        nombre.setEnabled(false);
        correo.setEnabled(false);
        telefono.setEnabled(false);
        direccion.setEnabled(false);
        estatus.setEnabled(false);
        tipo_usuario.setEnabled(false);
        update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipo_usuario = new javax.swing.JComboBox<>();
        estatus = new javax.swing.JComboBox<>();
        presentacion = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        filtrado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        contenedor.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 730, 120));

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, 30));

        modificar.setText("modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, 30));
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 220, -1));
        add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 220, -1));
        add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 220, -1));

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 170, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("tipo de usuario: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nombre: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("correo: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("telefono: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("direccion: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("estatus:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrado", "empleado", "cliente" }));
        tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_usuarioActionPerformed(evt);
            }
        });
        add(tipo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        add(estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        presentacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        presentacion.setForeground(new java.awt.Color(255, 255, 255));
        add(presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 370, 30));

        update.setText("modificar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtradoKeyReleased(evt);
            }
        });
        add(filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 140, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("filtrar por nombre");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            BD.eliminar(tabla.getValueAt(fila, 0).toString());
            mostrar_tabla_admin("");
        } else {
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para eliminarla");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            nombre.setEnabled(true);
            correo.setEnabled(true);
            telefono.setEnabled(true);
            direccion.setEnabled(true);
            estatus.setEnabled(true);
            tipo_usuario.setEnabled(true);
            update.setEnabled(true);
            nombre.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            correo.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            telefono.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            direccion.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
            cedulaM = Long.parseLong(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para modificarla");

        }
    }//GEN-LAST:event_modificarActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_usuarioActionPerformed
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (vacio(nombre) + vacio(telefono) + vacio(direccion) + vacio(correo) + numeros(telefono) != 5) {
            JOptionPane.showMessageDialog(null, "no se ha podido modificar los datos");
        } else {
            String op1, op2;
            if (opcion(tipo_usuario)) {
                op1 = "administrador";
            } else {
                op1 = "empleado";
            }
            if (opcion(estatus)) {
                op2 = "activo";
            } else {
                op2 = "inactivo";
            }
            BD.update(cedulaM, nombre.getText().trim(), Long.parseLong(telefono.getText().trim()), correo.getText().trim(), direccion.getText().trim(), op2, op1);
            mostrar_tabla_admin("");
            nombre.setEnabled(false);
            correo.setEnabled(false);
            telefono.setEnabled(false);
            direccion.setEnabled(false);
            estatus.setEnabled(false);
            tipo_usuario.setEnabled(false);
            update.setEnabled(false);
            nombre.setText("");
            correo.setText("");
            telefono.setText("");
            direccion.setText("");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtradoKeyReleased
        if (BD.estatus(Nombre, cedula).equals("administrador")) {
            mostrar_tabla_admin(filtrado.getText().trim());
        } else {
            mostrar_tabla_empleado(filtrado.getText().trim());
        }
    }//GEN-LAST:event_filtradoKeyReleased
    public int numeros(JTextField x) {
        try {
            Long.parseLong(x.getText().trim());
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hay datos que son invalidos");
            return 0;
        }
    }

    public boolean opcion(JComboBox x) {
        if (x.getSelectedIndex() + 1 == 1) {
            return true;
        } else {
            return false;
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
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> estatus;
    private javax.swing.JTextField filtrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel presentacion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo_usuario;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
