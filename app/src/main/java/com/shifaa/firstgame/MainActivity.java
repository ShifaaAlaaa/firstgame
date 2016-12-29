package com.shifaa.firstgame;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView textView;
    static String[] colors={  "#730099","#990073","#00ffff","#ffff00","#ff66ff",
                                "#999900","#009973","#002699",
                                 "#990000","#00ff00","#992600",
                                "#999900","#009973","#002699",
                                 "#730099","#990073","#00ffff","#ffff00","#ff66ff",
                                  "#990000","#00ff00","#992600",
                                "#999900","#009973","#002699",
                                  "#999900","#009973","#002699",
                                "#730099","#990073","#00ffff","#ffff00","#ff66ff"};
    Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView=(TextView)findViewById(R.id.textView);

    //    int r=(random.nextInt(colors.length)+1);

//        textView.setBackgroundColor(Color.parseColor(colors[r]));

        /*final int interval = 1000; // 1 Second
         Handler handler = new Handler();

        Runnable runnable = new Runnable(){
            public void run() {
                int r=(random.nextInt(colors.length)+1);
                textView.setBackgroundColor((Color.parseColor(colors[r])));

            }
        };

            handler.postAtTime(runnable, System.currentTimeMillis() + interval);
            handler.postDelayed(runnable, interval);
        */
        new CountDownTimer(10000, 100) {

            public void onTick(long millisUntilFinished) {
                int r=(random.nextInt(colors.length)+1);

                textView.setBackgroundColor((int) (Color.parseColor(colors[r])+ millisUntilFinished / 100));
            }

            public void onFinish() {

            }
        }.start();


    }



   public void changeColor(View view) {
       btn=(Button)findViewById(R.id.btn);
        int c=0;
       while (c < colors.length) {
           btn.setBackgroundColor(Color.parseColor(colors[c]));

       }
    }
}
