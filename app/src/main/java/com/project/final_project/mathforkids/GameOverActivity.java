package com.project.final_project.mathforkids;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.final_project.R;
import com.project.final_project.util.Controller;
import com.project.final_project.util.SaveIntegerData;

/**
 * Created by Janice
 */
public class GameOverActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
      Total correctly answered questions
      for all the rounds completed
      (Must reach the game over screen
      when the timer is 0)
     */
        SaveIntegerData overallCorrect = new SaveIntegerData(this, "overallCorrect");
        SaveIntegerData highscore = new SaveIntegerData(this, "highscore");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        TextView totalCorrect = findViewById(R.id.roundCorrect);
        int correct = Integer.parseInt(Controller.getCorrect());
        if(correct > highscore.getData()){
            highscore.setData(correct);
            TextView newScore = findViewById(R.id.newHighscore);
            String newScoreText = "You have a new highscore of " + Controller.getCorrect();
            newScore.setText(newScoreText);
        }

        overallCorrect.setData(correct + overallCorrect.getData());
        totalCorrect.append(Controller.getCorrect());

        TextView totalWrong = findViewById(R.id.roundIncorrect);
        totalWrong.append(Controller.getTotalIncorrect());

        TextView totalQuestions = findViewById(R.id.roundAnswered);
        totalQuestions.append(String.valueOf(Controller.getTotalQuestions()));


    }
}
