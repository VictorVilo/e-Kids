package com.project.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
    }


    public void alphabetsClick(View view) {
        Intent intent = new Intent(Home.this, Alphabets.class);
        startActivity(intent);
    }

    public void patternClick(View view) {
        Intent intent = new Intent(Home.this, Pattern.class);
        startActivity(intent);
    }

    public void drawingClick(View view) {
        Intent intent = new Intent(Home.this, Drawing.class);
        startActivity(intent);
    }

    public void mathClick(View view) {
        Intent intent = new Intent(Home.this, Math.class);
        startActivity(intent);
    }

}
