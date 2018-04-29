package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = findViewById(R.id.askButton);

        final ImageView magicBall;
        magicBall = findViewById(R.id.ball);

        final int[] balls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic-8-Ball", "button pressed");
                Random randomNumberGenerater = new Random();
                int number = randomNumberGenerater.nextInt(4);
                magicBall.setImageResource(balls[number]);
            }
        });
    }
}
