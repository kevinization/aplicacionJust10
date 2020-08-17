package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_eje6_5 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6_5);

        aciertos = (TextView) findViewById(R.id.mat65_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje6_4.acier);

        num1 = (EditText)findViewById(R.id.mat65_txtNum1);
        num2 = (EditText)findViewById(R.id.mat65_txtNum2);
        num3 = (EditText)findViewById(R.id.mat65_txtNum3);
        num4 = (EditText)findViewById(R.id.mat65_txtNum4);
        num5 = (EditText)findViewById(R.id.mat65_txtNum5);
    }

    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();

        acier = activity_matematicas_eje6_4.acier;

        if(numero1.equals("12")){
            acier++;
        }
        if(numero2.equals("6")){
            acier++;
        }
        if(numero3.equals("3")){
            acier++;
        }
        if(numero4.equals("20")){
            acier++;
        }
        if(numero5.equals("26")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat66(view);
    }
    public void mat66(View view){
        Intent mat66 = new Intent(this, activity_matematicas_eje6_6.class);
        startActivity(mat66);
    }
}