package Negocio;

import Servicio.UsuarioDAO;
import Servicio.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

public class UsuarioBO {
    
    public void guardarDatosUser(UsuarioDAO obj, int idUsuario, int docUsuario, String nombreUsuario, String emailUsuario, String contraseñaUsuario, int telUsuario, int tipoUsuario) {
        obj.setIdUsuario(idUsuario);
        obj.setDocUsuario(docUsuario);
        obj.setNombreUsuario(nombreUsuario);
        obj.setEmailUsuario(emailUsuario);
        obj.setContraseñaUsuario(contraseñaUsuario);
        obj.setTipoUsuario(tipoUsuario);
    }
    
    public void guardarDatosUsuarioBD(UsuarioDAO obj) {
        Connection con = null;
        if ((con = ConexionBD.crearConexionBD()) != null) {
            try {

                String query = "INSERT INTO usuario (docUsuario, nombreUsuario, emailUsuario, contraseñaUsuario, telUsuario, fechIniUsuario, tipoUsuario)" +
                                "VALUES (?, ?, ?, ?, ?, ?, ?);";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, obj.getDocUsuario());
                ps.setString(2, obj.getNombreUsuario());
                ps.setString(3, obj.getEmailUsuario());
                ps.setString(4, obj.getContraseñaUsuario());
                ps.setString(5, obj.getTelUsuario());
                
                LocalDate fecha = obj.getFechIniUsuario();
                ps.setDate(6, Date.valueOf(fecha));
                
                ps.setInt(7, obj.getTipoUsuario());
                
                ps.execute();  
                System.out.println("Se agregaron los datos correctamente");
                con.close(); 
            } catch (SQLException e) {
                System.out.println("Error al agregar datos: " + e.getMessage());  // En caso de error
            }
        }
    }
    
    public DefaultTableModel obtenerModeloUsuarios() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Documento");
    modelo.addColumn("Nombre");
    modelo.addColumn("Email");
    modelo.addColumn("Teléfono");
    modelo.addColumn("Fecha Inicio");
    modelo.addColumn("Tipo Usuario");

    Connection con = null;
    if ((con = ConexionBD.crearConexionBD()) != null) {
        try {
            String query = "SELECT * FROM usuario";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("docUsuario"),
                    rs.getString("nombreUsuario"),
                    rs.getString("emailUsuario"),
                    rs.getString("telUsuario"),
                    rs.getDate("fechIniUsuario"),
                    rs.getInt("tipoUsuario")
                });
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        }
    }
    return modelo;
}
}
