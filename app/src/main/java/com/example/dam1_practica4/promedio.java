package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class promedio extends AppCompatActivity {
    EditText eti;
    EditText etd;
    EditText eta;
    EditText etb;
    EditText etu;
    int promedio, et1, et2, et3, et4, et5 ;
    Button calcular;
    private ListView Listacalificaciones;
    ArrayList<String> calificaciones = new ArrayList<>();
    ArrayAdapter<String> adapter;
    String p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        eti = (EditText)findViewById(R.id.txtIngles);
        etd = (EditText)findViewById(R.id.txtDAM);
        eta = (EditText)findViewById(R.id.txtadmin);
        etb = (EditText)findViewById(R.id.txtBD);
        etu = (EditText)findViewById(R.id.txtuml);
        calcular = (Button)findViewById(R.id.btn);
        Listacalificaciones = (ListView)findViewById(R.id.Listview);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1 = Integer.parseInt(eti.getText().toString());
                et2 = Integer.parseInt(etd.getText().toString());
                et3 = Integer.parseInt(eta.getText().toString());
                et4 = Integer.parseInt(etb.getText().toString());
                et5 = Integer.parseInt(etu.getText().toString());
                promedio = (et1 + et2+ et3 + et4 + et5)/5;

                if (TextUtils.isEmpty(eti.getText().toString()) || TextUtils.isEmpty(etd.getText().toString()) || TextUtils.isEmpty(eta.getText().toString()) || TextUtils.isEmpty(etb.getText().toString()) || TextUtils.isEmpty(etu.getText().toString()) ){
                    Toast.makeText(getApplicationContext(),"calificaciones faltantes", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (promedio >=90){
                        p = "Eres buen alumno";
                    }
                    else if (promedio <90 && promedio>=80) {
                        p = "Vas bien pero debes mejorar";
                    }
                    else if (promedio <80 && promedio >=70){
                        p= "Estas aprobando de pansazo" ;
                    }
                    else if (promedio <70){
                        p = "Ya fuiste";
                    }
                    calificaciones.add("su promedio es "+promedio +" " +p);
                    adapter = new ArrayAdapter<>(promedio.this, android.R.layout.simple_list_item_1,calificaciones);
                    Listacalificaciones.setAdapter(adapter);
                }
            }
        });
    }

}