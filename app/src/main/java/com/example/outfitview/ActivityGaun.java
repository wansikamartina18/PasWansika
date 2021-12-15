package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityGaun extends AppCompatActivity {
    Button btnGaun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaun);
        btnGaun=(Button) findViewById(R.id.btn1);

        btnGaun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnGaun = new Intent(ActivityGaun.this,ActivityGaun1.class);
                startActivity(pindahBtnGaun);
            }
        });
    }
}