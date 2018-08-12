package com.example.radic.runners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Planes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes);
    }

    public void BUT_R1 (View view) {
        Intent t = new Intent( this, Ejercicio1.class );
        startActivity(t);
    }

    public void BUT_R2 (View view) {
        Intent t = new Intent( this, Ejercicio2.class );
        startActivity(t);
    }

    public void BUT_R3 (View view) {
        Intent t = new Intent( this, Ejercicio3.class );
        startActivity(t);
    }

    public void BUT_R4 (View view) {
        Intent t = new Intent( this, Ejercicio4.class );
        startActivity(t);
    }

    public void BUT_R5 (View view) {
        Intent t = new Intent( this, Ejercicio5.class );
        startActivity(t);
    }

    public void BUT_R6 (View view) {
        Intent t = new Intent( this, Ejercicio6.class );
        startActivity(t);
    }
}
