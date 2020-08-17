package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_matematicas_ej1_9 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;

    private TextView aciertos7;

    public static int acier7 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_9);

        aciertos7 = (TextView)findViewById(R.id.mat19_txtAciertos);
        aciertos7.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej1_8c.acier6);

        num1 = (EditText)findViewById(R.id.mat19_txtNum1);
        num2 = (EditText)findViewById(R.id.mat19_txtNum2);
        num3 = (EditText)findViewById(R.id.mat19_txtNum3);
        num4 = (EditText)findViewById(R.id.mat19_txtNum4);
        num5 = (EditText)findViewById(R.id.mat19_txtNum5);
        num6 = (EditText)findViewById(R.id.mat19_txtNum6);
    }

    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();

        acier7 = activity_matematicas_ej1_8c.acier6;

        if(numero1.equals("0998")){
            acier7++;
        }
        if(numero2.equals("0999")){
            acier7++;
        }
        if(numero3.equals("1000")){
            acier7++;
        }
        if(numero4.equals("0140")){
            acier7++;
        }
        if(numero5.equals("0900")){
            acier7++;
        }
        if(numero6.equals("1000")){
            acier7++;
        }

        aciertos7.setText(activity_matematicas_ej1_3.textoAciertos + acier7);

        //Guardad acier7 en BD (Campo Num)
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        String idvalor = claseBD.regresaIDUSUARIO();
        claseBD.actualizarPuntajes(idvalor,"NUM", String.valueOf(acier7));
        Toast.makeText(getApplicationContext(), "Puntaje Actualizado", Toast.LENGTH_SHORT).show();

        mat2(view);
    }

    public void mat2(View view){
        Intent mat2 = new Intent(this, ActiTemas.class);
        startActivity(mat2);
        finalizar(view);
    }

    public void finalizar(View v){
        finish();
    }

    public void guardarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos19", Context.MODE_PRIVATE);
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();

        SharedPreferences.Editor editor=preferences.edit();

        editor.putString("datosNumero1", numero1);
        editor.putString("datosNumero2", numero2);
        editor.putString("datosNumero3", numero3);
        editor.putString("datosNumero4", numero4);
        editor.putString("datosNumero5", numero5);
        editor.putString("datosNumero6", numero6);

        //editor.putInt("totalAciertos", total);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);
        num5.setText(numero5);
        num6.setText(numero6);

        //aciertos7.setText(String.valueOf(total));

        editor.commit();
    }

    private void cargarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos17", Context.MODE_PRIVATE);
        String numero1 = preferences.getString("datosNumero1","");
        String numero2 = preferences.getString("datosNumero2","");
        String numero3 = preferences.getString("datosNumero3","");
        String numero4 = preferences.getString("datosNumero4","");
        String numero5 = preferences.getString("datosNumero5","");
        String numero6 = preferences.getString("datosNumero6","");

        //int total = preferences.getInt("totalAciertos", 0);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);
        num5.setText(numero5);
        num6.setText(numero6);

        //aciertos7.setText(String.valueOf(total));
    }
}