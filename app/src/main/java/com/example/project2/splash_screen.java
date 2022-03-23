package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {

    private ImageView logo;
    private TextView heading, slogan;

    Animation top_animation, text_animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {


            @Override

            public void run() {

                Intent i = new Intent(splash_screen.this, Login.class);

                startActivity(i);



                finish();

            }

        }, 5*1000);




        logo = findViewById(R.id.logo);
        heading = findViewById(R.id.heading);
        slogan = findViewById(R.id.slogan);

        top_animation = AnimationUtils.loadAnimation( this, R.anim.top_animation);
        text_animation=AnimationUtils.loadAnimation(this,R.anim.text_animation);

        logo.setAnimation(top_animation);
        heading.setAnimation(text_animation);
        slogan.setAnimation(text_animation);

    }
}