package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_eje6_10 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6_10);

        aciertos = (TextView) findViewById(R.id.mat610_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje6_9.acier);

        num1 = (EditText)findViewById(R.id.mat610_txtNum1);
        num2 = (EditText)findViewById(R.id.mat610_txtNum2);
        num3 = (EditText)findViewById(R.id.mat610_txtNum3);
        num4 = (EditText)findViewById(R.id.mat610_txtNum4);
    }
    public void comprobacion(View view){

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();

        acier = activity_matematicas_eje6_9.acier;

        if(numero1.equals("1")){
            acier++;
        }
        if(numero2.equals("4")){
            acier++;
        }
        if(numero3.equals("2")){
            acier++;
        }
        if(numero4.equals("5")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat611(view);
    }
    public void mat611(View view){
        Intent mat611 = new Intent(this, activity_matematicas_eje6_11.class);
        startActivity(mat611);
    }
}