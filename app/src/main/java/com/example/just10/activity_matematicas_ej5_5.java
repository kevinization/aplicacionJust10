package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class activity_matematicas_ej5_5 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej5_5);

        aciertos = (TextView) findViewById(R.id.mat55_txtAciertos);
        aciertos.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej5_4.acier);

        spinner1 = (Spinner)findViewById(R.id.mat55_spn1);
        String [] s1 = {"Paralelas", "Perpendiculares"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat55_spn2);
        String [] s2 = {"Paralelas", "Perpendiculares"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();

        acier = activity_matematicas_ej5_4.acier;

        if(preg1.equals("Paralelas")){
            acier++;
        }
        if(preg2.equals("Perpendiculares")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        //Guardad acier en BD (Campo FCG)
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        String idvalor = claseBD.regresaIDUSUARIO();
        claseBD.actualizarPuntajes(idvalor,"FCG", String.valueOf(acier));
        Toast.makeText(getApplicationContext(), "Puntaje Actualizado", Toast.LENGTH_SHORT).show();

        mat56(view);
    }
    public void mat56(View view){
        Intent mat56 = new Intent(this, ActiTemas.class);
        startActivity(mat56);
    }
}