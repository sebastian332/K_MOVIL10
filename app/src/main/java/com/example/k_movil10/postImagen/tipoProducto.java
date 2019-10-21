package com.example.k_movil10.postImagen;

public class tipoProducto {
    private int pkTipoProducto;
    private String codigo;
    private String nombre;

    public tipoProducto() {
    }

    public tipoProducto(int pkTipoProducto, String codigo, String nombre) {
        this.pkTipoProducto = pkTipoProducto;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getPkTipoProducto() {
        return pkTipoProducto;
    }

    public void setPkTipoProducto(int pkTipoProducto) {
        this.pkTipoProducto = pkTipoProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
