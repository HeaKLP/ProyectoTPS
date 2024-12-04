package Servicio;

public class ProveedoresDAO {
    
    private int codigo;
    private String nombre;
    private String NIT;
    private String telefono;
    private String direccion;
    private String correo;
    private String nombre_contacto;

    public ProveedoresDAO(String nombre, String NIT, String telefono, String direccion, String correo, String nombre_contacto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.NIT = NIT;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.nombre_contacto = nombre_contacto;
    }

    public ProveedoresDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }
 
        
    }

