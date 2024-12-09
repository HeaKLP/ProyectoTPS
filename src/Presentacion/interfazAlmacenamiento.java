package Presentacion;

import Servicio.ConexionBD;
import Servicio.AlmacenamientoDAO;
import Negocio.AlmacenamientoBO;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class interfazAlmacenamiento extends javax.swing.JPanel {
    private interfazPrincipal principal;
    
    public interfazAlmacenamiento(interfazPrincipal principal) {
    this.principal = principal;
    initComponents();
    cargarTabla();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtDescripcionAlmacenamiento = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlmacenamiento = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnLaboratorio = new javax.swing.JButton();
        btnAlmacenamiento = new javax.swing.JButton();
        btnPresentacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTemperaturaAlmacenamiento = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(860, 500));

        btnEliminar.setBackground(new java.awt.Color(25, 80, 180));
        btnEliminar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(88, 16));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(25, 80, 180));
        btnEditar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(88, 16));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(25, 80, 180));
        btnAgregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(88, 16));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblAlmacenamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo de almacenamiento", "Temperatura de almacenamiento", "Descripción de almacenamiento"
            }
        ));
        jScrollPane1.setViewportView(tblAlmacenamiento);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Temperatura de almacenamiento:");

        btnLaboratorio.setBackground(new java.awt.Color(25, 80, 180));
        btnLaboratorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        btnLaboratorio.setText("Laboratorio");
        btnLaboratorio.setPreferredSize(new java.awt.Dimension(265, 75));

        btnAlmacenamiento.setBackground(new java.awt.Color(33, 54, 130));
        btnAlmacenamiento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAlmacenamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnAlmacenamiento.setText("Almacenamiento");
        btnAlmacenamiento.setPreferredSize(new java.awt.Dimension(265, 75));

        btnPresentacion.setBackground(new java.awt.Color(25, 80, 180));
        btnPresentacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnPresentacion.setText("Presentación");
        btnPresentacion.setPreferredSize(new java.awt.Dimension(265, 75));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Descripción de almacenamiento:");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDescripcionAlmacenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemperaturaAlmacenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(298, 298, 298))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemperaturaAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcionAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     registrar();
     cargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    eliminar();
    cargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    editar();
    }//GEN-LAST:event_btnEditarActionPerformed
  private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tblAlmacenamiento.getModel();
    modelo.setRowCount(0);

    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("CodigoAlmacenamiento");
        modelo.addColumn("TemperaturaAlmacenamiento");
        modelo.addColumn("DescripcionAlmacenamiento");         
        
    }

    try {
        Connection con = ConexionBD.crearConexionBD();
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM almacenamiento");
            while (rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("CodigoAlmacenamiento"), 
                    rs.getString("TemperaturaAlmacenamiento"), 
                    rs.getString("DescripcionAlmacenamiento")  
                     });
                }
            }
        } catch (SQLException e) {
        System.out.println("Error al obtener datos de almacenamiento: " + e.getMessage());
        }
    }
    
    private void registrar(){
        try {
        AlmacenamientoBO AlmacenamientoBO = new AlmacenamientoBO();
        AlmacenamientoDAO AlmacenamientoDAO = new AlmacenamientoDAO();
        
        String TemperaturaAlmacenamiento = txtTemperaturaAlmacenamiento.getText();
        String DescripcionAlmacenamiento = txtDescripcionAlmacenamiento.getText();
        
        AlmacenamientoDAO.setTemperaturaAlmacenamiento(TemperaturaAlmacenamiento);
        AlmacenamientoDAO.setDescripcionAlmacenamiento(DescripcionAlmacenamiento);
        

        AlmacenamientoBO.guardarDatosAlmacenamientoBD(AlmacenamientoDAO);

        JOptionPane.showMessageDialog(this, "Almacenamiento registrado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa datos válidos: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar el almacenamiento: " + e.getMessage());
    }
  }
    
   private void eliminar() {
    int filaSeleccionada = tblAlmacenamiento.getSelectedRow();

    if (filaSeleccionada != -1) {

        int CodigoAlmacenamiento = (int) tblAlmacenamiento.getValueAt(filaSeleccionada, 0);
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este almacenamiento?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection con = ConexionBD.crearConexionBD();
                
                if (con != null) {

                    String sql = "DELETE FROM almacenamiento WHERE CodigoAlmacenamiento = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, CodigoAlmacenamiento);
                    
                    int filasAfectadas = pst.executeUpdate();
                    
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Almacenamiento eliminado correctamente.");
                        cargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al eliminar el almacenamiento.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el almacenamiento: " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un almacenamiento para eliminar.");
    }
} 
   
   private void editar(){
        interfazEditarAlmacenamiento editarAlmacenamiento = new interfazEditarAlmacenamiento();

        editarAlmacenamiento.setSize(860, 500);
        editarAlmacenamiento.setLocation(0, 0);

        bg.removeAll();
        bg.add(editarAlmacenamiento, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAlmacenamiento;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnPresentacion;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlmacenamiento;
    private javax.swing.JTextField txtDescripcionAlmacenamiento;
    private javax.swing.JTextField txtTemperaturaAlmacenamiento;
    // End of variables declaration//GEN-END:variables
}
