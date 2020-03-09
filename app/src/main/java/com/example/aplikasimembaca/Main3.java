package com.example.aplikasimembaca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.MediaController;

public class Main3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        final MediaPlayer SuaraA = MediaPlayer.create(this, R.raw.a);
        final MediaPlayer SuaraB = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer SuaraC = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer SuaraD = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer SuaraE = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer SuaraF = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer SuaraG = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer SuaraH = MediaPlayer.create(this, R.raw.h);
        final MediaPlayer SuaraI = MediaPlayer.create(this, R.raw.i);
        final MediaPlayer SuaraJ = MediaPlayer.create(this, R.raw.j);
        final MediaPlayer SuaraK = MediaPlayer.create(this, R.raw.k);
        final MediaPlayer SuaraL = MediaPlayer.create(this, R.raw.l);
        final MediaPlayer SuaraM = MediaPlayer.create(this, R.raw.m);
        final MediaPlayer SuaraN = MediaPlayer.create(this, R.raw.n);
        final MediaPlayer SuaraO = MediaPlayer.create(this, R.raw.o);
        final MediaPlayer SuaraP = MediaPlayer.create(this, R.raw.p);
        final MediaPlayer SuaraQ = MediaPlayer.create(this, R.raw.q);
        final MediaPlayer SuaraR = MediaPlayer.create(this, R.raw.r);
        final MediaPlayer SuaraS = MediaPlayer.create(this, R.raw.s);
        final MediaPlayer SuaraT = MediaPlayer.create(this, R.raw.t);
        final MediaPlayer SuaraU = MediaPlayer.create(this, R.raw.u);
        final MediaPlayer SuaraV = MediaPlayer.create(this, R.raw.v);
        final MediaPlayer SuaraW = MediaPlayer.create(this, R.raw.w);
        final MediaPlayer SuaraX = MediaPlayer.create(this, R.raw.x);
        final MediaPlayer SuaraY = MediaPlayer.create(this, R.raw.y);
        final MediaPlayer SuaraZ = MediaPlayer.create(this, R.raw.z);

        Button btnbesar = (Button) findViewById(R.id.scale);
        Button btnbesar2 = (Button) findViewById(R.id.scale2);
        Button btnbesar3 = (Button) findViewById(R.id.scale3);
        Button btnbesar4 = (Button) findViewById(R.id.scale4);
        Button btnbesar5 = (Button) findViewById(R.id.scale5);
        Button btnbesar6 = (Button) findViewById(R.id.scale6);
        Button btnbesar7 = (Button) findViewById(R.id.scale7);
        Button btnbesar8 = (Button) findViewById(R.id.scale8);
        Button btnbesar9 = (Button) findViewById(R.id.scale9);
        Button btnbesar10 = (Button) findViewById(R.id.scale10);
        Button btnbesar11 = (Button) findViewById(R.id.scale11);
        Button btnbesar12 = (Button) findViewById(R.id.scale12);
        Button btnbesar13 = (Button) findViewById(R.id.scale13);
        Button btnbesar14 = (Button) findViewById(R.id.scale14);
        Button btnbesar15 = (Button) findViewById(R.id.scale15);
        Button btnbesar16 = (Button) findViewById(R.id.scale16);
        Button btnbesar17 = (Button) findViewById(R.id.scale17);
        Button btnbesar18 = (Button) findViewById(R.id.scale18);
        Button btnbesar19 = (Button) findViewById(R.id.scale19);
        Button btnbesar20 = (Button) findViewById(R.id.scale20);
        Button btnbesar21 = (Button) findViewById(R.id.scale21);
        Button btnbesar22 = (Button) findViewById(R.id.scale22);
        Button btnbesar23 = (Button) findViewById(R.id.scale23);
        Button btnbesar24 = (Button) findViewById(R.id.scale24);
        Button btnbesar25 = (Button) findViewById(R.id.scale25);
        Button btnbesar26 = (Button) findViewById(R.id.scale26);
        Button BtnNext1 = (Button) findViewById(R.id.next1);

        btnbesar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraA.start();
            }});

        btnbesar2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraB.start();
            }});

        btnbesar3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraC.start();
            }});

        btnbesar4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraD.start();
            }});

        btnbesar5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraE.start();
            }});

        btnbesar6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraF.start();
            }});

        btnbesar7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraG.start();
            }});

        btnbesar8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraH.start();
            }});

        btnbesar9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraI.start();
            }});

        btnbesar10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraJ.start();
            }});

        btnbesar11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraK.start();
            }});

        btnbesar12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraL.start();
            }});

        btnbesar13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraM.start();
            }});

        btnbesar14.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraN.start();
            }});

        btnbesar15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraO.start();
            }});

        btnbesar16.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraP.start();
            }});

        btnbesar17.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraQ.start();
            }});

        btnbesar18.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraR.start();
            }});

        btnbesar19.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraS.start();
            }});

        btnbesar20.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraT.start();
            }});

        btnbesar21.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraU.start();
            }});

        btnbesar22.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraV.start();
            }});

        btnbesar23.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraW.start();
            }});

        btnbesar24.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraX.start();
            }});

        btnbesar25.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraY.start();
            }});

        btnbesar26.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
                SuaraZ.start();
            }});

        BtnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main4.class);
                startActivity(intent);
            }
        });


    }
}
