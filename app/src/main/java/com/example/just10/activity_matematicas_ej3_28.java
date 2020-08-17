package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej3_28 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_28);

        aciertos = (TextView)findViewById(R.id.mat328_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_27.acier);

        num1 = (EditText)findViewById(R.id.mat328_txtNum1);
        num2 = (EditText)findViewById(R.id.mat328_txtNum2);
        num3 = (EditText)findViewById(R.id.mat328_txtNum3);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();

        acier = activity_matematicas_ej3_27.acier;

        if(numero1.equals("2")){
            acier++;
        }
        if(numero2.equals("3")){
            acier++;
        }
        if(numero3.equals("1")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat329(view);
    }
    public void mat329(View view){
        Intent mat329 = new Intent(this, activity_matematicas_ej3_29.class);
        startActivity(mat329);
    }
}