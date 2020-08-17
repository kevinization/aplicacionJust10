package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_27 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_27);

        aciertos = (TextView)findViewById(R.id.mat327_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_26c.acier);

        num1 = (EditText)findViewById(R.id.mat327_txtNum1);
        num2 = (EditText)findViewById(R.id.mat327_txtNum2);
        num3 = (EditText)findViewById(R.id.mat327_txtNum3);
        num4 = (EditText)findViewById(R.id.mat327_txtNum4);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();

        acier = activity_matematicas_ej3_26c.acier;

        if(numero1.equals("56")){
            acier++;
        }
        if(numero2.equals("4")){
            acier++;
        }
        if(numero3.equals("14")){
            acier++;
        }
        if(numero4.equals("14")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat328(view);
    }
    public void mat328(View view){
        Intent mat328 = new Intent(this, activity_matematicas_ej3_28.class);
        startActivity(mat328);
    }
}