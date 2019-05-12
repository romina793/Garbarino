package com.example.garbarino.controller;

import com.example.garbarino.model.DAO.ProductoDao;
import com.example.garbarino.model.POJO.ConteinerProducto;
import com.example.garbarino.utils.ResultListener;

public class ProductoController {

    public void traerPokemons(final ResultListener<ConteinerProducto> listenerDelView) {
        ProductoDao pokemonDAO = new ProductoDao();
        pokemonDAO.traerPokemons(new ResultListener<ConteinerProducto>() {
            @Override
            public void finish(ConteinerProducto result) {
                listenerDelView.finish(result);
            }
        });
    }

}
