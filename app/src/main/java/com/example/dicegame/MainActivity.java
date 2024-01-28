package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView iv_dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_dice=findViewById(R.id.iv_dice);
    }
    public void play(View view){
        Random r=new Random();
        int n=r.nextInt(6)+1;
        if (n==1){
            iv_dice.setImageResource(R.drawable.one);
        } else if (n==2) {
            iv_dice.setImageResource(R.drawable.two);
        } else if (n==3) {
            iv_dice.setImageResource(R.drawable.three);
        } else if (n==4) {
            iv_dice.setImageResource(R.drawable.four);
        } else if (n==5) {
            iv_dice.setImageResource(R.drawable.five);
        }else if (n==6){
            iv_dice.setImageResource(R.drawable.six);
        }
    }
}