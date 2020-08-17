package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej3_7 extends AppCompatActivity {

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

    private Spinner spinner1;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_7);

        aciertos = (TextView)findViewById(R.id.mat37_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_6.acier);

        num1 = (EditText)findViewById(R.id.mat37_txtNum1);
        num2 = (EditText)findViewById(R.id.mat37_txtNum2);
        num3 = (EditText)findViewById(R.id.mat37_txtNum3);
        num4 = (EditText)findViewById(R.id.mat37_txtNum4);
        num5 = (EditText)findViewById(R.id.mat37_txtNum5);
        num6 = (EditText)findViewById(R.id.mat37_txtNum6);
        num7 = (EditText)findViewById(R.id.mat37_txtNum7);
        num8 = (EditText)findViewById(R.id.mat37_txtNum8);
        num9 = (EditText)findViewById(R.id.mat37_txtNum9);
        num10 = (EditText)findViewById(R.id.mat37_txtNum10);
        num11 = (EditText)findViewById(R.id.mat37_txtNum11);

        spinner1 = (Spinner)findViewById(R.id.mat37_spn1);
        String [] s1 = {"Azules", "Verdes", "Rojas"};
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
        String numero9 = num9.getText().toString();
        String numero10 = num10.getText().toString();
        String numero11 = num11.getText().toString();

        String preg1 = spinner1.getSelectedItem().toString();

        acier = activity_matematicas_ej3_6.acier;

        if(numero1.equals("13")){
            acier++;
        }
        if(numero2.equals("10")){
            acier++;
        }
        if(numero3.equals("100")){
            acier++;
        }
        if(numero4.equals("30")){
            acier++;
        }
        if(numero5.equals("130")){
            acier++;
        }
        if(numero6.equals("13")){
            acier++;
        }
        if(numero7.equals("10")){
            acier++;
        }
        if(numero8.equals("130")){
            acier++;
        }
        if(numero9.equals("120")){
            acier++;
        }
        if(numero10.equals("0")){
            acier++;
        }
        if(numero11.equals("230")){
            acier++;
        }
        if(preg1.equals("Azules")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat38(view);
    }
    public void mat38(View view){
        Intent mat38 = new Intent(this, activity_matematicas_ej3_8c.class);
        startActivity(mat38);
    }
}