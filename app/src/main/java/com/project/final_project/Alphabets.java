package com.project.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Alphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_alphabets);
    }

    public void startAlphabets(View view) {
        Intent intent = new Intent(Alphabets.this, LearnAlphabets.class);
        startActivity(intent);
    }

    public void makeWords(View view) {
        Intent intent = new Intent(Alphabets.this, AlphabetImages.class);
        startActivity(intent);
    }
}
