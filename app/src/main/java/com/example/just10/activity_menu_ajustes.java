package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_menu_ajustes extends AppCompatActivity {

    Button btnConsultarBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ajustes);

        btnConsultarBD=(Button)findViewById(R.id.btnConsultarBD);
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());

        btnConsultarBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), activity_muestrausuarios.class);
                startActivityForResult(intent,0);
            }
        });
    }

    public void recordatorios(View view){
        Intent recordatorios = new Intent(this, Activity_recordatorios.class);
        startActivity(recordatorios);
    }




}