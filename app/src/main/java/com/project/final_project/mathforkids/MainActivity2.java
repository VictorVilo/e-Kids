package com.project.final_project.mathforkids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.project.final_project.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Create buttons and add action listeners
        Button score = findViewById(R.id.score);

        score.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ScoreActivity.class);
                startActivity(intent);
            }
        });
        Button start = findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, QuestionActivity.class);
                startActivity(intent);
            }
        });

        Button acheive = findViewById(R.id.achieve);
        acheive.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, AchievementActivity.class);
                startActivity(intent);
            }
        });

        Button settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

    }


}
