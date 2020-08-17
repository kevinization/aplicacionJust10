package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej3_18c extends AppCompatActivity {
    private EditText num1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_18c);

        aciertos = (TextView)findViewById(R.id.mat318_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_17.acier);

        num1 = (EditText)findViewById(R.id.mat318_txtNum1);

    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();

        acier = activity_matematicas_ej3_17.acier;

        if(numero1.equals("375")){
            acier++;
        }
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat319(view);

    }
    public void mat319(View view){
        Intent mat319 = new Intent(this, activity_matematicas_ej3_19c.class);
        startActivity(mat319);
    }
}