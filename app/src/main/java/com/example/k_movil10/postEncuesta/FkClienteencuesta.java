package com.example.k_movil10.postEncuesta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class FkClienteencuesta {
    @SerializedName("pkClienteencuesta")
    @Expose
    private Integer pkClienteencuesta;

    public FkClienteencuesta(Integer pkClienteencuesta) {
        this.pkClienteencuesta = pkClienteencuesta;
    }

    public Integer getPkClienteencuesta() {
        return pkClienteencuesta;
    }

    public void setPkClienteencuesta(Integer pkClienteencuesta) {
        this.pkClienteencuesta = pkClienteencuesta;
    }
}
