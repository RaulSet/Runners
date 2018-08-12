package com.example.radic.runners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CRR_But(View view) {
        Intent t = new Intent( this, Aerobico.class );
        startActivity(t);
    }

    public void CRP_But(View view) {
        Intent i = new Intent( this, Cuerpo.class );
        startActivity(i);
    }

    public void PLA_But(View view) {
        Intent i = new Intent( this, Planes.class );
        startActivity(i);
    }

    public void Ret_BUT(View view) {
        Intent i = new Intent( this, Retos.class );
        startActivity(i);
    }

    public void Hist_BUT(View view) {
        Intent i = new Intent( this, Historial.class );
        startActivity(i);
    }

    public void Ace_But(View view) {
        Intent i = new Intent( this, AcercaDe.class );
        startActivity(i);
    }

    public void Plani_BUT(View view) {
        Intent i = new Intent( this, Planificacion.class );
        startActivity(i);
    }

    public void Diet_But(View view) {
        Intent i = new Intent( this, Recetario.class );
        startActivity(i);
    }


}
