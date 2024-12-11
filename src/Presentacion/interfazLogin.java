package Presentacion;
import Servicio.ConexionBD;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class interfazLogin extends javax.swing.JFrame {

    public interfazLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usuarioLbl = new javax.swing.JLabel();
        contraseñaLbl = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        contraseñapsw = new javax.swing.JPasswordField();

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuarioLbl.setText("USUARIO:");

        contraseñaLbl.setText("CONTRASEÑA:");

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        contraseñapsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñapswActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(usuarioLbl))))
                    .addComponent(usuariotxt)
                    .addComponent(contraseñapsw, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(usuarioLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseñaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñapsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        validarUsuario();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void contraseñapswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñapswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñapswActionPerformed
    
    
   private void validarUsuario() {
    String usuario = usuariotxt.getText();
    String contrasena = new String(contraseñapsw.getPassword());

    String sql = "SELECT tipoUsuario FROM usuario WHERE nombreUsuario = ? AND contrasenaUsuario = ?";
    System.out.println("Consulta SQL: " + sql);
    System.out.println("Usuario ingresado: " + usuario);
    System.out.println("Contraseña ingresada: " + contrasena);

    try (ResultSet rs = ConexionBD.ejecutarConsulta(sql, usuario, contrasena)) {
        if (rs != null) {
            if (rs.next()) {
                System.out.println("Consulta exitosa. Usuario encontrado.");
                String tipoUsuario = rs.getString("tipoUsuario");
                System.out.println("Tipo de Usuario: " + tipoUsuario);

                if ("1".equalsIgnoreCase(tipoUsuario)) {
                    JOptionPane.showMessageDialog(this, "Bienvenido Administrador");
                    interfazPrincipal inicio = new interfazPrincipal();
                    System.out.println("Creando instancia de interfazPrincipal.");
                    inicio.setVisible(true);
                    inicio.setLocationRelativeTo(null);
                } else if ("2".equalsIgnoreCase(tipoUsuario)) {
                    JOptionPane.showMessageDialog(this, "Bienvenido Trabajador");
                    // Puedes incluir aquí la interfaz de trabajador.
                }
                dispose(); // Cierra la ventana de login.
            } else {
                System.out.println("Consulta exitosa, pero usuario o contraseña incorrectos.");
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        } else {
            System.out.println("El ResultSet es nulo. Verifica la conexión y la consulta.");
        }
    } catch (SQLException e) {
        System.out.println("Error de SQL: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    }
    System.out.println("");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel contraseñaLbl;
    private javax.swing.JPasswordField contraseñapsw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel usuarioLbl;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
