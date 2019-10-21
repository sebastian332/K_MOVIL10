package com.example.k_movil10;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface usuario {
    String API_LOGIN = "webresources/k_soft.jpa.entidades.usuario/android/{user}/{pass}";
    @GET(API_LOGIN)
    Call<List<Usuariop>> autenticarUsuario (@Path("user") String groupid, @Path("pass") String groupPass );

}
