package com.example.imagegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    //@Override
    Button btn;
    ImageView num1;
    ImageView num2;
    ImageView num3;
    ImageView Iv;



    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.androidNum1);
        num2=findViewById(R.id.pokemonNum2);
        num3=findViewById(R.id.minionsNum3);
        btn=findViewById(R.id.button);
        Iv=findViewById(R.id.imageView);
    }
    public void clicked(View view)
    {


}