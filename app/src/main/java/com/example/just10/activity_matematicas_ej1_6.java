package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej1_6 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;

    private Spinner spinner1;
    private Spinner spinner2;

    private TextView aciertos4;

    public static int acier4 = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_6);

        aciertos4 = (TextView)findViewById(R.id.mat16_txtAciertos);
        aciertos4.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej1_5.acier3);

        num1 = (EditText)findViewById(R.id.mat16_txtNum1);
        num2 = (EditText)findViewById(R.id.mat16_txtNum2);

        spinner1 = (Spinner)findViewById(R.id.mat16_spn1);
        String [] premio = {"Celular", "Balón", "Lámpara", "Guitarra"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat16_spn2);
        String [] premio2 = {"Balón", "Reloj", "Regalo", "Guitarra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio2);
        spinner2.setAdapter(adapter2);
    }

    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        String seleccion1 = spinner1.getSelectedItem().toString();
        String seleccion2 = spinner2.getSelectedItem().toString();

        acier4 = activity_matematicas_ej1_5.acier3;

        if(numero1.equals("80")){
            acier4++;
        }
        if(seleccion1.equals("Lámpara")){
            acier4++;
        }
        if(numero2.equals("250")){
            acier4++;
        }
        if(seleccion2.equals("Guitarra")){
            acier4++;
        }

        aciertos4.setText(activity_matematicas_ej1_3.textoAciertos + acier4);

        mat17(view);
    }

    public void mat17(View view){
        Intent mat17 = new Intent(this, activity_matematicas_ej1_7.class);
        startActivity(mat17);
    }

    public void guardarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos16", Context.MODE_PRIVATE);
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        String [] premio = {"Celular", "Balón", "Lámpara", "Guitarra"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio);

        String [] premio2 = {"Balón", "Reloj", "Regalo", "Guitarra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio2);

        String seleccion1 = spinner1.getSelectedItem().toString();
        String seleccion2 = spinner2.getSelectedItem().toString();
        SharedPreferences.Editor editor=preferences.edit();

        editor.putString("datosNumero1", numero1);
        editor.putString("datosNumero2", numero2);

        editor.putString("datosSpinner1", seleccion1);
        editor.putString("datosSpinner1", seleccion2);

        //editor.putInt("totalAciertos", total);

        num1.setText(numero1);
        num2.setText(numero2);

        spinner1.setSelection(adapter1.getPosition(seleccion1));
        spinner2.setSelection(adapter2.getPosition(seleccion2));

        //aciertos4.setText(String.valueOf(total));

        editor.commit();
    }

    private void cargarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos16", Context.MODE_PRIVATE);
        String numero1 = preferences.getString("datosNumero1","");
        String numero2 = preferences.getString("datosNumero2","");

        String seleccion1 = preferences.getString("datosSpinner1", "Celular");
        String [] premio = {"Celular", "Balón", "Lámpara", "Guitarra"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio);

        String seleccion2 = preferences.getString("datosSpinner2", "Balón");
        String [] premio2 = {"Balón", "Reloj", "Regalo", "Guitarra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio2);

        //int total = preferences.getInt("totalAciertos", 0);

        num1.setText(numero1);
        num2.setText(numero2);

        spinner1.setSelection(adapter1.getPosition(seleccion1));
        spinner2.setSelection(adapter2.getPosition(seleccion2));

        //aciertos4.setText(String.valueOf(total));
    }
}