/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
/**
 *
 * @author Jefry
 */
public class transaccionDAO {
    // Variables para los datos
    private String codigoTransaccion;
    private String tipoTransaccion;
    private int cantidadTransaccion;
    private String fechaTransaccion;
    private float totalTransaccion;
    private String descripcionTransaccion;

    // Métodos Getter y Setter
    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getCantidadTransaccion() {
        return cantidadTransaccion;
    }

    public void setCantidadTransaccion(int cantidadTransaccion) {
        this.cantidadTransaccion = cantidadTransaccion;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public float getTotalTransaccion() {
        return totalTransaccion;
    }

    public void setTotalTransaccion(float totalTransaccion) {
        this.totalTransaccion = totalTransaccion;
    }

    public String getDescripcionTransaccion() {
        return descripcionTransaccion;
    }

    public void setDescripcionTransaccion(String descripcionTransaccion) {
        this.descripcionTransaccion = descripcionTransaccion;
    }   
} 
