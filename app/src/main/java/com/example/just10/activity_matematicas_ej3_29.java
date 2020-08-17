package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_29 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private EditText num7;
    private EditText num8;
    private EditText num9;
    private EditText num10;
    private EditText num11;
    private EditText num12;
    private EditText num13;
    private EditText num14;

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_29);

        aciertos = (TextView)findViewById(R.id.mat329_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_28.acier);

        num1 = (EditText)findViewById(R.id.mat329_txtNum1);
        num2 = (EditText)findViewById(R.id.mat329_txtNum2);
        num3 = (EditText)findViewById(R.id.mat329_txtNum3);
        num4 = (EditText)findViewById(R.id.mat329_txtNum4);
        num5 = (EditText)findViewById(R.id.mat329_txtNum5);
        num6 = (EditText)findViewById(R.id.mat329_txtNum6);
        num7 = (EditText)findViewById(R.id.mat329_txtNum7);
        num8 = (EditText)findViewById(R.id.mat329_txtNum8);
        num9 = (EditText)findViewById(R.id.mat329_txtNum9);
        num10 = (EditText)findViewById(R.id.mat329_txtNum10);
        num11 = (EditText)findViewById(R.id.mat329_txtNum11);
        num12 = (EditText)findViewById(R.id.mat329_txtNum12);
        num13 = (EditText)findViewById(R.id.mat329_txtNum13);
        num14 = (EditText)findViewById(R.id.mat329_txtNum14);

        spinner1 = (Spinner)findViewById(R.id.mat329_spn1);
        String [] s1 = {"Sí", "No"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);
    }
    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();
        String numero7 = num7.getText().toString();
        String numero8 = num8.getText().toString();
        String numero9 = num9.getText().toString();
        String numero10 = num10.getText().toString();
        String numero11 = num11.getText().toString();
        String numero12 = num12.getText().toString();
        String numero13 = num13.getText().toString();
        String numero14 = num14.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_28.acier;

        if(numero1.equals("2")){
            acier++;
        }
        if(numero2.equals("2")){
            acier++;
        }
        if(numero3.equals("3")){
            acier++;
        }
        if(numero4.equals("3")){
            acier++;
        }
        if(numero5.equals("6")){
            acier++;
        }
        if(numero6.equals("3")){
            acier++;
        }
        if(numero7.equals("1")){
            acier++;
        }
        if(numero8.equals("1")){
            acier++;
        }
        if(numero9.equals("6")){
            acier++;
        }
        if(numero10.equals("6")){
            acier++;
        }
        if(numero11.equals("10")){
            acier++;
        }
        if(numero12.equals("10")){
            acier++;
        }
        if(numero13.equals("5")){
            acier++;
        }
        if(numero14.equals("5")){
            acier++;
        }
        if(preg1.equals("Sí")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat330(view);
    }
    public void mat330(View view){
        Intent mat330 = new Intent(this, activity_matematicas_ej3_30c.class);
        startActivity(mat330);
    }
}