package com.example.k_movil10.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.k_movil10.R;
import com.example.k_movil10.postEncuesta.FkPregunta;

import java.util.List;

public class AdapterPreguntas extends RecyclerView.Adapter<AdapterPreguntas.AdapterViewHolder>{
    private List<FkPregunta> lstPreguntas;
    private int resources;
    private Activity contexte;

    private OnClickItem onclickItem;

    public interface OnClickItem {
        void getItemPosition(int position, float stars);

    }

    public void setOnclickItem(OnClickItem onclickItem) {
        this.onclickItem = onclickItem;
    }

    public AdapterPreguntas(List<FkPregunta> lstPreguntas, int resources, Activity contexte) {
        this.lstPreguntas = lstPreguntas;
        this.resources = resources;
        this.contexte = contexte;
    }

    @NonNull
    @Override
    public AdapterPreguntas.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources, parent, false);
        return new AdapterPreguntas.AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPreguntas.AdapterViewHolder holder, int position) {
        FkPregunta pregunta = lstPreguntas.get(position);
        holder.textPregunta.setText(pregunta.getPregunta());

    }

    @Override
    public int getItemCount() {
        return lstPreguntas.size() ;
    }


    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        TextView textPregunta;
        RatingBar ratingBar;
        TextView displayRatingBar;
        TextView calificacion;

        public AdapterViewHolder(@NonNull final View itemView) {
            super(itemView);
            textPregunta = itemView.findViewById(R.id.itemPregunta);
            ratingBar = itemView.findViewById(R.id.itemRespuestaEstrllita);
            //displayRatingBar.setText("Calificacion");

            calificacion = itemView.findViewById(R.id.tvRatingScale);
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                    calificacion.setText(String.valueOf(v));
                    if(onclickItem!=null){
                        int position = getLayoutPosition();
                        if(position != RecyclerView.NO_POSITION){
                            onclickItem.getItemPosition(position, ratingBar.getRating());
                        }
                    }
                    switch ((int) ratingBar.getRating()){
                        case 1:
                            calificacion.setText("muy Mala");
                            break;
                        case 2:
                            calificacion.setText("Mala");
                            break;
                        case 3:
                            calificacion.setText("Buena");
                            break;
                        case 4:
                            calificacion.setText("Excelente");
                            break;
                        case 5:
                            calificacion.setText("Increible, Me encanta");
                            break;
                        default:
                            calificacion.setText("No Gusta Opinar??");
                            break;

                    }
                }
            });





        }
    }


}
