package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_eje6_11 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;

    private Spinner spinner1;
    private Spinner spinner2;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6_11);

        aciertos = (TextView) findViewById(R.id.mat611_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje6_10.acier);

        num1 = (EditText)findViewById(R.id.mat611_txtNum1);
        num2 = (EditText)findViewById(R.id.mat611_txtNum2);
        num3 = (EditText)findViewById(R.id.mat611_txtNum3);
        num4 = (EditText)findViewById(R.id.mat611_txtNum4);

        spinner1 = (Spinner)findViewById(R.id.mat611_spn1);
        String [] s1 = {"En media docena", "En un cuarto de docena", "Hay las mismas"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat611_spn2);
        String [] s2 = {"En media docena", "En un cuarto de docena", "Hay las mismas"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);
    }
    public void comprobacion(View view){

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();

        acier = activity_matematicas_eje6_10.acier;

        if(numero1.equals("8")){
            acier++;
        }
        if(numero2.equals("4")){
            acier++;
        }
        if(numero3.equals("6")){
            acier++;
        }
        if(numero4.equals("3")){
            acier++;
        }
        if(preg1.equals("En media docena")){
            acier++;
        }
        if(preg2.equals("Hay las mismas")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat612(view);
    }
    public void mat612(View view){
        Intent mat612 = new Intent(this, activity_matematicas_eje6_12.class);
        startActivity(mat612);
    }
}