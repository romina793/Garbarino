package com.example.garbarino.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.garbarino.R;
import com.example.garbarino.controller.ProductoController;
import com.example.garbarino.model.POJO.ConteinerProducto;
import com.example.garbarino.utils.ResultListener;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductoAdapter adapter;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerProducto);
        adapter = new ProductoAdapter();

        ProductoController productoController = new ProductoController();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        productoController.traerProductos(new ResultListener<ConteinerProducto>() {
            @Override
            public void finish(ConteinerProducto conteinerProducto) {
                adapter.setListaProductos(conteinerProducto.getResults());
            }
        });


    }
}
