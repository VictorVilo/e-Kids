package com.project.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.project.final_project.mathforkids.MainActivity2;

public class Math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_math);
    }

    public void startMath(View view) {
        Intent intent = new Intent(Math.this, MainActivity2.class);
        startActivity(intent);
    }

    public void readMath(View view) {
        Intent intent = new Intent(Math.this, LearnNumbers.class);
        startActivity(intent);
    }

    public void learnWithImages(View view) {
        Intent intent = new Intent(Math.this, ImageNumbers.class);
        startActivity(intent);
    }

    public void openOperations(View view) {
        Intent intent = new Intent(Math.this, ImageMath.class);
        startActivity(intent);
    }
}
