package Presentacion;

import Servicio.LaboratorioDAO;
import Negocio.LaboratorioBO;
import Servicio.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;  

public class interfazLaboratorio extends javax.swing.JPanel {
    private interfazPrincipal principal;
    
     

    public interfazLaboratorio(interfazPrincipal principal) {
        this.principal= principal;
        initComponents();
        cargarTabla();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLaboratorios = new javax.swing.JTable();
        nombreTextField = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        btnPresentacion = new javax.swing.JButton();
        btnLaboratorio = new javax.swing.JButton();
        btnAlmacenamiento = new javax.swing.JButton();

        setLayout(null);

        tablaLaboratorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre del Laboratorio"
            }
        ));
        jScrollPane1.setViewportView(tablaLaboratorios);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 850, 200);

        nombreTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        add(nombreTextField);
        nombreTextField.setBounds(340, 160, 204, 28);

        agregarButton.setBackground(new java.awt.Color(25, 80, 180));
        agregarButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agregarButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });
        add(agregarButton);
        agregarButton.setBounds(180, 250, 150, 30);

        editarButton.setBackground(new java.awt.Color(25, 80, 180));
        editarButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        add(editarButton);
        editarButton.setBounds(560, 250, 150, 30);

        eliminarButton.setBackground(new java.awt.Color(25, 80, 180));
        eliminarButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        add(eliminarButton);
        eliminarButton.setBounds(370, 250, 150, 30);

        nombreLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombreLabel.setText("Nombre del Laboratorio:");
        add(nombreLabel);
        nombreLabel.setBounds(360, 130, 190, 20);

        btnPresentacion.setBackground(new java.awt.Color(25, 80, 180));
        btnPresentacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnPresentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/laboratorio_1.png"))); // NOI18N
        btnPresentacion.setText("Presentación");
        btnPresentacion.setPreferredSize(new java.awt.Dimension(265, 75));
        btnPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentacionActionPerformed(evt);
            }
        });
        add(btnPresentacion);
        btnPresentacion.setBounds(600, 10, 265, 75);

        btnLaboratorio.setBackground(new java.awt.Color(33, 54, 130));
        btnLaboratorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/laboratorio.png"))); // NOI18N
        btnLaboratorio.setText("Laboratorio");
        btnLaboratorio.setPreferredSize(new java.awt.Dimension(265, 75));
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });
        add(btnLaboratorio);
        btnLaboratorio.setBounds(10, 10, 265, 75);

        btnAlmacenamiento.setBackground(new java.awt.Color(25, 80, 180));
        btnAlmacenamiento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAlmacenamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnAlmacenamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacenamiento.png"))); // NOI18N
        btnAlmacenamiento.setText("Almacenamiento");
        btnAlmacenamiento.setPreferredSize(new java.awt.Dimension(265, 75));
        btnAlmacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenamientoActionPerformed(evt);
            }
        });
        add(btnAlmacenamiento);
        btnAlmacenamiento.setBounds(310, 10, 265, 75);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        String nombreLaboratorio = nombreTextField.getText().trim();
    if (nombreLaboratorio.isEmpty()) {
    JOptionPane.showMessageDialog(this, "El nombre del laboratorio no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
} else {
    nombreTextField.setText("");
}

    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
    registrar();
    cargarTabla();
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
    editar();
    }//GEN-LAST:event_editarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
       eliminar();
       cargarTabla();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void btnPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentacionActionPerformed
        interfazPresentacion pagPresentacion = new interfazPresentacion(principal);
    
    // Llamar al método cambiarPanel para actualizar el contenido con el nuevo panel
    principal.cambiarPanel(pagPresentacion);
    }//GEN-LAST:event_btnPresentacionActionPerformed

    private void btnLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorioActionPerformed
        
    }//GEN-LAST:event_btnLaboratorioActionPerformed

    private void btnAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenamientoActionPerformed
        interfazAlmacenamiento pagAlmacenamiento = new interfazAlmacenamiento(principal);

        // Llamar al método cambiarPanel para actualizar el contenido con el nuevo panel
        principal.cambiarPanel(pagAlmacenamiento);
    }//GEN-LAST:event_btnAlmacenamientoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton btnAlmacenamiento;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnPresentacion;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTable tablaLaboratorios;
    // End of variables declaration//GEN-END:variables


private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tablaLaboratorios.getModel();
    modelo.setRowCount(0);

    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("CodigoLaboratorio");
        modelo.addColumn("nombreLaboratorio");     
    }

    try {
        Connection con = ConexionBD.crearConexionBD();
        if (con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM laboratorio");
            while (rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("CodigoLaboratorio"), 
                    rs.getString("nombreLaboratorio"), 
                     });
                }
            }
        } catch (SQLException e) {
        System.out.println("Error al obtener datos de almacenamiento: " + e.getMessage());
        }
    }
private void registrar(){
        try {
        LaboratorioBO LaboratorioBO = new LaboratorioBO();
        LaboratorioDAO LaboratorioDAO = new LaboratorioDAO();
        
        String nombreLaboratorio = nombreTextField.getText();
        
        
        LaboratorioDAO.setNombreLaboratorio(nombreLaboratorio);
       
        LaboratorioBO.guardarDatosLaboratorioBD(LaboratorioDAO);

        JOptionPane.showMessageDialog(this, "Laboratorio registrado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa datos válidos: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar el almacenamiento: " + e.getMessage());
    }
  }
private void eliminar() {
    int filaSeleccionada = tablaLaboratorios.getSelectedRow();

    if (filaSeleccionada != -1) {

        int CodigoLaboratorio = (int) tablaLaboratorios.getValueAt(filaSeleccionada, 0);
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este laboratorio?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection con = ConexionBD.crearConexionBD();
                
                if (con != null) {

                    String sql = "DELETE FROM laboratorio WHERE CodigoLaboratorio = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, CodigoLaboratorio);
                    
                    int filasAfectadas = pst.executeUpdate();
                    
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Laboratorio eliminado correctamente.");
                        cargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al eliminar el laboratorio.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el laboratorio: " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un laboratorio para eliminar.");
    }
} 
private void editar() {
    int filaSeleccionada = tablaLaboratorios.getSelectedRow(); // Obtén la fila seleccionada de la tabla

    if (filaSeleccionada != -1) {
        // Obtén los datos actuales de la fila seleccionada
        int CodigoLaboratorio = (int) tablaLaboratorios.getValueAt(filaSeleccionada, 0);
        String nombreLaboratorio = (String) tablaLaboratorios.getValueAt(filaSeleccionada, 1);

        // Solicita nuevos datos al usuario con valores actuales como sugerencia
        String nuevoNombre = JOptionPane.showInputDialog(this, "Editar Nombre del Laboratorio:", nombreLaboratorio);

        // Verifica si el usuario ingresó un nuevo nombre válido
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            try {
                // Establece conexión con la base de datos
                Connection con = ConexionBD.crearConexionBD();
                if (con != null) {
                    String sql = "UPDATE laboratorio SET nombreLaboratorio = ? WHERE CodigoLaboratorio = ?";
                    PreparedStatement pst = con.prepareStatement(sql);

                    // Establece los valores en la consulta
                    pst.setString(1, nuevoNombre);
                    pst.setInt(2, CodigoLaboratorio);

                    // Ejecuta la actualización
                    int filasAfectadas = pst.executeUpdate();
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Laboratorio editado correctamente.");
                        cargarTabla(); // Refresca la tabla para mostrar los cambios
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al editar el laboratorio.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al editar el laboratorio: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre del laboratorio no puede estar vacío.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un laboratorio para editar.");
    }
}
}