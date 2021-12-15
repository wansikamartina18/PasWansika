package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityGaun1 extends AppCompatActivity {
    Button btnBackGaun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaun1);
        btnBackGaun = (Button) findViewById(R.id.btn_gn);

    btnBackGaun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent pindahBtnGaun = new Intent(ActivityGaun1.this,MainActivity.class);
            startActivity(pindahBtnGaun);
        }
    });
    }
}