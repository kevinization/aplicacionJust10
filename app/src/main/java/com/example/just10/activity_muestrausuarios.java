package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class activity_muestrausuarios extends AppCompatActivity {
    TextView txtTituloApp, txtResultadosCalificaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestrausuarios);
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        txtTituloApp=(TextView) findViewById(R.id.txtTituloApp);
        txtResultadosCalificaciones=(TextView) findViewById(R.id.txtResultadosCalificaciones);
        List calificaciones = claseBD.mostrarCalificaciones();
        String delim = "\n";
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<calificaciones.size()-1){
            sb.append(calificaciones.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(calificaciones.get(i));
        String res = sb.toString();
        txtResultadosCalificaciones.setText(res);
    }
}