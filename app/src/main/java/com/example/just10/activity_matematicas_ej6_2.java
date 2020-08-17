package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej6_2 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;

    private EditText num1;
    private EditText num2;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej6_2);

        aciertos = (TextView) findViewById(R.id.mat62_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej6_1.acier);

        num1 = (EditText)findViewById(R.id.mat62_txtNum1);
        num2 = (EditText)findViewById(R.id.mat62_txtNum2);

        spinner1 = (Spinner)findViewById(R.id.mat62_spn1);
        String [] s1 = {"Minutos", "Horas"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat62_spn2);
        String [] s2 = {"Minuto", "Hora"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat62_spn3);
        String [] s3 = {"La grande", "La chica"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner)findViewById(R.id.mat62_spn4);
        String [] s4 = {"La grande", "La chica"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s4);
        spinner4.setAdapter(adapter4);

    }

    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();
        String preg4 = spinner4.getSelectedItem().toString();

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        acier = activity_matematicas_ej6_1.acier;

        if(numero1.equals("30")){
            acier++;
        }
        if(numero2.equals("1")){
            acier++;
        }
        if(preg1.equals("Minutos")){
            acier++;
        }
        if(preg2.equals("Hora")){
            acier++;
        }
        if(preg3.equals("La chica")){
            acier++;
        }
        if(preg4.equals("La grande")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat63(view);
    }
    public void mat63(View view){
        Intent mat63 = new Intent(this, activity_matematicas_ej6_3.class);
        startActivity(mat63);
    }
}