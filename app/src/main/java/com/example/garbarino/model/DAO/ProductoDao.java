package com.example.garbarino.model.DAO;

import com.example.garbarino.model.POJO.ConteinerProducto;
import com.example.garbarino.utils.ResultListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductoDao extends ProductoRetrofit{

    //Defino la urlBase
    // Atributo Service, que me va a permitir hacer las llamadas definidas
    private static final String BASE_URL = "http://garbarino-mock-api.s3-website-us-east-1.amazonaws.com/";
    private ProductoService pokemonService;


    public ProductoDao() {
        super(BASE_URL);
        pokemonService = retrofit.create(ProductoService.class);
    }


    public void traerProductos(final ResultListener<ConteinerProducto> listenerDelControler){
        pokemonService.getProducto().enqueue(new Callback<ConteinerProducto>() {
            @Override
            public void onResponse( Call<ConteinerProducto> call, Response<ConteinerProducto> response) {
                listenerDelControler.finish(response.body());
            }

            @Override
            public void onFailure(Call<ConteinerProducto> call, Throwable t) {

            }
        });
    }


}
