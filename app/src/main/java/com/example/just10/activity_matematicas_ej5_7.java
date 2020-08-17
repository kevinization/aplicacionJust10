package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej5_7 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej5_7);

        aciertos = (TextView) findViewById(R.id.mat57_txtAciertos);
        aciertos.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej5_6.acier);

        spinner1 = (Spinner)findViewById(R.id.mat57_spn1);
        String [] s1 = {"Círculo", "Triángulo", "Rectángulo", "Cuadrado", "Rombo"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat57_spn2);
        String [] s2 = {"Círculo", "Triángulo", "Rectángulo", "Cuadrado", "Rombo"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat57_spn3);
        String [] s3 = {"Círculo", "Triángulo", "Rectángulo", "Cuadrado", "Rombo"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();

        acier = activity_matematicas_ej5_6.acier;

        if(preg1.equals("Triángulo")){
            acier++;
        }
        if(preg2.equals("Rombo")){
            acier++;
        }
        if(preg3.equals("Rectángulo")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat6(view);
    }
    public void mat6(View view){
        Intent mat6 = new Intent(this, activity_matematicas_ej6.class);
        startActivity(mat6);
        finalizar(view);
    }

    public void finalizar(View v){
        finish();
    }
}