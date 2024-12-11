package Presentacion;


import Servicio.ConexionBD;
import Negocio.ProveedoresBO;
import Servicio.ProveedoresDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;





public class interfazProveedores extends javax.swing.JPanel {
    
    ProveedoresBO operacion = new ProveedoresBO();

    public interfazProveedores() {
        initComponents();
        operacion.cargarDatosEnTabla(tablaproveedores);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txttelProveedores = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombreProveedores = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNITProveedores = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdirProveedores = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcorreoProveedores = new javax.swing.JTextField();
        txtNombreContactoProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproveedores = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Nombre Proveedor:");

        txttelProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelProveedoresActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("NIT Proveedores:");

        txtnombreProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreProveedoresActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Telefono Proveedor:");

        txtNITProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITProveedoresActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Direccion Proveedor:");

        txtdirProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdirProveedoresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Correo Proveedor:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setText("Nombre contacto Proveedor:");

        txtcorreoProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoProveedoresActionPerformed(evt);
            }
        });

        txtNombreContactoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreContactoProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNITProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdirProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtdirProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcorreoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(15, 15, 15)))
                        .addComponent(txtNombreContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtnombreProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNITProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(50, 50, 50))
        );

        tablaproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre proveedor", "NIT", "Telefono", "Direccion", "Correo", "Nombre contacto"
            }
        ));
        tablaproveedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproveedores);

        btnguardar.setBackground(new java.awt.Color(25, 80, 180));
        btnguardar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(25, 80, 180));
        btneliminar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar ");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(25, 80, 180));
        btneditar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btneditar.setForeground(new java.awt.Color(255, 255, 255));
        btneditar.setText("Editar ");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttelProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelProveedoresActionPerformed

    private void txtNITProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNITProveedoresActionPerformed

    private void txtdirProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdirProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdirProveedoresActionPerformed

    private void txtNombreContactoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreContactoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreContactoProveedorActionPerformed

    private void txtcorreoProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoProveedoresActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
      operacion.eliminar(tablaproveedores);
      operacion.cargarDatosEnTabla(tablaproveedores);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
     editar();
     operacion.cargarDatosEnTabla(tablaproveedores);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        guardar();
        operacion.cargarDatosEnTabla(tablaproveedores);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnombreProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreProveedoresActionPerformed

    private void tablaproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproveedoresMouseClicked
        
int filaSeleccionada = tablaproveedores.getSelectedRow();


if (filaSeleccionada != -1) {
    
    String nombre = tablaproveedores.getValueAt(filaSeleccionada, 1).toString(); 
    String nit = tablaproveedores.getValueAt(filaSeleccionada, 2).toString(); 
    String telefono = tablaproveedores.getValueAt(filaSeleccionada, 3).toString(); 
    String direccion = tablaproveedores.getValueAt(filaSeleccionada, 4).toString(); 
    String correo = tablaproveedores.getValueAt(filaSeleccionada, 5).toString(); 
    String nombrecontacto = tablaproveedores.getValueAt(filaSeleccionada, 6).toString(); 
    
    
    txtnombreProveedores.setText(nombre);
    txtNITProveedores.setText(nit);
    txttelProveedores.setText(telefono);
    txtdirProveedores.setText(direccion);
    txtcorreoProveedores.setText(correo);
    txtNombreContactoProveedor.setText(nombrecontacto);
} else {
    JOptionPane.showMessageDialog(null, "Seleccione un registro para editar.");
}

    }//GEN-LAST:event_tablaproveedoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btneditar;
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaproveedores;
    public javax.swing.JTextField txtNITProveedores;
    public javax.swing.JTextField txtNombreContactoProveedor;
    public javax.swing.JTextField txtcorreoProveedores;
    public javax.swing.JTextField txtdirProveedores;
    public javax.swing.JTextField txtnombreProveedores;
    public javax.swing.JTextField txttelProveedores;
    // End of variables declaration//GEN-END:variables


 public void guardar(){
 try {
        ProveedoresBO ProveedoresBO = new ProveedoresBO();
        ProveedoresDAO ProveedoresDAO = new ProveedoresDAO();

        String nombreProveedores = txtnombreProveedores.getText();
        String NITProveedores = txtNITProveedores.getText();
        String telProveedores = txttelProveedores.getText();
        String dirProveedores = txtdirProveedores.getText();
        String correoProveedores = txtcorreoProveedores.getText();
        String NombreContactoProveedor = txtNombreContactoProveedor.getText();


        ProveedoresDAO.setnombreProveedores(nombreProveedores);
        ProveedoresDAO.setNITProveedores(NITProveedores);
        ProveedoresDAO.settelProveedores(telProveedores);
        ProveedoresDAO.setdirProveedores(dirProveedores);
        ProveedoresDAO.setcorreoProveedores(correoProveedores);
        ProveedoresDAO.setNombreContactoProveedor(NombreContactoProveedor);

        ProveedoresBO.guardarDatos(ProveedoresDAO);
        
                
        

        JOptionPane.showMessageDialog(this, "Proveedor registrado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa datos válidos: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar el usuario: " + e.getMessage());
    }

 
 }

 public void editar() {
    ProveedoresBO proveedoresBO = new ProveedoresBO();

    btneditar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int filaSeleccionada = tablaproveedores.getSelectedRow();
            if (filaSeleccionada != -1) {
                try {
                    int codProveedores = Integer.parseInt(tablaproveedores.getValueAt(filaSeleccionada, 0).toString());
                    String nombreProveedores = txtnombreProveedores.getText();
                    String NITProveedores = txtNITProveedores.getText();
                    String telProveedores = txttelProveedores.getText();
                    String dirProveedores = txtdirProveedores.getText();
                    String correoProveedores = txtcorreoProveedores.getText();
                    String NombreContactoProveedor = txtNombreContactoProveedor.getText();

                    if (!nombreProveedores.isEmpty() && !NITProveedores.isEmpty() && !telProveedores.isEmpty() && !dirProveedores.isEmpty() && !correoProveedores.isEmpty() && !NombreContactoProveedor.isEmpty()) {
                        
                        proveedoresBO.actualizarProveedor(codProveedores, nombreProveedores, NITProveedores, telProveedores, dirProveedores, correoProveedores, NombreContactoProveedor);

                        
                        JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
                        operacion.cargarDatosEnTabla(tablaproveedores);

                        
                        txtnombreProveedores.setText("");
                        txtNITProveedores.setText("");
                        txttelProveedores.setText("");
                        txtdirProveedores.setText("");
                        txtcorreoProveedores.setText("");
                        txtNombreContactoProveedor.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para editar.");
            }
        }
    });
}
 

}

 

