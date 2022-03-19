package com.example.mypc.musicalstuctureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        Button tophome = (Button) findViewById(R.id.tophome);
        tophome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tophomeintent = new Intent(NowPlaying.this, MainActivity.class);

                startActivity(tophomeintent);
            }
        });

        Button toptracks = (Button) findViewById(R.id.toptracks);
        toptracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toptrackintent = new Intent(NowPlaying.this, Tracks.class);

                startActivity(toptrackintent);
            }
        });

        Button topalbum = (Button) findViewById(R.id.topalbum);
        topalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topalbumintent = new Intent(NowPlaying.this, Albums.class);

                startActivity(topalbumintent);
            }
        });

        Button topartist = (Button) findViewById(R.id.topartist);
        topartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topartistintent = new Intent(NowPlaying.this, Artist.class);

                startActivity(topartistintent);
            }
        });

        Button topsetting = (Button) findViewById(R.id.topsettings);
        topsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topsettingintent = new Intent(NowPlaying.this, settings.class);

                startActivity(topsettingintent);
            }
        });
        Button topcart = (Button) findViewById(R.id.topmusiccart);
        topcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topcartintent = new Intent(NowPlaying.this, Cart.class);

                startActivity(topcartintent);
            }
        });

        ImageButton prevbtn = (ImageButton) findViewById(R.id.prev);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Previous song is Playing", Toast.LENGTH_SHORT).show();

            }
        });

        ImageButton playbtn = (ImageButton) findViewById(R.id.playicon);
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Song is Playing", Toast.LENGTH_SHORT).show();

            }
        });

        ImageButton nextbtn = (ImageButton) findViewById(R.id.nexticon);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Next song is Playing", Toast.LENGTH_SHORT).show();

            }
        });



    }


}

