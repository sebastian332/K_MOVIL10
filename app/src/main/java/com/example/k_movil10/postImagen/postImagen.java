package com.example.k_movil10.postImagen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.k_movil10.Adapters.AdapterProducto;
import com.example.k_movil10.R;
import com.example.k_movil10.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class postImagen extends AppCompatActivity {
    ListView list;
    ArrayList<String> imagenes = new ArrayList<>();
    ArrayAdapter arrayAdapter;
    String ruta = "http://localhost:8083/k_soft_v3-3.0/resources/upload/1061808480_Alexis_Alvarado/dfc068-CapitanAmericaAiroManThor.jpg";
    ImageView imagen;

    List<pImagen> listDatos;
    AdapterProducto adapterProducto;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_imagen);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, imagenes );
        list = findViewById(R.id.list);
        list.setAdapter(arrayAdapter);
        listDatos = new ArrayList<>();
//        imagen = findViewById(R.id.imagen);
        getPostImagen();
        recyclerView = findViewById(R.id.opcRecicler);
        adapterProducto = new AdapterProducto( listDatos,R.layout.itemp, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProducto);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterProducto.notifyDataSetChanged();
    }

    private void getPostImagen (){
/*        pImagen pImagen = new pImagen();
        final String ruta1 = pImagen.getRuta();*/
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://"+Utils.IP_RUTE+":8083/k_soft_v3-3.0/").addConverterFactory(GsonConverterFactory.create()).build();

        Imagen imagen = retrofit.create(Imagen.class);
        Call<List<pImagen>> call1 = imagen.getPost();

        call1.enqueue(new Callback<List<pImagen>>() {
            @Override
            public void onResponse(Call<List<pImagen>> call, Response<List<pImagen>> response) {
                for(pImagen pimagen : response.body()){

                    listDatos.add(new pImagen(pimagen.getRuta(), pimagen.getFkProducto(), pimagen.getDescripcion()));

                    imagenes.add(pimagen.getDescripcion());
                    imagenes.add(pimagen.getFkProducto().getNombre());
                    imagenes.add(pimagen.getFkProducto().getFkTipoproducto().getNombre());
                }
                arrayAdapter.notifyDataSetChanged();
                adapterProducto.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<pImagen>> call, Throwable t) {

            }
        });
    }


}
