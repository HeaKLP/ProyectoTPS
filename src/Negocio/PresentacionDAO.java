/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 /**
 *
 * @author USUARIO
 */
package Servicio;

public class PresentacionDAO {
    
    // Constructor vacío
    public PresentacionDAO() {
    }

    // Atributos MER
    private int codigoPresentacion;
    private String descripcionPresentacion;

    // Constructor con parámetros
    public PresentacionDAO(int codigoPresentacion, String descripcionPresentacion) {
        this.codigoPresentacion = codigoPresentacion;
        this.descripcionPresentacion = descripcionPresentacion;
    }

    // Getters y Setters
    public int getCodigoPresentacion() {
        return codigoPresentacion;
    }

    public void setCodigoPresentacion(int codigoPresentacion) {
        this.codigoPresentacion = codigoPresentacion;
    }

    public String getDescripcionPresentacion() {
        return descripcionPresentacion;
    }

    public void setDescripcionPresentacion(String descripcionPresentacion) {
        this.descripcionPresentacion = descripcionPresentacion;
    }

    // Métodos para añadir, eliminar y editar presentación
    public void añadirPresentacion(int codigo, String descripcion) {
        this.codigoPresentacion = codigo;
        this.descripcionPresentacion = descripcion;
        System.out.println("Presentación añadida: Código - " + codigo + ", Descripción - " + descripcion);
    }

    public void eliminarPresentacion() {
        System.out.println("Presentación eliminada: Código - " + codigoPresentacion + ", Descripción - " + descripcionPresentacion);
        this.codigoPresentacion = 0;
        this.descripcionPresentacion = null;
    }

    public void editarPresentacion(int nuevoCodigo, String nuevaDescripcion) {
        System.out.println("Presentación editada: De Código - " + codigoPresentacion + ", Descripción - " + descripcionPresentacion +
                           " a Código - " + nuevoCodigo + ", Descripción - " + nuevaDescripcion);
        this.codigoPresentacion = nuevoCodigo;
        this.descripcionPresentacion = nuevaDescripcion;
    }
}
