package com.example.garbarino.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.garbarino.R;
import com.example.garbarino.model.POJO.Producto;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class ProductoAdapter extends RecyclerView.Adapter  {

    private List<Producto> listaProductos;
    private ListenerProductoAdapter listenerProductoAdapter;

    public ProductoAdapter() {
        this.listaProductos = new ArrayList<>();
    }

    public void setListaProductos( List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
        notifyDataSetChanged();
    }

    public ListenerProductoAdapter getListenerProductoAdapter() {
        return listenerProductoAdapter;
    }

    public void setListenerProductoAdapter( ListenerProductoAdapter listenerProductoAdapter ) {
        this.listenerProductoAdapter = listenerProductoAdapter;
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
    }


    private class ViewHolderProducto extends RecyclerView.ViewHolder{

        private TextView textViewDescriptionProducto;
        private TextView textViewPrecio;
        private ImageView imageViewproducto;
        private Producto producto;

        public ViewHolderProducto(View itemView) {
            super(itemView);
            textViewDescriptionProducto = itemView.findViewById(R.id.celda_nombreProducto);
            imageViewproducto = itemView.findViewById(R.id.imageViewCelda);
            textViewPrecio = itemView.findViewById(R.id.textViewPrecio);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick( View v ) {
               // listenerProductoAdapter.informarSeleccion(producto);
                }
            });
        }


        public void loadProducto(Producto producto){
            this.producto = producto;
            textViewDescriptionProducto.setText(producto.getDescription());
            textViewPrecio.setText("$ " + producto.getPrice().toString() + ".-");
            if (producto.getImageUrl() == null){
                imageViewproducto.setImageResource(R.drawable.imagengarbarino);
            }else {
            Picasso.get().load(producto.getImageUrl()).into(imageViewproducto);
            }
        }
    }


    public interface ListenerProductoAdapter {
        public void informarSeleccion (Producto producto);
    }
}
