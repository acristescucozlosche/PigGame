package com.example.thepiggame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int contador;
    int suma;
    boolean jugador1;
    boolean jugador2;
    View puntos1;
    View puntos2;
    Button newgame;
    Button tirar;
    Button pasar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puntos1 = findViewById(R.id.puntos1);
        puntos2 = findViewById(R.id.puntos2);
        newgame = findViewById(R.id.newgame);
        tirar = findViewById(R.id.tirar);
        pasar = findViewById(R.id.pasar);

        tirar.set

    }


}