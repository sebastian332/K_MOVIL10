package com.example.k_movil10.postEncuesta;

import java.util.Date;

public class Venta {
    private int pkVenta;
    private Date fecha;
    private String codigo;
    private double precioTotal;

    public Venta() {
    }

    public Venta(int pkVenta, Date fecha, String codigo, double precioTotal) {
        this.pkVenta = pkVenta;
        this.fecha = fecha;
        this.codigo = codigo;
        this.precioTotal = precioTotal;
    }

    public int getPkVenta() {
        return pkVenta;
    }

    public void setPkVenta(int pkVenta) {
        this.pkVenta = pkVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
