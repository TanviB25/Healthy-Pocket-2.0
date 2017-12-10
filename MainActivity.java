package com.tanvi.myway.healthypocket20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton19,imageButton20,imageButton21,imageButton22;
    TextView textView18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dreams = new Intent(MainActivity.this, firstquiz.class);
                startActivity(dreams);
            }
        });
        imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dreams1 = new Intent(MainActivity.this, secondquiz.class);
                startActivity(dreams1);
            }
        });

        imageButton21 = (ImageButton) findViewById(R.id.imageButton21);
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dreams2 = new Intent(MainActivity.this, calorimeter.class);
                startActivity(dreams2);
            }
        });
        imageButton22 = (ImageButton) findViewById(R.id.imageButton22);
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dreams3 = new Intent(MainActivity.this, pageconstruction.class);
                startActivity(dreams3);
            }
        });
        textView18 = (TextView) findViewById(R.id.textView18);
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500); // blinking time with parameter
        anim.setStartOffset(150);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textView18.startAnimation(anim);


    }
}
