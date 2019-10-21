package com.example.k_movil10.LoguearEncuesta;

public class Vendedor {
    private int pkVendedor;
    private Persona fkPersona;

    public Vendedor(int pkVendedor, Persona fkPersona) {
        this.pkVendedor = pkVendedor;
        this.fkPersona = fkPersona;
    }

    public int getPkVendedor() {
        return pkVendedor;
    }

    public void setPkVendedor(int pkVendedor) {
        this.pkVendedor = pkVendedor;
    }

    public Persona getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Persona fkPersona) {
        this.fkPersona = fkPersona;
    }
}
