package com.example.k_movil10.Adapters;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.k_movil10.R;
import com.example.k_movil10.postImagen.pImagen;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterProducto extends RecyclerView.Adapter<AdapterProducto.AdapterViewHolder> {
    private List<pImagen> listaDatos;
    private int resources;
    private Activity context;

    public AdapterProducto(List<pImagen> listaDatos, int resources, Activity context) {
        this.listaDatos = listaDatos;
        this.resources = resources;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProducto.AdapterViewHolder holder, int position) {
        pImagen itemModel = listaDatos.get(position);
        Uri url = Uri.parse(itemModel.getRuta().toString());
        Picasso.get().load(url).into(holder.imagen);
        holder.nombreproducto.setText(itemModel.getFkProducto().getNombre());
        holder.descripcionImagen.setText(itemModel.getDescripcion());
      //  holder.tipoProduicto.setText(itemModel.getFkProducto().getFkTipoproducto().getNombre());
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView nombreproducto;
        TextView descripcionImagen;
       // TextView tipoProduicto;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagenPrueba);
            nombreproducto = itemView.findViewById(R.id.itemNombreProducto);
            descripcionImagen = itemView.findViewById(R.id.itemDescripcion);
           // tipoProduicto = itemView.findViewById(R.id.itemTipoproducto);


            imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
