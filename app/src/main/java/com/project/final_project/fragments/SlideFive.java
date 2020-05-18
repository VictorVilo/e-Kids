package com.project.final_project.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.airbnb.lottie.LottieAnimationView;
import com.project.final_project.R;


/**
 * Created by Aniruddh on 18-10-2017.
 */

public class SlideFive extends Fragment {
    private static final String ARG_LAYOUT_RES_ID = "layoutResId";
    private int layoutResId;

    public SlideFive() {
    }

    public static SlideFive newInstance(int layoutResId) {
        SlideFive sampleSlide = new SlideFive();

        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        sampleSlide.setArguments(bundleArgs);

        return sampleSlide;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null && getArguments().containsKey(ARG_LAYOUT_RES_ID))
            layoutResId = getArguments().getInt(ARG_LAYOUT_RES_ID);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.slide_five, container, false);
        LottieAnimationView animationView = view.findViewById(R.id.slideFiveAnimation);
        animationView.setAnimation("animations/fun.json");
        animationView.loop(true);
        animationView.playAnimation();
        return view;
    }

}