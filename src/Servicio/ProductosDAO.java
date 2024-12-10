package Servicio;

import java.time.LocalDate;

/**
 * Clase para la gestión de productos con sus atributos correspondientes.
 */
public class ProductosDAO {
    private int idProducto;
    private String nombreProducto;
    private int concentracion;
    private float precio;
    private String laboratorio;
    private int cantidad;
    private LocalDate fechaVencimiento;

    // Constructor vacío
    public ProductosDAO() {}

    // Constructor con parámetros para inicializar todos los atributos
    public ProductosDAO(int idProducto, String nombreProducto, int concentracion, float precio,
                         String laboratorio, int cantidad, LocalDate fechaVencimiento) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.concentracion = concentracion;
        this.precio = precio;
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = (float) precio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // Método opcional para mostrar la información completa del producto
    @Override
    public String toString() {
        return "ProductoDAO{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", concentracion=" + concentracion +
                ", precio=" + precio +
                ", laboratorio='" + laboratorio + '\'' +
                ", cantidad=" + cantidad +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }

    public void setidProducto(int idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
