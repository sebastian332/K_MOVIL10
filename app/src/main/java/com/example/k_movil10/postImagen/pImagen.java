package com.example.k_movil10.postImagen;

public class pImagen {
    public int pkImagen;
    public String ruta;
    public String descripcion;
    public Producto fkProducto;
    public String producto;
    public String tipoProducto;

    public pImagen() {
    }
//prueba
    public pImagen(String ruta, String descripcion){
        this.ruta = ruta;
        this.descripcion = descripcion;
    }

    //la verdadera jejeje
    public pImagen(String ruta, Producto producto, String descripcion){
        this.ruta=ruta;
        this.fkProducto=producto;
        this.descripcion=descripcion;
    }

    public int getPkImagen() {
        return pkImagen;
    }

    public void setPkImagen(int pkImagen) {
        this.pkImagen = pkImagen;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getFkProducto() {
        return fkProducto;
    }

    public void setFkProducto(Producto fkProducto) {
        this.fkProducto = fkProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
