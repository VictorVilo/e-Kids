package com.project.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Drawing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_drawing);
    }

    public void startDrawing(View view) {
        Intent intent = new Intent(Drawing.this, MainKotlin.class);
        startActivity(intent);
    }


    public void startGame(View view) {
        Intent intent = new Intent(Drawing.this, MainGameActivity.class);
        startActivity(intent);
    }
}
