package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_ej1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_1);
    }

    //Metodo para cambiar a la pantalla de arco
    public void Arco(View view){
        Intent arco = new Intent(this, acivity_matematicas_ej1_2.class);
        startActivity(arco);
    }
}