package com.project.final_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LearnNumbers extends AppCompatActivity {

    private List<Numbers> numbersList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NumbersAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_learn_numbers);

        recyclerView = findViewById(R.id.recycler_view);

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

        numbers = new Numbers("51", "Fifty one");
        numbersList.add(numbers);

        numbers = new Numbers("52", "Fifty two");
        numbersList.add(numbers);

        numbers = new Numbers("53", "Fifty three");
        numbersList.add(numbers);

        numbers = new Numbers("54", "Fifty four");
        numbersList.add(numbers);

        numbers = new Numbers("55", "Fifty five");
        numbersList.add(numbers);

        numbers = new Numbers("56", "Fifty six");
        numbersList.add(numbers);

        numbers = new Numbers("57", "Fifty seven");
        numbersList.add(numbers);

        numbers = new Numbers("58", "Fifty eight");
        numbersList.add(numbers);

        numbers = new Numbers("59", "Fifty nine");
        numbersList.add(numbers);

        numbers = new Numbers("60", "Sixty");
        numbersList.add(numbers);

        numbers = new Numbers("61", "Sixty one");
        numbersList.add(numbers);

        numbers = new Numbers("62", "Sixty two");
        numbersList.add(numbers);

        numbers = new Numbers("63", "Sixty three");
        numbersList.add(numbers);

        numbers = new Numbers("64", "Sixty four");
        numbersList.add(numbers);

        numbers = new Numbers("65", "Sixty five");
        numbersList.add(numbers);

        numbers = new Numbers("66", "Sixty six");
        numbersList.add(numbers);

        numbers = new Numbers("67", "Sixty seven");
        numbersList.add(numbers);

        numbers = new Numbers("68", "Sixty eight");
        numbersList.add(numbers);

        numbers = new Numbers("69", "Sixty nine");
        numbersList.add(numbers);

        numbers = new Numbers("70", "Seventy");
        numbersList.add(numbers);

        numbers = new Numbers("71", "Seventy one");
        numbersList.add(numbers);

        numbers = new Numbers("72", "Seventy two");
        numbersList.add(numbers);

        numbers = new Numbers("73", "Seventy three");
        numbersList.add(numbers);

        numbers = new Numbers("74", "Seventy four");
        numbersList.add(numbers);

        numbers = new Numbers("75", "Seventy five");
        numbersList.add(numbers);

        numbers = new Numbers("76", "Seventy six");
        numbersList.add(numbers);

        numbers = new Numbers("77", "Seventy seven");
        numbersList.add(numbers);

        numbers = new Numbers("78", "Seventy eight");
        numbersList.add(numbers);

        numbers = new Numbers("79", "Seventy nine");
        numbersList.add(numbers);

        numbers = new Numbers("80", "Eighty");
        numbersList.add(numbers);

        numbers = new Numbers("81", "Eighty one");
        numbersList.add(numbers);

        numbers = new Numbers("82", "Eighty two");
        numbersList.add(numbers);

        numbers = new Numbers("83", "Eighty three");
        numbersList.add(numbers);

        numbers = new Numbers("84", "Eighty four");
        numbersList.add(numbers);

        numbers = new Numbers("85", "Eighty five");
        numbersList.add(numbers);

        numbers = new Numbers("86", "Eighty six");
        numbersList.add(numbers);

        numbers = new Numbers("87", "Eighty seven");
        numbersList.add(numbers);

        numbers = new Numbers("88", "Eighty eight");
        numbersList.add(numbers);

        numbers = new Numbers("89", "Eighty nine");
        numbersList.add(numbers);

        numbers = new Numbers("90", "Ninety");
        numbersList.add(numbers);

        numbers = new Numbers("91", "Ninety one");
        numbersList.add(numbers);

        numbers = new Numbers("92", "Ninety two");
        numbersList.add(numbers);

        numbers = new Numbers("93", "Ninety three");
        numbersList.add(numbers);

        numbers = new Numbers("94", "Ninety four");
        numbersList.add(numbers);

        numbers = new Numbers("95", "Ninety five");
        numbersList.add(numbers);

        numbers = new Numbers("96", "Ninety six");
        numbersList.add(numbers);

        numbers = new Numbers("97", "Ninety seven");
        numbersList.add(numbers);

        numbers = new Numbers("98", "Ninety eight");
        numbersList.add(numbers);

        numbers = new Numbers("99", "Ninety nine");
        numbersList.add(numbers);

        numbers = new Numbers("100", "One hundred");
        numbersList.add(numbers);


        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();
    }


}