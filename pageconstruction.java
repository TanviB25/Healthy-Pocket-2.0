package com.tanvi.myway.healthypocket20;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.TextView;

public class pageconstruction extends AppCompatActivity {

    TextView textView12,textView8,textView15,textView16;

    ImageButton imageButton,imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageconstruction);

        textView12 = (TextView) findViewById(R.id.textView12);
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500); // blinking time with parameter
        anim.setStartOffset(150);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textView12.startAnimation(anim);

        textView8 =(TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent harry = new Intent(Intent.ACTION_VIEW);
                harry.setData(Uri.parse("http://www.maps.google.com"));
                startActivity(harry);

            }
        });

        imageButton =(ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent fb = new Intent(Intent.ACTION_VIEW);
                fb.setData(Uri.parse("https://www.facebook.com/healthypocket2.0"));
                startActivity(fb);

            }
        });

        imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
       imageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tw = new Intent(Intent.ACTION_VIEW);
                tw.setData(Uri.parse("https://twitter.com/@tanvi_barge/"));
                startActivity(tw);

            }
        });




    }


}
