package com.project.final_project;


import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.project.final_project.classification.ImageClassifier;
import com.project.final_project.classification.Result;

import java.io.IOException;
import java.util.Random;


public class Classify extends AppCompatActivity {

    private View mainView;
    private PaintView paintView; // custom drawing view
    private ImageClassifier classifier; // complete image classification

    TextView textViewResult;
    TextView textViewDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classify);


        paintView = findViewById(R.id.paintView);
        paintView.init(); // initial drawing view

        textViewResult = findViewById(R.id.txt_result_label);
        textViewDraw = findViewById(R.id.txt_draw_label);


        // instantiate classifier
        try {
            this.classifier = new ImageClassifier(this);
        } catch (IOException e) {
            Log.e("MainActivity", "Cannot initialize tfLite model!", e);
            e.printStackTrace();
        }

        this.mainView = this.findViewById(R.id.activity_main).getRootView();

        resetView();
    }


    public void onClearClick(View view) {
        Log.i("MainActivity", "Clear sketch event triggers");
        paintView.clear();

    }

    public void onDetectClick(View view) {
        Log.i("MainActivity", "Detect sketch event triggers");
        if (classifier == null) {
            Log.e("MainActivity", "Cannot initialize tfLite model!");
            return;
        }


        Bitmap sketch = paintView.getNormalizedBitmap(); // get resized bitmap

        //showImage(paintView.scaleBitmap(40, sketch));

        // create the result
        Result result = classifier.classify(sketch);


        // render results
        textViewResult.setText("");
        for (int index : result.getTopK()) {
            textViewResult.setText(
                    textViewResult.getText()
                            + "\n"
                            + classifier.getLabel(index)
                            + " ("
                            + String.format("%.02f", classifier.getProbability(index) * 100)
                            + "%)"
            );
        }

        int expectedIndex = classifier.getExpectedIndex();
        if (result.getTopK().contains(expectedIndex)) {
            mainView.setBackgroundColor(Color.rgb(78, 175, 36));
            LottieAnimationView animationView = findViewById(R.id.classifyAnimation);
            animationView.setAnimation("animations/smile.json");
            animationView.loop(false);
            animationView.playAnimation();
        } else {
            mainView.setBackgroundColor(Color.rgb(200, 0, 0));
            LottieAnimationView animationView2 = findViewById(R.id.classifyAnimation);
            animationView2.setAnimation("animations/sad.json");
            animationView2.loop(false);
            animationView2.playAnimation();

        }


    }


    public void onNextClick(View view) {
        resetView();
    }

    // debug: ImageView with rescaled 28x28 bitmap
    private void showImage(Bitmap bitmap) {
        Dialog builder = new Dialog(this);
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
            }
        });

        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);
        builder.addContentView(imageView, new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        builder.show();
    }


    private void resetView() {
        mainView.setBackgroundColor(Color.WHITE);
        paintView.clear();
        textViewResult.setText("");

        // get a random label and set as expected class
        classifier.setExpectedIndex(new Random().nextInt(classifier.getNumberOfClasses()));
        textViewDraw.setText("Can You Draw ... " + classifier.getLabel(classifier.getExpectedIndex()));

    }


}