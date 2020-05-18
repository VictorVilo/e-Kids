package com.project.final_project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class Pattern extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pattern);

        if (ContextCompat.checkSelfPermission(Pattern.this,
                Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(Pattern.this,
                    Manifest.permission.CAMERA)) {
                ActivityCompat.requestPermissions(Pattern.this,
                        new String[]{Manifest.permission.CAMERA}, 1);
            } else {
                ActivityCompat.requestPermissions(Pattern.this,
                        new String[]{Manifest.permission.CAMERA}, 1);

            }
        }
    }

    public void openCamera(View view) {
        Intent intent = new Intent(Pattern.this, ImageDetection.class);
        startActivity(intent);
    }

    public void startMlDraw(View view) {
        Intent intent = new Intent(Pattern.this, Classify.class);
        startActivity(intent);
    }
}
