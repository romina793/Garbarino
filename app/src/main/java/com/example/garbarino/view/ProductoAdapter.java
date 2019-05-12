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
    public RecyclerView.ViewHolder onCreateViewHolder( @NonNull ViewGroup viewGroup, int i ) {
     //   View viewCelda = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celda_pokemon,parent,false);
        //ViewHolderProducto viewHolderProducto = new ViewHolderProducto(viewCelda);
        return null;
    }

    @Override
    public void onBindViewHolder( @NonNull RecyclerView.ViewHolder viewHolder, int i ) {

    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    //TODO REVISAR

    private class ViewHolderProducto extends RecyclerView.ViewHolder{

        private TextView textViewNombrePokemon;

        public ViewHolderProducto(View itemView) {
            super(itemView);
          //  textViewNombrePokemon = itemView.findViewById(R.id.celda_nombrePokemon);
        }


        public void loadPokemon(Producto producto){
           // textViewNombrePokemon.setText(producto.getName());
        }
    }
}
