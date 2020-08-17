package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej2_7 extends AppCompatActivity {

    private EditText num1;

    private TextView aciertos6;

    public static int acier6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_7);

        aciertos6 = (TextView) findViewById(R.id.mat27_txtAciertos);
        aciertos6.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_6c.acier5);

        num1 = (EditText)findViewById(R.id.mat27_txtNum1);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();

        acier6 = activity_matematicas_ej2_6c.acier5;
        if(numero1.equals("109")){
            acier6++;
        }

        aciertos6.setText(activity_matematicas_ej2_2.textoAciertos + acier6);

        mat28(view);
    }
    public void mat28(View view){
        Intent mat28 = new Intent(this, activity_matematicas_ej2_8.class);
        startActivity(mat28);
    }
}