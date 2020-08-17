package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej5_2c extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;

    private TextView aciertos;

    public static int acier = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej5_2c);

        aciertos = (TextView) findViewById(R.id.mat52_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej5_2c.acier);

        spinner1 = (Spinner)findViewById(R.id.mat52_spn1);
        String [] s1 = {"Casa", "Cruz", "Estrella"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat52_spn2);
        String [] s2 = {"Casa", "Cruz", "Estrella"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat52_spn3);
        String [] s3 = {"Casa", "Cruz", "Estrella"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();

        acier = 0;

        if(preg1.equals("Estrella")){
            acier++;
        }
        if(preg2.equals("Cruz")){
            acier++;
        }
        if(preg3.equals("Casa")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat53(view);
    }

    public void mat53(View view){
        Intent mat53 = new Intent(this, activity_matematicas_ej5_3.class);
        startActivity(mat53);
    }
}