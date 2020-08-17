package com.example.just10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class activity_acti1_registro extends AppCompatActivity {
    EditText txt_nombre2, txt_edad2;
    Button btnRegistrarBD, btnConsultarBD, btnDeletedatos;
    RadioButton rbPrimaria, rbSecundaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti1_registro);
        txt_nombre2=(EditText)findViewById(R.id.txt_nombre2);
        txt_edad2=(EditText)findViewById(R.id.txt_edad2);
        rbPrimaria=(RadioButton)findViewById(R.id.rbPrimaria);
        rbSecundaria=(RadioButton)findViewById(R.id.rbSecundaria);
        btnRegistrarBD=(Button)findViewById(R.id.btnRegistrarBD);
        btnConsultarBD=(Button)findViewById(R.id.btnConsultarBD);
        btnDeletedatos=(Button)findViewById(R.id.btnDeletedatos);
        final ClaseBD claseBD= new ClaseBD(getApplicationContext());
        btnRegistrarBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gradoescolar="";
                if(rbPrimaria.isChecked()==true){
                    gradoescolar="Primaria";
                }else
                    if (rbSecundaria.isChecked()==true){
                        gradoescolar="Secundaria";
                    }
                claseBD.agregarCursos(txt_nombre2.getText().toString(),txt_edad2.getText().toString(), gradoescolar);
                Toast.makeText(getApplicationContext(), "SE REGISTRO CORRECTAMENTE EL ALUMNO", Toast.LENGTH_SHORT).show();
                /*String idvalor = claseBD.regresaIDUSUARIO();
                Toast.makeText(getApplicationContext(), idvalor.toString(), Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(view.getContext(), activity_acti1_menu.class);
                startActivityForResult(intent,0);
            }
        });
        btnConsultarBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), activity_muestrausuarios.class);
                startActivityForResult(intent,0);
            }
        });
        btnDeletedatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                claseBD.eliminaRegistros();
                Toast.makeText(getApplicationContext(), "SE ELIMINARON LOS REGISTROS DE LOS USUARIOS", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), activity_muestrausuarios.class);
                startActivityForResult(intent,0);
            }
        });
    }
}