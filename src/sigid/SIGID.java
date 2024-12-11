package sigid;

import Servicio.ConexionBD;
import Presentacion.interfazLogin;

public class SIGID {
    
    public static void main(String[] args) {
        
       ConexionBD con = new ConexionBD();
        
    
        
        
        interfazLogin Login = new interfazLogin();
        
        Login.setVisible(true);
        Login.setLocationRelativeTo(null);
        
    }
    
}
