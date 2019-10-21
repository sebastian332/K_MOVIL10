package com.example.k_movil10;

public class Usuariop {
    private int pkusuario;
    private String nombreusuario;
    private String contrasena;
    private int tipousuarioenum;

    public Usuariop() {
    }

    public Usuariop(int pkusuario, String nombreusuario, String contrasena, int tipousuarioenum) {
        this.pkusuario = pkusuario;
        this.nombreusuario = nombreusuario;
        this.contrasena = contrasena;
        this.tipousuarioenum = tipousuarioenum;
    }

    public int getPkusuario() {
        return pkusuario;
    }

    public void setPkusuario(int pkusuario) {
        this.pkusuario = pkusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTipousuarioenum() {
        return tipousuarioenum;
    }

    public void setTipousuarioenum(int tipousuarioenum) {
        this.tipousuarioenum = tipousuarioenum;
    }
}
