package Servicio;

 public class TipoUsuarioDAO {
    private int idTipoUsuario;
    private String TipoUsuario;

    public TipoUsuarioDAO() {
    }

    
    
    public TipoUsuarioDAO(int idTipoUsuario, String TipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.TipoUsuario = TipoUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
    
    
}
 