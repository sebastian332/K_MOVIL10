package com.example.k_movil10.LoguearEncuesta;

import java.util.Date;

public class Venta {
    private int pkVenta;
    private String codigo;
    private Cliente fkCliente;
    private Vendedor vendedor;

    public Venta() {
    }

    public Venta(int pkVenta,  String codigo, Cliente fkCliente, Vendedor vendedor) {
        this.pkVenta = pkVenta;
        this.codigo = codigo;
        this.fkCliente = fkCliente;
        this.vendedor = vendedor;
    }

    public int getPkVenta() {
        return pkVenta;
    }

    public void setPkVenta(int pkVenta) {
        this.pkVenta = pkVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(Cliente fkCliente) {
        this.fkCliente = fkCliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
