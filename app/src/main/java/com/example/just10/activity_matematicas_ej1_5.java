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

public class activity_matematicas_ej1_5 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private EditText num7;
    private EditText num8;
    private EditText preg;

    private Spinner spinner1;
    private Spinner spinner2;

    private TextView aciertos3;

    public static int acier3 = 0;

    //public static int total = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_5);

        aciertos3 = (TextView)findViewById(R.id.mat15_txtAciertos);
        aciertos3.setText(activity_matematicas_ej1_3.textoAciertos + acivity_mateamticas_ej1_4.acier2);

        num1 = (EditText)findViewById(R.id.mat16_txtNum1);
        num2 = (EditText)findViewById(R.id.mat15_txtNum2);
        num3 = (EditText)findViewById(R.id.mat15_txtNum3);
        num4 = (EditText)findViewById(R.id.mat15_txtNum4);
        num5 = (EditText)findViewById(R.id.mat15_txtNum5);
        num6 = (EditText)findViewById(R.id.mat15_txtNum6);
        num7 = (EditText)findViewById(R.id.mat15_txtNum7);
        num8 = (EditText)findViewById(R.id.mat15_txtNum8);
        preg = (EditText)findViewById(R.id.mat15_txtNum9);

        spinner1 = (Spinner)findViewById(R.id.mat15_spn1);
        String [] dardos = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dardos);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat15_spn2);
        String [] celular = {"Sí", "No"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, celular);
        spinner2.setAdapter(adapter2);
    }

    public void comprobacion (View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();
        String numero7 = num7.getText().toString();
        String numero8 = num8.getText().toString();
        String pregu = preg.getText().toString();

        String seleccion1 = spinner1.getSelectedItem().toString();
        String seleccion2 = spinner2.getSelectedItem().toString();

        acier3 = acivity_mateamticas_ej1_4.acier2;
        if(numero1.equals("90")){
            acier3++;
        }
        if(numero2.equals("100")){
            acier3++;
        }
        if(numero3.equals("110")){
            acier3++;
        }
        if(numero4.equals("120")){
            acier3++;
        }
        if(numero5.equals("800")){
            acier3++;
        }
        if(numero6.equals("900")){
            acier3++;
        }
        if(numero7.equals("1000")){
            acier3++;
        }
        if(numero8.equals("1100")){
            acier3++;
        }
        if(seleccion1.equals("No")){
            acier3++;
        }
        if(pregu.equals("180")){
            acier3++;
        }
        if(seleccion2.equals("Sí")){
            acier3++;
        }

        //total += acier;
        aciertos3.setText(activity_matematicas_ej1_3.textoAciertos + acier3);


        //guardarDatos();

        mat16(view);

    }

    public void mat16(View view){
        Intent mat16 = new Intent(this, activity_matematicas_ej1_6.class);
        startActivity(mat16);
    }

    public void guardarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos15", Context.MODE_PRIVATE);

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();
        String numero7 = num7.getText().toString();
        String numero8 = num8.getText().toString();

        String [] dardos = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dardos);

        String [] celular = {"Sí", "No"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, celular);

        String seleccion1 = spinner1.getSelectedItem().toString();
        String seleccion2 = spinner2.getSelectedItem().toString();

        SharedPreferences.Editor editor=preferences.edit();

        editor.putString("datosNumero1", numero1);
        editor.putString("datosNumero2", numero2);
        editor.putString("datosNumero3", numero3);
        editor.putString("datosNumero4", numero4);
        editor.putString("datosNumero1", numero5);
        editor.putString("datosNumero2", numero6);
        editor.putString("datosNumero3", numero7);
        editor.putString("datosNumero4", numero8);

        editor.putString("datosSpinner1", seleccion1);
        editor.putString("datosSpinner2", seleccion2);

        //editor.putInt("totalAciertos", total);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);
        num5.setText(numero5);
        num6.setText(numero6);
        num7.setText(numero7);
        num8.setText(numero8);

        spinner1.setSelection(adapter1.getPosition(seleccion1));
        spinner2.setSelection(adapter2.getPosition(seleccion2));

        //aciertos3.setText(String.valueOf(total));

        editor.commit();
    }

    private void cargarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos15", Context.MODE_PRIVATE);

        String numero1 = preferences.getString("90","90");
        String numero2 = preferences.getString("datosNumero2","");
        String numero3 = preferences.getString("110","110");
        String numero4 = preferences.getString("datosNumero4","");
        String numero5 = preferences.getString("datosNumero5","");
        String numero6 = preferences.getString("900","900");
        String numero7 = preferences.getString("1000","1000");
        String numero8 = preferences.getString("datosNumero8","");

        String seleccion = preferences.getString("datosSpinner1", "Sí");
        String [] dardos = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dardos);

        String seleccion2 = preferences.getString("datosSpinner1", "Sí");
        String [] celular = {"Sí", "No"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, celular);

        //int total = preferences.getInt("totalAciertos", 0);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);
        num5.setText(numero5);
        num6.setText(numero6);
        num7.setText(numero7);
        num8.setText(numero8);

        spinner1.setSelection(adapter1.getPosition(seleccion));
        spinner2.setSelection(adapter2.getPosition(seleccion));

        //aciertos3.setText(String.valueOf(total));
    }
}