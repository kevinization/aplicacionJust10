package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej2_3 extends AppCompatActivity {

    private TextView aciertos2;

    public static int acier2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_3);

        aciertos2 = (TextView) findViewById(R.id.mat23_txtAciertos);
        aciertos2.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_2.acier);
    }

    public void comprobacion (View view){
        acier2 = activity_matematicas_ej2_2.acier;

        aciertos2.setText(activity_matematicas_ej2_2.textoAciertos + acier2);

        mat24(view);

    }
    public void mat24(View view){
        Intent mat24 = new Intent(this, activity_matematicas_ej2_4.class);
        startActivity(mat24);
    }
}