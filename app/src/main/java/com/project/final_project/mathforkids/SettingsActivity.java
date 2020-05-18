package com.project.final_project.mathforkids;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.project.final_project.R;
import com.project.final_project.util.Controller;

/**
 * @author Created by Megan
 * Show Settings for selecting difficulty
 * and muting the sound
 */
public class SettingsActivity extends AppCompatActivity {

    private static boolean basicB = true;
    private static boolean intermediateB = false;
    private static boolean advancedB = false;
    private Switch basic;
    private Switch intermediate;
    private Switch advanced;
    private Snackbar errorDifficultyMsg;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        basic = findViewById(R.id.basic);
        intermediate = findViewById(R.id.intermediate);
        advanced = findViewById(R.id.advanced);
        Switch mute = findViewById(R.id.mute);
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        boolean muted = sp.getBoolean("mute", false);
        errorDifficultyMsg = Snackbar.make(findViewById(R.id.settingsLayout), R.string.difficultyError, Snackbar.LENGTH_SHORT);

        //set the switch to OFF
        mute.setChecked(muted);
        basic.setChecked(basicB);
        intermediate.setChecked(intermediateB);
        advanced.setChecked(advancedB);

        //attach a listener to check for changes in state
        basic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    basicB = true;
                    if (basicB) {
                        intermediateB = false;
                        advancedB = false;
                        basic.setChecked(basicB);
                        intermediate.setChecked(intermediateB);
                        advanced.setChecked(advancedB);
                    }
                    Controller.setDifficulty(1);
                }
                else{
                    //Must have at least one of the difficulty settings on!
                    if(!intermediateB && !advancedB){
                        basic.setChecked(basicB);
                        errorDifficultyMsg.show();
                    }
                }

            }
        });
        intermediate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    intermediateB = true;
                    if (intermediateB) {
                        basicB = false;
                        advancedB = false;
                        basic.setChecked(basicB);
                        intermediate.setChecked(intermediateB);
                        advanced.setChecked(advancedB);
                    }
                    Controller.setDifficulty(2);
                }
                else{
                    //Must have at least one of the difficulty settings on!
                    if(!basicB && !advancedB){
                        intermediate.setChecked(intermediateB);
                        errorDifficultyMsg.show();
                    }
                }

            }
        });
        advanced.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    advancedB = true;
                    if (advancedB) {
                        intermediateB = false;
                        basicB = false;
                        basic.setChecked(basicB);
                        intermediate.setChecked(intermediateB);
                        advanced.setChecked(advancedB);
                    }
                    Controller.setDifficulty(3);
                }
                else{
                    //Must have at least one of the difficulty settings on!
                    if(!basicB && !intermediateB){
                        advanced.setChecked(advancedB);
                        errorDifficultyMsg.show();
                    }
                }

            }
        });

        mute.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this);
                sp.edit().putBoolean("mute", isChecked).apply();

            }
        });


    }
}
