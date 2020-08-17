package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_ej3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3);
    }
    public void Md1 (View view){
        Intent md1 = new Intent(this, activity_matematicas_ej3_1.class);
        startActivity(md1);
    }
}