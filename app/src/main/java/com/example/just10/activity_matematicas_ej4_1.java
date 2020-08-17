package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_ej4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej4_1);
    }
    public void Ue1 (View view){
        Intent ue1 = new Intent(this, acivity_matematicas_ej4_2.class);
        startActivity(ue1);
    }
}