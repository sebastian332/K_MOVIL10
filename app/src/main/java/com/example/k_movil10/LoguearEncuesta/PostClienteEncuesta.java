package com.example.k_movil10.LoguearEncuesta;

import com.example.k_movil10.Usuariop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostClienteEncuesta {
    String API_ROUTE = "webresources/k_soft.jpa.entidades.clienteencuesta/android/{codigo}";
    @GET(API_ROUTE)
    Call<List<ClienteEncuesta>> autenticarCodigo(@Path("codigo") String codigo);
}
