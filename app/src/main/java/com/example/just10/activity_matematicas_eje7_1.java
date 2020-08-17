package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_eje7_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje7_1);
    }
    public void mat72(View view){
        Intent mat72 = new Intent(this, activity_matematicas_eje7_2.class);
        startActivity(mat72);
    }
}