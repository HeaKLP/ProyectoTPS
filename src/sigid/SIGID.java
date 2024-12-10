package sigid;
import Presentacion.interfazPrincipal;
import Presentacion.interfazUsuario;
import Servicio.ConexionBD;
import Presentacion.interfazLogin;

public class SIGID {
    
    public static void main(String[] args) {
        
       ConexionBD con = new ConexionBD();
        con.crearConexionBD();
        
        interfazPrincipal interfaz = new interfazPrincipal();
        
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        
    }
    
}
