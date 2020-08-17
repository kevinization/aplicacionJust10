package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej2_5 extends AppCompatActivity {

    private TextView aciertos4;

    public static int acier4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_5);

        aciertos4 = (TextView) findViewById(R.id.mat25_txtAciertos);
        aciertos4.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_4.acier3);
    }

    public void comprobacion(View view){
        acier4 = activity_matematicas_ej2_4.acier3;

        aciertos4.setText(activity_matematicas_ej2_2.textoAciertos + acier4);

        mat26(view);
    }

    public void mat26(View view){
        Intent mat26 = new Intent(this, activity_matematicas_ej2_6c.class);
        startActivity(mat26);
    }
}