package com.example.k_movil10.postImagen;

import com.example.k_movil10.postImagen.pImagen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Imagen {
    String API_ROUTE = "webresources/k_soft.jpa.entidades.imagen";
    @GET(API_ROUTE)
    Call<List<pImagen>> getPost();
}
