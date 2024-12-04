
package Servicio;

import java.time.LocalDate;

public class UsuarioDAO {
    
    public UsuarioDAO() {
    // Constructor vacío por defecto
    }
    //Atributos MER
    private int idUsuario;
    private int docUsuario;
    private String nombreUsuario;
    private String emailUsuario;
    private String contraseñaUsuario;
    private String telUsuario;
    private LocalDate  fechIniUsuario = LocalDate.now();
    private int tipoUsuario;

    public UsuarioDAO(int idUsuario, int docUsuario, String nombreUsuario, String emailUsuario, String contraseñaUsuario, String telUsuario, int tipoUsuario) {
        this.idUsuario = idUsuario;
        this.docUsuario = docUsuario;
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.telUsuario = telUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDocUsuario() {
        return docUsuario;
    }

    public void setDocUsuario(int docUsuario) {
        this.docUsuario = docUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }

    public LocalDate getFechIniUsuario() {
        return fechIniUsuario;
    }

    public void setFechIniUsuario(LocalDate fechIniUsuario) {
        this.fechIniUsuario = fechIniUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
