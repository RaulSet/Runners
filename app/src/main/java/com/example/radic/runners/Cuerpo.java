package com.example.radic.runners;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Cuerpo extends AppCompatActivity {

    private RadioButton RAD_MAS;
    private RadioButton RAD_FEM;

    private EditText TXT_PES;
    private EditText TXT_ALT;
    private EditText TXT_EDA;

    private TextView CAM_IMC;
    private TextView CAM_IGC;

    DecimalFormat redondeo = new DecimalFormat("##.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuerpo);

        RAD_MAS=(RadioButton)findViewById(R.id.RAD_MAS);
        RAD_FEM=(RadioButton)findViewById(R.id.RAD_FEM);

        TXT_PES=(EditText)findViewById(R.id.TXT_PES);
        TXT_ALT=(EditText)findViewById(R.id.TXT_ALT);
        TXT_EDA=(EditText)findViewById(R.id.TXT_EDA);

        CAM_IMC=(TextView)findViewById(R.id.CAM_IMC);
        CAM_IGC=(TextView)findViewById(R.id.CAM_IGC);
    }

    public void calcular (View view) {
        String valor1=TXT_PES.getText().toString();
        String valor2=TXT_ALT.getText().toString();
        String valor3=TXT_EDA.getText().toString();

        int nro1=Integer.parseInt(valor1);
        float nro2=Float.parseFloat(valor2);
        int nro3=Integer.parseInt(valor3);

        float imc=nro1/(nro2*nro2);

        String resu=String.valueOf(redondeo.format(imc));

        CAM_IMC.setText(resu);

        if (RAD_MAS.isChecked()==true) {
            double igc=(1.2*imc)+(0.23*nro3)-10.8-5.4;
            String resu2=String.valueOf(redondeo.format(igc));
            CAM_IGC.setText(resu2+"%");
        } else
        if (RAD_FEM.isChecked()==true) {
            double igc=(1.2*imc)+(0.23*nro3)-5.4;
            String resu2=String.valueOf(redondeo.format(igc));
            CAM_IGC.setText(resu2+"%");
        }

    }

    public void Guardar(View v) {

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String mas = CAM_IMC.getText().toString();
        String gras = CAM_IGC.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("Imc", mas);
        registro.put("Igc", gras);

        bd.insert("Cuerpo", null, registro);
        bd.close();
        CAM_IMC.setText("");
        CAM_IGC.setText("");

        Toast.makeText(this, "Se cargaron los datos del cuerpo",
                Toast.LENGTH_SHORT).show();
    }
}
