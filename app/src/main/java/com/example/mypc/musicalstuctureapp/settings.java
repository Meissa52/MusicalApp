package com.example.mypc.musicalstuctureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    CheckBox settingcheckbox1;
    CheckBox settingcheckbox2;
    CheckBox settingcheckbox3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button toptracks =(Button) findViewById(R.id.toptracks);
        toptracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toptrackintent=new Intent(settings.this, Tracks.class);

                startActivity(toptrackintent);
            }
        });

        Button topalbum =(Button) findViewById(R.id.topalbum);
        topalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topalbumintent=new Intent(settings.this, Albums.class);

                startActivity(topalbumintent);
            }
        });

        Button topartist =(Button) findViewById(R.id.topartist);
        topartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topartistintent=new Intent(settings.this, Artist.class);

                startActivity(topartistintent);
            }
        });

        Button tophome =(Button) findViewById(R.id.tophome);
        tophome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topsettingintent=new Intent(settings.this, MainActivity.class);

                startActivity(topsettingintent);
            }
        });
        Button topcart =(Button) findViewById(R.id.topmusiccart);
        topcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topcartintent=new Intent(settings.this, Cart.class);

                startActivity(topcartintent);
            }
        });


        settingcheckbox1 = findViewById(R.id.box1);
        settingcheckbox2 = findViewById(R.id.box2);
        settingcheckbox3 = findViewById(R.id.box3);


        settingcheckbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (settingcheckbox1.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Changes are saved-SWITCH is ON", Toast.LENGTH_SHORT).show();


                }
            }
        });

        settingcheckbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (settingcheckbox2.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Changes are made-Shuffle is Enabled", Toast.LENGTH_SHORT).show();


                }
            }
        });

        settingcheckbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (settingcheckbox3.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Changes are made-Equalizer is ON", Toast.LENGTH_SHORT).show();


                }
            }
        });

        Button sbtn1= findViewById(R.id.set1);
        sbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Go to Play Store to Rate the App", Toast.LENGTH_SHORT).show();

            }
        });
        Button sbtn2=findViewById(R.id.set2);

        sbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey! check out the Music app at: https://play.google.com/store/apps/details?id=com.google.android.apps.plus");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        Button sbtn3= findViewById(R.id.set3);
        sbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your cart is Restored",Toast.LENGTH_SHORT).show();
            }
        });






    }
}
