package com.example.k_movil10.LoguearEncuesta;

import java.util.Date;

public class ClienteEncuesta {
    private int pkClienteencuesta;
    private Date fecha;
    private Venta fkVenta;
    private Cliente Cliente;
    private Vendedor vendedor;

    public ClienteEncuesta(int pkClienteencuesta, Date fecha, Venta fkVenta, com.example.k_movil10.LoguearEncuesta.Cliente cliente, Vendedor vendedor) {
        this.pkClienteencuesta = pkClienteencuesta;
        this.fecha = fecha;
        this.fkVenta = fkVenta;
        Cliente = cliente;
        this.vendedor = vendedor;
    }

    public int getPkClienteencuesta() {
        return pkClienteencuesta;
    }

    public void setPkClienteencuesta(int pkClienteencuesta) {
        this.pkClienteencuesta = pkClienteencuesta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Venta getFkVenta() {
        return fkVenta;
    }

    public void setFkVenta(Venta venta) {
        this.fkVenta = venta;
    }

    public com.example.k_movil10.LoguearEncuesta.Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(com.example.k_movil10.LoguearEncuesta.Cliente cliente) {
        Cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
