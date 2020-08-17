package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import android.os.Bundle;

import java.util.ArrayList;

public class activity_graficaProgreso extends AppCompatActivity {

        ArrayList<BarEntry> BARENTRY;
        ArrayList<String> BarEntryLabels;
        BarDataSet Bardataset;
        BarData BARDATA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafica_progreso);

        BarChart barChart = (BarChart)findViewById(R.id.graficaProgreso);

        BARENTRY = new ArrayList<>();

        BarEntryLabels = new ArrayList<String>();

        AddValuesToBARENTRY();

        AddValuestoBarEntryLabels();

        Bardataset = new BarDataSet(BARENTRY, "Actividades");

        BARDATA = new BarData(BarEntryLabels,Bardataset);

        Bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        barChart.setData(BARDATA);

        barChart.animateY(3000);
    }

    public void AddValuesToBARENTRY(){
        BARENTRY.add(new BarEntry(2f,0));
        BARENTRY.add(new BarEntry(4f,1));
        BARENTRY.add(new BarEntry(8f,2));
        BARENTRY.add(new BarEntry(6f,3));
        BARENTRY.add(new BarEntry(3f,4));
    }

    public void AddValuestoBarEntryLabels(){
        BarEntryLabels.add("Número");
        BarEntryLabels.add("Suma y Resta");
        BarEntryLabels.add("Multiplicacion y Divición");
        BarEntryLabels.add("Ubicación Especial");
        BarEntryLabels.add("Figuras y Cuerpos Geometricos");
        BarEntryLabels.add("Magnitudes y Medidas");
        BarEntryLabels.add("Estadistica");
    }
}