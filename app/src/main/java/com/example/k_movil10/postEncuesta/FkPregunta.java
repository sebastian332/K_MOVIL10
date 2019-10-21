package com.example.k_movil10.postEncuesta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FkPregunta {
    @SerializedName("pkPregunta")
    @Expose
    private Integer pkPregunta;
    @SerializedName("pregunta")
    @Expose
    private String pregunta;

    public FkPregunta(Integer pkPregunta, String pregunta) {
        this.pkPregunta = pkPregunta;
        this.pregunta = pregunta;
    }

    public FkPregunta(Integer pkPregunta) {
        this.pkPregunta = pkPregunta;
    }

    public FkPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getPkPregunta() {
        return pkPregunta;
    }

    public void setPkPregunta(Integer pkPregunta) {
        this.pkPregunta = pkPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
