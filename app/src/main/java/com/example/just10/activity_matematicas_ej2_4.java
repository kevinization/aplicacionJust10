package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej2_4 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;

    private EditText num1;
    private EditText num2;

    private TextView aciertos3;

    public static int acier3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_4);

        aciertos3 = (TextView) findViewById(R.id.mat24_txtAciertos);
        aciertos3.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_3.acier2);

        num1 = (EditText)findViewById(R.id.mat24_txtNum1);
        num2 = (EditText)findViewById(R.id.mat24_txtNum2);

        spinner1 = (Spinner)findViewById(R.id.mat24_spn1);
        String [] s1 = {"Tiene el dinero suficiente", "Debe cambiar"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat24_spn2);
        String [] s2 = {"Un billete de 100 por 10 monedas de 10", "Una moneda de 10 por 10 de 1"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);
    }

    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();

        acier3 = activity_matematicas_ej2_3.acier2;

        if(preg1.equals("Debe cambiar")){
            acier3++;
        }
        if(preg2.equals("Un billete de 100 por 10 monedas de 10")){
            acier3++;
        }
        if(numero1.equals("523")){
            acier3++;
        }
        if(numero2.equals("273")){
            acier3++;
        }

        aciertos3.setText(activity_matematicas_ej2_2.textoAciertos + acier3);

        mat25(view);
    }
    public void mat25(View view){
        Intent mat25 = new Intent(this, activity_matematicas_ej2_5.class);
        startActivity(mat25);
    }
}