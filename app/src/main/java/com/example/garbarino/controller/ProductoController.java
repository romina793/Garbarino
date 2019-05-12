package com.example.garbarino.controller;

import com.example.garbarino.model.DAO.ProductoDao;
import com.example.garbarino.model.POJO.ConteinerProducto;
import com.example.garbarino.utils.ResultListener;

public class ProductoController {

    public void traerProductos(final ResultListener<ConteinerProducto> listenerDelView) {
        ProductoDao productoDao = new ProductoDao();
        productoDao.traerProductos(new ResultListener<ConteinerProducto>() {
            @Override
            public void finish(ConteinerProducto result) {
                listenerDelView.finish(result);
            }
        });
    }

}
