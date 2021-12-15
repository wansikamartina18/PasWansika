package com.example.outfitview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySweater extends AppCompatActivity {
    Button btnSweater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweater);
        btnSweater = (Button) findViewById(R.id.btn4);

        btnSweater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnSweater = new Intent(ActivitySweater.this,ActivitySweater1.class);
                startActivity(pindahBtnSweater);
            }
        });
    }
}