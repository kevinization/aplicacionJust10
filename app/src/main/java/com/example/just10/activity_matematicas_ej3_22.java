package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej3_22 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private EditText num7;
    private EditText num8;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_22);

        aciertos = (TextView)findViewById(R.id.mat322_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_21.acier);

        num1 = (EditText)findViewById(R.id.mat323_txtNum1);
        num2 = (EditText)findViewById(R.id.mat322_txtNum2);
        num3 = (EditText)findViewById(R.id.mat322_txtNum3);
        num4 = (EditText)findViewById(R.id.mat322_txtNum4);
        num5 = (EditText)findViewById(R.id.mat322_txtNum5);
        num6 = (EditText)findViewById(R.id.mat322_txtNum6);
        num7 = (EditText)findViewById(R.id.mat322_txtNum7);
        num8 = (EditText)findViewById(R.id.mat322_txtNum8);
    }

    public void comprobacion(View view){

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();
        String numero7 = num7.getText().toString();
        String numero8 = num8.getText().toString();

        acier = activity_matematicas_ej3_21.acier;

        if(numero1.equals("28")){
            acier++;
        }
        if(numero2.equals("560")){
            acier++;
        }
        if(numero3.equals("588")){
            acier++;
        }
        if(numero4.equals("588")){
            acier++;
        }
        if(numero5.equals("108")){
            acier++;
        }
        if(numero6.equals("1080")){
            acier++;
        }
        if(numero7.equals("1188")){
            acier++;
        }
        if(numero8.equals("1188")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat323(view);
    }
    public void mat323(View view){
        Intent mat323 = new Intent(this, activity_matematicas_ej3_23.class);
        startActivity(mat323);
    }
}