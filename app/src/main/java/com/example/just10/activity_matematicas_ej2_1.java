package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_matematicas_ej2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_1);
    }
    public void Suma3 (View view){
        Intent suma3 = new Intent(this, activity_matematicas_ej2_2.class);
        startActivity(suma3);
    }

}
