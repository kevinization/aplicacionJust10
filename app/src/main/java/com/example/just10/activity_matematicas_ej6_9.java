package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej6_9 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej6_9);

        aciertos = (TextView) findViewById(R.id.mat69_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej6_8.acier);

        num1 = (EditText)findViewById(R.id.mat69_txtNum1);
        num2 = (EditText)findViewById(R.id.mat69_txtNum2);
        num3 = (EditText)findViewById(R.id.mat69_txtNum3);
        num4 = (EditText)findViewById(R.id.mat69_txtNum4);
        num5 = (EditText)findViewById(R.id.mat69_txtNum5);
        num6 = (EditText)findViewById(R.id.mat69_txtNum6);

        spinner1 = (Spinner)findViewById(R.id.mat69_spn1);
        String [] s1 = {"La rosa", "La azul"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();

        acier = activity_matematicas_ej6_8.acier;

        if(preg1.equals("La azul")){
            acier++;
        }
        if(numero1.equals("26")){
            acier++;
        }
        if(numero2.equals("28")){
            acier++;
        }
        if(numero3.equals("20")){
            acier++;
        }
        if(numero4.equals("16")){
            acier++;
        }
        if(numero5.equals("20")){
            acier++;
        }
        if(numero6.equals("16")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat610(view);
    }
    public void mat610(View view){
        Intent mat610 = new Intent(this, activity_matematicas_ej6_10.class);
        startActivity(mat610);
    }
}