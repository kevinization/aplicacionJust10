package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej6_1 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej6_1);

        aciertos = (TextView) findViewById(R.id.mat61_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej6_1.acier);

        spinner1 = (Spinner)findViewById(R.id.mat61_spn1);
        String [] s1 = {"Texcoco", "Puebla", "Cuautla", "Tlaxcala", "Xalapa", "Veracruz"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat61_spn2);
        String [] s2 = {"Texcoco", "Puebla", "Cuautla", "Tlaxcala", "Xalapa", "Veracruz"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

    }

    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();

        acier = 0;

        if(preg1.equals("Texcoco")){
            acier++;
        }
        if(preg2.equals("Veracruz")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat62(view);
    }
    public void mat62(View view){
        Intent mat62 = new Intent(this, activity_matematicas_ej6_2.class);
        startActivity(mat62);
    }
}