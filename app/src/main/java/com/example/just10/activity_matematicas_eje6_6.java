package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_eje6_6 extends AppCompatActivity {


    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6_6);

        aciertos = (TextView) findViewById(R.id.mat66_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje6_5.acier);
    }

    public void mat67(View view){
        acier = activity_matematicas_eje6_5.acier;
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        Intent mat67 = new Intent(this, activity_matematicas_eje6_7.class);
        startActivity(mat67);
    }
}