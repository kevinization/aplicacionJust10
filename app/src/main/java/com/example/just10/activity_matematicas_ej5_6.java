package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej5_6 extends AppCompatActivity {

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej5_6);

        aciertos = (TextView) findViewById(R.id.mat56_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej5_5.acier);
    }

    public void mat57(View view){
        acier = activity_matematicas_ej5_5.acier;

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat57(view);

        Intent mat57 = new Intent(this, ActiTemas.class);
        startActivity(mat57);
    }
}