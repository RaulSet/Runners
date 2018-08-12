package com.example.radic.runners;


import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Aerobico extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    private GoogleMap mMap;
    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;
    private double speed = 0.0;
    String mensaje1;
    String direccion = "";
    private TextView text_dist;
    private TextView text_tiem;
    private TextView text_vel;

    Button contar, pausa;
    Chronometer crono;
    long Time=0;

    static final int REQUEST_LOCATION = 1;
    LocationManager locationManager;
    double PI = 3.14159265358979323846;
    double radio = 6371;
    double result =0;

    DecimalFormat redondeo = new DecimalFormat("##.###");
    DecimalFormat redondeo2 = new DecimalFormat("##.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerobico);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //ALGORITMO PARA PONER EN FUNCIONAMIENTO EL CRONOMETRO
        crono = (Chronometer) findViewById(R.id.Cronometro);
        contar = (Button) findViewById(R.id.BUTT_INIC);
        pausa = (Button) findViewById(R.id.BUTT_PAUS);

        contar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                contar.setEnabled(false);
                pausa.setEnabled(true);
                crono.setBase(SystemClock.elapsedRealtime());
                crono.start();
            }
        });

        pausa.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                contar.setEnabled(true);
                pausa.setEnabled(false);
                crono.stop();
            }
        });

        LocationManager lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            return;
        }
        lm.requestLocationUpdates(locationManager.GPS_PROVIDER, 0, 0, this);

        this.onLocationChanged(null);

        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        getPermission();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        miUbicacion();
    }

    //ACTIVAMOS LOS SERVICIOS GPS
    public void locationStart() {
        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        final boolean gpsEnabled = mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (!gpsEnabled) {
            Intent settingsIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(settingsIntent);
        }

    }

    public void setLocation(Location loc) {
        //Obtener la direccion de la calle a partir de la latitud y la longitud
        if (loc.getLatitude() != 0.0 && loc.getLongitude() != 0.0) {
            try {
                Geocoder geocoder = new Geocoder(this, Locale.getDefault());
                List<Address> list = geocoder.getFromLocation(
                        loc.getLatitude(), loc.getLongitude(), 1);
                if (!list.isEmpty()) {
                    Address DirCalle = list.get(0);
                    direccion = (DirCalle.getAddressLine(0));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //AGREGAMOS EL MARCADOR AL MAPA
    private void AgregarMarcador(double lat, double lng) {
        LatLng coordenadas = new LatLng(lat, lng);
        CameraUpdate MiUbicacion = CameraUpdateFactory.newLatLngZoom(coordenadas, 16);
        if (marcador != null) marcador.remove();
        marcador = mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title("Dirección:" + direccion)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.running22)));
        mMap.animateCamera(MiUbicacion);
    }

    //ACTUALIZAMOS LA UBICACION ACTUAL
    private void ActualizarUbicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lng = location.getLongitude();
            AgregarMarcador(lat, lng);

        }
    }

    //CONTROL DEL GPS
    LocationListener locListener = new LocationListener() {

        @Override
        public void onLocationChanged(Location location) {

            ActualizarUbicacion(location);
            setLocation(location);

        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {
            mensaje1 = ("GPS Activado");
            Mensaje();
        }

        @Override
        public void onProviderDisabled(String s) {
            mensaje1 = ("GPS Desactivado");
            locationStart();
            Mensaje();
        }
    };

    @Override
    public void onLocationChanged(Location location) {

        getSpeed(location);
        getDistance(location);

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    private static int PETICION_PERMISO_LOCALIZACION = 101;

    private void miUbicacion() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    PETICION_PERMISO_LOCALIZACION);
            return;
        } else {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            ActualizarUbicacion(location);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,1200,0,locListener);
        }

    }

    public void Mensaje() {
        Toast toast = Toast.makeText(this, mensaje1, Toast.LENGTH_LONG);
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    void getPermission() {

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);

        } else {
            Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            getSpeed(location);
            getDistance(location);

        }

    }

    void getSpeed(Location location){

        TextView txt = (TextView) this.findViewById(R.id.text_vel);

        if(location==null){

            txt.setText("-.-");

        }else{

            float nCurrentSpeed = ((location.getSpeed()*3600)/1000);
            String Veloc=String.valueOf(redondeo2.format(nCurrentSpeed));
            txt.setText(Veloc+ " Km/h");

        }
    }

    void getDistance(Location location){

        if (location == null){

            TextView txt3 = (TextView) this.findViewById(R.id.text_dist);
            txt3.setText("--");

        } else {

            double longi1 = location.getLongitude();
            double latti1 = location.getLatitude();
            double longi2 = location.getLongitude();
            double latti2 = location.getLatitude();

            double latA = toRadians(latti1);
            double lonA = toRadians(longi1);
            double latB = toRadians(latti2);
            double lonB = toRadians(longi2);
            double cosAng = (cos(latA) * cos(latB) * cos(lonB-lonA)) +
                    (sin(latA) * sin(latB));
            double ang = Math.acos(cosAng);
            double dist = ang *6378;

            if (dist >= 0) {

                result = result + dist;

                TextView txt3 = (TextView) this.findViewById(R.id.text_dist);
                String distancia=String.valueOf(redondeo.format(result));
                txt3.setText(distancia +" Km");
            }

        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_LOCATION:
                getPermission();
                break;
        }
    }

    public void Guardar(View v) {

        TextView et1=(TextView)findViewById(R.id.text_dist);
        TextView et2=(TextView)findViewById(R.id.Cronometro);

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String dis = et1.getText().toString();
        String cron = et2.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("Distancia", dis);
        registro.put("Tiempo", cron);

        bd.insert("Aerobic", null, registro);
        bd.close();
        et1.setText("");
        et2.setText("");

        Toast.makeText(this, "Se guardaron los datos de la carrera",
                Toast.LENGTH_SHORT).show();
    }
}




