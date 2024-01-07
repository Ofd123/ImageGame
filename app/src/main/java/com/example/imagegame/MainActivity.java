package com.example.imagegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    //@Override
    Button btn;
    ImageView[] Iv = new ImageView[3];
    public Random randomizer = new Random();
    int justANumber;
    int[] id = new int[3];


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iv[0]=(android.widget.ImageView) findViewById(R.id.androidNum1);
        Iv[1]=(android.widget.ImageView) findViewById(R.id.pokemonNum2);
        Iv[2]=(android.widget.ImageView) findViewById(R.id.minionsNum3);
        btn=findViewById(R.id.button);
        id[0]=R.drawable.androidNum1;
        id[1]=R.drawable.pokemonNum2;
        id[2]=R.drawable.minionsNum3;
    }
    public void clicked(View view)
    {
        justANumber=randomizer.nextInt(3);
        btn.setText("this is picture number: "+justANumber);
        if (justANumber==1) {
            Iv.setImageResource(R.drawable.androidNum1);
        }
    }


}