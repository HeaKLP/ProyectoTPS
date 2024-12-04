package Presentacion;

import Negocio.TipoUsuarioBO;
import Negocio.UsuarioBO;
import Servicio.ConexionBD;
import Servicio.TipoUsuarioDAO;
import Servicio.UsuarioDAO;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;



public class interfazUsuario extends javax.swing.JPanel {
    
    private TipoUsuarioBO tipoUsuarioBO;

    public interfazUsuario() {
        initComponents();
        hoverBotones();
        
        tipoUsuarioBO = new TipoUsuarioBO();

        cargarCombo();
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgFormulario = new javax.swing.JPanel();
        txtDocUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtEmailUsuario = new javax.swing.JTextField();
        txtTelUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        txtContraseñaUsuario = new javax.swing.JPasswordField();
        bgUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Usuario:");

        jLabel2.setText("Documento del Usuario");

        jLabel3.setText("Correo del usuario:");

        jLabel4.setText("Contraseña del usuario");

        jLabel5.setText("Telefono del Usuario:");

        jLabel6.setText("Tipo de usuario:");

        btnRegistrar.setBackground(new java.awt.Color(25, 80, 180));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Agregar Registro");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(25, 80, 180));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Registro");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(25, 80, 180));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Registro");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgFormularioLayout = new javax.swing.GroupLayout(bgFormulario);
        bgFormulario.setLayout(bgFormularioLayout);
        bgFormularioLayout.setHorizontalGroup(
            bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFormularioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelUsuario)
                    .addComponent(txtContraseñaUsuario)
                    .addComponent(cbxTipoUsuario, 0, 150, Short.MAX_VALUE))
                .addGap(127, 127, 127))
            .addGroup(bgFormularioLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgFormularioLayout.setVerticalGroup(
            bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFormularioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(bgFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        bg.add(bgFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 270));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout bgUsuariosLayout = new javax.swing.GroupLayout(bgUsuarios);
        bgUsuarios.setLayout(bgUsuariosLayout);
        bgUsuariosLayout.setHorizontalGroup(
            bgUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        bgUsuariosLayout.setVerticalGroup(
            bgUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        bg.add(bgUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 860, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelUsuarioActionPerformed

    }//GEN-LAST:event_txtTelUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
        cargarTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        cargarTabla();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        cargarTabla();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoUsuarioActionPerformed

    }//GEN-LAST:event_cbxTipoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgFormulario;
    private javax.swing.JPanel bgUsuarios;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JPasswordField txtContraseñaUsuario;
    private javax.swing.JTextField txtDocUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
    modelo.setRowCount(0);

    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("Documento");     
        modelo.addColumn("Nombre");         
        modelo.addColumn("Email"); 
        modelo.addColumn("Teléfono"); 
        modelo.addColumn("Fecha de Ingreso");
        modelo.addColumn("Tipo de Usuario");
    }

    try {
        Connection con = ConexionBD.crearConexionBD();
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");

            while (rs.next()) {
                String tipoUsuario = "";
                int tipo = rs.getInt("tipoUsuario");

                switch (tipo) {
                    case 1:
                        tipoUsuario = "Administrador";
                        break;
                    case 2:
                        tipoUsuario = "Trabajador";
                        break;
                    default:
                        tipoUsuario = "Desconocido";
                        break;
                }
                modelo.addRow(new Object[]{
                    rs.getInt("docUsuario"),        
                    rs.getString("nombreUsuario"),   
                    rs.getString("emailUsuario"),   
                    rs.getString("telUsuario"),     
                    rs.getDate("fechIniUsuario"),   
                    tipoUsuario  
                });
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener usuarios: " + e.getMessage());
    }
}
    
    private void cargarCombo() {
    cbxTipoUsuario.removeAllItems();
    
    tipoUsuarioBO.cargarRolesDesdeBD();
    
    for (TipoUsuarioDAO tipo : tipoUsuarioBO.lista) {
        cbxTipoUsuario.addItem(tipo.getTipoUsuario()); 
    }
}

    private void registrar(){
        try {
        UsuarioBO usuarioBO = new UsuarioBO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        int docUsuario = Integer.parseInt(txtDocUsuario.getText());
        String nombreUsuario = txtNombreUsuario.getText();
        String emailUsuario = txtEmailUsuario.getText();
        String contraseñaUsuario = new String(txtContraseñaUsuario.getPassword());
        String telUsuario = txtTelUsuario.getText();
        int tipoUsuario = cbxTipoUsuario.getSelectedIndex() + 1; // Ajustar índice al ID del tipo

        LocalDate fechaInicio = LocalDate.now();

        usuarioDAO.setDocUsuario(docUsuario);
        usuarioDAO.setNombreUsuario(nombreUsuario);
        usuarioDAO.setEmailUsuario(emailUsuario);
        usuarioDAO.setContraseñaUsuario(contraseñaUsuario);
        usuarioDAO.setTelUsuario(telUsuario);
        usuarioDAO.setFechIniUsuario(fechaInicio);
        usuarioDAO.setTipoUsuario(tipoUsuario);

        usuarioBO.guardarDatosUsuarioBD(usuarioDAO);

        JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa datos válidos: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar el usuario: " + e.getMessage());
    }
    
    
    }
    
    private void eliminar() {
    int filaSeleccionada = tblUsuarios.getSelectedRow();

    if (filaSeleccionada != -1) {

        int idUsuario = (int) tblUsuarios.getValueAt(filaSeleccionada, 0);
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este usuario?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection con = ConexionBD.crearConexionBD();
                
                if (con != null) {

                    String sql = "DELETE FROM usuario WHERE docUsuario = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, idUsuario);
                    
                    int filasAfectadas = pst.executeUpdate();
                    
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");
                        cargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al eliminar el usuario.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el usuario: " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un usuario para eliminar.");
    }
}
    
    
    public void hoverBotones(){
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnRegistrar.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnRegistrar.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnRegistrar.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
    
       // btnEliminar
    
       
       btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnEliminar.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnEliminar.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnEliminar.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
       
       //btnEditar
       
       btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnEditar.setBackground(new java.awt.Color(50, 150, 255)); // Color al pasar el mouse
            btnEditar.setOpaque(true); // Asegura que se vea el cambio de color
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnEditar.setBackground(new java.awt.Color(25, 80, 180)); // Color original
        }
    });
    }
}
