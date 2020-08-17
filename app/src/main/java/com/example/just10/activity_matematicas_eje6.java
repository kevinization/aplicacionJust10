package com.example.just10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_matematicas_eje6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6);
    }
    public void mat61(View view){
        Intent mat61 = new Intent(this, activity_matematicas_eje6_1.class);
        startActivity(mat61);
    }
}