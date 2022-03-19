
package com.example.mypc.musicalstuctureapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        Button toptracks =(Button) findViewById(R.id.toptracks);
        toptracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toptrackintent=new Intent(Artist.this, Tracks.class);

                startActivity(toptrackintent);
            }
        });

        Button topalbum =(Button) findViewById(R.id.topalbum);
        topalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topalbumintent=new Intent(Artist.this, Albums.class);

                startActivity(topalbumintent);
            }
        });

        Button tophome =(Button) findViewById(R.id.tophome);
        tophome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topartistintent=new Intent(Artist.this, MainActivity.class);

                startActivity(topartistintent);
            }
        });

        Button topsetting =(Button) findViewById(R.id.topsettings);
        topsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topsettingintent=new Intent(Artist.this, settings.class);

                startActivity(topsettingintent);
            }
        });
        Button topcart =(Button) findViewById(R.id.topmusiccart);
        topcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topcartintent=new Intent(Artist.this, Cart.class);

                startActivity(topcartintent);
            }
        });


        Button mButton = (Button) findViewById(R.id.ed);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Go to wikipedia for info about Artist", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/Ed_Sheeran"));
                startActivity(browserIntent);

            }


        });


        Button mButton1 = (Button) findViewById(R.id.ariana);
        mButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Go to wikipedia for info about Artist", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/Ariana_Grande"));
                startActivity(browserIntent);

            }


        });


        Button mButton2 = (Button) findViewById(R.id.SBT);
        mButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Go to wikipedia for info about Artist", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/SBTRKT"));
                startActivity(browserIntent);

            }


        });


        Button mButton3 = (Button) findViewById(R.id.cold);
        mButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Go to wikipedia for info about Artist",Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/Coldplay"));
                startActivity(browserIntent);

            }


        });


        Button mButton4 = (Button) findViewById(R.id.katy);
        mButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Go to wikipedia for info about Artist",Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/Katy_Perry"));
                startActivity(browserIntent);
            }


        });

    }
}