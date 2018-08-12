package com.example.radic.runners;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    String consulta = "CREATE TABLE Cuerpo(Igc TEXT , Imc TEXT)";
    String consulta2 = "CREATE TABLE Aerobic(Id INTEGER PRIMARY KEY AUTOINCREMENT, Tiempo TEXT, Distancia TEXT)";

    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(consulta);
        db.execSQL(consulta2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS Cuerpo");
        db.execSQL("DROP TABLE IF EXISTS Aerobic");

        //Se crea la nueva versión de la tabla
        db.execSQL(consulta);
        db.execSQL(consulta2);

    }



}
