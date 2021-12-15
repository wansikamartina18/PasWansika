package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKemeja1 extends AppCompatActivity {
    Button btnBackKemeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kemeja1);
        btnBackKemeja = (Button) findViewById(R.id.btn_kmj);

        btnBackKemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnKemeja = new Intent(ActivityKemeja1.this,MainActivity.class);
                startActivity(pindahBtnKemeja);
            }
        });
    }
}