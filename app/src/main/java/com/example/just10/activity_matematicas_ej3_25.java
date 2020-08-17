package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class activity_matematicas_ej3_25 extends AppCompatActivity {

    private EditText num2;
    private EditText num3;
    private EditText num4;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_25);

        aciertos = (TextView)findViewById(R.id.mat325_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_23.acier);

        num2 = (EditText)findViewById(R.id.mat325_txtNum2);
        num3 = (EditText)findViewById(R.id.mat325_txtNum3);
        num4 = (EditText)findViewById(R.id.mat325_txtNum4);

        spinner1 = (Spinner)findViewById(R.id.mat325_spn1);
        String [] s1 = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }
    public void comprobacion(View view){
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_23.acier;
        if(numero2.equals("5")){
            acier++;
        }
        if(numero3.equals("12")){
            acier++;
        }
        if(preg1.equals("No")){
            acier++;
        }
        if(numero4.equals("75")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        //Guardad acier en BD (Campo MYD)
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        String idvalor = claseBD.regresaIDUSUARIO();
        claseBD.actualizarPuntajes(idvalor,"MYD", String.valueOf(acier));
        Toast.makeText(getApplicationContext(), "Puntaje Actualizado", Toast.LENGTH_SHORT).show();

        mat326(view);
    }
    public void mat326(View view){
        Intent mat326 = new Intent(this, ActiTemas.class);
        startActivity(mat326);
        finalizar(view);
    }

    public void finalizar(View v){
        finish();
    }
}