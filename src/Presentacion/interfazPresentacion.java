package Presentacion;

import Servicio.ConexionBD;
import Servicio.PresentacionDAO;
import Negocio.PresentacionBO;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class interfazPresentacion extends javax.swing.JPanel {
    private interfazPrincipal principal;
    
    public interfazPresentacion(interfazPrincipal principal) {
        this.principal = principal;
        initComponents();
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PG = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPresentacion = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnLaboratorio = new javax.swing.JButton();
        btnAlmacenamiento = new javax.swing.JButton();
        btnPresentacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();

        btnAgregar.setBackground(new java.awt.Color(25, 80, 180));
        btnAgregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        btnEditar.setBackground(new java.awt.Color(25, 80, 180));
        btnEditar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tblPresentacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Presentación", "Descripción Presentación", "Codigo de producto"
            }
        ));
        tblPresentacion.setPreferredSize(new java.awt.Dimension(225, 80));
        jScrollPane1.setViewportView(tblPresentacion);

        btnEliminar.setBackground(new java.awt.Color(25, 80, 180));
        btnEliminar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLaboratorio.setBackground(new java.awt.Color(25, 80, 180));
        btnLaboratorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        btnLaboratorio.setText("Laboratorio");
        btnLaboratorio.setPreferredSize(new java.awt.Dimension(265, 75));
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });

        btnAlmacenamiento.setBackground(new java.awt.Color(25, 80, 180));
        btnAlmacenamiento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAlmacenamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnAlmacenamiento.setText("Almacenamiento");
        btnAlmacenamiento.setPreferredSize(new java.awt.Dimension(265, 75));
        btnAlmacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenamientoActionPerformed(evt);
            }
        });

        btnPresentacion.setBackground(new java.awt.Color(33, 54, 130));
        btnPresentacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnPresentacion.setText("Presentación");
        btnPresentacion.setPreferredSize(new java.awt.Dimension(265, 75));
        btnPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Descripción Presentación");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Código de producto");

        txtCodigoProducto.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout PGLayout = new javax.swing.GroupLayout(PG);
        PG.setLayout(PGLayout);
        PGLayout.setHorizontalGroup(
            PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PGLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PGLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PGLayout.createSequentialGroup()
                        .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PGLayout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PGLayout.createSequentialGroup()
                                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescripcion)
                                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(246, 246, 246)))))
                .addContainerGap())
        );
        PGLayout.setVerticalGroup(
            PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        registrar();
        cargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminar();
       cargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPresentacionActionPerformed

    private void btnLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorioActionPerformed
        interfazLaboratorio pagLaboratorio = new interfazLaboratorio(principal);
    
    // Llamar al método cambiarPanel para actualizar el contenido con el nuevo panel
    principal.cambiarPanel(pagLaboratorio);
    }//GEN-LAST:event_btnLaboratorioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenamientoActionPerformed
      interfazAlmacenamiento pagAlmacenamiento = new interfazAlmacenamiento(principal);
    
    // Llamar al método cambiarPanel para actualizar el contenido con el nuevo panel
    principal.cambiarPanel(pagAlmacenamiento);
    }//GEN-LAST:event_btnAlmacenamientoActionPerformed
private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tblPresentacion.getModel();
    modelo.setRowCount(0);

    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("CodigoPresentacion");
        modelo.addColumn("descripcionPresentacion");         
        modelo.addColumn("Producto_CodigoProducto");
    }

    try {
        Connection con = ConexionBD.crearConexionBD();
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM presentacion");
            while (rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("CodigoPresentacion"),  
                    rs.getString("descripcionPresentacion"),
                    rs.getInt("Producto_CodigoProducto")
                     });
                }
            }
        } catch (SQLException e) {
        System.out.println("Error al obtener datos de presentacion: " + e.getMessage());
        }
    }
    
    private void registrar(){
        try {
        PresentacionBO PresentacionBO = new PresentacionBO();
        PresentacionDAO PresentacionDAO = new PresentacionDAO();
        
        String descripcionPresentacion = txtDescripcion.getText();
        String Producto_CodigoProducto = txtCodigoProducto.getText();
        
        PresentacionDAO.setDescripcionPresentacion(descripcionPresentacion);
        PresentacionDAO.setProducto_CodigoProducto(Producto_CodigoProducto);
        

        PresentacionBO.guardarDatosPresentacionBD(PresentacionDAO);

        JOptionPane.showMessageDialog(this, "Presentación registrado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa datos válidos: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar la presentación: " + e.getMessage());
    }
  }
    
   private void eliminar() {
    int filaSeleccionada = tblPresentacion.getSelectedRow();

    if (filaSeleccionada != -1) {

        int CodigoPresentacion = (int) tblPresentacion.getValueAt(filaSeleccionada, 0);
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar esta presentación?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection con = ConexionBD.crearConexionBD();
                
                if (con != null) {

                    String sql = "DELETE FROM presentacion WHERE CodigoPresentacion = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, CodigoPresentacion);
                    
                    int filasAfectadas = pst.executeUpdate();
                    
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Presentación eliminada correctamente.");
                        cargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al eliminar la presentación.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar la presentación: " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona una presentación para eliminar.");
    }
} 
   
   private void editar(){
        int filaSeleccionada = tblPresentacion.getSelectedRow(); // Obtén la fila seleccionada de la tabla

    if (filaSeleccionada != -1) {
        // Obtén los datos actuales de la fila seleccionada
        int CodigoPresentacion = (int) tblPresentacion.getValueAt(filaSeleccionada, 0);
        String DescripcionPresentacion = (String) tblPresentacion.getValueAt(filaSeleccionada, 1);
        
        // Solicita nuevos datos al usuario con valores actuales como sugerencia
        String nuevaDescripcion = JOptionPane.showInputDialog(this, "Editar descripción de presentación:", DescripcionPresentacion);
        // Verifica si el usuario ingresó un nuevo nombre válido
        if (nuevaDescripcion != null && !nuevaDescripcion.trim().isEmpty()) {
            try {
                // Establece conexión con la base de datos
                Connection con = ConexionBD.crearConexionBD();
                if (con != null) {
                    String sql = "UPDATE presentacion SET descripcioPresentacion = ? WHERE CodigoPresentacion = ?";
                    PreparedStatement pst = con.prepareStatement(sql);

                    // Establece los valores en la consulta
                    pst.setString(1, nuevaDescripcion);
                    pst.setInt(2, CodigoPresentacion);

                    // Ejecuta la actualización
                    int filasAfectadas = pst.executeUpdate();
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Presentación editada correctamente.");
                        cargarTabla(); // Refresca la tabla para mostrar los cambios
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al editar la presentación.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al editar la presentación: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "La descripción de la presentación no puede estar vacía.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona una presentación para editar.");
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PG;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAlmacenamiento;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnPresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPresentacion;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
