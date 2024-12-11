package Negocio;

import Servicio.ConexionBD;
import Servicio.ProveedoresDAO;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ProveedoresBO {
    
    ConexionBD con = new ConexionBD();
    Connection cn = con.crearConexionBD();
    
    public void guardarDatosProveedor(ProveedoresDAO obj, String nombreProveedores, String NITProveedores, String telProveedores, String dirProveedores, String correoProveedores, String NombreContactoProveedor, int codProveedores) {
        obj.setnombreProveedores(nombreProveedores);
        obj.setNITProveedores(NITProveedores);
        obj.settelProveedores(telProveedores);
        obj.setdirProveedores(dirProveedores);
        obj.setcorreoProveedores(correoProveedores);
        obj.setNombreContactoProveedor(NombreContactoProveedor);
    }
    
    public void guardarDatos(ProveedoresDAO obj){

    
    ConexionBD conexionBD = new ConexionBD();
Connection conexion = conexionBD.crearConexionBD();

if (conexion != null) {
    try {
        // Depuración de valores para verificar si están vacíos o nulos
        if (obj.getnombreProveedores() == null || obj.getnombreProveedores().trim().isEmpty() ||
            obj.getNITProveedores() == null || obj.getNITProveedores().trim().isEmpty() ||
            obj.gettelProveedores() == null || obj.gettelProveedores().trim().isEmpty() ||
            obj.getdirProveedores() == null || obj.getdirProveedores().trim().isEmpty() ||
            obj.getcorreoProveedores() == null || obj.getcorreoProveedores().trim().isEmpty() ||
            obj.getNombreContactoProveedor() == null || obj.getNombreContactoProveedor().trim().isEmpty()) {

            System.out.println("Error: No se pueden guardar datos vacíos.");
            
            // Mensajes específicos para depuración
            System.out.println("Verificación de valores:");
            System.out.println("Nombre: " + obj.getnombreProveedores());
            System.out.println("NIT: " + obj.getNITProveedores());
            System.out.println("Teléfono: " + obj.gettelProveedores());
            System.out.println("Dirección: " + obj.getdirProveedores());
            System.out.println("Correo: " + obj.getcorreoProveedores());
            System.out.println("Contacto: " + obj.getNombreContactoProveedor());
            
            return; // Finaliza si algún valor es inválido
        }

        String sql = "INSERT INTO proveedor (nombreProveedores, NITProveedores, telProveedores, dirProveedores, correoProveedores, NombreContactoProveedor) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, obj.getnombreProveedores());
        ps.setString(2, obj.getNITProveedores()); 
        ps.setString(3, obj.gettelProveedores()); 
        ps.setString(4, obj.getdirProveedores()); 
        ps.setString(5, obj.getcorreoProveedores()); 
        ps.setString(6, obj.getNombreContactoProveedor()); 

        ps.executeUpdate();
        System.out.println("Datos enviados correctamente.");

    } catch (SQLException e) {
        System.out.println("Error al insertar datos: " + e.getMessage());
    } finally {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
} else {
    System.out.println("No se pudo conectar a la base de datos.");
}

 
 }

    public void eliminar(JTable tablaproveedores) {
        int filaSeleccionada = tablaproveedores.getSelectedRow(); 
    if (filaSeleccionada != -1) { 
        try {
            
            int id = (int) tablaproveedores.getValueAt(filaSeleccionada, 0); 

            
            ConexionBD conexionBD = new ConexionBD();
            Connection conexion = conexionBD.crearConexionBD();

            if (conexion != null) {
                int confirmacion = JOptionPane.showConfirmDialog(
                    null, 
                    "¿Está seguro de eliminar este proveedor?", 
                    "Confirmar", 
                    JOptionPane.YES_NO_OPTION
                );

                if (confirmacion == JOptionPane.YES_OPTION) {
                    
                    String sql = "DELETE FROM proveedor WHERE codProveedores = ?";
                    PreparedStatement ps = conexion.prepareStatement(sql);
                    ps.setInt(1, id); 

                    
                    int filasAfectadas = ps.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Proveedor eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró el registro para eliminar.");
                    }

                    
                    ps.close();
                    conexion.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.");
    }
 }
    
    public void cargarDatosEnTabla(JTable tablaproveedores) {
    try {
        
        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = conexionBD.crearConexionBD();

        if (conexion != null) {
            
            String sql = "SELECT * FROM proveedor";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            
            DefaultTableModel modelo = (DefaultTableModel) tablaproveedores.getModel();
            modelo.setRowCount(0); 
            

            
            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("codProveedores"),  
                    rs.getString("nombreProveedores"),
                    rs.getString("NITProveedores"),
                    rs.getString("telProveedores"),
                    rs.getString("dirProveedores"),
                    rs.getString("correoProveedores"),
                    rs.getString("NombreContactoProveedor")
                };
                modelo.addRow(fila); 
                

            }

            
            rs.close();
            ps.close();
            conexion.close();
        }
    } catch (SQLException e) {
        System.out.println("Error al cargar los datos: " + e.getMessage());
    }
}
    
    public void actualizarProveedor(
            int codProveedores, 
            String nombreProveedores, 
            String NITProveedores, 
            String telProveedores, 
            String dirProveedores, 
            String correoProveedores, 
            String NombreContactoProveedor) throws SQLException {
        
        
        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = conexionBD.crearConexionBD();

        if (conexion != null) {
            
            String sql = "UPDATE proveedor SET nombreProveedores = ?, NITProveedores = ?, telProveedores = ?, dirProveedores = ?, correoProveedores = ?, NombreContactoProveedor = ? WHERE codProveedores = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreProveedores);
            ps.setString(2, NITProveedores);
            ps.setString(3, telProveedores);
            ps.setString(4, dirProveedores);
            ps.setString(5, correoProveedores);
            ps.setString(6, NombreContactoProveedor);
            ps.setInt(7, codProveedores);

            
            ps.executeUpdate();

            
            conexion.close();
        } else {
            throw new SQLException("No se pudo conectar a la base de datos.");
        }
    }

    
    
    
    

 }
    


    

