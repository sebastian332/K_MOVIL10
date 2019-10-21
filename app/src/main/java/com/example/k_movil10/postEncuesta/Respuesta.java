package com.example.k_movil10.postEncuesta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Respuesta {
    @SerializedName("respuesta")
    @Expose
    private String respuesta;
    @SerializedName("fkClienteencuesta")
    @Expose
    private FkClienteencuesta fkClienteencuesta;
    @SerializedName("fkPregunta")
    @Expose
    private FkPregunta fkPregunta;

    public Respuesta(String respuesta, FkClienteencuesta fkClienteencuesta, FkPregunta fkPregunta) {
        this.respuesta = respuesta;
        this.fkClienteencuesta = fkClienteencuesta;
        this.fkPregunta = fkPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public FkClienteencuesta getFkClienteencuesta() {
        return fkClienteencuesta;
    }

    public void setFkClienteencuesta(FkClienteencuesta fkClienteencuesta) {
        this.fkClienteencuesta = fkClienteencuesta;
    }

    public FkPregunta getFkPregunta() {
        return fkPregunta;
    }

    public void setFkPregunta(FkPregunta fkPregunta) {
        this.fkPregunta = fkPregunta;
    }
}
