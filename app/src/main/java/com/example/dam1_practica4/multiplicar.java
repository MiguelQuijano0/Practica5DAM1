package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class multiplicar extends AppCompatActivity {
    private EditText etNum;
    private EditText etSal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        etNum = (EditText) findViewById(R.id.entnumero);
        etSal = (EditText) findViewById(R.id.Resultado);
    }
    public void calcular (View v){
        String cad = "";
        if (etNum.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese un numero", Toast.LENGTH_LONG).show();
        }
        else {
            int numero = Integer.parseInt(etNum.getText().toString());
            for (int i = 1; i <= 10; i++) {
                cad += String.valueOf(numero) + "\t x \t" + i + "\t = \t" + (numero * i) + "\n";
            }
            etSal.setText(cad);
        }
    }
}