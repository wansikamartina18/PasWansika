package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKaos1 extends AppCompatActivity {
    Button btnBackKaos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaos1);
        btnBackKaos = (Button) findViewById(R.id.btn_ks);

        btnBackKaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnKaos = new Intent(ActivityKaos1.this,MainActivity.class);
                startActivity(pindahBtnKaos);
            }
        });
    }
}