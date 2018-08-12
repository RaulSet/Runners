package com.example.radic.runners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Recetario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetario);
    }

    public void Rec1_BUT(View view) {
        Intent i = new Intent( this, Receta1.class );
        startActivity(i);
    }

    public void Rec2_BUT(View view) {
        Intent i = new Intent( this, Receta2.class );
        startActivity(i);
    }

    public void Rec3_BUT(View view) {
        Intent i = new Intent( this, Receta3.class );
        startActivity(i);
    }

    public void Rec4_BUT(View view) {
        Intent i = new Intent( this, Receta4.class );
        startActivity(i);
    }

    public void Rec5_BUT(View view) {
        Intent i = new Intent( this, Receta5.class );
        startActivity(i);
    }

    public void Rec6_BUT(View view) {
        Intent i = new Intent( this, Receta6.class );
        startActivity(i);
    }

    public void Rec7_BUT(View view) {
        Intent i = new Intent( this, Receta7.class );
        startActivity(i);
    }

    public void Rec8_BUT(View view) {
        Intent i = new Intent( this, Receta8.class );
        startActivity(i);
    }

    public void Rec9_BUT(View view) {
        Intent i = new Intent( this, Receta9.class );
        startActivity(i);
    }

    public void Rec10_BUT(View view) {
        Intent i = new Intent( this, Receta10.class );
        startActivity(i);
    }

    public void Rec11_BUT(View view) {
        Intent i = new Intent( this, Receta11.class );
        startActivity(i);
    }

    public void Rec12_BUT(View view) {
        Intent i = new Intent( this, Receta12.class );
        startActivity(i);
    }
}
