package com.example.k_movil10.postEncuesta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.k_movil10.Adapters.AdapterPreguntas;
import com.example.k_movil10.R;
import com.example.k_movil10.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class logueoEncuesta extends AppCompatActivity {

    ListView list;
    ArrayList<String> preguntas = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    TextView textView;

    Button btn;

    List<FkPregunta> lstPreguntas;
    AdapterPreguntas adapterPreguntas;
    RecyclerView recyclerView;

    List<Float> puntuacion;
    List<Float> puntuacionStar;


    Venta venta = new Venta();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo_encuesta);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, preguntas );
        //list = findViewById(R.id.list);
        //list.setAdapter(arrayAdapter);
        lstPreguntas = new ArrayList<>();
        btn = findViewById(R.id.opcEnviar);
        puntuacion = new ArrayList<>();
        puntuacion.add(0, (float) 0);
        puntuacion.add(1, (float) 0);
        puntuacion.add(2, (float) 0);
        puntuacion.add(3, (float) 0);
        puntuacion.add(4, (float) 0);
        //textView = findViewById(R.id.pruebaNombreCliente);

        adapterPreguntas= new AdapterPreguntas(lstPreguntas, R.layout.itempregunta, this);
        getPostPreguntas();
        recyclerView = findViewById(R.id.opcReciclerPreguntas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterPreguntas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterPreguntas.notifyDataSetChanged();

        adapterPreguntas.setOnclickItem(new AdapterPreguntas.OnClickItem() {
            @Override
            public void getItemPosition(int position, float stars) {
                if(lstPreguntas!=null){
                    Toast.makeText(logueoEncuesta.this,
                            "Pregunta" + position + "estrellas: " + stars,
                            Toast.LENGTH_SHORT).show();
                    puntuacion.set(position,((stars)));
                }
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postRespuesta();

            }
        });
    }

    private void postRespuesta() {
        for(int i=0; i<5; i++){
            FkPregunta fkPregunta = new FkPregunta(lstPreguntas.get(i).getPkPregunta());
            FkClienteencuesta fkClienteencuesta = new FkClienteencuesta(2);
            Respuesta respuesta = new Respuesta(""+puntuacion.get(i), fkClienteencuesta,fkPregunta);
            Retrofit retrofit = new Retrofit.Builder().baseUrl("http://"+Utils.IP_RUTE+":8083/k_soft_v3-3.0/").addConverterFactory(GsonConverterFactory.create()).build();
            RespuestaPost respuestaPost = retrofit.create(RespuestaPost.class);

            Call<Respuesta> call = respuestaPost.createUser(respuesta);

            call.enqueue(new Callback<com.example.k_movil10.postEncuesta.Respuesta>() {
                @Override
                public void onResponse(Call<com.example.k_movil10.postEncuesta.Respuesta> call, Response<com.example.k_movil10.postEncuesta.Respuesta> response) {
                    Toast.makeText(logueoEncuesta.this, "Guardado", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onFailure(Call<com.example.k_movil10.postEncuesta.Respuesta> call, Throwable t) {
                    Toast.makeText(logueoEncuesta.this, "Error", Toast.LENGTH_SHORT).show();


                }
            });


        }



    }

    private void getPostPreguntas() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://"+Utils.IP_RUTE+":8083/k_soft_v3-3.0/").addConverterFactory(GsonConverterFactory.create()).build();
        PreguntaPost preguntaPost = retrofit.create(PreguntaPost.class);

        Call<List<FkPregunta>> call = preguntaPost.getPost();


        call.enqueue(new Callback<List<FkPregunta>>() {
            @Override
            public void onResponse(Call<List<FkPregunta>> call, Response<List<FkPregunta>> response) {
                for(FkPregunta pregunta : response.body()){
                   lstPreguntas.add(new FkPregunta(pregunta.getPkPregunta(), pregunta.getPregunta()));
                }
                adapterPreguntas.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<FkPregunta>> call, Throwable t) {

            }
        });

    }
}
