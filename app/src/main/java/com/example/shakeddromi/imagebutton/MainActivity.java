package com.example.shakeddromi.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    int x;
    ImageButton ib;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = (ImageButton) findViewById(R.id.ib);
        iv = (ImageView) findViewById(R.id.iv);
    }

    public void click(View view) {
        x = rnd.nextInt(3) + 1;
        switch (x) {
            case 1:
                iv.setImageResource(R.drawable.f1);
                ib.setImageResource(R.drawable.click11);
                break;
            case 2:
                iv.setImageResource(R.drawable.f2);
                ib.setImageResource(R.drawable.click22);
                break;
            case 3:
                iv.setImageResource(R.drawable.f3);
                ib.setImageResource(R.drawable.click33);
                break;
        }
    }
}