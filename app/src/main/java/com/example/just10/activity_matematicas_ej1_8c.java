package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej1_8c extends AppCompatActivity {

    private TextView aciertos6;

    public static int acier6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_8c);

        aciertos6 = (TextView)findViewById(R.id.mat18_txtAciertos);
        aciertos6.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej1_7.acier5);
    }

    public void comprobacion (View view){
        acier6 = activity_matematicas_ej1_7.acier5;
        aciertos6.setText(activity_matematicas_ej1_3.textoAciertos + acier6);

        mat19(view);
    }

    public void mat19(View view){
        Intent mat19 = new Intent(this, activity_matematicas_ej1_9.class);
        startActivity(mat19);
    }
}