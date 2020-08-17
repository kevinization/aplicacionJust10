package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class acivity_matematicas_ej1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_2);
    }

    //Metodo para cambiar a la pantalla de premios
    public void mat13(View view){
        Intent mat13 = new Intent(this, activity_matematicas_ej1_3.class);
        startActivity(mat13);
    }
}