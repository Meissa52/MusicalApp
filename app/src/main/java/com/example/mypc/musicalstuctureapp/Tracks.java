package com.example.mypc.musicalstuctureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);


        Button tophome =(Button) findViewById(R.id.tophome);
        tophome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toptrackintent=new Intent(Tracks.this, MainActivity.class);

                startActivity(toptrackintent);
            }
        });

        Button topalbum =(Button) findViewById(R.id.topalbum);
        topalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topalbumintent=new Intent(Tracks.this, Albums.class);

                startActivity(topalbumintent);
            }
        });

        Button topartist =(Button) findViewById(R.id.topartist);
        topartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topartistintent=new Intent(Tracks.this, Artist.class);

                startActivity(topartistintent);
            }
        });

        Button topsetting =(Button) findViewById(R.id.topsettings);
        topsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topsettingintent=new Intent(Tracks.this, settings.class);

                startActivity(topsettingintent);
            }
        });
        Button topcart =(Button) findViewById(R.id.topmusiccart);
        topcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topcartintent=new Intent(Tracks.this, Cart.class);

                startActivity(topcartintent);
            }
        });





        TextView trak1 = (TextView) findViewById(R.id.trk1);
        trak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song 01 is now playing", Toast.LENGTH_SHORT).show();
            }
        });

        TextView trak2 = (TextView) findViewById(R.id.trk2);
        trak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song 02 is now playing", Toast.LENGTH_SHORT).show();
            }
        });

        TextView trak3 = (TextView) findViewById(R.id.trk3);
        trak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song 03 is now playing", Toast.LENGTH_SHORT).show();
            }
        });

        TextView trak4 = (TextView) findViewById(R.id.trk4);
        trak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song 04 is now playing", Toast.LENGTH_SHORT).show();
            }
        });

        TextView trak5 = (TextView) findViewById(R.id.trk5);
        trak5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song 05 is now playing", Toast.LENGTH_SHORT).show();
            }
        });





    }
}