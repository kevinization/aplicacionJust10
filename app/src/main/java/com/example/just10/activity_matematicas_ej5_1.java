package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_ej5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej5_1);
    }

    public void mat52(View view){
        Intent mat52 = new Intent(this, activity_matematicas_ej5_2c.class);
        startActivity(mat52);
    }
}