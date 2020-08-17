package com.example.just10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActiTemas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_temas);
    }
    //Metodo para cambiar a la pantalla de Numero
    public void Numero(View view){
        Intent numero = new Intent(this, activity_matematicas.class);
        startActivity(numero);
    }
    public void SumaResta(View view){
        Intent sumaResta = new Intent(this, activity_matematicas_ej2.class);
        startActivity(sumaResta);
    }
    public void MultiDiv(View view){
        Intent multiDiv = new Intent(this, activity_matematicas_ej3.class);
        startActivity(multiDiv);
    }

    public void UbicEspa(View view){
        Intent ubicEspa = new Intent(this, activity_matematicas_ej4_1.class);
        startActivity(ubicEspa);
    }

    public void geom(View view){
        Intent geome = new Intent(this, activity_matematicas_ej5.class);
        startActivity(geome);
    }

    public void magyme(View view){
        Intent magymed = new Intent(this, activity_matematicas_eje6.class);
        startActivity(magymed);
    }

    public void esta(View view){
        Intent estad = new Intent(this, activity_matematicas_eje7.class);
        startActivity(estad);
    }


}