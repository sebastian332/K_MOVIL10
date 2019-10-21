package com.example.k_movil10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash_Sreen extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__sreen);
        imageView = findViewById(R.id.CafeSplash);

        final  Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                Intent intent = new Intent(Splash_Sreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        thread.start();
    }
}
