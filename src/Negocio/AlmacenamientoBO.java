package Negocio;

import Servicio.AlmacenamientoDAO;
import Servicio.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class AlmacenamientoBO {
    public void guardarDatosAlmacenamiento(AlmacenamientoDAO obj, int CodigoAlmacenamiento, String temperaturaAlmacenamiento, String DescripcionAlmacenamiento){
        obj.setCodigoAlmacenamiento(CodigoAlmacenamiento);
        obj.setTemperaturaAlmacenamiento(temperaturaAlmacenamiento);
        obj.setDescripcionAlmacenamiento(DescripcionAlmacenamiento);
    }
    
    public void guardarDatosAlmacenamientoBD(AlmacenamientoDAO obj){
        Connection con = null;
        if ((con = ConexionBD.crearConexionBD()) != null) {try{
            String query = "INSERT INTO almacenamiento (temperaturaAlmacenamiento, DescripcionAlmacenamiento)" + "VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, obj.getTemperaturaAlmacenamiento());
                ps.setString(2, obj.getDescripcionAlmacenamiento());
                ps.execute();
                System.out.println("Se agregaron los datos correctamente");
                con.close(); 
            }catch(SQLException e){
                System.out.println("Error al agregar datos: " + e.getMessage());  // En caso de error
            }
        }
    }
    
    public DefaultTableModel obtenerModeloAlmacenamiento() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("CodigoAlmacenamiento");
    modelo.addColumn("temperaturaAlmacenamiento");
    modelo.addColumn("DescripcionAlmacenamiento");
    
    Connection con = null;
    if ((con = ConexionBD.crearConexionBD()) != null) {
        try {
            String query = "SELECT * FROM almacenamiento";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("CodigoAlmacenamiento"),
                    rs.getString("temperaturaAlmacenamiento"),
                    rs.getString("DescripcionAlmacenamiento"),
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
