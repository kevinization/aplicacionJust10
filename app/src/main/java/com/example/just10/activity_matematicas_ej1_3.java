package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej1_3 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;

    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    private EditText txt4;

    private TextView aciertos;


    private Spinner spinner1;

    //Esta variable obtiene los aciertos
    public static int acier = 1;
    public static String textoAciertos = "Aciertos: ";

   // public static int total = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_3);

        num1 = (EditText)findViewById(R.id.mat13_txtNum1);
        num2 = (EditText)findViewById(R.id.mat13_txtNum2);
        num3 = (EditText)findViewById(R.id.mat13_txtNum3);
        num4 = (EditText)findViewById(R.id.mat13_txtNum4);

        txt1 = (EditText)findViewById(R.id.mat13_txtTexto1);
        txt2 = (EditText)findViewById(R.id.mat13_txtTexto2);
        txt3 = (EditText)findViewById(R.id.mat13_txtTexto3);
        txt4 = (EditText)findViewById(R.id.mat13_txtTexto4);

        aciertos = (TextView)findViewById(R.id.mat13_txtAciertos);

        spinner1 = (Spinner)findViewById(R.id.mat13_spn1);

        String [] premio30 = {"Televisión", "Rompecabezas", "Balón", "Reloj"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio30);
        spinner1.setAdapter(adapter);
       // cargarDatos();
    }



    public void comprobacion (View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();

        String texto1 = txt1.getText().toString();
        String texto2 = txt2.getText().toString();
        String texto3 = txt3.getText().toString();
        String texto4 = txt4.getText().toString();

        String seleccion = spinner1.getSelectedItem().toString();
        //total = 0;

        acier = 1;
        if(numero2.equals("300") && texto2.equals("trescientos")){
            acier++;
        }
        if(numero3.equals("250") && texto3.equals("doscientos cincuenta")){
            acier++;
        }
        if(numero4.equals("180") && texto4.equals("ciento ochenta")){
            acier++;
        }
        if(seleccion.equals("Balón")){
            acier++;
        }

        //total += acier;
        aciertos.setText(textoAciertos + acier);


      //  guardarDatos();
        mat14(view);

    }

    public void mat14(View view){
        Intent mat14 = new Intent(this, acivity_mateamticas_ej1_4.class);
        startActivity(mat14);
    }

    public void guardarDatos() {

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();

        String texto1 = txt1.getText().toString();
        String texto2 = txt2.getText().toString();
        String texto3 = txt3.getText().toString();
        String texto4 = txt4.getText().toString();

        String [] premio30 = {"Televisión", "Rompecabezas", "Balón", "Reloj"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio30);

        String seleccion = spinner1.getSelectedItem().toString();

        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("datosLetra1", texto1);
        editor.putString("datosLetra2", texto2);
        editor.putString("datosLetra3", texto3);
        editor.putString("datosLetra4", texto4);

        editor.putString("datosNumero1", numero1);
        editor.putString("datosNumero2", numero2);
        editor.putString("datosNumero3", numero3);
        editor.putString("datosNumero4", numero4);

        editor.putString("datosSpinner1", seleccion);

        //editor.putInt("totalAciertos", total);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);

        txt1.setText(texto1);
        txt2.setText(texto2);
        txt3.setText(texto3);
        txt4.setText(texto4);

        spinner1.setSelection(adapter.getPosition(seleccion));

        //aciertos.setText(String.valueOf(total));

        editor.commit();
    }

    private void cargarDatos() {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String numero1 = preferences.getString("1000","1000");
        String numero2 = preferences.getString("datosNumero2","");
        String numero3 = preferences.getString("datosNumero3","");
        String numero4 = preferences.getString("datosNumero4","");

        String texto1 = preferences.getString("mil","mil");
        String texto2 = preferences.getString("datosLetra2","");
        String texto3 = preferences.getString("datosLetra3","");
        String texto4 = preferences.getString("datosLetra4","");

        String seleccion = preferences.getString("datosSpinner1", "Televisión");
        String [] premio30 = {"Televisión", "Rompecabezas", "Balón", "Reloj"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, premio30);

        //int total = preferences.getInt("totalAciertos", 0);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);

        txt1.setText(texto1);
        txt2.setText(texto2);
        txt3.setText(texto3);
        txt4.setText(texto4);

        spinner1.setSelection(adapter.getPosition(seleccion));

        //aciertos.setText(String.valueOf(total));
    }

}