package com.project.final_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        if (ContextCompat.checkSelfPermission(Home.this,
                Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(Home.this,
                    Manifest.permission.CAMERA)) {
                ActivityCompat.requestPermissions(Home.this,
                        new String[]{Manifest.permission.CAMERA}, 1);
            } else {
                ActivityCompat.requestPermissions(Home.this,
                        new String[]{Manifest.permission.CAMERA}, 1);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(Home.this,
                            Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                    }
                    return;
                }
            }
        }
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
