package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_24c extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_24c);

        aciertos = (TextView)findViewById(R.id.mat324_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_23.acier);

        num1 = (EditText)findViewById(R.id.mat324_txtNum1);
        num2 = (EditText)findViewById(R.id.mat324_txtNum2);
        num3 = (EditText)findViewById(R.id.mat324_txtNum3);

        spinner1 = (Spinner)findViewById(R.id.mat324_spn1);
        String [] s1 = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }

    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_23.acier;

        if(numero1.equals("35")){
            acier++;
        }
        if(numero2.equals("5")){
            acier++;
        }
        if(numero3.equals("7")){
            acier++;
        }
        if(preg1.equals("No")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat325(view);
    }
    public void mat325(View view){
        Intent mat325 = new Intent(this, activity_matematicas_ej3_25.class);
        startActivity(mat325);
    }
}