package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_9 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private EditText num7;
    private EditText num8;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_9);

        aciertos = (TextView)findViewById(R.id.mat39_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_8c.acier);

        num1 = (EditText)findViewById(R.id.mat39_txtNum1);
        num2 = (EditText)findViewById(R.id.mat39_txtNum2);
        num3 = (EditText)findViewById(R.id.mat39_txtNum3);
        num4 = (EditText)findViewById(R.id.mat39_txtNum4);
        num5 = (EditText)findViewById(R.id.mat39_txtNum5);
        num6 = (EditText)findViewById(R.id.mat39_txtNum6);
        num7 = (EditText)findViewById(R.id.mat39_txtNum5);
        num8 = (EditText)findViewById(R.id.mat39_txtNum6);

        spinner1 = (Spinner)findViewById(R.id.mat39_spn1);
        String [] s1 = {"Itzel", "Mónica"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
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

        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_8c.acier;

        if(numero1.equals("120")){
            acier++;
        }
        if(numero2.equals("180")){
            acier++;
        }
        if(numero3.equals("300")){
            acier++;
        }
        if(preg1.equals("Itzel")){
            acier++;
        }
        if(numero4.equals("15")){
            acier++;
        }
        if(numero5.equals("9")){
            acier++;
        }
        if(numero6.equals("135")){
            acier++;
        }
        if(numero7.equals("135")){
            acier++;
        }
        if(numero8.equals("31")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat310(view);
    }
    public void mat310(View view){
        Intent mat310 = new Intent(this, activity_matematicas_ej3_10.class);
        startActivity(mat310);
    }
}