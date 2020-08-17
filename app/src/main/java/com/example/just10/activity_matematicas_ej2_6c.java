package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_matematicas_ej2_6c extends AppCompatActivity {

    private TextView aciertos5;

    public static int acier5 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_6c);

        aciertos5 = (TextView) findViewById(R.id.mat26_txtAciertos);
        aciertos5.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_5.acier4);
    }

    public void comprobacion(View view){
        acier5 = activity_matematicas_ej2_5.acier4;

        aciertos5.setText(activity_matematicas_ej2_2.textoAciertos + acier5);

        mat27(view);
    }

    public void mat27(View view){
        Intent mat27 = new Intent(this, activity_matematicas_ej2_7.class);
        startActivity(mat27);
    }
}