package com.example.parcialandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String equipo1, equipo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void matchOne(View view){
        equipo1="paraguay";
        equipo2="peru";
        Toast.makeText(this, "ver resultado Paraguay vs Perú", Toast.LENGTH_SHORT).show();
        Intent datos = new Intent(this, Resultados.class);
        datos.putExtra("equipoUno", equipo1);
        datos.putExtra("equipoDos", equipo2);
        startActivity(datos);
    }
    public void matchTwo(View view){
        equipo1="argentina";
        equipo2="ecuador";
        Toast.makeText(this, "ver resultado Argentina vs Ecuador", Toast.LENGTH_SHORT).show();
        Intent datos = new Intent(this, Resultados.class);
        datos.putExtra("equipoUno", equipo1);
        datos.putExtra("equipoDos", equipo2);
        startActivity(datos);
    }
    public void matchThree(View view){
        equipo1="brasil";
        equipo2="bolivia";
        Toast.makeText(this, "ver resultado Brasil vs Bolivia", Toast.LENGTH_SHORT).show();
        Intent datos = new Intent(this, Resultados.class);
        datos.putExtra("equipoUno", equipo1);
        datos.putExtra("equipoDos", equipo2);
        startActivity(datos);
    }
    public void matchFour(View view){
        equipo1="uruguay";
        equipo2="chile";
        Toast.makeText(this, "ver resultado Uruguay vs Chile", Toast.LENGTH_SHORT).show();
        Intent datos = new Intent(this, Resultados.class);
        datos.putExtra("equipoUno", equipo1);
        datos.putExtra("equipoDos", equipo2);
        startActivity(datos);
    }
    public void matchFive(View view){
        equipo1="colombia";
        equipo2="venezuela";
        Toast.makeText(this, "ver resultado Colombia vs Venezuela", Toast.LENGTH_SHORT).show();
        Intent datos = new Intent(this, Resultados.class);
        datos.putExtra("equipoUno", equipo1);
        datos.putExtra("equipoDos", equipo2);
        startActivity(datos);
    }
    public void Estadisticaspartidos(View view){
        Toast.makeText(this, "stadisticas del jugador", Toast.LENGTH_SHORT).show();
        Intent envioFinal = new Intent(this, Resultados.class);
        startActivity(envioFinal);
    }
}