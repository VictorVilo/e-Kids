package com.project.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Pattern extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pattern);
    }

    public void canvasClick(View view) {
        Intent intent = new Intent(Pattern.this, EasyPaint.class);
        startActivity(intent);
    }

    public void openCamera(View view) {
        Intent intent = new Intent(Pattern.this, ImageDetection.class);
        startActivity(intent);
    }
}
