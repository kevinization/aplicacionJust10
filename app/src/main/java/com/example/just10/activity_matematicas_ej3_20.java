package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej3_20 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_20);

        aciertos = (TextView)findViewById(R.id.mat320_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_19c.acier);

        num1 = (EditText)findViewById(R.id.mat320_txtNum1);
        num2 = (EditText)findViewById(R.id.mat320_txtNum2);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        acier = activity_matematicas_ej3_19c.acier;

        if(numero1.equals("375")){
            acier++;
        }
        if(numero2.equals("640")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat321(view);
    }
    public void mat321(View view){
        Intent mat321 = new Intent(this, activity_matematicas_ej3_21.class);
        startActivity(mat321);
    }

}