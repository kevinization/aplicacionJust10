package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_10 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private EditText num7;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_10);

        aciertos = (TextView)findViewById(R.id.mat310_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_9.acier);

        num1 = (EditText)findViewById(R.id.mat310_txtNum1);
        num2 = (EditText)findViewById(R.id.mat310_txtNum2);
        num3 = (EditText)findViewById(R.id.mat310_txtNum3);
        num4 = (EditText)findViewById(R.id.mat310_txtNum4);
        num5 = (EditText)findViewById(R.id.mat310_txtNum5);
        num6 = (EditText)findViewById(R.id.mat310_txtNum6);
        num7 = (EditText)findViewById(R.id.mat310_txtNum7);

        spinner1 = (Spinner)findViewById(R.id.mat310_spn1);
        String [] s1 = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }
    public void comprobacion (View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();
        String numero7 = num7.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_9.acier;

        if(numero1.equals("10")){
            acier++;
        }
        if(numero2.equals("7")){
            acier++;
        }
        if(numero3.equals("70")){
            acier++;
        }
        if(numero4.equals("8")){
            acier++;
        }
        if(numero5.equals("7")){
            acier++;
        }
        if(numero6.equals("56 ")){
            acier++;
        }
        if(numero7.equals("26")){
            acier++;
        }
        if(preg1.equals("Sí")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat311(view);
    }
    public void mat311(View view){
        Intent mat311 = new Intent(this, activity_matematicas_ej3_11.class);
        startActivity(mat311);
    }
}