package com.example.aplikasimembaca;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2 extends AppCompatActivity {
    Button btnp1, btnp2, btnemail, BtnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnp1 = (Button) findViewById(R.id.btnp1);
        btnp2 = (Button) findViewById(R.id.btnp2);
        btnemail = (Button) findViewById(R.id.btnemail);
        BtnExit = (Button) findViewById(R.id.BtnExit);


        //btnp2.setEnabled(false);



        btnp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Main3.class);
                startActivity(intent);


            }
        });

        btnp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Main8.class);
                startActivity(intent);


            }
        });
        BtnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }


    public void browser1(View v) {
        Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSe0vnSwrKuFT0d3dWd5fdmnmICwy5Z7lAPjjbcyGuQ_20b3bg/viewform?usp=pp_url"));
        startActivity(browserintent);





    }



}
