package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej3_21 extends AppCompatActivity {


    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_21);

        aciertos = (TextView)findViewById(R.id.mat321_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_20.acier);
    }

    public void comprobacion(View view){

        acier = activity_matematicas_ej3_20.acier;

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat322(view);
    }
    public void mat322(View view){
        Intent mat322 = new Intent(this, activity_matematicas_ej3_22.class);
        startActivity(mat322);
    }
}