package com.example.k_movil10.postImagen;

import com.example.k_movil10.postImagen.tipoProducto;

import java.math.BigDecimal;

public class Producto {
    public BigDecimal pkproducto;
    public String codigo;
    public String nombre;
    public tipoProducto fkTipoproducto;

    public Producto() {
    }

    public Producto(BigDecimal pkproducto, String codigo, String nombre) {
        this.pkproducto = pkproducto;
        this.codigo = codigo;
        this.nombre = nombre;
    }


    public BigDecimal getPkproducto() {
        return pkproducto;
    }

    public void setPkproducto(BigDecimal pkproducto) {
        this.pkproducto = pkproducto;
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

    public tipoProducto getFkTipoproducto() {
        return fkTipoproducto;
    }

    public void setFkTipoproducto(tipoProducto fkTipoproducto) {
        this.fkTipoproducto = fkTipoproducto;
    }
}
