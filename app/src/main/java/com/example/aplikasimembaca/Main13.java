package com.example.aplikasimembaca;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main13 extends AppCompatActivity {

    TextView textQuestion, textBtn;
    ImageView bigboss;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");


        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textBtn = (TextView) findViewById(R.id.textBtn);

        bigboss = (ImageView) findViewById(R.id.bigboss);
        bigboss.startAnimation(smalltobig);
        MediaPlayer mediaPlayer= MediaPlayer.create(Main13.this,R.raw.berhasil);
        mediaPlayer.start();

        textBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2.class);
                startActivity(intent);
            }
        });


        textQuestion.setTypeface(typeface);
        textBtn.setTypeface(typeface);
    }
}
