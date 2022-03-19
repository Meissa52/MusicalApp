package com.example.mypc.musicalstuctureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


        Button toptracks =(Button) findViewById(R.id.toptracks);
        toptracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toptrackintent=new Intent(Albums.this, Tracks.class);

                startActivity(toptrackintent);
            }
        });

        Button tophome =(Button) findViewById(R.id.tophome);
        tophome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topalbumintent=new Intent(Albums.this, MainActivity.class);

                startActivity(topalbumintent);
            }
        });

        Button topartist =(Button) findViewById(R.id.topartist);
        topartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topartistintent=new Intent(Albums.this, Artist.class);

                startActivity(topartistintent);
            }
        });

        Button topsetting =(Button) findViewById(R.id.topsettings);
        topsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topsettingintent=new Intent(Albums.this, settings.class);

                startActivity(topsettingintent);
            }
        });
        Button topcart =(Button) findViewById(R.id.topmusiccart);
        topcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topcartintent=new Intent(Albums.this, Cart.class);

                startActivity(topcartintent);
            }
        });



        Button albumbutton1 = (Button) findViewById(R.id.edalbum);
        albumbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Now Playing Ed Sheeran Album Songs", Toast.LENGTH_SHORT).show();
            }
        });

        Button albumbutton2 = (Button) findViewById(R.id.arianaalbum);
        albumbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Now Playing Ariana Grande Album Songs", Toast.LENGTH_SHORT).show();
            }
        });

        Button albumbutton3 = (Button) findViewById(R.id.coldalbum);
        albumbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Now Playing Coldplay Album Songs", Toast.LENGTH_SHORT).show();
            }
        });

        Button albumbutton4 = (Button) findViewById(R.id.katyalbum);
        albumbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Now Playing Katy Perry Album Songs", Toast.LENGTH_SHORT).show();
            }
        });
    }

        }
