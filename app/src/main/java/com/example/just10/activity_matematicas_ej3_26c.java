package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_26c extends AppCompatActivity {

    private EditText num1;
    private EditText num2;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_26c);

        aciertos = (TextView)findViewById(R.id.mat326_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_25.acier);

        num1 = (EditText)findViewById(R.id.mat326_txtNum1);
        num2 = (EditText)findViewById(R.id.mat326_txtNum2);

        spinner1 = (Spinner)findViewById(R.id.mat326_spn1);
        String [] s1 = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_25.acier;

        if(numero1.equals("3")){
            acier++;
        }
        if(numero2.equals("3")){
            acier++;
        }
        if(preg1.equals("Sí")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat327(view);
    }
    public void mat327(View view){
        Intent mat327 = new Intent(this, activity_matematicas_ej3_27.class);
        startActivity(mat327);
    }
}