package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pract1 (View view){
        Intent a = new Intent(this,Aniobisiesto.class);
        startActivity(a);
    }
    public void Pract2 (View view){
        Intent  b= new Intent(this,array.class);
        startActivity(b);
    }
    public void Pract3 (View view){
        Intent c = new Intent(this,multiplicar.class);
        startActivity(c);
    }
    public void Pract4 (View view){
        Intent d = new Intent(this,promedio.class);
        startActivity(d);
    }

}