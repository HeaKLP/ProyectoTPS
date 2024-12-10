package Servicio;


public class ProveedoresDAO {
    
    public ProveedoresDAO() {
    // Constructor vacío por defecto
    }
    
    private int codProveedores;
    private String nombreProveedores;
    private String NITProveedores;
    private String telProveedores;
    private String dirProveedores;
    private String correoProveedores;
    private String NombreContactoProveedor;

    public ProveedoresDAO(int codProveedores,String nombreProveedores,String NITProveedores,String telProveedores,String dirProveedores,String correoProveedores,String NombreContactoProveedor) {
        this.codProveedores = codProveedores;
        this.nombreProveedores = nombreProveedores;
        this.NITProveedores = NITProveedores;
        this.telProveedores = telProveedores;
        this.dirProveedores = dirProveedores;
        this.correoProveedores = correoProveedores;
        this.NombreContactoProveedor = NombreContactoProveedor;
    }


    public int getcodProveedores() {
        return codProveedores;
    }

    public void setcodProveedores(int codProveedores) {
        this.codProveedores = codProveedores;
    }

    public String getnombreProveedores() {
        return nombreProveedores;
    }

    public void setnombreProveedores(String nombreProveedores) {
        this.nombreProveedores = nombreProveedores;
    }

    public String getNITProveedores() {
        return NITProveedores;
    }

    public void setNITProveedores(String NITProveedores) {
        this.NITProveedores = NITProveedores;
    }

    public String gettelProveedores() {
        return telProveedores;
    }

    public void settelProveedores(String telProveedores) {
        this.telProveedores = telProveedores;
    }

    public String getdirProveedores() {
        return dirProveedores;
    }

    public void setdirProveedores(String dirProveedores) {
        this.dirProveedores = dirProveedores;
    }

    public String getcorreoProveedores() {
        return correoProveedores;
    }

    public void setcorreoProveedores(String correoProveedores) {
        this.correoProveedores = correoProveedores;
    }

    public String getNombreContactoProveedor() {
        return NombreContactoProveedor;
    }

    public void setNombreContactoProveedor(String NombreContactoProveedor) {
        this.NombreContactoProveedor = NombreContactoProveedor;
    }
 
        
    }

