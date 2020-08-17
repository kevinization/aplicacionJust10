package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas);


    }
    //Metodo para cambiar a la pantalla de premios
    public void Premios (View view){
        Intent premios = new Intent(this, activity_matematicas_ej1_1.class);
        startActivity(premios);
    }
}