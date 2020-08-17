package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_matematicas_ej2_9c extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;

    private TextView aciertos8;

    public static int acier8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej2_9c);

        aciertos8 = (TextView) findViewById(R.id.mat29_txtAciertos);
        aciertos8.setText(activity_matematicas_ej2_2.textoAciertos + activity_matematicas_ej2_8.acier7);

        num1 = (EditText)findViewById(R.id.mat29_txtNum1);
        num2 = (EditText)findViewById(R.id.mat29_txtNum2);
        num3 = (EditText)findViewById(R.id.mat29_txtNum3);
    }

    public void comprobacion(View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num2.getText().toString();

        acier8 = activity_matematicas_ej2_8.acier7;
        if(numero1.equals("18")){
            acier8++;
        }
        if(numero2.equals("98")){
            acier8++;
        }
        if(numero3.equals("16")){
            acier8++;
        }

        aciertos8.setText(activity_matematicas_ej2_2.textoAciertos + acier8);

        //Guardad acier8 en BD (Campo Num)
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        String idvalor = claseBD.regresaIDUSUARIO();
        claseBD.actualizarPuntajes(idvalor,"SYR", String.valueOf(acier8));
        Toast.makeText(getApplicationContext(), "Puntaje Actualizado", Toast.LENGTH_SHORT).show();

        temas(view);
    }
    public void temas(View view){
        Intent temas = new Intent(this, ActiTemas.class);
        startActivity(temas);
        finalizar(view);
    }

    public void finalizar(View v){
        finish();
    }
}