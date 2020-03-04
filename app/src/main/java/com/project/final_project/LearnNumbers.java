package com.project.final_project;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class LearnNumbers extends AppCompatActivity {

    private List<Numbers> numbersList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NumbersAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_learn_numbers);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new NumbersAdapter(numbersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        prepareNumbersData();
    }

    private void prepareNumbersData() {
        Numbers numbers = new Numbers("1", "One");
        numbersList.add(numbers);

        numbers = new Numbers("2", "Two");
        numbersList.add(numbers);

        numbers = new Numbers("3", "Three");
        numbersList.add(numbers);

        numbers = new Numbers("4", "Four");
        numbersList.add(numbers);

        numbers = new Numbers("5", "Five");
        numbersList.add(numbers);

        numbers = new Numbers("6", "Six");
        numbersList.add(numbers);

        numbers = new Numbers("7", "Seven");
        numbersList.add(numbers);

        numbers = new Numbers("8", "Eight");
        numbersList.add(numbers);

        numbers = new Numbers("9", "Nine");
        numbersList.add(numbers);

        numbers = new Numbers("10", "Ten");
        numbersList.add(numbers);

        numbers = new Numbers("11", "Eleven");
        numbersList.add(numbers);

        numbers = new Numbers("12", "Twelve");
        numbersList.add(numbers);

        numbers = new Numbers("13", "Thirteen");
        numbersList.add(numbers);

        numbers = new Numbers("14", "Fourteen");
        numbersList.add(numbers);

        numbers = new Numbers("15", "Fifteen");
        numbersList.add(numbers);

        numbers = new Numbers("16", "Sixteen");
        numbersList.add(numbers);

        numbers = new Numbers("17", "Seventeen");
        numbersList.add(numbers);

        numbers = new Numbers("18", "Eighteen");
        numbersList.add(numbers);

        numbers = new Numbers("19", "Nineteen");
        numbersList.add(numbers);

        numbers = new Numbers("20", "Twenty");
        numbersList.add(numbers);

        numbers = new Numbers("21", "Twenty one");
        numbersList.add(numbers);

        numbers = new Numbers("22", "Twenty two");
        numbersList.add(numbers);

        numbers = new Numbers("23", "Twenty three");
        numbersList.add(numbers);

        numbers = new Numbers("24", "Twenty four");
        numbersList.add(numbers);

        numbers = new Numbers("25", "Twenty five");
        numbersList.add(numbers);

        numbers = new Numbers("26", "Twenty six");
        numbersList.add(numbers);

        numbers = new Numbers("27", "Twenty seven");
        numbersList.add(numbers);

        numbers = new Numbers("28", "Twenty eight");
        numbersList.add(numbers);

        numbers = new Numbers("29", "Twenty nine");
        numbersList.add(numbers);

        numbers = new Numbers("30", "Thirty");
        numbersList.add(numbers);

        numbers = new Numbers("31", "Thirty one");
        numbersList.add(numbers);

        numbers = new Numbers("32", "Thirty two");
        numbersList.add(numbers);

        numbers = new Numbers("33", "Thirty three");
        numbersList.add(numbers);

        numbers = new Numbers("34", "Thirty four");
        numbersList.add(numbers);

        numbers = new Numbers("35", "Thirty five");
        numbersList.add(numbers);

        numbers = new Numbers("36", "Thirty six");
        numbersList.add(numbers);

        numbers = new Numbers("37", "Thirty seven");
        numbersList.add(numbers);

        numbers = new Numbers("38", "Thirty eight");
        numbersList.add(numbers);

        numbers = new Numbers("39", "Thirty nine");
        numbersList.add(numbers);

        numbers = new Numbers("40", "Forty");
        numbersList.add(numbers);

        numbers = new Numbers("41", "Forty one");
        numbersList.add(numbers);

        numbers = new Numbers("42", "Forty two");
        numbersList.add(numbers);

        numbers = new Numbers("43", "Forty three");
        numbersList.add(numbers);

        numbers = new Numbers("44", "Forty four");
        numbersList.add(numbers);

        numbers = new Numbers("45", "Forty five");
        numbersList.add(numbers);

        numbers = new Numbers("46", "Forty six");
        numbersList.add(numbers);

        numbers = new Numbers("47", "Forty seven");
        numbersList.add(numbers);

        numbers = new Numbers("48", "Forty eight");
        numbersList.add(numbers);

        numbers = new Numbers("49", "Forty nine");
        numbersList.add(numbers);

        numbers = new Numbers("50", "Fifty");
        numbersList.add(numbers);


        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();
    }


   /* @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.UK);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Toast.makeText(LearnNumbers.this, "This Language is not supported", Toast.LENGTH_SHORT).show();
            } else {
                img1.setEnabled(true);
                img2.setEnabled(true);
                img3.setEnabled(true);
                img4.setEnabled(true);
                img5.setEnabled(true);
                img6.setEnabled(true);
                img7.setEnabled(true);
                img8.setEnabled(true);
                img9.setEnabled(true);
                img10.setEnabled(true);
                img11.setEnabled(true);
                img12.setEnabled(true);
                speakOut("");
            }

        } else {
            Log.e("TTS", "Initialization Failed!");
        }

    }

    @Override
    public void onBackPressed() {
        finish();
    }

    private void speakOut(String text)
    {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }*/

}