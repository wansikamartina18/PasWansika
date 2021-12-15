package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySweater1 extends AppCompatActivity {
    Button btnBackSweater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweater1);
        btnBackSweater = (Button) findViewById(R.id.btn_swtr);

        btnBackSweater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnSweater = new Intent(ActivitySweater1.this,MainActivity.class);
                startActivity(pindahBtnSweater);
            }
        });
    }
}