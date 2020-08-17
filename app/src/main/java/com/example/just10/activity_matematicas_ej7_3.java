package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej7_3 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej7_3);

        aciertos = (TextView) findViewById(R.id.mat73_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej7_2.acier);

        spinner1 = (Spinner)findViewById(R.id.mat73_spn1);
        String [] s1 = {"Canicas", "Lotería", "Balero", "Serpientes y escaleras"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat73_spn2);
        String [] s2 = {"Canicas", "Lotería", "Balero", "Serpientes y escaleras"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat73_spn3);
        String [] s3 = {"Sí", "No"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);
    }

    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();

        acier = activity_matematicas_ej7_2.acier;

        if(preg1.equals("Serpientes y escaleras")){
            acier++;
        }
        if(preg2.equals("Lotería")){
            acier++;
        }
        if(preg3.equals("Sí")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        matFin(view);
    }
    public void matFin(View view){
        Intent matFin = new Intent(this, ActiTemas.class);
        startActivity(matFin);
        finalizar(view);
    }
    public void finalizar(View v){
        finish();
    }
}