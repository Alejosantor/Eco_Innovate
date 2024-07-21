package com.example.ecoinnovate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class opciones extends AppCompatActivity {


    Button categorias;
    Button estadisticas;
    Button concejos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        categorias=(Button) findViewById(R.id.btn_catagorias);
        estadisticas=(Button) findViewById(R.id.btn_estadisticas);
        concejos=(Button) findViewById(R.id.btn_concejos);

        categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(opciones.this, categorias.class);
                startActivity(intent);
            }
        });
        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(opciones.this, estadisticas.class);
                startActivity(intent);
            }
        });
        concejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(opciones.this, concejos.class);
                startActivity(intent);
            }
        });
    }
}