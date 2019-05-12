package com.example.garbarino.model.DAO;

import com.example.garbarino.model.POJO.ConteinerProducto;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductoService {

    @GET("products")
        //Cada Call va a recibir un resultado del tipo especificado entre <>
    Call<ConteinerProducto> getProducto();
}
