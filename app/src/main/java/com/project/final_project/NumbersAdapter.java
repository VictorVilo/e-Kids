package com.project.final_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.MyViewHolder> {

    private List<Numbers> numbersList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView digit, number;

        public MyViewHolder(View view) {
            super(view);
            digit = (TextView) view.findViewById(R.id.title);
            number = (TextView) view.findViewById(R.id.genre);
        }
    }


    public NumbersAdapter(List<Numbers> moviesList) {
        this.numbersList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.numbers_list_row, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Numbers numbers = numbersList.get(position);
        holder.digit.setText(numbers.getDigit());
        holder.number.setText(numbers.getNumber());
    }

    @Override
    public int getItemCount() {
        return numbersList.size();
    }
}