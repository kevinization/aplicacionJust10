package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej3_11 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_11);

        aciertos = (TextView)findViewById(R.id.mat311_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_10.acier);

        num1 = (EditText)findViewById(R.id.mat311_txtNum1);
        num2 = (EditText)findViewById(R.id.mat311_txtNum2);
        num3 = (EditText)findViewById(R.id.mat311_txtNum3);
        num4 = (EditText)findViewById(R.id.mat311_txtNum4);
        num5 = (EditText)findViewById(R.id.mat311_txtNum5);
        num6 = (EditText)findViewById(R.id.mat311_txtNum6);
    }

    public void comprobacion (View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();

        acier = activity_matematicas_ej3_10.acier;

        if(numero1.equals("45")){
            acier++;
        }
        if(numero2.equals("180")){
            acier++;
        }
        if(numero3.equals("225")){
            acier++;
        }
        if(numero4.equals("16")){
            acier++;
        }
        if(numero5.equals("240")){
            acier++;
        }
        if(numero6.equals("256 ")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat312(view);
    }
    public void mat312(View view){
        Intent mat312 = new Intent(this, activity_matematicas_ej3_12c.class);
        startActivity(mat312);
    }
}