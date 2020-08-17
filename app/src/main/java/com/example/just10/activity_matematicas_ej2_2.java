package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej2_2 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;

    private TextView aciertos;

    public static int acier = 0;
    public static String textoAciertos = "Aciertos: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_2);

        spinner1 = (Spinner)findViewById(R.id.mat22_spn1);
        String [] s1 = {"No", "Sí"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat22_spn2);
        String [] s2 = {"No", "Sí"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat22_spn3);
        String [] s3 = {"Sí", "No"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner)findViewById(R.id.mat22_spn4);
        String [] s4 = {"No", "Sí"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s4);
        spinner4.setAdapter(adapter4);

        aciertos = (TextView)findViewById(R.id.mat22_txtAciertos);
    }

    public void comprobacion (View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();
        String preg4 = spinner4.getSelectedItem().toString();

        acier = 0;

        if(preg1.equals("Sí")){
            acier++;
        }
        if(preg2.equals("Sí")){
            acier++;
        }
        if(preg3.equals("No")){
            acier++;
        }
        if(preg4.equals("Sí")){
            acier++;
        }

        aciertos.setText(textoAciertos + acier);

        mat23(view);
    }

    public void mat23(View view){
        Intent mat23 = new Intent(this, activity_matematicas_ej2_3.class);
        startActivity(mat23);
    }
}