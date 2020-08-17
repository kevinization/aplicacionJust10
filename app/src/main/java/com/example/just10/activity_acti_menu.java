package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_acti_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_menu);
    }
    //Metodo para cambiar a la pantalla de temas
    public void Temas(View view){
        Intent temas = new Intent(this, ActiTemas.class);
        startActivity(temas);
    }

    public void ajustes(View view){
        Intent ajustes = new Intent(this, activity_menu_ajustes.class);
        startActivity(ajustes);
    }
}