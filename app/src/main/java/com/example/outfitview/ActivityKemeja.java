package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKemeja extends AppCompatActivity {
    Button btnKemeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kemeja);
        btnKemeja= (Button) findViewById(R.id.btn3);

        btnKemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnKemeja = new Intent(ActivityKemeja.this,ActivityKemeja1.class);
                startActivity(pindahBtnKemeja);
            }
        });
    }
}