package com.example.k_movil10.LoguearEncuesta;

public class Cliente {
    private int pkPersona;
    private Persona fkPersona;

    public Cliente(int pkPersona, Persona fkPersona) {
        this.pkPersona = pkPersona;
        this.fkPersona = fkPersona;
    }

    public int getPkPersona() {
        return pkPersona;
    }

    public void setPkPersona(int pkPersona) {
        this.pkPersona = pkPersona;
    }

    public Persona getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Persona fkPersona) {
        this.fkPersona = fkPersona;
    }
}
