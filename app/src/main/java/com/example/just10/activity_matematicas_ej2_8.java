package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej2_8 extends AppCompatActivity {

    private EditText num1;

    private TextView aciertos7;

    public static int acier7 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_8);

        aciertos7 = (TextView) findViewById(R.id.mat28_txtAciertos);
        aciertos7.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_7.acier6);

        num1 = (EditText)findViewById(R.id.mat28_txtNum1);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();

        acier7 = activity_matematicas_ej2_7.acier6;
        if(numero1.equals("216")){
            acier7++;
        }

        aciertos7.setText(activity_matematicas_ej2_2.textoAciertos + acier7);

        mat29(view);
    }
    public void mat29(View view){
        Intent mat29 = new Intent(this, activity_matematicas_ej2_9c.class);
        startActivity(mat29);
    }
}