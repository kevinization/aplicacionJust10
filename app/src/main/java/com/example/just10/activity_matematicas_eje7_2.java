package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_eje7_2 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje7_2);

        aciertos = (TextView) findViewById(R.id.mat72_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje7_2.acier);

        num1 = (EditText)findViewById(R.id.mat72_txtNum1);
        num2 = (EditText)findViewById(R.id.mat72_txtNum2);
        num3 = (EditText)findViewById(R.id.mat72_txtNum3);
    }

    public void comprobacion(View view){

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();

        acier = activity_matematicas_eje7_2.acier;

        if(numero1.equals("14")){
            acier++;
        }
        if(numero2.equals("21")){
            acier++;
        }
        if(numero3.equals("35")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat73(view);
    }
    public void mat73(View view){
        Intent mat73 = new Intent(this, activity_matematicas_eje7_3.class);
        startActivity(mat73);
    }
}