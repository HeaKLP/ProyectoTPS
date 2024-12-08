package Presentacion;

import Servicio.LaboratorioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;  

public class interfazLaboratorio extends javax.swing.JPanel {

    private interfazPrincipal principal;
    private final DefaultTableModel tableModel;   
    private final LaboratorioDAO laboratorioDAO;  

    public interfazLaboratorio(interfazPrincipal principal) {
        this.principal = principal;
        
        initComponents();
        laboratorioDAO = new LaboratorioDAO();  
        tableModel = (DefaultTableModel) tablaLaboratorios.getModel();  
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
        jScrollPane1.setBounds(50, 190, 500, 201);

        nombreTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        add(nombreTextField);
        nombreTextField.setBounds(210, 80, 180, 23);

        agregarButton.setBackground(new java.awt.Color(25, 80, 180));
        agregarButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agregarButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });
        add(agregarButton);
        agregarButton.setBounds(140, 150, 81, 24);

        editarButton.setBackground(new java.awt.Color(25, 80, 180));
        editarButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        add(editarButton);
        editarButton.setBounds(270, 150, 72, 24);

        eliminarButton.setBackground(new java.awt.Color(25, 80, 180));
        eliminarButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        add(eliminarButton);
        eliminarButton.setBounds(390, 150, 90, 24);

        nombreLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nombreLabel.setText("Nombre del Laboratorio:");
        add(nombreLabel);
        nombreLabel.setBounds(210, 50, 180, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        String nombreLaboratorio = nombreTextField.getText().trim();
    if (!nombreLaboratorio.isEmpty()) {
        
        nombreTextField.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "El nombre del laboratorio no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
    if (!validarCampos()) return;

    try {
        
        String nombreLaboratorio = nombreTextField.getText().trim();

       
        laboratorioDAO.agregarLaboratorio(nombreLaboratorio);

       
        actualizarTablaLaboratorios();

        
        nombreTextField.setText("");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al agregar el laboratorio: " + e.getMessage());
    }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
int filaSeleccionada = tablaLaboratorios.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un laboratorio para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    int codigoLaboratorio = (int) tablaLaboratorios.getValueAt(filaSeleccionada, 0);

    
    String nuevoNombreLaboratorio = nombreTextField.getText().trim();

    
    if (nuevoNombreLaboratorio.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El nombre del laboratorio no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        
        laboratorioDAO.editarLaboratorio(codigoLaboratorio, nuevoNombreLaboratorio);

       
        actualizarTablaLaboratorios();

       
        nombreTextField.setText("");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al editar el laboratorio: " + e.getMessage());
    }
    }//GEN-LAST:event_editarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
       int filaSeleccionada = tablaLaboratorios.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un laboratorio para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int codigoLaboratorio = (int) tablaLaboratorios.getValueAt(filaSeleccionada, 0);

    try {
        laboratorioDAO.eliminarLaboratorio(codigoLaboratorio);
        actualizarTablaLaboratorios();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el laboratorio: " + e.getMessage());
    }
    }//GEN-LAST:event_eliminarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTable tablaLaboratorios;
    // End of variables declaration//GEN-END:variables

   
    private boolean validarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void actualizarTablaLaboratorios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
