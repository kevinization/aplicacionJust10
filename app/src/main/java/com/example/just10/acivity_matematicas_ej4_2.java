package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class acivity_matematicas_ej4_2 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;
    private Spinner spinner6;
    private Spinner spinner7;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej4_2);

        aciertos = (TextView)findViewById(R.id.mat42_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acivity_matematicas_ej4_2.acier);

        spinner1 = (Spinner)findViewById(R.id.mat42_spn1);
        String [] s1 = {"Cerca", "Lejos"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat42_spn2);
        String [] s2 = {"Cerca", "Lejos"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat42_spn3);
        String [] s3 = {"Es verdad", "Es mentira"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner)findViewById(R.id.mat42_spn4);
        String [] s4 = {"1", "2", "3", "4"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s4);
        spinner4.setAdapter(adapter4);

        spinner5 = (Spinner)findViewById(R.id.mat42_spn5);
        String [] s5 = {"1", "2", "3", "4"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s5);
        spinner5.setAdapter(adapter5);

        spinner6 = (Spinner)findViewById(R.id.mat42_spn6);
        String [] s6 = {"1", "2", "3", "4"};
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s6);
        spinner6.setAdapter(adapter6);

        spinner7 = (Spinner)findViewById(R.id.mat42_spn7);
        String [] s7 = {"1", "2", "3", "4"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s7);
        spinner7.setAdapter(adapter7);
    }

    public void comprobacion (View view){

        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();
        String preg4 = spinner4.getSelectedItem().toString();
        String preg5 = spinner5.getSelectedItem().toString();
        String preg6 = spinner6.getSelectedItem().toString();
        String preg7 = spinner7.getSelectedItem().toString();

        acier = 0;

        if(preg1.equals("Cerca")){
            acier++;
        }
        if(preg2.equals("Lejos")){
            acier++;
        }
        if(preg3.equals("Es verdad")){
            acier++;
        }
        if(preg4.equals("3")){
            acier++;
        }
        if(preg5.equals("4")){
            acier++;
        }
        if(preg6.equals("1")){
            acier++;
        }
        if(preg7.equals("2")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        //Guardad acier en BD (Campo UBE)
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        String idvalor = claseBD.regresaIDUSUARIO();
        claseBD.actualizarPuntajes(idvalor,"UBE", String.valueOf(acier));
        Toast.makeText(getApplicationContext(), "Puntaje Actualizado", Toast.LENGTH_SHORT).show();

        mat5(view);
    }
    public void mat5(View view){
        Intent mat5 = new Intent(this, ActiTemas.class);
        startActivity(mat5);
        finalizar(view);
    }

    public void finalizar(View v){
        finish();
    }
}