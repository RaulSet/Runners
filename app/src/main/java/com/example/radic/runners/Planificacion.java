package com.example.radic.runners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class Planificacion extends AppCompatActivity {

    CalendarView simpleCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planificacion);

        simpleCalendarView = (CalendarView) findViewById(R.id.simpleCalendarView);

        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                if(dayOfMonth==1 && month==0) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==0) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==0) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==0) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==0) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==0) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==0) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==0) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==0) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==0) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==0) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==0) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==1) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 7", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==1) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==1) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==1) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==1) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==1) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==1) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==1) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==1) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==1) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==1) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==1) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==2) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==2) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==2) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==2) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==2) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==2) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==3) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==3) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==3) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==3) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==3) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==3) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==3) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==3) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==3) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==3) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==3) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==3) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==4) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 7", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==4) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==4) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==4) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==4) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==4) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==4) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==4) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==4) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==4) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==4) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==4) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==5) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==5) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==5) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==5) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==5) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==5) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==6) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==6) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==6) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==6) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==6) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==6) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==6) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==6) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==6) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==6) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==6) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==6) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==7) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 7", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==7) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==7) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==7) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==7) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==7) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==7) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==7) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==7) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==7) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==7) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==7) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==8) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==8) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==8) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==8) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==8) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==8) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==9) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==9) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==9) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==9) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==9) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==9) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==9) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==9) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==9) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==9) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==9) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==9) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==10) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 7", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==10) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==10) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==10) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==10) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==10) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==10) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==10) {
                    Toast.makeText(getApplicationContext(), "Corre durante 1 hora", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==10) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==10) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 2", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==10) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==10) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==1 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 3", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==3 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==5 && month==11) {
                    Toast.makeText(getApplicationContext(), "Corre durante 50 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==8 && month==11) {
                    Toast.makeText(getApplicationContext(), "Corre durante 40 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==10 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 6", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==12 && month==11) {
                    Toast.makeText(getApplicationContext(), "Corre durante 45 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==15 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 1", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==17 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 4", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==19 && month==11) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==22 && month==11) {
                    Toast.makeText(getApplicationContext(), "Corre durante 30 minutos", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==24 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 5", Toast.LENGTH_LONG).show();
                }

                else if(dayOfMonth==26 && month==11) {
                    Toast.makeText(getApplicationContext(), "Realiza el ejercicio 8", Toast.LENGTH_LONG).show();
                }

                else{
                    Toast.makeText(getApplicationContext(), "Dia libre", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
