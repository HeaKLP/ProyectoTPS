package Servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection crearConexionBD() {
        Connection con = null;
        String host = "localhost";
        String user = "root";
        String password = "";
        int port = 3306;
        String database = "sistemainvetario";
        String url = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Librería no encontrada: " + e.getMessage());
            return null;
        }
        
        try {
            url = String.format("jdbc:mysql://%s:%d/%s", host, port, database);
            System.out.println("URL: " + url);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion con " + database + " establecida");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la BD: " + e.getMessage());
        }
        return con;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
