package com.project.final_project.mathforkids;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.final_project.R;
import com.project.final_project.util.SaveIntegerData;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        SaveIntegerData highscore = new SaveIntegerData(this,"highscore");
        TextView output = findViewById(R.id.roundScore);
        output.append(String.valueOf(highscore.getData()));

    }
}
