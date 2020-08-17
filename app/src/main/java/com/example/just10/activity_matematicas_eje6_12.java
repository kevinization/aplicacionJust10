package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_eje6_12 extends AppCompatActivity {

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6_12);

        aciertos = (TextView) findViewById(R.id.mat612_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje6_11.acier);

        spinner1 = (Spinner)findViewById(R.id.mat612_spn1);
        String [] s1 = {"La señora", "El señor", "Compraron la misma cantidad"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_eje6_11.acier;

        if(preg1.equals("La señora")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat613(view);
    }
    public void mat613(View view){
        Intent mat613 = new Intent(this, activity_matematicas_eje6_13.class);
        startActivity(mat613);
    }
}