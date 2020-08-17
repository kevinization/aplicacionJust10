package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_matematicas_ej1_7 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;
    private Spinner spinner6;
    private Spinner spinner7;
    private Spinner spinner8;
    private Spinner spinner9;

    private TextView aciertos5;

    public static int acier5 = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas_ej1_7);

        aciertos5 = (TextView)findViewById(R.id.mat317_txtAciertos);
        aciertos5.setText(activity_matematicas_ej1_3.textoAciertos + activity_matematicas_ej1_6.acier4);

        num1 = (EditText)findViewById(R.id.mat17_txtNum1);
        num2 = (EditText)findViewById(R.id.mat17_txtNum2);
        num3 = (EditText)findViewById(R.id.mat17_txtNum3);
        num4 = (EditText)findViewById(R.id.mat17_txtNum4);
        num5 = (EditText)findViewById(R.id.mat17_txtNum5);
        num6 = (EditText)findViewById(R.id.mat17_txtNum6);

        spinner1 = (Spinner)findViewById(R.id.mat17_spn1);
        String [] s1 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.mat17_spn2);
        String [] s2 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.mat17_spn3);
        String [] s3 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s3);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner)findViewById(R.id.mat17_spn4);
        String [] s4 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s4);
        spinner4.setAdapter(adapter4);

        spinner5 = (Spinner) findViewById(R.id.mat17_spn5);
        String [] s5 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s5);
        spinner5.setAdapter(adapter5);

        spinner6 = (Spinner)findViewById(R.id.mat17_spn6);
        String [] s6 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s6);
        spinner6.setAdapter(adapter7);

        spinner7 = (Spinner)findViewById(R.id.mat17_spn7);
        String [] s7 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s7);
        spinner7.setAdapter(adapter8);

        spinner8 = (Spinner)findViewById(R.id.mat17_spn8);
        String [] s8 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s8);
        spinner8.setAdapter(adapter9);

        spinner9 = (Spinner)findViewById(R.id.mat17_spn9);
        String [] s9 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s9);
        spinner9.setAdapter(adapter10);
        //cargarDatos();
    }
    public void comprobacion (View view){
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();

        String arc1_1 = spinner1.getSelectedItem().toString();
        String arc1_2 = spinner2.getSelectedItem().toString();
        String arc1_3 = spinner3.getSelectedItem().toString();
        String arc2_1 = spinner4.getSelectedItem().toString();
        String arc2_2 = spinner5.getSelectedItem().toString();
        String arc2_3 = spinner6.getSelectedItem().toString();
        String arc3_1 = spinner7.getSelectedItem().toString();
        String arc3_2 = spinner8.getSelectedItem().toString();
        String arc3_3 = spinner9.getSelectedItem().toString();

        acier5 = activity_matematicas_ej1_6.acier4;

        if(numero1.equals("100")){
            acier5++;
        }
        if(numero2.equals("50")){
            acier5++;
        }
        if(numero3.equals("30")){
            acier5++;
        }
        if(numero4.equals("100")){
            acier5++;
        }
        if(numero5.equals("100")){
            acier5++;
        }
        if(numero6.equals("50")){
            acier5++;
        }
        if(arc1_1.equals("100")){
            acier5++;
        }
        if(arc1_2.equals("100")){
            acier5++;
        }
        if(arc1_3.equals("50")){
            acier5++;
        }
        if(arc2_1.equals("30")){
            acier5++;
        }
        if(arc2_2.equals("30")){
            acier5++;
        }
        if(arc2_3.equals("20")){
            acier5++;
        }
        if(arc3_1.equals("50")){
            acier5++;
        }
        if(arc3_2.equals("30")){
            acier5++;
        }
        if(arc3_3.equals("20")){
            acier5++;
        }

        //total += acier;
        aciertos5.setText(activity_matematicas_ej1_3.textoAciertos + acier5);


       // guardarDatos();

        mat18(view);
    }

    public void mat18(View view){
        Intent mat18 = new Intent(this, activity_matematicas_ej1_8c.class);
        startActivity(mat18);
    }

    public void guardarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos17", Context.MODE_PRIVATE);
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        String numero3 = num3.getText().toString();
        String numero4 = num4.getText().toString();
        String numero5 = num5.getText().toString();
        String numero6 = num6.getText().toString();

        String [] s1 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s2 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s3 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s4 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s5 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s6 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s7 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s8 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String [] s9 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        String arc1_1 = spinner1.getSelectedItem().toString();
        String arc1_2 = spinner2.getSelectedItem().toString();
        String arc1_3 = spinner3.getSelectedItem().toString();
        String arc2_1 = spinner4.getSelectedItem().toString();
        String arc2_2 = spinner5.getSelectedItem().toString();
        String arc2_3 = spinner6.getSelectedItem().toString();
        String arc3_1 = spinner7.getSelectedItem().toString();
        String arc3_2 = spinner8.getSelectedItem().toString();
        String arc3_3 = spinner9.getSelectedItem().toString();

        SharedPreferences.Editor editor=preferences.edit();

        editor.putString("datosNumero1", numero1);
        editor.putString("datosNumero2", numero2);
        editor.putString("datosNumero3", numero3);
        editor.putString("datosNumero4", numero4);
        editor.putString("datosNumero5", numero5);
        editor.putString("datosNumero6", numero6);

        editor.putString("datosSpinner1", arc1_1);
        editor.putString("datosSpinner2", arc1_2);
        editor.putString("datosSpinner3", arc1_3);
        editor.putString("datosSpinner4", arc2_1);
        editor.putString("datosSpinner5", arc2_2);
        editor.putString("datosSpinner6", arc2_3);
        editor.putString("datosSpinner7", arc3_1);
        editor.putString("datosSpinner8", arc3_2);
        editor.putString("datosSpinner8", arc3_3);

        //editor.putInt("totalAciertos", total);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);
        num5.setText(numero5);
        num6.setText(numero6);

        spinner1.setSelection(adapter1.getPosition(arc1_1));
        spinner1.setSelection(adapter2.getPosition(arc1_2));
        spinner1.setSelection(adapter3.getPosition(arc1_3));
        spinner1.setSelection(adapter4.getPosition(arc2_1));
        spinner1.setSelection(adapter5.getPosition(arc2_2));
        spinner1.setSelection(adapter7.getPosition(arc2_3));
        spinner1.setSelection(adapter8.getPosition(arc3_1));
        spinner1.setSelection(adapter9.getPosition(arc3_2));
        spinner1.setSelection(adapter10.getPosition(arc3_3));

        //aciertos5.setText(String.valueOf(total));

        editor.commit();
    }

    private void cargarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos17", Context.MODE_PRIVATE);
        String numero1 = preferences.getString("datosNumero1","");
        String numero2 = preferences.getString("datosNumero2","");
        String numero3 = preferences.getString("datosNumero3","");
        String numero4 = preferences.getString("datosNumero4","");
        String numero5 = preferences.getString("datosNumero5","");
        String numero6 = preferences.getString("datosNumero6","");

        String seleccion1 = preferences.getString("datosSpinner1", "100");
        String [] s1 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion2 = preferences.getString("datosSpinner1", "100");
        String [] s2 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion3 = preferences.getString("datosSpinner1", "100");
        String [] s3 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion4 = preferences.getString("datosSpinner1", "100");
        String [] s4 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion5 = preferences.getString("datosSpinner1", "100");
        String [] s5 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion6 = preferences.getString("datosSpinner1", "100");
        String [] s6 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion7 = preferences.getString("datosSpinner1", "100");
        String [] s7 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion8 = preferences.getString("datosSpinner1", "100");
        String [] s8 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);
        String seleccion9 = preferences.getString("datosSpinner1", "100");
        String [] s9 = {"100", "50", "40", "30", "20"};
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s1);

        //int total = preferences.getInt("totalAciertos", 0);

        num1.setText(numero1);
        num2.setText(numero2);
        num3.setText(numero3);
        num4.setText(numero4);
        num5.setText(numero5);
        num6.setText(numero6);

        spinner1.setSelection(adapter1.getPosition(seleccion1));
        spinner2.setSelection(adapter2.getPosition(seleccion2));
        spinner3.setSelection(adapter3.getPosition(seleccion3));
        spinner4.setSelection(adapter4.getPosition(seleccion4));
        spinner5.setSelection(adapter5.getPosition(seleccion5));
        spinner6.setSelection(adapter7.getPosition(seleccion6));
        spinner7.setSelection(adapter8.getPosition(seleccion7));
        spinner8.setSelection(adapter9.getPosition(seleccion8));
        spinner9.setSelection(adapter10.getPosition(seleccion9));

        //aciertos5.setText(String.valueOf(total));
    }
}