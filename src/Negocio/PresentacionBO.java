/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Servicio.PresentacionDAO;
import Servicio.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PresentacionBO {

    // Método para guardar los datos de la presentación en el objeto PresentacionDAO
    public void guardarDatosPresentacion(PresentacionDAO obj, int codigoPresentacion, String descripcionPresentacion) {
        obj.setCodigoPresentacion(codigoPresentacion);
        obj.setDescripcionPresentacion(descripcionPresentacion);
    }

    // Método para guardar la presentación en la base de datos
    public void guardarDatosPresentacionBD(PresentacionDAO obj) {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "INSERT INTO presentacion (codigoPresentacion, descripcionPresentacion) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, obj.getCodigoPresentacion());
                ps.setString(2, obj.getDescripcionPresentacion());
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
        modelo.addColumn("Código Presentación");
        modelo.addColumn("Descripción");

        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "SELECT * FROM presentacion";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getInt("codigoPresentacion"),
                        rs.getString("descripcionPresentacion")
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

    // Método para eliminar una presentación por su código
    public void eliminarPresentacionBD(int codigoPresentacion) {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "DELETE FROM presentacion WHERE codigoPresentacion = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, codigoPresentacion);
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

    // Método para editar una presentación por su código
    public void editarPresentacionBD(PresentacionDAO obj) {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();
            if (con != null) {
                String query = "UPDATE presentacion SET descripcionPresentacion = ? WHERE codigoPresentacion = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, obj.getDescripcionPresentacion());
                ps.setInt(2, obj.getCodigoPresentacion());
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
