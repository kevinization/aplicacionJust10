package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActPantallaCarga extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pantalla_carga);
    }

    public void registro(View view){
        Intent registro = new Intent(this, activity_acti1_registro.class);
        startActivity(registro);
    }

}