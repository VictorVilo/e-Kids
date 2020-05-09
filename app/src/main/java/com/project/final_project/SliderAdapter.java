package com.project.final_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    public int[] slide_images = {
            R.drawable.apple,
            R.drawable.ball,
            R.drawable.cat2,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.fish,
            R.drawable.giraffe,
            R.drawable.horse,
            R.drawable.icecream,
            R.drawable.jug,
            R.drawable.kite,
            R.drawable.lion,
            R.drawable.mango,
            R.drawable.nest,
            R.drawable.ostrich,
            R.drawable.parrot,
            R.drawable.queen,
            R.drawable.rabbit,
            R.drawable.spoon,
            R.drawable.tomato,
            R.drawable.umbrella,
            R.drawable.vase,
            R.drawable.watch,
            R.drawable.xylophone,
            R.drawable.yacht,
            R.drawable.zebra

    };
    public String[] slide_headings = {
            "Aa",
            "Bb",
            "Cc",
            "Dd",
            "Ee",
            "Ff",
            "Gg",
            "Hh",
            "Ii",
            "Jj",
            "Kk",
            "Ll",
            "Mm",
            "Nn",
            "Oo",
            "Pp",
            "Qq",
            "Rr",
            "Ss",
            "Tt",
            "Uu",
            "Vv",
            "Ww",
            "Xx",
            "Yy",
            "Zz"

    };
    public String[] descs = {
            "Apple",
            "Ball",
            "Cat",
            "Dog",
            "Elephant",
            "Fish",
            "Giraffe",
            "Horse",
            "Icecream",
            "Jug",
            "Kite",
            "Lion",
            "Mango",
            "Nest",
            "Ostrich",
            "Parrot",
            "Queen",
            "Rabbit",
            "Spoon",
            "Tomato",
            "Umbrella",
            "Vase",
            "Watch",
            "Xylophone",
            "Yacht",
            "Zebra"

    };
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.alphabets_slider, container, false);

        TextView tv1 = view.findViewById(R.id.letter);
        ImageView img1 = view.findViewById(R.id.image);
        TextView tv2 = view.findViewById(R.id.name);

        tv1.setText(slide_headings[position]);
        img1.setImageResource(slide_images[position]);
        tv2.setText(descs[position]);

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
