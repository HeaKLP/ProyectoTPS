package Negocio;

import Servicio.TipoUsuarioDAO;
import Servicio.ConexionBD;
import java.sql.*;
import java.util.ArrayList;

public class TipoUsuarioBO {
    public ArrayList<TipoUsuarioDAO> lista;

    public TipoUsuarioBO() {
        lista = new ArrayList<>();
    }

    public void agregarTipoUsuario(TipoUsuarioDAO r) {
        boolean existe = lista.stream().anyMatch(rol -> rol.getIdTipoUsuario() == r.getIdTipoUsuario());
        if (!existe) {
            lista.add(r);
            System.out.println("Tipo Usuario agregado: " + r.getTipoUsuario());
        } else {
            System.out.println("El Tipo Usuario ya existe en la lista.");
        }
    }

    public void cargarRolesDesdeBD() {
        Connection con = null;
        try {
            con = ConexionBD.crearConexionBD();

            if (con != null) {
                String query = "SELECT * FROM tipousuario";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    TipoUsuarioDAO tipo = new TipoUsuarioDAO();
                    tipo.setIdTipoUsuario(rs.getInt("idTipoUsuario"));
                    tipo.setTipoUsuario(rs.getString("tipoUsuario"));
                    agregarTipoUsuario(tipo);
                }
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar los roles desde la base de datos: " + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
