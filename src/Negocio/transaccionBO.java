/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Negocio;
/**
 *
 * @author Jefry
 */

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import Servicio.ConexionBD;
import Servicio.transaccionDAO;
import java.sql.PreparedStatement;



public class transaccionBO {
    private transaccionDAO datos; // Instancia de transaccionDAO

    public transaccionBO() {
        this.datos = new transaccionDAO(); // Inicialización de la instancia
    }

    public void setDatos(transaccionDAO datos) {
        this.datos = datos;
    }

    public transaccionDAO getDatos() {
        return this.datos;
    }     

    // Método para agregar datos de una transacción
    public void AgregarDatosTransaccion(String tipo, int cantidad, String fecha, float total, String descripcion) {
    // Validar y asignar valores a `transaccionDAO`
    try {
        datos.setTipoTransaccion(tipo);
        datos.setCantidadTransaccion(cantidad);
        datos.setFechaTransaccion(fecha);
        datos.setTotalTransaccion(total);
        datos.setDescripcionTransaccion(descripcion);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al asignar los datos: " + e.getMessage());
        return;
    }

    // Conexión a la base de datos
    ConexionBD conexionBD = new ConexionBD();
    Connection conexion = conexionBD.crearConexionBD();

    // Consulta SQL
    String consulta = "INSERT INTO transaccion (tipoTransaccion, cantidadTransaccion, fechaTransaccion, totalTransaccion, descripcionTransaccion) VALUES (?, ?, ?, ?, ?)";

    try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
        // Usar getters de `transaccionDAO`
        ps.setString(1, datos.getTipoTransaccion());
        ps.setInt(2, datos.getCantidadTransaccion());
        ps.setString(3, datos.getFechaTransaccion());
        ps.setFloat(4, datos.getTotalTransaccion());
        ps.setString(5, datos.getDescripcionTransaccion());

        // Ejecutar la consulta
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se insertó correctamente la transacción");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar la transacción: " + e.getMessage());
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



    // Mostrar datos en JTable
    public void MostrarTabla(JTable paramTablaMostrar) {
        // Instancia de conexión
        ConexionBD conexion = new ConexionBD();
        Connection conn = null;

        // Modelo de tabla
        DefaultTableModel modelo = new DefaultTableModel();

        // Ordenar la tabla
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<>(modelo);
        paramTablaMostrar.setRowSorter(ordenarTabla);

        // Añadir columnas
        modelo.addColumn("codigoTransaccion");
        modelo.addColumn("tipoTransaccion");
        modelo.addColumn("cantidadTransaccion");
        modelo.addColumn("fechaTransaccion");
        modelo.addColumn("totalTransaccion");
        modelo.addColumn("descripcionTransaccion");

        // Asignar modelo al JTable
        paramTablaMostrar.setModel(modelo);

        // Consulta SQL
        String sql = "SELECT * FROM transaccion";
        String[] datos = new String[6]; // Almacenar temporalmente cada fila

        try {
            // Establecer conexión
            conn = conexion.crearConexionBD();
            if (conn == null) {
                throw new SQLException("No se pudo establecer conexión con la base de datos.");
            }

            // Crear Statement y ejecutar consulta
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Iterar resultados y llenar el modelo
            while (rs.next()) {
                datos[0] = rs.getString("codigoTransaccion");
                datos[1] = rs.getString("tipoTransaccion");
                datos[2] = rs.getString("cantidadTransaccion");
                datos[3] = rs.getString("fechaTransaccion");
                datos[4] = rs.getString("totalTransaccion");
                datos[5] = rs.getString("descripcionTransaccion");
                modelo.addRow(datos);
            }

            paramTablaMostrar.setModel(modelo);

            // Cerrar recursos
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los registros: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage());
            ex.printStackTrace();
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

    // Modificar transacción seleccionada en JTable
    public void MostrarRegistro(JTable paramMostrarTabla,JTextField paramCodigo,JTextField paramTipo, JTextField paramCantidad, JTextField paramFecha,
                                        JTextField paramTotal, JTextField paramDescripcion) {
        try {
            int fila = paramMostrarTabla.getSelectedRow();

            if (fila >= 0) {
                paramCodigo.setText(paramMostrarTabla.getValueAt(fila, 0).toString());
                paramTipo.setText(paramMostrarTabla.getValueAt(fila, 1).toString());
                paramCantidad.setText(paramMostrarTabla.getValueAt(fila, 2).toString());
                paramFecha.setText(paramMostrarTabla.getValueAt(fila, 3).toString());
                paramTotal.setText(paramMostrarTabla.getValueAt(fila, 4).toString());
                paramDescripcion.setText(paramMostrarTabla.getValueAt(fila, 5).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error" + e.toString());
        }
    }

    // Modificar un registro de la transacción
    public void ModificarRegistro(JTextField paramCodigo, JTextField paramTipo, JTextField paramCantidad,
                               JTextField paramFecha, JTextField paramTotal, JTextField paramDescripcion) {
    // Validación y asignación de valores
    String codigoTransaccion = paramCodigo.getText();
    String tipoTransaccion = paramTipo.getText();
    int cantidadTransaccion;
    float totalTransaccion;
    String descripcionTransaccion = paramDescripcion.getText();
    String fechaTransaccion;

    try {
        // Validar cantidad y total
        cantidadTransaccion = Integer.parseInt(paramCantidad.getText());
        totalTransaccion = Float.parseFloat(paramTotal.getText());

        // Validar y convertir fecha
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // No permitir fechas inválidas
        fechaTransaccion = paramFecha.getText();
        sdf.parse(fechaTransaccion); // Verificar si la fecha es válida
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Cantidad y Total deben ser valores numéricos.");
        return;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "La fecha debe tener el formato yyyy-MM-dd.");
        return;
    }

    // Conexión a la base de datos
    ConexionBD conexion = new ConexionBD();
    Connection conn = null;

    // Consulta SQL para actualizar
    String consulta = "UPDATE transaccion SET tipoTransaccion = ?, cantidadTransaccion = ?, fechaTransaccion = ?, "
            + "totalTransaccion = ?, descripcionTransaccion = ? WHERE codigoTransaccion = ?";

    try {
        conn = conexion.crearConexionBD();
        if (conn == null) {
            throw new SQLException("No se pudo establecer conexión con la base de datos.");
        }

        // Preparar la consulta
        CallableStatement cs = conn.prepareCall(consulta);
        cs.setString(1, tipoTransaccion);
        cs.setInt(2, cantidadTransaccion);
        cs.setString(3, fechaTransaccion); // Fecha validada
        cs.setFloat(4, totalTransaccion);
        cs.setString(5, descripcionTransaccion);
        cs.setString(6, codigoTransaccion); // Código como identificador

        // Ejecutar consulta
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Modificación exitosa");

        cs.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la modificación del dato: " + e.getMessage());
        e.printStackTrace();
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


    // Eliminar registro por código de transacción
    public void EliminarRegistro(JTextField paramCodigo) {
    datos.setCodigoTransaccion(paramCodigo.getText());

    if (datos.getCodigoTransaccion().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Código de transacción vacío");
        return;
    }

    String consulta = "DELETE FROM transaccion WHERE transaccion.codigoTransaccion = ?";

    ConexionBD conexion = new ConexionBD();

    try (Connection conn = conexion.crearConexionBD();
         CallableStatement cs = conn.prepareCall(consulta)) {
        cs.setString(1, datos.getCodigoTransaccion());
        cs.execute();

        JOptionPane.showMessageDialog(null, "Se realizó la eliminación de los datos correctamente");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar los datos: " + e.getMessage());
    }
    }
}