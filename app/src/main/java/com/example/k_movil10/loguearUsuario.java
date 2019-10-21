package com.example.k_movil10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.k_movil10.utils.Utils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class loguearUsuario extends AppCompatActivity {
    Button button;
    EditText edtNombreUsuario;
    EditText getEdtContrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguear_usuario);
        Inicializar();
    }

    public void Inicializar() {
        edtNombreUsuario = findViewById(R.id.EditTextNombreUsuario);
        getEdtContrasena = findViewById(R.id.EditTextPass);

        button = findViewById(R.id.ingresar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPost(edtNombreUsuario.getText().toString(), getEdtContrasena.getText().toString());
            }
        });

    }

    public void getPost (String nombre, String pass){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://"+Utils.IP_RUTE+":8083/k_soft_v3-3.0/").addConverterFactory(GsonConverterFactory.create()).build();
        usuario usuario = retrofit.create(usuario.class);

        Call<List<Usuariop>> call = usuario.autenticarUsuario(nombre, pass);
        call.enqueue(new Callback<List<Usuariop>>() {
            @Override
            public void onResponse(Call<List<Usuariop>> call, Response<List<Usuariop>> response) {
                for(Usuariop usuariop :response.body()){
                    if(usuariop.getNombreusuario() !=null){
                        cambioActivity(usuariop);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Usuariop>> call, Throwable t) {
                Toast.makeText(loguearUsuario.this, "Datos Invalidos", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void cambioActivity(Usuariop usuario) {
        Toast.makeText(this, "Bienvenido "+usuario.getNombreusuario()
                , Toast.LENGTH_SHORT).show();

        //Intent ....
        //Intent.putExtra("key","value");
    }



}
