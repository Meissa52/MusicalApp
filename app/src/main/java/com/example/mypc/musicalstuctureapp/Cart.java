package com.example.mypc.musicalstuctureapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Cart extends AppCompatActivity {

    int cartitems=0;
    int cartvalue=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        Button btnpayment =(Button)findViewById(R.id.payment);
        btnpayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Go to Spotify login page for payment", Toast.LENGTH_SHORT).show();


                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.spotify.com/int/signup/"));
                startActivity(browserIntent);
            }
        });


        }


    public void increment(View view) {

        cartitems = cartitems + 1;

        displayCart(cartitems);

        cartvalue=cartitems*10;

        displayCartprice(cartvalue);

    }

    public void decrement(View view) {
        cartitems = cartitems - 1;
        if
                (cartitems > 0) {
            displayCart(cartitems);

        } else {
            displayCart(cartitems= 0);


        }

        if (cartvalue>0){
            displayCartprice(cartvalue=cartvalue-10);
        }
        else {
            displayCartprice(cartvalue=0);
        }



    }



    private void displayCart(int cartitem) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.initialcartvalue);
        quantityTextView.setText("" + cartitems);

    }

    private void displayCartprice(int cartprice) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.initialcartprice);
        quantityTextView.setText("" + cartvalue);

    }

}


