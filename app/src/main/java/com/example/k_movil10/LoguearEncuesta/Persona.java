package com.example.k_movil10.LoguearEncuesta;

public class Persona {
    private int pkPersona;
    private String identificacion;
    private String nombres;
    private String apellidos;

    public Persona(int pkPersona, String identificacion, String nombres, String apellidos) {
        this.pkPersona = pkPersona;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getPkPersona() {
        return pkPersona;
    }

    public void setPkPersona(int pkPersona) {
        this.pkPersona = pkPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
