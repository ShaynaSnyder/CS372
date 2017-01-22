package com.ssnyder19.www.yahtzeeapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)this.findViewById(R.id.button);
        b.setOnClickListener(this);}

    public void onClick(View v){
        ImageView i1 = (ImageView)MainActivity.this.findViewById(R.id.imageView1);
        ImageView i2 = (ImageView)MainActivity.this.findViewById(R.id.imageView2);
        ImageView i3 = (ImageView)MainActivity.this.findViewById(R.id.imageView3);
        ImageView i4 = (ImageView)MainActivity.this.findViewById(R.id.imageView4);
        ImageView i5 = (ImageView)MainActivity.this.findViewById(R.id.imageView5);

        Random rand = new Random();
        int t1 = rand.nextInt(6)+1;
        int t2 = rand.nextInt(6)+1;
        int t3 = rand.nextInt(6)+1;
        int t4 = rand.nextInt(6)+1;
        int t5 = rand.nextInt(6)+1;

        if(t1==1)
            i1.setImageDrawable(getDrawable(R.drawable.dice1));
        else if(t1==2)
            i1.setImageDrawable(getDrawable(R.drawable.dice2));
        else if(t1==3)
            i1.setImageDrawable(getDrawable(R.drawable.dice3));
        else if(t1==4)
            i1.setImageDrawable(getDrawable(R.drawable.dice4));
        else if(t1==5)
            i1.setImageDrawable(getDrawable(R.drawable.dice5));
        else if(t1==6)
            i1.setImageDrawable(getDrawable(R.drawable.dice6));

        if(t2==1)
            i2.setImageDrawable(getDrawable(R.drawable.dice1));
        else if(t2==2)
            i2.setImageDrawable(getDrawable(R.drawable.dice2));
        else if(t2==3)
            i2.setImageDrawable(getDrawable(R.drawable.dice3));
        else if(t2==4)
            i2.setImageDrawable(getDrawable(R.drawable.dice4));
        else if(t2==5)
            i2.setImageDrawable(getDrawable(R.drawable.dice5));
        else if(t2==6)
            i2.setImageDrawable(getDrawable(R.drawable.dice6));

        if(t3==1)
            i3.setImageDrawable(getDrawable(R.drawable.dice1));
        else if(t3==2)
            i3.setImageDrawable(getDrawable(R.drawable.dice2));
        else if(t3==3)
            i3.setImageDrawable(getDrawable(R.drawable.dice3));
        else if(t3==4)
            i3.setImageDrawable(getDrawable(R.drawable.dice4));
        else if(t3==5)
            i3.setImageDrawable(getDrawable(R.drawable.dice5));
        else if(t3==6)
            i3.setImageDrawable(getDrawable(R.drawable.dice6));

        if(t4==1)
            i4.setImageDrawable(getDrawable(R.drawable.dice1));
        else if(t4==2)
            i4.setImageDrawable(getDrawable(R.drawable.dice2));
        else if(t4==3)
            i4.setImageDrawable(getDrawable(R.drawable.dice3));
        else if(t4==4)
            i4.setImageDrawable(getDrawable(R.drawable.dice4));
        else if(t4==5)
            i4.setImageDrawable(getDrawable(R.drawable.dice5));
        else if(t4==6)
            i4.setImageDrawable(getDrawable(R.drawable.dice6));

        if(t5==1)
            i5.setImageDrawable(getDrawable(R.drawable.dice1));
        else if(t5==2)
            i5.setImageDrawable(getDrawable(R.drawable.dice2));
        else if(t5==3)
            i5.setImageDrawable(getDrawable(R.drawable.dice3));
        else if(t5==4)
            i5.setImageDrawable(getDrawable(R.drawable.dice4));
        else if(t5==5)
            i5.setImageDrawable(getDrawable(R.drawable.dice5));
        else if(t5==6)
            i5.setImageDrawable(getDrawable(R.drawable.dice6));
    }
}