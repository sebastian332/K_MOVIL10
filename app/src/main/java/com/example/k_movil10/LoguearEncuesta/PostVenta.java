package com.example.k_movil10.LoguearEncuesta;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostVenta {
    String API_LOGIN = "webresources/k_soft.jpa.entidades.venta/android/{codigo}";
    @GET(API_LOGIN)
    Call<List<Venta>> autenticarCodigo(@Path("codigo") String codigo);
}
