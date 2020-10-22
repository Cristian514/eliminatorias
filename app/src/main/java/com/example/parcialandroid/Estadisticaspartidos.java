package com.example.parcialandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Resultados extends AppCompatActivity {
    private  EditText golesUno,golesDos;
    private TextView textoP,textoS;
    String prueba1,prueba2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        textoP=(TextView)findViewById(R.id.texto1);
        textoS=(TextView)findViewById(R.id.texto2);
        String equipoUno =getIntent().getStringExtra("equipoUno");
        String equipoDos =getIntent().getStringExtra("equipoDos");
        prueba1 =getIntent().getStringExtra("equipoUno");
        prueba2 =getIntent().getStringExtra("equipoDos");
        golesUno=(EditText) findViewById(R.id.Gol1);
        golesDos=(EditText) findViewById(R.id.Gol2);
        if(equipoUno.equals("paraguay")){
            a=(TextView)findViewById(R.id.Team1);
        }
        if(equipoUno.equals("argentina")){
            a=(TextView)findViewById(R.id.Team1);
        }
        if(equipoUno.equals("brasil")){
            a=(TextView)findViewById(R.id.Team1);
        }
        if(equipoUno.equals("uruguay")){
            a=(TextView)findViewById(R.id.Team1);
        }
        if(equipoUno.equals("colombia")){
            a=(TextView)findViewById(R.id.Team1);
        }
        textoP.setText(equipoUno.toUpperCase());
        if(equipoDos.equals("peru")){
            a=(TextView)findViewById(R.id.Team2);
        }
        if(equipoDos.equals("ecuador")){
            a=(TextView)findViewById(R.id.Team2);
        }
        if(equipoDos.equals("bolivia")){
            a=(TextView)findViewById(R.id.Team2);
        }
        if(equipoDos.equals("chile")){
            a=(TextView)findViewById(R.id.Team2);
        }
        if(equipoDos.equals("venezuela")){
            a=(TextView)findViewById(R.id.Team2);
        }
        textoS.setText(equipoDos.toUpperCase());
    }
    public void Resultados8 (View view){
        String campoUno = golesUno.getText().toString();
        String campoDos = golesDos.getText().toString();
        String eq1 =getIntent().getStringExtra("equipoUno");
        String eq2 =getIntent().getStringExtra("equipoDos");
        SharedPreferences clasificaciones = getSharedPreferences( "golesMarcados", Context.MODE_PRIVATE);
        SharedPreferences.Editor edicion = clasificaciones.edit();
        edicion.putString(eq1,campoUno);
        edicion.commit();
        SharedPreferences clasificaciones2 = getSharedPreferences( "golesMarcados1", Context.MODE_PRIVATE);
        SharedPreferences.Editor edicion2 = clasificaciones.edit();
        edicion.putString(eq2,campoDos);
        edicion.commit();
        Toast.makeText(this, "Se registro el marcador", Toast.LENGTH_SHORT).show();

    }
    public  void Buscar (View view){
        String eq1 =prueba1;
        String eq2 =prueba2;
        SharedPreferences clasificaciones = getSharedPreferences( "golesMarcados", Context.MODE_PRIVATE);
        String uno = clasificaciones.getString(eq1,"");
        if(uno.length()==0){
            Toast.makeText(this, "No se encontró ningún resultado", Toast.LENGTH_SHORT).show();
        } else {
            golesUno.setText(uno);
        }
        SharedPreferences clasificaciones2 = getSharedPreferences( "golesMarcados1", Context.MODE_PRIVATE);
        String dos = clasificaciones.getString(eq2,"");
        if(dos.length()==0){
            Toast.makeText(this, "No se encontró ningún resultado", Toast.LENGTH_SHORT).show();
        } else {
            golesUno.setEnabled(false);
            golesDos.setEnabled(false);
            golesDos.setText(dos);
            Toast.makeText(this, "Erros al registrar \uD83D\uDE00, resultado final: "+uno+" - "+dos, Toast.LENGTH_SHORT).show();
        }
    }
    public void regresar(View view){
        Intent regresar= new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

}