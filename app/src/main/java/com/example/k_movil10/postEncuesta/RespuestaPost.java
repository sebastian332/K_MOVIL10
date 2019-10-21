package com.example.k_movil10.postEncuesta;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RespuestaPost {
    String API_ROUTE = "webresources/k_soft.jpa.entidades.respuesta";
    @GET(API_ROUTE)
    Call<List<Respuesta>> getPost();

    @POST("webresources/k_soft.jpa.entidades.respuesta")
    Call<Respuesta> createUser(@Body Respuesta respuesta);

}
