package com.example.k_movil10.postEncuesta;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PreguntaPost {
    String API_ROUTE = "webresources/k_soft.jpa.entidades.pregunta";
    @GET(API_ROUTE)
    Call<List<FkPregunta>> getPost();
}
