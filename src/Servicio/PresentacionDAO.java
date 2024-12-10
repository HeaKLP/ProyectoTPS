/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

public class PresentacionDAO {
    
    // Atributo para descripción
    private String descripcionPresentacion;
    private String Producto_CodigoProducto;

    // Constructor vacío
    public PresentacionDAO() {
    }

    // Constructor con parámetros
    public PresentacionDAO(String descripcionPresentacion, String Producto_CodigoProducto) {
        this.descripcionPresentacion = descripcionPresentacion;
        this.Producto_CodigoProducto = Producto_CodigoProducto;
    }

    // Getter y Setter

    public String getDescripcionPresentacion() {
        return descripcionPresentacion;
    }

    public void setDescripcionPresentacion(String descripcionPresentacion) {
        this.descripcionPresentacion = descripcionPresentacion;
    }

    public String getProducto_CodigoProducto() {
        return Producto_CodigoProducto;
    }

    public void setProducto_CodigoProducto(String Producto_CodigoProducto) {
        this.Producto_CodigoProducto = Producto_CodigoProducto;
    }

    
    
}
