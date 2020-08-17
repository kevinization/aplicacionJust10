package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class acivity_mateamticas_ej1_4 extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;
    private Spinner spinner6;
    private Spinner spinner7;
    private Spinner spinner8;
    private Spinner spinner9;
    private Spinner spinner10;
    private Spinner spinner11;
    private Spinner spinner12;

    private TextView aciertos2;

    public static int acier2 = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_4);

        aciertos2 = (TextView) findViewById(R.id.mat14_txtAciertos);
        aciertos2.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej1_3.acier);

        spinner1 = (Spinner) findViewById(R.id.mat14_spn1);
        String[] preg1 = {"Regalo y Televisión", "Rompecabezas y  Oso", "Rompecabezas y Reloj", "Rompecabezas y Balón"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner) findViewById(R.id.mat14_spn2);
        String[] preg2 = {"Televisión", "Celular", "Regalo", "Guitarra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner) findViewById(R.id.mat14_spn3);
        String[] preg3r1 = {"30", "60", "90", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r1);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner) findViewById(R.id.mat14_spn4);
        String[] preg3r2 = {"300", "60", "90", "250", "1000", "20", "40", "80", "180", "30"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r2);
        spinner4.setAdapter(adapter4);

        spinner5 = (Spinner) findViewById(R.id.mat14_spn5);
        String[] preg3r3 = {"250", "60", "90", "30", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r3);
        spinner5.setAdapter(adapter5);

        spinner6 = (Spinner)findViewById(R.id.mat14_spn6);
        String [] preg3r5 = {"180", "60", "90", "250", "1000", "20", "40", "80", "30", "300"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r5);
        spinner6.setAdapter(adapter7);

        spinner7 = (Spinner)findViewById(R.id.mat14_spn7);
        String [] preg3r6 = {"80", "60", "90", "250", "1000", "20", "40", "30", "180", "300"};
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r6);
        spinner7.setAdapter(adapter8);

        spinner8 = (Spinner)findViewById(R.id.mat14_spn8);
        String [] preg3r7 = {"20", "60", "90", "250", "1000", "30", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r7);
        spinner8.setAdapter(adapter9);

        spinner9 = (Spinner)findViewById(R.id.mat14_spn9);
        String [] preg3r8 = {"90", "60", "30", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r8);
        spinner9.setAdapter(adapter10);

        spinner10 = (Spinner)findViewById(R.id.mat14_spn10);
        String [] preg3r9 = {"60", "30", "90", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r9);
        spinner10.setAdapter(adapter11);

        spinner11 = (Spinner)findViewById(R.id.mat14_spn11);
        String [] preg3r10 = {"300", "60", "90", "250", "1000", "20", "40", "80", "180", "30"};
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r10);
        spinner11.setAdapter(adapter12);

        spinner12 = (Spinner)findViewById(R.id.mat14_spn12);
        String [] preg3r11 = {"250", "60", "90", "30", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r11);
        spinner12.setAdapter(adapter13);

        //cargarDatos();


    }

    public void comprobacion (View view){
        String seleccionPreg1 = spinner1.getSelectedItem().toString();
        String seleccionPreg2 = spinner2.getSelectedItem().toString();
        String seleccionPreg3r1 = spinner3.getSelectedItem().toString();
        String seleccionPreg3r2 = spinner4.getSelectedItem().toString();
        String seleccionPreg3r3 = spinner5.getSelectedItem().toString();
        String seleccionPreg3r4 = spinner6.getSelectedItem().toString();
        String seleccionPreg3r5 = spinner7.getSelectedItem().toString();
        String seleccionPreg3r6 = spinner8.getSelectedItem().toString();
        String seleccionPreg3r7 = spinner9.getSelectedItem().toString();
        String seleccionPreg3r8 = spinner10.getSelectedItem().toString();
        String seleccionPreg3r9 = spinner11.getSelectedItem().toString();
        String seleccionPreg3r10 = spinner12.getSelectedItem().toString();



        acier2 = activity_matematicas_ej1_3.acier;

        if(seleccionPreg1.equals("Rompecabezas y Balón")){
            acier2++;
        }
        if(seleccionPreg2.equals("Regalo")){
            acier2++;
        }
        if(seleccionPreg3r1.equals("20")){
            acier2++;
        }
        if(seleccionPreg3r2.equals("30")){
            acier2++;
        }
        if(seleccionPreg3r3.equals("40")){
            acier2++;
        }
        if(seleccionPreg3r4.equals("60")){
            acier2++;
        }
        if(seleccionPreg3r5.equals("80")){
            acier2++;
        }
        if(seleccionPreg3r6.equals("90")){
            acier2++;
        }
        if(seleccionPreg3r7.equals("180")){
            acier2++;
        }
        if(seleccionPreg3r8.equals("250")){
            acier2++;
        }
        if(seleccionPreg3r9.equals("300")){
            acier2++;
        }
        if(seleccionPreg3r10.equals("1000")){
            acier2++;
        }

        //activity_matematicas_ej1_3.total += acier2;
        aciertos2.setText(activity_matematicas_ej1_3.textoAciertos + acier2);

      //  guardarDatos();
        mat15(view);
    }

    public void mat15(View view){
        Intent mat15 = new Intent(this, activity_matematicas_ej1_5.class);
        startActivity(mat15);
    }

    public void guardarDatos() {

        SharedPreferences preferences = getSharedPreferences("datos14", Context.MODE_PRIVATE);


        String[] preg1 = {"Regalo y Televisión", "Rompecabezas y  Oso", "Rompecabezas y Reloj", "Rompecabezas y Balón"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg1);

        String[] preg2 = {"Televisión", "Celular", "Regalo", "Guitarra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg2);

        String[] preg3r1 = {"30", "60", "90", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r1);

        String[] preg3r2 = {"300", "60", "90", "250", "1000", "20", "40", "80", "180", "30"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r2);

        String[] preg3r3 = {"250", "60", "90", "30", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r3);

        String [] preg3r5 = {"180", "60", "90", "250", "1000", "20", "40", "80", "30", "300"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r5);

        String [] preg3r6 = {"80", "60", "90", "250", "1000", "20", "40", "30", "180", "300"};
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r6);

        String [] preg3r7 = {"20", "60", "90", "250", "1000", "30", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r7);

        String [] preg3r8 = {"90", "60", "30", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r8);

        String [] preg3r9 = {"60", "30", "90", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r9);

        String [] preg3r10 = {"300", "60", "90", "250", "1000", "20", "40", "80", "180", "30"};
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r10);

        String [] preg3r11 = {"250", "60", "90", "30", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r11);

        String seleccionPreg1 = spinner1.getSelectedItem().toString();
        String seleccionPreg2 = spinner2.getSelectedItem().toString();
        String seleccionPreg3r1 = spinner3.getSelectedItem().toString();
        String seleccionPreg3r2 = spinner4.getSelectedItem().toString();
        String seleccionPreg3r3 = spinner5.getSelectedItem().toString();
        String seleccionPreg3r4 = spinner6.getSelectedItem().toString();
        String seleccionPreg3r5 = spinner7.getSelectedItem().toString();
        String seleccionPreg3r6 = spinner8.getSelectedItem().toString();
        String seleccionPreg3r7 = spinner9.getSelectedItem().toString();
        String seleccionPreg3r8 = spinner10.getSelectedItem().toString();
        String seleccionPreg3r9 = spinner11.getSelectedItem().toString();
        String seleccionPreg3r10 = spinner12.getSelectedItem().toString();

        SharedPreferences.Editor editor=preferences.edit();

        editor.putString("datosSpinner1", seleccionPreg1);
        editor.putString("datosSpinner2", seleccionPreg2);
        editor.putString("datosSpinner3", seleccionPreg3r1);
        editor.putString("datosSpinner4", seleccionPreg3r2);
        editor.putString("datosSpinner5", seleccionPreg3r3);
        editor.putString("datosSpinner6", seleccionPreg3r4);
        editor.putString("datosSpinner7", seleccionPreg3r5);
        editor.putString("datosSpinner8", seleccionPreg3r6);
        editor.putString("datosSpinner9", seleccionPreg3r7);
        editor.putString("datosSpinner10", seleccionPreg3r8);
        editor.putString("datosSpinner11", seleccionPreg3r9);
        editor.putString("datosSpinner12", seleccionPreg3r10);

        //editor.putInt("totalAciertos", activity_matematicas_ej1_3.total);

        spinner1.setSelection(adapter1.getPosition(seleccionPreg1));
        spinner2.setSelection(adapter2.getPosition(seleccionPreg2));
        spinner3.setSelection(adapter3.getPosition(seleccionPreg3r1));
        spinner4.setSelection(adapter4.getPosition(seleccionPreg3r2));
        spinner5.setSelection(adapter5.getPosition(seleccionPreg3r3));
        spinner6.setSelection(adapter7.getPosition(seleccionPreg3r4));
        spinner7.setSelection(adapter8.getPosition(seleccionPreg3r5));
        spinner8.setSelection(adapter9.getPosition(seleccionPreg3r6));
        spinner9.setSelection(adapter10.getPosition(seleccionPreg3r7));
        spinner10.setSelection(adapter11.getPosition(seleccionPreg3r8));
        spinner11.setSelection(adapter12.getPosition(seleccionPreg3r9));
        spinner12.setSelection(adapter13.getPosition(seleccionPreg3r10));

       // aciertos2.setText(String.valueOf(activity_matematicas_ej1_3.total));

        editor.commit();
    }

    private void cargarDatos() {
        SharedPreferences preferences = getSharedPreferences("datos14", Context.MODE_PRIVATE);

        String seleccionPreg1 = preferences.getString("datosSpinner1", "Regalo y Televisión");
        String[] preg1 = {"Regalo y Televisión", "Rompecabezas y  Oso", "Rompecabezas y Reloj", "Rompecabezas y Balón"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg1);

        String seleccionPreg2 = preferences.getString("datosSpinner2", "Televisión");
        String[] preg2 = {"Televisión", "Celular", "Regalo", "Guitarra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg2);

        String seleccionPreg3 = preferences.getString("datosSpinner3", "20");
        String[] preg3r1 = {"30", "60", "90", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r1);

        String seleccionPreg4 = preferences.getString("datosSpinner4", "20");
        String[] preg3r2 = {"300", "60", "90", "250", "1000", "20", "40", "80", "180", "30"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r2);

        String seleccionPreg5 = preferences.getString("datosSpinner5", "20");
        String[] preg3r3 = {"250", "60", "90", "30", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r3);

        String seleccionPreg6 = preferences.getString("datosSpinner6", "20");
        String [] preg3r5 = {"180", "60", "90", "250", "1000", "20", "40", "80", "30", "300"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r5);

        String seleccionPreg7 = preferences.getString("datosSpinner7", "20");
        String [] preg3r6 = {"80", "60", "90", "250", "1000", "20", "40", "30", "180", "300"};
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r6);

        String seleccionPreg8 = preferences.getString("datosSpinner8", "20");
        String [] preg3r7 = {"20", "60", "90", "250", "1000", "30", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r7);

        String seleccionPreg9 = preferences.getString("datosSpinner9", "20");
        String [] preg3r8 = {"90", "60", "30", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r8);

        String seleccionPreg10 = preferences.getString("datosSpinner10", "20");
        String [] preg3r9 = {"60", "30", "90", "250", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r9);

        String seleccionPreg11 = preferences.getString("datosSpinner11", "20");
        String [] preg3r10 = {"300", "60", "90", "250", "1000", "20", "40", "80", "180", "30"};
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r10);

        String seleccionPreg12 = preferences.getString("datosSpinner12", "20");
        String [] preg3r11 = {"250", "60", "90", "30", "1000", "20", "40", "80", "180", "300"};
        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, preg3r11);

        //int total = preferences.getInt("totalAciertos", 0);

        spinner1.setSelection(adapter1.getPosition(seleccionPreg1));
        spinner2.setSelection(adapter2.getPosition(seleccionPreg2));
        spinner3.setSelection(adapter3.getPosition(seleccionPreg3));
        spinner4.setSelection(adapter4.getPosition(seleccionPreg4));
        spinner5.setSelection(adapter5.getPosition(seleccionPreg5));
        spinner6.setSelection(adapter7.getPosition(seleccionPreg6));
        spinner7.setSelection(adapter8.getPosition(seleccionPreg7));
        spinner8.setSelection(adapter9.getPosition(seleccionPreg8));
        spinner9.setSelection(adapter10.getPosition(seleccionPreg9));
        spinner10.setSelection(adapter11.getPosition(seleccionPreg10));
        spinner11.setSelection(adapter12.getPosition(seleccionPreg11));
        spinner12.setSelection(adapter13.getPosition(seleccionPreg12));

        //aciertos2.setText(String.valueOf(total));
    }




}