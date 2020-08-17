package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_12c extends AppCompatActivity {

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_12c);

        aciertos = (TextView)findViewById(R.id.mat312_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_11.acier);

        spinner1 = (Spinner)findViewById(R.id.mat312_spn1);
        String [] s1 = {"El de venado", "El de mariposa"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

    }

    public void comprobacion (View view){
        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_11.acier;

        if(preg1.equals("El de mariposa")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat313(view);
    }
    public void mat313(View view){
        Intent mat313 = new Intent(this, activity_matematicas_ej3_13.class);
        startActivity(mat313);
    }
}