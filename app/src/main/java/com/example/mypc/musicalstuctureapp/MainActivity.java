package com.example.mypc.musicalstuctureapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView nowplaying = (TextView) findViewById(R.id.nowplaying);

        nowplaying.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent npwplayingIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(npwplayingIntent);


            }

        });


        TextView tracks = (TextView) findViewById(R.id.tracks);

        tracks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(MainActivity.this,Tracks.class);

                // Start the new activity
                startActivity(tracksIntent);

            }

        });


        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });


        TextView artists = (TextView) findViewById(R.id.artists);
        artists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, Artist.class);

                // Start the new activity
                startActivity(artistIntent);
            }

        });

        TextView settings = (TextView) findViewById(R.id.settings);
        settings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, settings.class);

                // Start the new activity
                startActivity(settingsIntent);
            }

        });

        TextView musiccart = (TextView) findViewById(R.id.cart);
        musiccart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musiccartIntent = new Intent(MainActivity.this, Cart.class);

                // Start the new activity
                startActivity(musiccartIntent);
            }

        });


    }
}