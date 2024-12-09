package Negocio;

import Servicio.ConexionBD;
import Servicio.LaboratorioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class LaboratorioBO {
    public void agregarLaboratorio(LaboratorioDAO obj, int Codigolaboratorio, String NombreLaboratorio) {
        obj.setCodigoLaboratorio(Codigolaboratorio); 
        obj.setNombreLaboratorio(NombreLaboratorio);
    }

    public void guardarDatosLaboratorioBD(LaboratorioDAO obj){
        Connection con = null;
        if ((con = ConexionBD.crearConexionBD()) != null) {try{
            String query = "INSERT INTO laboratorio (nombreLaboratorio)" + "VALUES (?)";
            PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, obj.getNombreLaboratorio());
                ps.execute();
                System.out.println("Se agregaron los datos correctamente");
                con.close(); 
            }catch(SQLException e){
                System.out.println("Error al agregar datos: " + e.getMessage());  // En caso de error
            }
        }
    }
        
    public DefaultTableModel obtenerModeloLaboratorioo() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("CodigoLaboratorio");
    modelo.addColumn("NombreLaboratorio");
    
    Connection con = null;
    if ((con = ConexionBD.crearConexionBD()) != null) {
        try {
            String query = "SELECT * FROM laboratorio";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("CodigoLaboratorio"),
                    rs.getString("NombreLaboratorio"),
                });
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al obtener descripción del almacenamiento: " + e.getMessage());
        }
    }
    return modelo;
    }
}