/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Servicio.PresentacionDAO;
import Servicio.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PresentacionBO {

    // Método para guardar la presentación en la base de datos
    public void guardarDatosPresentacionBD(PresentacionDAO obj) {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "INSERT INTO presentacion (descripcionPresentacion, Producto_CodigoProducto) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, obj.getDescripcionPresentacion());
                ps.setString(2, obj.getProducto_CodigoProducto());
                ps.execute();
                System.out.println("Presentación agregada correctamente");
            } else {
                System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar presentación: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // Método para obtener el modelo de datos de presentaciones desde la base de datos
    public DefaultTableModel obtenerModeloPresentaciones() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Descripción");
        modelo.addColumn("Producto");

        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "SELECT descripcionPresentacion , Producto_CodigoProducto FROM presentacion";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("descripcionPresentacion"),
                        rs.getInt("Producto_CodigoProducto"),
                        });
                }
            } else {
                System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener presentaciones: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return modelo;
    }

    // Método para eliminar una presentación por su descripción
    public void eliminarPresentacionBD(int CodigoPresentacion, String descripcionPresentacion, String Producto_CodigoProducto) {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "DELETE FROM presentacion WHERE CodigoPresentacion = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, CodigoPresentacion);
                ps.execute();
                System.out.println("Presentación eliminada correctamente");
            } else {
                System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar presentación: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // Método para editar una presentación por su descripción
    public void editarPresentacionBD(String descripcionAntigua, String descripcionNueva) {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "UPDATE presentacion SET descripcionPresentacion = ? WHERE descripcionPresentacion = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, descripcionNueva);
                ps.setString(2, descripcionAntigua);
                ps.execute();
                System.out.println("Presentación editada correctamente");
            } else {
                System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al editar presentación: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
