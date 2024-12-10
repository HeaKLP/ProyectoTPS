package Negocio;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.time.LocalDate;
import Servicio.ConexionBD;
import Servicio.ProductosDAO;

public class ProductosBO {
    private ProductosDAO datos; // Instancia de ProductoDAO

    public ProductosBO() {
        this.datos = new ProductosDAO(); // Inicialización de la instancia
    }

    public void setDatos(ProductosDAO datos) {
        this.datos = datos;
    }

    public ProductosDAO getDatos() {
        return this.datos;
    }

    // Método para agregar un producto a la base de datos
    public void AgregarProducto(String nombreProducto, int concentracion, float precio, 
                                 String laboratorio, int cantidad, LocalDate fechaVencimiento) {
        try {
            datos.setNombreProducto(nombreProducto);
            datos.setConcentracion(concentracion);
            datos.setPrecio(precio);
            datos.setLaboratorio(laboratorio);
            datos.setCantidad(cantidad);
            datos.setFechaVencimiento(fechaVencimiento);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al asignar los datos: " + e.getMessage());
            return;
        }

        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = conexionBD.crearConexionBD();

        String consulta = "INSERT INTO producto (nombreProducto, concentracion, precio, laboratorio, cantidad, fechaVencimiento) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ps.setString(1, datos.getNombreProducto());
            ps.setInt(2, datos.getConcentracion());
            ps.setFloat(3, datos.getPrecio());
            ps.setString(4, datos.getLaboratorio());
            ps.setInt(5, datos.getCantidad());
            ps.setDate(6, java.sql.Date.valueOf(datos.getFechaVencimiento()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el producto: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }

    // Método para mostrar productos en la tabla
    public void MostrarTabla(JTable paramTablaMostrar) {
        ConexionBD conexion = new ConexionBD();
        Connection conn = null;

        DefaultTableModel modelo = new DefaultTableModel();
        paramTablaMostrar.setRowSorter(new TableRowSorter<>(modelo));

        modelo.addColumn("NombreProducto");
        modelo.addColumn("Concentración");
        modelo.addColumn("Precio");
        modelo.addColumn("Laboratorio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("FechaVencimiento");

        paramTablaMostrar.setModel(modelo);

        String sql = "SELECT * FROM producto";
        String[] datos = new String[6];

        try {
            conn = conexion.crearConexionBD();
            if (conn == null) {
                throw new SQLException("No se pudo establecer conexión con la base de datos.");
            }

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString("nombreProducto");
                datos[1] = String.valueOf(rs.getInt("concentracion"));
                datos[2] = String.valueOf(rs.getFloat("precio"));
                datos[3] = rs.getString("laboratorio");
                datos[4] = String.valueOf(rs.getInt("cantidad"));
                datos[5] = rs.getDate("fechaVencimiento").toString();
                modelo.addRow(datos);
            }

            paramTablaMostrar.setModel(modelo);

            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los productos: " + e.getMessage());
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }

    public boolean eliminarProductoBD(ProductosDAO productoDAO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void guardarDatosProductoBD(ProductosDAO productoDAO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
