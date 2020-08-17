package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_matematicas_ej3_19c extends AppCompatActivity {

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
    private EditText num15;
    private EditText num16;
    private EditText num17;
    private EditText num18;
    private EditText num19;

    private TextView aciertos;

    public static int acier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej3_19c);

        aciertos = (TextView)findViewById(R.id.mat319_txtAciertos);
        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej3_18c.acier);

        num1 = (EditText)findViewById(R.id.mat319_txtNum1);
        num2 = (EditText)findViewById(R.id.mat319_txtNum2);
        num3 = (EditText)findViewById(R.id.mat319_txtNum3);
        num4 = (EditText)findViewById(R.id.mat319_txtNum4);
        num5 = (EditText)findViewById(R.id.mat319_txtNum5);
        num6 = (EditText)findViewById(R.id.mat319_txtNum6);
        num7 = (EditText)findViewById(R.id.mat319_txtNum7);
        num8 = (EditText)findViewById(R.id.mat319_txtNum8);
        num9 = (EditText)findViewById(R.id.mat319_txtNum9);
        num10 = (EditText)findViewById(R.id.mat319_txtNum10);
        num11 = (EditText)findViewById(R.id.mat319_txtNum11);
        num12 = (EditText)findViewById(R.id.mat319_txtNum12);
        num13 = (EditText)findViewById(R.id.mat319_txtNum13);
        num14 = (EditText)findViewById(R.id.mat319_txtNum14);
        num15 = (EditText)findViewById(R.id.mat319_txtNum15);
        num16 = (EditText)findViewById(R.id.mat319_txtNum16);
        num17 = (EditText)findViewById(R.id.mat319_txtNum17);
        num18 = (EditText)findViewById(R.id.mat319_txtNum18);
        num19 = (EditText)findViewById(R.id.mat319_txtNum19);
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
        String numero15 = num15.getText().toString();
        String numero16 = num16.getText().toString();
        String numero17 = num17.getText().toString();
        String numero18 = num18.getText().toString();
        String numero19 = num19.getText().toString();

        acier = activity_matematicas_ej3_18c.acier;

        if(numero1.equals("11")){
            acier++;
        }
        if(numero2.equals("10")){
            acier++;
        }
        if(numero3.equals("110")){
            acier++;
        }
        if(numero4.equals("9")){
            acier++;
        }
        if(numero5.equals("10")){
            acier++;
        }
        if(numero6.equals("90")){
            acier++;
        }
        if(numero7.equals("4")){
            acier++;
        }
        if(numero8.equals("10")){
            acier++;
        }
        if(numero9.equals("40")){
            acier++;
        }
        if(numero10.equals("11")){
            acier++;
        }
        if(numero11.equals("5")){
            acier++;
        }
        if(numero12.equals("55")){
            acier++;
        }
        if(numero13.equals("9")){
            acier++;
        }
        if(numero14.equals("5")){
            acier++;
        }
        if(numero15.equals("45")){
            acier++;
        }
        if(numero16.equals("4")){
            acier++;
        }
        if(numero17.equals("5")){
            acier++;
        }
        if(numero18.equals("20")){
            acier++;
        }
        if(numero19.equals("360")){
            acier++;
        }

        aciertos.setText(activity_matematicas_ej1_3.textoAciertos + acier);

        mat320(view);
    }
    public void mat320(View view){
        Intent mat320 = new Intent(this, activity_matematicas_ej3_20.class);
        startActivity(mat320);
    }
}