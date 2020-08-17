package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej3_1 extends AppCompatActivity {

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_1);

        aciertos = (TextView)findViewById(R.id.mat31_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_1.acier);
    }
    public void comprobacion (View view){
        acier = 0;
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat32(view);
    }

    public void mat32(View view){
        Intent mat32 = new Intent(this, activity_matematicas_ej3_2.class);
        startActivity(mat32);
    }
}