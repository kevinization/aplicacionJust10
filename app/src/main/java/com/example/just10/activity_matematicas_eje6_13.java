package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class activity_matematicas_eje6_13 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_eje6_13);

        aciertos = (TextView) findViewById(R.id.mat613_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_eje6_12.acier);

        spinner1 = (Spinner)findViewById(R.id.mat613_spn1);
        String [] s1 = {"Paco", "Ana"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat613_spn2);
        String [] s2 = {"Sí", "No"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat613_spn3);
        String [] s3 = {"Medio kilo de nueces", "Medio kilo de piñones", "Pesan lo mismo"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner)findViewById(R.id.mat613_spn4);
        String [] s4 = {"Medio kilo de nueces", "Medio kilo de piñones", "Pesan lo mismo"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s4);
        spinner4.setAdapter(adapter4);
    }
    public void comprobacion(View view){
        String preg1 = spinner1.getSelectedItem().toString();
        String preg2 = spinner2.getSelectedItem().toString();
        String preg3 = spinner3.getSelectedItem().toString();
        String preg4 = spinner4.getSelectedItem().toString();

        acier = activity_matematicas_eje6_12.acier;

        if(preg1.equals("Ana")){
            acier++;
        }
        if(preg2.equals("No")){
            acier++;
        }
        if(preg3.equals("Pesan lo mismo")){
            acier++;
        }
        if(preg4.equals("Pesan lo mismo")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        //Guardad acier en BD (Campo MYM)
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        String idvalor = claseBD.regresaIDUSUARIO();
        claseBD.actualizarPuntajes(idvalor,"MYM", String.valueOf(acier));
        Toast.makeText(getApplicationContext(), "Puntaje Actualizado", Toast.LENGTH_SHORT).show();

        mat7(view);
    }
    public void mat7(View view){
        Intent mat7 = new Intent(this, ActiTemas.class);
        startActivity(mat7);
    }
}