package Negocio;

import Servicio.ConexionBD;
import Servicio.ProveedoresDAO;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProveedoresBO {
    
    ConexionBD con = new ConexionBD();
    Connection cn = con.crearConexionBD();
    
    
    public void registrarbd(ProveedoresDAO p){
        try{
            String query = "INSERT INTO proveedores(nombre,NIT,telefono,direccion,correo,nombre_contacto)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps=cn.prepareStatement(query);
         ps.setString(1, p.getNombre());
         ps.setString(2, p.getNIT());
         ps.setString(3, p.getTelefono());
         ps.setString(4, p.getDireccion());
         ps.setString(5, p.getCorreo());
         ps.setString(6, p.getNombre_contacto());
         ps.executeUpdate();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al registrar datos"+e);
        }
    }
    
    public void MostrarTable(JTable tabla){
          DefaultTableModel modelo=new DefaultTableModel();
          modelo.addColumn("nombre");
          modelo.addColumn("NIT");
          modelo.addColumn("telefono");
          modelo.addColumn("direccion");
          modelo.addColumn("correo");
          modelo.addColumn("nombre_contacto");
          
          
          String consultasql="SELECT*FROM proveedores";
          Statement st;
          try {
              st=cn.createStatement();
                ResultSet rs=st.executeQuery(consultasql);
                while(rs.next()){
                    Object [] lista={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                    modelo.addRow(lista);
                }
                tabla.setModel(modelo);
          } catch(Exception e){
              System.out.println("ERROR AL LISTAR LOS DATOS"+e);
          }
    }
}
