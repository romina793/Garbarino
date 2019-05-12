package com.example.garbarino.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.garbarino.R;
import com.example.garbarino.model.POJO.Producto;

import java.util.ArrayList;
import java.util.List;


public class ProductoAdapter extends RecyclerView.Adapter  {

    private List<Producto> listaProductos;

    public ProductoAdapter() {
        listaProductos = new ArrayList<>();
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View viewCelda = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_producto,parent,false);
        ViewHolderProducto viewHolderProducto = new ViewHolderProducto(viewCelda);
        return viewHolderProducto;
    }

    @Override
    public void onBindViewHolder( @NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderProducto viewHolderProducto = (ViewHolderProducto) holder;
        viewHolderProducto.loadProducto(listaProductos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
        //el error me da size = 0
    }


    private class ViewHolderProducto extends RecyclerView.ViewHolder{

        private TextView textViewDescriptionProducto;

        public ViewHolderProducto(View itemView) {
            super(itemView);
            textViewDescriptionProducto = itemView.findViewById(R.id.celda_nombreProducto);
        }


        public void loadProducto(Producto producto){
            textViewDescriptionProducto.setText(producto.getDescription());
        }
    }
}
