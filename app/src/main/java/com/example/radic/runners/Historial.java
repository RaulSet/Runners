package com.example.radic.runners;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Historial extends AppCompatActivity {

    private TextView CAM_IMC;
    private TextView CAM_IGC;

    private EditText CAM_NUM;

    private TextView CAM_TIEM;
    private TextView CAM_VEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        CAM_IMC=(TextView)findViewById(R.id.IMCRes);
        CAM_IGC=(TextView)findViewById(R.id.IGCRes);
        CAM_NUM=(EditText)findViewById(R.id.NumCarre);
        CAM_TIEM=(TextView)findViewById(R.id.TiemRes);
        CAM_VEL=(TextView)findViewById(R.id.VelRes);

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        //String mas = CAM_IMC.getText().toString();
        //String gras = CAM_IGC.getText().toString();

        String q = "SELECT * FROM Cuerpo";

        Cursor fila = bd.rawQuery(q,null);

        if (fila.moveToFirst()) {
            CAM_IMC.setText(fila.getString(0));
            CAM_IGC.setText(fila.getString(1));
        } else
            Toast.makeText(this, "",
                    Toast.LENGTH_SHORT).show();
        bd.close();
    }

    public void Borrar(View v) {

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);

        SQLiteDatabase bd = admin.getWritableDatabase();

        int cant = bd.delete("Cuerpo", null, null);
        bd.close();
        CAM_IMC.setText("");
        CAM_IGC.setText("");
        if (cant == 1)
            Toast.makeText(this, "Se borró el artículo con dicho código",
                    Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "No existe un artículo con dicho código",
                    Toast.LENGTH_SHORT).show();
    }


    public void Ver(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String cod = CAM_NUM.getText().toString();

        Cursor fila = bd.rawQuery(
                "select Tiempo, Distancia from Aerobic where Id=" + cod, null);

        if (fila.moveToFirst()) {
            CAM_TIEM.setText(fila.getString(0));
            CAM_VEL.setText(fila.getString(1));
        } else
            Toast.makeText(this, "No existe ninguna carrera",
                    Toast.LENGTH_SHORT).show();
        bd.close();
    }


    public void Borrado(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String cod = CAM_NUM.getText().toString();
        int cant = bd.delete("Aerobic", "Id=" + cod, null);
        bd.close();
        CAM_TIEM.setText("");
        CAM_VEL.setText("");
        if (cant == 1)
            Toast.makeText(this, "Se borró la carrera",
                    Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "No existe la carrera",
                    Toast.LENGTH_SHORT).show();
    }


}
