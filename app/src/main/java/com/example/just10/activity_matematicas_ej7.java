package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_ej7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej7);
    }
    public void mat71(View view){
        Intent mat71 = new Intent(this, activity_matematicas_ej7_1.class);
        startActivity(mat71);
    }
}