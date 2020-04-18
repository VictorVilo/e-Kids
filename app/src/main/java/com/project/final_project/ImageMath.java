package com.project.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ImageMath extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_math);

    }

    public void startAdding(View view) {
        Intent intent = new Intent(ImageMath.this, Addition.class);
        startActivity(intent);
    }

    public void startMinus(View view) {
        Intent intent = new Intent(ImageMath.this, Minus.class);
        startActivity(intent);
    }
}
