package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej6_7 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;

    private EditText num1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej6_7);

        aciertos = (TextView) findViewById(R.id.mat67_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej6_6.acier);

        num1 = (EditText)findViewById(R.id.mat67_txtNum1);

        spinner1 = (Spinner)findViewById(R.id.mat67_spn1);
        String [] s1 = {"Un medio", "Un cuarto", "Un queso"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat67_spn2);
        String [] s2 = {"Un medio", "Un cuarto", "Un queso"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();

        String numero1 = num1.getText().toString();

        acier = activity_matematicas_ej6_6.acier;

        if(numero1.equals("32")){
            acier++;
        }
        if(preg1.equals("Un cuarto")){
            acier++;
        }
        if(preg2.equals("Un medio")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat68(view);
    }
    public void mat68(View view){
        Intent mat68 = new Intent(this, activity_matematicas_ej6_8.class);
        startActivity(mat68);
    }
}