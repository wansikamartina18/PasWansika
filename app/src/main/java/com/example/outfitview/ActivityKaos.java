package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKaos extends AppCompatActivity {
    Button btnKaos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaos);
        btnKaos=(Button) findViewById(R.id.btn2);

        btnKaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnKaos = new Intent(ActivityKaos.this,ActivityKaos1.class);
                startActivity(pindahBtnKaos);
            }
        });


    }
}