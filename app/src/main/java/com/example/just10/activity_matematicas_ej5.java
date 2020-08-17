package com.example.just10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_matematicas_ej5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej5);
    }
    public void mat51(View view){
        Intent mat51 = new Intent(this, activity_matematicas_ej5_1.class);
        startActivity(mat51);
    }
}