package com.example.k_movil10.LoguearEncuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.k_movil10.MainActivity;
import com.example.k_movil10.R;
import com.example.k_movil10.Splash_Sreen;
import com.example.k_movil10.Usuariop;
import com.example.k_movil10.loguearUsuario;
import com.example.k_movil10.postEncuesta.logueoEncuesta;
import com.example.k_movil10.utils.Utils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CodigoEncuesta extends AppCompatActivity {
    Button btnValidar;
    EditText edtTextCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_encuesta);
        Inicializar();
    }

    private void Inicializar() {
        edtTextCodigo = findViewById(R.id.edtCodigo);
        btnValidar = findViewById(R.id.btnValidarCodigo);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PostVenta(edtTextCodigo.getText().toString());
            }
        });
    }

    private void getPostValidarCodigo(String codigo) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://" + Utils.IP_RUTE + ":8083/k_soft_v3-3.0/").addConverterFactory(GsonConverterFactory.create()).build();
        PostClienteEncuesta postClienteEncuesta = retrofit.create(PostClienteEncuesta.class);

        Call<List<ClienteEncuesta>> call = postClienteEncuesta.autenticarCodigo(codigo);
        call.enqueue(new Callback<List<ClienteEncuesta>>() {
            @Override
            public void onResponse(Call<List<ClienteEncuesta>> call, Response<List<ClienteEncuesta>> response) {
                for (ClienteEncuesta clienteEncuesta : response.body()) {
                    if (clienteEncuesta.getFkVenta().getCodigo() != null) {
                        //  Toast.makeText(CodigoEncuesta.this, "Bienvenido"+clienteEncuesta.getVenta().getFkCliente().getPersona().getNombres(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<ClienteEncuesta>> call, Throwable t) {
                Toast.makeText(CodigoEncuesta.this, "Datos Invalidos", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void PostVenta(String codigo) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://" + Utils.IP_RUTE + ":8083/k_soft_v3-3.0/").addConverterFactory(GsonConverterFactory.create()).build();
        PostVenta postVenta = retrofit.create(PostVenta.class);

        Call<List<Venta>> call = postVenta.autenticarCodigo(codigo);
        call.enqueue(new Callback<List<Venta>>() {
            @Override
            public void onResponse(Call<List<Venta>> call, Response<List<Venta>> response) {
                for (Venta venta : response.body()) {
                    if (venta.getCodigo() != null) {
                        cambioActivity(venta);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Venta>> call, Throwable t) {
                Toast.makeText(CodigoEncuesta.this, "Datos Invalidos", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void cambioActivity(Venta venta) {
        Toast.makeText(this, "Bienvenido "+venta.getFkCliente().getFkPersona().getNombres()+" "+venta.getFkCliente().getFkPersona().getApellidos()
                , Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, logueoEncuesta.class);
        startActivity(intent);
        finish();
    }
}


