package com.example.k_movil10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.k_movil10.LoguearEncuesta.CodigoEncuesta;
import com.example.k_movil10.postEncuesta.logueoEncuesta;
import com.example.k_movil10.postImagen.postImagen;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void produ(View view) {
        Toast.makeText(this, "Cargando Productos", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "corran", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, postImagen.class);
        startActivity(intent);


    }
    public void encuesta(View view) {
        Toast.makeText(this, "Cargando...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, CodigoEncuesta.class);
        startActivity(intent);


    }
}
