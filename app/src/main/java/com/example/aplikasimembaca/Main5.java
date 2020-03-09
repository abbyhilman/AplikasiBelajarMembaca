package com.example.aplikasimembaca;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main5 extends AppCompatActivity {

    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textview = (TextView) findViewById(R.id.Textview1);

        button = (Button) findViewById(R.id.next1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main6.class);
                startActivity(intent);
            }
        });

    }

    public void String (View view){
        textview.setText("");
        String vokal[] = {"a", "i", "u", "e", "o"};
        String konsonan[] = {"b", "c", "d", "f", "g",
                "h", "j", "k", "l", "m",
                "n", "p", "q", "r", "s",
                "t", "v", "w", "x", "y",
                "z", "ng", "ny"
        };

        int randomV;
        int randomK;
        int randomVK;
        String VKV;

        //char[] konsonan="BCDFGHJKLMNPQRSTVWXYZ".toCharArray();
        int textCounter = 0;
        Random random = new Random();
        Random randomaja = new Random();
        int color = Color.argb(255, randomaja.nextInt(256), randomaja.nextInt(256), randomaja.nextInt(256));
        textview.setTextColor(color);
        while (textCounter < 1){
            randomV = random.nextInt(vokal.length);
            randomK = random.nextInt(konsonan.length);
            randomVK = random.nextInt(vokal.length);
            //char d = konsonan[random1.nextInt(textCounter)];
            //textview.append(" V " + randomV + "\n");
            VKV = vokal[randomVK] +"\t" + "\t" + konsonan[randomK] + vokal[randomV];
            textview.append(VKV);
            textCounter++;
        }

        //while (int i = 20;  i++){
        //char c = chars[random.nextInt(chars.length)];
        //stringBuilder.append(c);
        //}

    }
}
