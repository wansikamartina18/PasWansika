package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
CircleImageView imgGaun,imgKaos,imgKemeja,imgSweater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGaun=(CircleImageView) findViewById(R.id.circleImageView);
        imgKaos=(CircleImageView) findViewById(R.id.circleImageView2);
        imgKemeja=(CircleImageView) findViewById(R.id.circleImageView3);
        imgSweater=(CircleImageView) findViewById(R.id.circleImageView4);

        imgGaun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahGaun = new Intent(MainActivity.this, ActivityGaun.class);
                startActivity(pindahGaun);
            }
        });
        imgKaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahKaos = new Intent(MainActivity.this,ActivityKaos.class);
                startActivity(pindahKaos);
            }
        });
        imgKemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent pindahKemeja =new Intent(MainActivity.this,ActivityKemeja.class);
                 startActivity(pindahKemeja);

            }
        });
        imgSweater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSweater =new Intent(MainActivity.this,ActivitySweater.class);
                startActivity(pindahSweater);
            }
        });


    }
}