package com.example.just10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_matematicas_eje7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje7);
    }
    public void mat71(View view){
        Intent mat71 = new Intent(this, activity_matematicas_eje7_1.class);
        startActivity(mat71);
    }
}