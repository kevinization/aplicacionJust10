package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class activity_calificaciones extends AppCompatActivity {
    private RecyclerView recyclerViewCalificaciones;
    private RecyclerViewAdaptador adaptadorCalificaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        recyclerViewCalificaciones=(RecyclerView)findViewById(R.id.recyclerCalificaciones);
        recyclerViewCalificaciones.setLayoutManager(new LinearLayoutManager(this));
        adaptadorCalificaciones=new RecyclerViewAdaptador(claseBD.mostrarCalificaciones());
        recyclerViewCalificaciones.setAdapter(adaptadorCalificaciones);
    }
}