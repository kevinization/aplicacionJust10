package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class activity_matematicas_ej1 extends AppCompatActivity {


    private ListView lv1;

    private String premios [] = {"Celular","Balón","Control","Televisión","Rompecabezas","Reloj",
            "Oso","Raqueta de PingPong","Lámpara","Regalo","Guitarra"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1);

        //lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, premios);
        lv1.setAdapter(adapter);
    }
}