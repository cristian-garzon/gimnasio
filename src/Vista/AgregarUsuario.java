package Vista;

import Controlador.Nodo_usuarios;
import Modelo.JavaConexion;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class AgregarUsuario extends javax.swing.JFrame {

//    static ManejoDatos mDato;
    public JTable tabla;
    public static gimnasio Gym;
    
    public AgregarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        ced.setVisible(false);
        nom.setVisible(false);
        tel.setVisible(false);
        cor.setVisible(false);
        dir.setVisible(false);
    }
    
    /*
    Si da problemas el metodo, puende eliminarlo , su funcion es de solo hacer visible 
    esta Jframe y noVisible el JFrame Principal y vicebersa
    */ 
    public void cargarInterfaz(gimnasio Gym) {
        Gym = new gimnasio();
        this.Gym = Gym;
    }
    //NO eliminar eset metodo
    public boolean validar() {
        if (txtCedula.getText().isEmpty()) {
            ced.setVisible(true);
        } else {
            ced.setVisible(false);
        }
        if (txtNombre.getText().isEmpty()) {
            nom.setVisible(true);
        } else {
            nom.setVisible(false);
        }
        if (txtTelefono.getText().isEmpty()) {
            tel.setVisible(true);
        } else {
            tel.setVisible(false);
        }
        if (txtCorreo.getText().isEmpty()) {
            cor.setVisible(true);
        } else {
            cor.setVisible(false);
        }
        if (txtDireccion.getText().isEmpty()) {
            dir.setVisible(true);
        } else {
            dir.setVisible(false);
            
        }
        if (txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
        
    }

//    public void recibir(ManejoDatos mDato, JTable tabla) {
//        this.mDato = mDato;
//        this.tabla = tabla;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        Estatus = new javax.swing.JComboBox<>();
        labelTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        labelTipo_usuario = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        tipoUsuario = new javax.swing.JComboBox<>();
        labelDireccion = new javax.swing.JLabel();
        labelEstatus = new javax.swing.JLabel();
        dir = new javax.swing.JLabel();
        ced = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        cor = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Estatus.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        Estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstatusActionPerformed(evt);
            }
        });
        panel2.add(Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 30));

        labelTelefono.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefono.setText("Telefono");
        panel2.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 110, 20));

        txtTelefono.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        panel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 140, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        labelTipo_usuario.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelTipo_usuario.setForeground(new java.awt.Color(0, 0, 0));
        labelTipo_usuario.setText("Tipo de Usuario");
        panel2.add(labelTipo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 180, 20));

        txtDireccion.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        panel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 300, -1));

        labelNombre.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(0, 0, 0));
        labelNombre.setText("Nombre");
        panel2.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 100, 20));

        txtNombre.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 140, -1));

        labelCedula.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelCedula.setForeground(new java.awt.Color(0, 0, 0));
        labelCedula.setText("Cedula");
        panel2.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 20));

        txtCedula.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        panel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, -1));

        labelCorreo.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        labelCorreo.setText("Correo");
        panel2.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 20));

        txtCorreo.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        panel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, -1));

        tipoUsuario.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Empleado", "Administrador" }));
        tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUsuarioActionPerformed(evt);
            }
        });
        panel2.add(tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        labelDireccion.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("Direccion");
        panel2.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 20));

        labelEstatus.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        labelEstatus.setForeground(new java.awt.Color(0, 0, 0));
        labelEstatus.setText("Estatus");
        panel2.add(labelEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 110, 20));

        dir.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        dir.setForeground(new java.awt.Color(204, 0, 0));
        dir.setText("*Llenar Espacio");
        panel2.add(dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        ced.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        ced.setForeground(new java.awt.Color(204, 0, 0));
        ced.setText("*Llenar Espacio");
        panel2.add(ced, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        nom.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        nom.setForeground(new java.awt.Color(204, 0, 0));
        nom.setText("*Llenar Espacio");
        panel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        tel.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(204, 0, 0));
        tel.setText("*Llenar Espacio");
        panel2.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        cor.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cor.setForeground(new java.awt.Color(204, 0, 0));
        cor.setText("*Llenar Espacio");
        panel2.add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 400));

        panel1.setBackground(new java.awt.Color(0, 204, 204));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setForeground(new java.awt.Color(0, 122, 204));
        salir.setText("X");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 20, 20));

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Agregar Usuario");
        panel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
        Gym.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void EstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstatusActionPerformed
        
        String mensaje = null;
        mensaje = Estatus.getSelectedItem().toString();

    }//GEN-LAST:event_EstatusActionPerformed

    private void tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUsuarioActionPerformed
        String mensaje = null;
        mensaje = tipoUsuario.getSelectedItem().toString();
    }//GEN-LAST:event_tipoUsuarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JavaConexion javaMetodo = new JavaConexion();
        if (validar()) {
            //Datos de las Listas
            String mensaje = null;
            String mensaje1 = null;
            mensaje = Estatus.getSelectedItem().toString().toLowerCase();
            mensaje1 = tipoUsuario.getSelectedItem().toString().toLowerCase();

            //Agregando todos los datos de Usuario al Nodo
            Nodo_usuarios agregar = new Nodo_usuarios(Integer.parseInt(txtCedula.getText()), txtNombre.getText(), Integer.parseInt(txtTelefono.getText()), txtCorreo.getText(),
                    txtDireccion.getText(), mensaje, mensaje1);
            
            javaMetodo.insert(agregar);
            
            JOptionPane.showMessageDialog(null, "Usuario Agregado", "Agregando Usuario", JOptionPane.INFORMATION_MESSAGE);
            
            txtCedula.setText("");
            txtNombre.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtDireccion.setText("");
            
            this.setVisible(false);
            Gym.setVisible(true);
        }
        

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        //Valida solo Numeros
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume(); //Desecha lo que no esta entre el rango
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Valida solo Letras
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume(); //Desecha lo que no esta entre el rango
    }//GEN-LAST:event_txtTelefonoKeyTyped
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                AgregarUsuario ob = new AgregarUsuario();
                ob.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Estatus;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel ced;
    private javax.swing.JLabel cor;
    private javax.swing.JLabel dir;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEstatus;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo_usuario;
    private javax.swing.JLabel nom;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tel;
    private javax.swing.JComboBox<String> tipoUsuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
